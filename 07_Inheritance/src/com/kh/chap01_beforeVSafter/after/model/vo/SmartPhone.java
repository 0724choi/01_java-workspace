package com.kh.chap01_beforeVSafter.after.model.vo;

public class SmartPhone extends Product{
	private String mobileAgency;
	
	
	public SmartPhone() {}
	public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgency) {
		//super생성자
		super(brand, pCode, pName, price);
		this.mobileAgency = mobileAgency;
	}
	
	public String getMobileAgency() {
		return mobileAgency;
	}
	
	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	
	
	public String information() {
		return super.information() + ", mobileAgency : " + mobileAgency;
	}
}



