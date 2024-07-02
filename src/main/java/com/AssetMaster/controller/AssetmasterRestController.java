package com.AssetMaster.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.AssetMaster.model.Asset;
import com.AssetMaster.requestdto.requestdto;
import com.AssetMaster.response.CommonResponse;
import com.AssetMaster.service.AssetMasterService;

@RestController
public class AssetmasterRestController {

	@Autowired
	private AssetMasterService service;

	@PostMapping("/addAsset")
	public CommonResponse create(@RequestBody Asset ob) {

		Asset data = service.AddNew(ob);

		CommonResponse response = new CommonResponse();

		if (data != null) {

			response.setStatusCode("200");
			response.setStatusMessage("Success...");
			response.setAsset(data);
		} else {

			response.setStatusCode("404");
			response.setAsset(data);
			response.setStatusMessage("Failed");
		}

		return response;
	}

	@GetMapping("/listAssets")

	public CommonResponse listAdd() {
		CommonResponse response = new CommonResponse();
		List<Asset> obj = service.ListAll();
//		java.util.List<Item> obj = service.display();

		if (obj.size() > 0) {
			response.setStatusCode("333");
			response.setStatusMessage(" Data successFully loaded.....");
			response.setListAsset(obj);
			// response.setDataList(obj);
		} else {

			response.setStatusCode("404");
			response.setStatusMessage("It is not Created....");
			response.setListAsset(obj);
		}

		return response;

	}

	@GetMapping("/listAssetTypeWhichAsset")
	public CommonResponse finds() {
		CommonResponse resp = new CommonResponse();
		List<String> data = service.listofassetnameonly();

		if (data != null) {
			resp.setStatusCode("333");
			resp.setStatusMessage("success");
			resp.setListString(data);
		} else {
			resp.setStatusMessage("failed");
			resp.setStatusCode("404");
		}

		return resp;

	}

	@GetMapping("ListOFSumOfAsset")
	public CommonResponse findsum() {
		CommonResponse resp = new CommonResponse();

		double data = service.SumOftAsset();

		resp.setTotalSum(data);
		resp.setStatusMessage("This is Total Assetprice");
		resp.setStatusCode("333");

		return resp;

	}

//	
//	@GetMapping("/listTypeandquantity")
//	public CommonResponse listAssetNameAndQuandity(@RequestParam("searchType") String searchname,@RequestParam("searchquantity") int searchquantity) {
//		CommonResponse response=new CommonResponse();
//		List<Asset> obj=service.search(searchname, searchquantity);
//		if(obj.size()>0) {
//			 response.setStatusMessage("Products loaded");
//			 response.setStatusCode("200");
//			 response.setListAsset(obj);
//		 }
//		 else{
//			 response.setStatusMessage("Product not found");
//			 response.setStatusCode("404");
//		     }
//		return response;
//	}
//	
//	
//	

//	@PutMapping("/EditAsset")
//	public CommonResponse Edit(@RequestBody requestdto ob )
//	{
//		
//		Asset editAsset =service.editAsset(ob);
//		
//		
//		CommonResponse resp= new CommonResponse();
//		
//		if(editAsset!= null) {
//			
//			resp.setStatusCode("333");
//			resp.setStatusMessage("Success");
//			resp.setAsset(editAsset);
//
//			
//		}
//		else {
//			
//			resp.setStatusCode("404");
//			resp.setStatusMessage("Failed");
//		}
//		
//		
//		
//		
//		
//		
//		return resp;
//		
//	
//	}
//	

	@GetMapping("/FindId")
	public CommonResponse FindId(@RequestParam("Searchid") int id) {

		Asset data = service.findById(id);
		CommonResponse response = new CommonResponse();

		if (data != null) {

			response.setStatusCode("303");
			response.setStatusMessage("Found");
			response.setAsset(data);
		} else {
			response.setStatusCode("404");
			response.setStatusMessage("Not Found");
		}

		return response;

	}

//	@GetMapping("/FindIdUsingQuary")
//	public CommonResponse FindIdQuary(@RequestParam("Searchid") int id) {
//
//		Asset data = service.searchByAssetId(id);
//		CommonResponse response = new CommonResponse();
//
//		if (data != null) {
//
//			response.setStatusCode("303");
//			response.setStatusMessage("Found");
//			response.setAsset(data);
//		} else {
//			response.setStatusCode("404");
//			response.setStatusMessage("Not Found");
//		}
//
//		return response;
//
//	}

	@GetMapping("/FindType")
	public CommonResponse FindType(@RequestParam("SearchType") String Type) {

		Asset TypeOfAsset = service.findByassettype(Type);

		CommonResponse resp = new CommonResponse();

		if (TypeOfAsset != null) {

			resp.setStatusCode("303");
			resp.setStatusMessage("Success");
			resp.setAsset(TypeOfAsset);
		}
		return resp;

	}

	@GetMapping("/FindQuantity")
	public CommonResponse FindT(@RequestParam("Searchquantity") int quantity) {

		List<Asset> TypeOfAsset = service.SearchByassetquantity(quantity);

		CommonResponse resp = new CommonResponse();

		if (TypeOfAsset != null) {

			resp.setStatusCode("303");
			resp.setStatusMessage("Success");
			resp.setListAsset(TypeOfAsset);

		} else {

			resp.setStatusCode("404");
			resp.setStatusMessage("Failed");
		}
		return resp;

	}

	@GetMapping("/findbyPrice")
	public CommonResponse findPriceAsset(@RequestParam("Searchprice") double price) {

		Asset price1 = service.SearchByassetprice(price);

		CommonResponse sd = new CommonResponse();

		if (price1 != null) {

			sd.setStatusCode("333");
			sd.setStatusMessage("success");
			sd.setAsset(price1);
		} else {
			sd.setStatusCode("404");
			sd.setStatusMessage("failed");
		}

		return sd;

	}

	@GetMapping("/FindYear")
	public CommonResponse Findyear(@RequestParam("SearhYear") int year) {

		List<Asset> TypeOfAsset = service.serachyear(year);

		CommonResponse resp = new CommonResponse();

		if (TypeOfAsset != null) {

			resp.setStatusCode("303");
			resp.setStatusMessage("Success");
			resp.setListAsset(TypeOfAsset);
		}

		else {
			resp.setStatusMessage("Failed");
			resp.setStatusCode("404");

		}
		return resp;

	}

	@PostMapping("/addnewAssetUsis")
	public CommonResponse create2(@RequestBody Asset ob) {
		Asset datas = service.AddNew(ob);

		CommonResponse resp = new CommonResponse();

		if (datas != null) {
			resp.setStatusCode("200");
			resp.setStatusMessage("success");
			resp.setAsset(datas);
		} else {
			resp.setStatusMessage("failed");
			resp.setStatusCode("404");
		}

		return resp;

	}
//
//	@PutMapping("/updatequery")
//	public CommonResponse displayqueryid1(@RequestBody requestdto data) {
//		CommonResponse response = new CommonResponse();
//		Asset obj = service.Update(data);
//		if (obj != null) {
//			response.setStatusMessage(" update successfully");
//			response.setStatusCode("303");
//			response.setAsset(obj);
//		} else {
//			response.setStatusMessage("not updated..");
//			response.setStatusCode("404");
//
//			response.setAsset(obj);
//		}
//		return response;
//
//	}

	@PutMapping("/updateAssetType")
	public CommonResponse updateprice(@RequestParam("id") int quant, @RequestParam("assettype") String j) {

		CommonResponse r = new CommonResponse();
		Asset UpdateAssettype = service.UpdateTotalAssetType(quant, j);

		if (UpdateAssettype == null) {
			r.setStatusMessage("success");
			r.setStatusCode("333");
			r.setAsset(UpdateAssettype);

		} else {
			r.setAsset(UpdateAssettype);
			r.setStatusCode("404");
			r.setStatusMessage("Failed");
		}
		return r;

	}

	@PutMapping("/updateDate")
	public CommonResponse updateTotalprice(@RequestBody requestdto d) {

		CommonResponse r = new CommonResponse();
		Asset s = service.UpdateDate(d);

		if (s != null) {
			r.setStatusCode("200");
			r.setStatusMessage("success");
			r.setAsset(s);

		} else {
			r.setAsset(s);
			r.setStatusCode("404");
			r.setStatusMessage("Failed");
		}
		return r;

	}

//
//	@PutMapping("/updatequeryprice")
//	public CommonResponse displayqueryid2(@RequestBody requestdto data) {
//		CommonResponse response = new CommonResponse();
//		Asset obj = service.updateAssetTotalPriceAndFields(data);
//		if (obj != null) {
//			response.setStatusMessage(" update successfully");
//			response.setStatusCode("303");
//			response.setAsset(obj);
//		} else {
//			response.setStatusMessage("not updated..");
//			response.setStatusCode("404");
//
//			response.setAsset(obj);
//		}
//		return response;
//
//	}

}
