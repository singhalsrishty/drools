package com.drools.org.drools.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.drools.org.drools.cache.RateFile;
import com.drools.org.drools.service.CacheService;

@RestController
@RequestMapping(value = "/v1/cache")
public class CacheController {
	
	@Autowired
	private CacheService cacheService;
	
	@RequestMapping(method =  RequestMethod.POST, value = "/cache")
	public void updateCache(@RequestBody RateFile rateFile) {
		this.cacheService.updateRates(rateFile);
	}
	
	@RequestMapping(method =  RequestMethod.GET, value = "/cache")
	public @ResponseBody List<RateFile> getCache() {
		return this.cacheService.getRates();
	}
	
	@RequestMapping(method =  RequestMethod.POST, value = "/clearcache")
	public void clearCache() {
		this.cacheService.clearCache();
	}

}
