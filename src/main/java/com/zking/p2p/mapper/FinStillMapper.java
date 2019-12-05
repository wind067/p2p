package com.zking.p2p.mapper;

import com.zking.p2p.model.FinStill;

public interface FinStillMapper {
    int deleteByPrimaryKey(Long fsid);

    int insert(FinStill record);

    int insertSelective(FinStill record);

    FinStill selectByPrimaryKey(Long fsid);

    int updateByPrimaryKeySelective(FinStill record);

    int updateByPrimaryKey(FinStill record);
}