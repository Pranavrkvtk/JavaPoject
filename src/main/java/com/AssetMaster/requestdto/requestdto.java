package com.AssetMaster.requestdto;

import java.sql.Date;

public class requestdto {

	public int getAssetquantity() {
		return assetquantity;
	}

	public void setAssetquantity(int assetquantity) {
		this.assetquantity = assetquantity;
	}

	public String getAssettype() {
		return assettype;
	}

	public void setAssettype(String assettype) {
		this.assettype = assettype;
	}

	private int assetquantity;
	private String assettype;

	private Date assetdate;

	private double assetprice;

	private double totalprice;

	public double getAssetprice() {
		return assetprice;
	}

	public void setAssetprice(double assetprice) {
		this.assetprice = assetprice;
	}

	public Date getAssetdate() {
		return assetdate;
	}

	public void setAssetdate(Date assetdate) {
		this.assetdate = assetdate;
	}

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
