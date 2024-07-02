package com.AssetMaster.model;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "abcd")

public class Asset {

	@Id

	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String assettype;

	private int assetquantity;

	private Date assetdate;

	private double assetprice;

	private double totalprice;
	



	public double getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAssettype() {
		return assettype;
	}

	public void setAssettype(String assettype) {
		this.assettype = assettype;
	}

	public int getAssetquantity() {
		return assetquantity;
	}

	public void setAssetquantity(int assetquantity) {
		this.assetquantity = assetquantity;
	}

	public Asset() {

	}

}
