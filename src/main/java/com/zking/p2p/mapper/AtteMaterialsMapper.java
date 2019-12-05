package com.zking.p2p.mapper;

import com.zking.p2p.model.AtteMaterials;

public interface AtteMaterialsMapper {
    int deleteByPrimaryKey(Long amid);

    int insert(AtteMaterials record);

    int insertSelective(AtteMaterials record);

    AtteMaterials selectByPrimaryKey(Long amid);

    int updateByPrimaryKeySelective(AtteMaterials record);

    int updateByPrimaryKey(AtteMaterials record);
}