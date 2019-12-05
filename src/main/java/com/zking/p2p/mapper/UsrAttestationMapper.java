package com.zking.p2p.mapper;

import com.zking.p2p.model.UsrAttestation;

public interface UsrAttestationMapper {
    int deleteByPrimaryKey(Long uatid);

    int insert(UsrAttestation record);

    int insertSelective(UsrAttestation record);

    UsrAttestation selectByPrimaryKey(Long uatid);

    int updateByPrimaryKeySelective(UsrAttestation record);

    int updateByPrimaryKey(UsrAttestation record);
}