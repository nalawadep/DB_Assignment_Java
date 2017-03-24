package com.db.assignment.model;

public class RetailManagerShop {
	private static final long serialVersionUID = -7989877877891L;
    public RetailManagerShop(String shopAddNumber, String shopName,
			String shopAddPostCode, String shopLongitude, String shopLatitude) {
		super();
		this.shopAddNumber = shopAddNumber;
		this.shopName = shopName;
		this.shopAddPostCode = shopAddPostCode;
		this.shopLongitude = shopLongitude;
		this.shopLatitude = shopLatitude;
	}
	private  String shopAddNumber;
    private  String shopName;
    private  String shopAddPostCode;
    private String shopLongitude;
    private String shopLatitude;
	/**
	 * @return the shopAddNumber
	 */
	public String getShopAddNumber() {
		return shopAddNumber;
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
	/**
	 * @return the shopLongitude
	 */
	public String getShopLongitude() {
		return shopLongitude;
	}
	/**
	 * @param shopLongitude the shopLongitude to set
	 */
	public void setShopLongitude(String shopLongitude) {
		this.shopLongitude = shopLongitude;
	}
	/**
	 * @return the shopLatitude
	 */
	public String getShopLatitude() {
		return shopLatitude;
	}
	/**
	 * @param shopLatitude the shopLatitude to set
	 */
	public void setShopLatitude(String shopLatitude) {
		this.shopLatitude = shopLatitude;
	}
}
