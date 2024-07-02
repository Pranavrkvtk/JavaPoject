package com.AssetMaster.service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.AssetMaster.model.Asset;
import com.AssetMaster.requestdto.requestdto;

public interface AssetMasterService {

	public Asset AddNew(Asset obj);

	public List<Asset> ListAll();

	public Asset findById(int i);

	public Asset findByassettype(String AssetType);

	public List<Asset> SearchByassetquantity(int quantity);

	public Asset SearchByassetprice(Asset price);

	public List<Asset> serachyear(int year);

//	public Asset searchByAssetId(int id);

//	public Asset Update(requestdto req);

	public Asset UpdateDate(requestdto req);

//	public Asset updateAssetTotalPriceAndFields(requestdto data);

//	public Asset addnewAsset(requestdto data);

	Asset SearchByassetprice(double p);

	public Asset UpdateTotalAssetType(int id, String as);

	public List<String> listofassetnameonly();


	double SumOftAsset();

}
