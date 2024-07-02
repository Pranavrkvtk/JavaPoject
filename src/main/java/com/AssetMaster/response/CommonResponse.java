package com.AssetMaster.response;

import java.util.List;

import com.AssetMaster.model.Asset;

public class CommonResponse {

	private String statusMessage;
	private String StatusCode;

	private Asset asset;

	
	private double TotalSum;




	public double getTotalSum() {
		return TotalSum;
	}

	public void setTotalSum(double totalSum) {
		TotalSum = totalSum;
	}

	private List<Asset> ListAsset;
	
	public List<String> getListString() {
		return ListString;
	}

	public void setListString(List<String> listString) {
		ListString = listString;
	}

	private List <String>ListString;
	
	

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public String getStatusCode() {
		return StatusCode;
	}

	public void setStatusCode(String statusCode) {
		StatusCode = statusCode;
	}

	public Asset getAsset() {
		return asset;
	}

	public void setAsset(Asset asset) {
		this.asset = asset;
	}

	public List<Asset> getListAsset() {
		return ListAsset;
	}

	public void setListAsset(List<Asset> listAsset) {
		ListAsset = listAsset;
	}

	public CommonResponse(String statusMessage, String statusCode, Asset asset, List<Asset> listAsset) {
		super();
		this.statusMessage = statusMessage;
		StatusCode = statusCode;
		this.asset = asset;
		ListAsset = listAsset;
	}

	public CommonResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

}
