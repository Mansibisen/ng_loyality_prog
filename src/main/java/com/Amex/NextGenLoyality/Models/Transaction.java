package com.Amex.NextGenLoyality.Models;




import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Transaction {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int trans_id;
	private int customer_id;
    private String trans_date; // format mm/dd/yyyy
	private long trans_amount;
	private String merchant_id;
	private String merchant_name; // no seperate merchant table as of now
	private String brand_name;
	private String segment_name;
	private long loyalty_points_earned;
	public int getTrans_id() {
		return trans_id;
	}
	public void setTrans_id(int trans_id) {
		this.trans_id = trans_id;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getTrans_date() {
		return trans_date;
	}
	public void setTrans_date(String trans_date) {
		this.trans_date = trans_date;
	}
	public long getTrans_amount() {
		return trans_amount;
	}
	public void setTrans_amount(long trans_amount) {
		this.trans_amount = trans_amount;
	}
	public String getMerchant_id() {
		return merchant_id;
	}
	public void setMerchant_id(String merchant_id) {
		this.merchant_id = merchant_id;
	}
	public String getMerchant_name() {
		return merchant_name;
	}
	public void setMerchant_name(String merchant_name) {
		this.merchant_name = merchant_name;
	}
	public String getBrand_name() {
		return brand_name;
	}
	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}
	public String getSegment_name() {
		return segment_name;
	}
	public void setSegment_name(String segment_name) {
		this.segment_name = segment_name;
	}
	public long getLoyalty_points_earned() {
		return loyalty_points_earned;
	}
	public void setLoyalty_points_earned(long loyalty_points_earned) {
		this.loyalty_points_earned = loyalty_points_earned;
	}

	
}