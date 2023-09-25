package com.qlts_jvw.dao;

import java.util.List;

import com.qlts_jvw.model.AssetModel;

public interface IAssetDAO extends GenericDAO<AssetModel>{
List<AssetModel> findAll();

AssetModel findOne(String id);

AssetModel findOneByCode(String code);
}
