package com.drools.org.drools.cache;

public class RateFile {
	
	private String sourceCurrency;
	private String destinationCurrency;
	private String midRate;
	private String buyRate;
	private String sellRate;
	private String dateTime;
	
	public RateFile(String sourceCurrency, String destinationCurrency, String midRate, String buyRate, String sellRate,
			String dateTime) {
		super();
		this.sourceCurrency = sourceCurrency;
		this.destinationCurrency = destinationCurrency;
		this.midRate = midRate;
		this.buyRate = buyRate;
		this.sellRate = sellRate;
		this.dateTime = dateTime;
	}
	public String getSourceCurrency() {
		return sourceCurrency;
	}
	public void setSourceCurrency(String sourceCurrency) {
		this.sourceCurrency = sourceCurrency;
	}
	public String getDestinationCurrency() {
		return destinationCurrency;
	}
	public void setDestinationCurrency(String destinationCurrency) {
		this.destinationCurrency = destinationCurrency;
	}
	public String getMidRate() {
		return midRate;
	}
	public void setMidRate(String midRate) {
		this.midRate = midRate;
	}
	public String getBuyRate() {
		return buyRate;
	}
	public void setBuyRate(String buyRate) {
		this.buyRate = buyRate;
	}
	public String getSellRate() {
		return sellRate;
	}
	public void setSellRate(String sellRate) {
		this.sellRate = sellRate;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	
	
	

}
