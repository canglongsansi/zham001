package com.zhanchormanage.service;

import com.zhanchormanage.mapper.ThreePartyContractMapper;
import com.zhanchormanage.model.ThreePartyContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThreePartyContractService {
    @Autowired
    private ThreePartyContractMapper tdao;
    public List<ThreePartyContract> queryVo(){
        return tdao.queryVo();
    }
}
