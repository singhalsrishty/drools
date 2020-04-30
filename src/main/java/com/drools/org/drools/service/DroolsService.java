package com.drools.org.drools.service;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.drools.org.drools.model.MastercardOffer;

public class DroolsService {
	
	/**
	 * Get offer for input card-type
	 * @return
	 */
	public String applyMasterCardOfferRule(String cardType) {
		KieServices kieServices = KieServices.Factory.get();
		KieContainer kieContainer = kieServices.getKieClasspathContainer();
		
		//KieBase kBase1 = kieContainer.getKieBase("KBase1");
		KieSession kieSession1 = kieContainer.newKieSession("KSession1");
		//StatelessKieSession kieSession2 = kieContainer.newStatelessKieSession("KSession2");
		
		MastercardOffer mastercardOffer = new MastercardOffer(cardType, null);
		kieSession1.insert(mastercardOffer);
		kieSession1.fireAllRules();
		
		return "Discounted Offer for this card type is: " + mastercardOffer.getDiscount();
		
	}

	
}
