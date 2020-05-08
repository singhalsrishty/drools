package com.drools.org.drools.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

import com.drools.org.drools.cache.RateFile;

public class CacheService {

	private List<RateFile> rates = new ArrayList<RateFile>();
	
	public List<RateFile> getRates() {
		return this.rates;
	}
	
	@Cacheable(value = "rates", key = "#root.args[0]")
	public RateFile getRateFromKey(int rateKey) {
		System.out.println("Entered Cacheable Method: ");
		return (this.rates.size() >= rateKey + 1)? this.rates.get(rateKey) : null;
	}

	@CachePut("rates")
	public void updateRates(RateFile rateFile) {
		this.rates.add(rateFile);
	}
	
	@CacheEvict(value = "rates", allEntries = true)
	public void clearCache() {
		this.rates = new ArrayList<RateFile>();
	}

}
