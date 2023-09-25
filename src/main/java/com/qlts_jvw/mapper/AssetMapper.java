package com.qlts_jvw.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.qlts_jvw.model.AssetModel;

public class AssetMapper implements RowMapper<AssetModel>{

	public AssetModel mapRow(ResultSet resultSet) {
		try {
			AssetModel asset = new AssetModel();
			asset.setAssetName(resultSet.getString("assetName"));
			asset.setAssetCode(resultSet.getString("assetCode"));
			asset.setAssetID(resultSet.getString("assetID"));
			asset.setAssStatusName(resultSet.getString("assStatusName"));
			asset.setFloorName(resultSet.getString("floorName"));
			asset.setFloorId(resultSet.getString("floorId"));
			asset.setAssetStatus(resultSet.getString("assetStatus"));
			asset.setBuyPrice(resultSet.getDouble("buyPrice"));
			asset.setRemainATM(resultSet.getDouble("remainATM"));
			asset.setRemainAmortizedAmt(resultSet.getDouble("remainAmortizedAmt"));
			asset.setEmpUse(resultSet.getString("empUse"));
			asset.setUseDate(resultSet.getString("useDate"));
			asset.setNotes(resultSet.getString("notes"));
			asset.setSerial(resultSet.getString("serial"));
			asset.setCreateDT(resultSet.getString("createDT"));
			asset.setMakerID(resultSet.getString("makerID"));
			asset.setTypeId(resultSet.getString("typeId"));
			return asset;
		} catch (SQLException e) {
			return null;
		}
	}
}
