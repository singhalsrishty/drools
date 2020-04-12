package com.drools.org.droolsexample.service;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.drools.org.droolsexample.model.MastercardOffer;

public class KieService {
	
	public static void main(String[] args) {
		applyMasterCardOfferRule();
	}
	
	public static void applyMasterCardOfferRule() {
		KieServices kieServices = KieServices.Factory.get();
		KieContainer kieContainer = kieServices.getKieClasspathContainer();
		
		//KieBase kBase1 = kieContainer.getKieBase("KBase1");
		KieSession kieSession1 = kieContainer.newKieSession("KSession1");
		//StatelessKieSession kieSession2 = kieContainer.newStatelessKieSession("KSession2");
		
		MastercardOffer mastercardOffer = new MastercardOffer("elite", null);
		kieSession1.insert(mastercardOffer);
		kieSession1.fireAllRules();
		System.out.println("Discounted Offer: " + mastercardOffer.getDiscount());
		
	}

	
}
