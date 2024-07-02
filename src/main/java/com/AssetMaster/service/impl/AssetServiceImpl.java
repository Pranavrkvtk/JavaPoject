package com.AssetMaster.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.AssetMaster.model.Asset;
import com.AssetMaster.repository.AssetMasterRepository;
import com.AssetMaster.requestdto.requestdto;
import com.AssetMaster.response.CommonResponse;
import com.AssetMaster.service.AssetMasterService;

@Service
public class AssetServiceImpl implements AssetMasterService {

	@Autowired

	private AssetMasterRepository dao;

	@Override
	public Asset AddNew(Asset obj) {

		int id = obj.getId();
		Date d = obj.getAssetdate();
		String asset = obj.getAssettype();
		double pr = obj.getAssetprice();
		int quantity = obj.getAssetquantity();

		double totalrice = pr * quantity;

		obj.setTotalprice(totalrice);
		obj.setAssetprice(pr);

		dao.save(obj);
		return obj;
	}

	@Override
	public List<Asset> ListAll() {
		// TODO Auto-generated method stub
		return dao.findAll();

	}

	@Override
	public Asset findById(int i) {
		// TODO Auto-generated method stub
		return dao.findById(i);
	}

	@Override
	public Asset findByassettype(String AssetType) {
		// TODO Auto-generated method stub
		return dao.findByassettype(AssetType);
	}

//	@Override
//	public Asset searchByAssetId(int id) {
//		// TODO Auto-generated method stub
//		return dao.searchByAssetID(id);
//	}
//
//
//	@Override
//	public Asset Update(requestdto data) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//
//@Override
//public Asset editAsset(requestdto EditAsset) {
//	// TODO Auto-generated method stub
//	
//	Asset Edit = dao.findById(EditAsset.getId());
//	CommonResponse  resp = new CommonResponse();
//	
//	
//	
//	if(Edit != null) {
//		
//		
//	Edit.setAssetquantity(EditAsset.getAssetquantity());	
//	
//	}
//	
//	return Edit;
//	
//	
//	
//

//	}

//}

//	
//	@Override
//	public Asset Update(requestdto req) {
//		// TODO Auto-generated method stub
//
//		int r = dao.updateAsset(req.getAssetquantity(), req.getAssettype(), req.getAssetdate(), req.getId());
//
//		if (r > 0) {
//			Asset yu = new Asset();
//			return yu;
//
//		}
//		return null;
//
//	}

	@Override
	public List<Asset> SearchByassetquantity(int quantity) {
		// TODO Auto-generated method stub
		return dao.findByassetquantity(quantity);
	}

	@Override
	public List<Asset> serachyear(int year) {
		// TODO Auto-generated method stub
		return dao.displayYear(year);
	}

	@Override
	public Asset SearchByassetprice(double p) {
		// TODO Auto-generated method stub

		return dao.findByassetprice(p);
	}

	@Override
	public Asset SearchByassetprice(Asset price) {
		// TODO Auto-generated method stub
		return dao.findByassetprice(price.getAssetprice());
	}

	@Override
	public Asset UpdateDate(requestdto req) {

		int set = dao.updateAssetdate(req.getAssetdate(), req.getId());

		return null;
		// TODO Auto-generated method stub

	}

	@Override
	public Asset UpdateTotalAssetType(int id, String as) {
		// TODO Auto-generated method stub

		int o = dao.updateAssetType(id, as);

		return null;
	}

	@Override
	public List<String> listofassetnameonly() {
		// TODO Auto-generated method stub
		return dao.displayAssetType();

	}

	@Override
	public double SumOftAsset() {
		// TODO Auto-generated method stub
		return dao.displaysumodAsset();
	}

}
