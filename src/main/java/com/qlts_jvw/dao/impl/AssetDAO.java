package com.qlts_jvw.dao.impl;



import java.util.List;

import com.qlts_jvw.dao.AbstractDAO;
import com.qlts_jvw.dao.IAssetDAO;
import com.qlts_jvw.mapper.AssetMapper;
import com.qlts_jvw.model.AssetModel;


public class AssetDAO extends AbstractDAO<AssetModel>  implements IAssetDAO {

	@Override
	public List<AssetModel> findAll() {
		String sql = "SELECT * FROM Asset";
	
		return query(sql, new AssetMapper());
	}

	@Override
	public AssetModel findOne(String id) {
		String sql = "SELECT * FROM Asset WHERE id = ?";
		List<AssetModel> asset = query(sql, new AssetMapper(), id);
		return asset.isEmpty() ? null : asset.get(0);
	}

    @Override
    public AssetModel findOneByCode(String code) {
		String sql = "SELECT * FROM Asset WHERE code = ?";
		List<AssetModel> asset = query(sql, new AssetMapper(), code);
		return asset.isEmpty() ? null : asset.get(0);
    }

}