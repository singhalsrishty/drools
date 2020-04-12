package com.drools.org.droolsexample.model;

public class MastercardOffer {
	
	private String channel;
	private String discount;
	
	public MastercardOffer(String channel, String discount) {
		super();
		this.channel = channel;
		this.discount = discount;
	}
	
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	
}
