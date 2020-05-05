package com.drools.org.drools.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;

import com.drools.org.drools.cache.RateFile;

public class CacheService {

	private List<RateFile> rates = new ArrayList<RateFile>();
	
	public List<RateFile> getRates() {
		return this.rates;
	}

	@CachePut(value = "rates" )
	public void updateRates(RateFile rateFile) {
		this.rates.add(rateFile);
	}
	
	@CacheEvict(value = "rates", allEntries = true)
	public void clearCache() {
		this.rates = new ArrayList<RateFile>();
	}

}
