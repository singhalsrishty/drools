package com.drools.org.droolsexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.drools.org.droolsexample.service.KieService;

@RestController
@RequestMapping(value = "/v1/drools")
public class DroolsController {
	
	@Autowired
	private KieService kieService;
	
	@RequestMapping(method =  RequestMethod.GET, value = "/offer/{card-type}")
	public String getOffer(@PathVariable("card-type") String cardType) {
		return this.kieService.applyMasterCardOfferRule(cardType);
	}

}
