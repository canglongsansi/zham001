package com.zhanchormanage.service;

import com.zhanchormanage.mapper.ArtisteSupplyContractMapper;
import com.zhanchormanage.model.ArtisteSupplyContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AristeSupplyContractService {
    @Autowired
    private ArtisteSupplyContractMapper adao;
    public List<ArtisteSupplyContract> queryAll(){
        return adao.queryAll();
    }
    //addd
}
