package com.db.assignment.model;

public class RetailManager {
	
	private static final long serialVersionUID = -7989877877890L;
    private  String shopAddNumber;
    private  String shopName;
    private  String shopAddPostCode;
	
	public RetailManager(String shopAddNumber, String shopName, String shopAddPostCode) {
		super();
		this.shopAddNumber = shopAddNumber;
		this.shopName = shopName;
		this.shopAddPostCode = shopAddPostCode;
	}
	/**
	 * @param shopAddNumber the shopAddNumber to set
	 */
	public void setShopAddNumber(String shopAddNumber) {
		this.shopAddNumber = shopAddNumber;
	}
	/**
	 * @return the shopName
	 */
	public String getShopName() {
		return shopName;
	}
	/**
	 * @param shopName the shopName to set
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	/**
	 * @return the shopAddPostCode
	 */
	public String getShopAddPostCode() {
		return shopAddPostCode;
	}
	/**
	 * @param shopAddPostCode the shopAddPostCode to set
	 */
	public void setShopAddPostCode(String shopAddPostCode) {
		this.shopAddPostCode = shopAddPostCode;
	}
	
   
}
