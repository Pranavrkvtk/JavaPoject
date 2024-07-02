package com.AssetMaster.repository;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.AssetMaster.model.Asset;
import com.AssetMaster.requestdto.requestdto;

import jakarta.transaction.Transactional;

public interface AssetMasterRepository extends JpaRepository<Asset, Integer> {

	public List<Asset> findAll();

	public Asset save(Asset obj);

	public Asset findById(int i);

	public Asset findByassettype(String i);

	public List<Asset> findByassetquantity(int l);

	public Asset findByassetprice(double s);

//	public List <Asset> findByAssettypeAndQuantity(String id,String h);



///	@Transactional
//	@Modifying
//	@Query(value = "UPDATE Asset SET assetquantity = ?1, assettype = ?2, assetdate = ?3 WHERE id = ?4", nativeQuery = true)
//	public int updateAsset(int assetquantity, String assettype, Date assetdate, int id);

	@Transactional
	@Modifying
	@Query(value = "UPDATE Asset Set assetdate =?1 WHERE ID =?2", nativeQuery = true)
	public int updateAssetdate(Date assetdate, int id);

	@Transactional
	@Modifying
	@Query(value = "UPDATE Asset SET assetdate=?1 where id=?2", nativeQuery = true)
	public int updateDate(Date assetdate, int id);

	@Query(value = "SELECT * FROM Asset WHERE id =:?1 AND assettype=?2", nativeQuery = true)
	public Asset displayAssetType(int id, double d);

	@Query(value = "SELECT * FROM Asset WHERE EXTRACT(YEAR FROM assetdate) =:searchYear", nativeQuery = true)
	public List<Asset> displayYear(@Param("searchYear") int assetyear);

//	@Transactional
//    @Modifying
//    @Query(value = "Update Asset set assettype=:?1 where id=:?2", nativeQuery = true)
//    int updateAssetType(@Param("id") int id, @Param("assettype") String s );

	@Transactional
	@Modifying
	@Query(value = "UPDATE Asset SET assettype = :assettype WHERE id = :id", nativeQuery = true)
	int updateAssetType(@Param("id") int id, @Param("assettype") String assetType);

	@Query(value = "SELECT assettype FROM Asset", nativeQuery = true)
	public List<String> displayAssetType();

	
	@Query(value="select sum(totalprice) from Asset",nativeQuery = true)
	public double displaysumodAsset();
	
	
}
