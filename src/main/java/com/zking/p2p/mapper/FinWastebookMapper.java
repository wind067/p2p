package com.zking.p2p.mapper;

import com.zking.p2p.model.FinWastebook;

public interface FinWastebookMapper {
    int deleteByPrimaryKey(Long fwid);

    int insert(FinWastebook record);

    int insertSelective(FinWastebook record);

    FinWastebook selectByPrimaryKey(Long fwid);

    int updateByPrimaryKeySelective(FinWastebook record);

    int updateByPrimaryKey(FinWastebook record);
}