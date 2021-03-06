package com.zhanchormanage.service;

import com.github.pagehelper.PageHelper;
import com.zhanchormanage.mapper.ThreePartyContractMapper;
import com.zhanchormanage.model.ThreePartyContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThreePartyContractService {
    @Autowired
    private ThreePartyContractMapper tdao;
    public List<ThreePartyContract> queryVo(int pageNum,int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        return tdao.queryVo();
    }
    public List<ThreePartyContract> queryVoSearch(){
        return tdao.queryVoSearch();
    }
    public void updateFilehost(ThreePartyContract threePartyContract){
        tdao.updateByPrimaryKeySelective(threePartyContract);
    }
    public List<ThreePartyContract> searchByname(String name){
        return tdao.searchByName(name);
    }
}
