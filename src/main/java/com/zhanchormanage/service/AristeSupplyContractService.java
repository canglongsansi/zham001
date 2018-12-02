package com.zhanchormanage.service;

import com.zhanchormanage.mapper.ArtisteSupplyContractMapper;
import com.zhanchormanage.model.ArtisteSupplyContract;
import com.zhanchormanage.util.TimeUtil;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AristeSupplyContractService {
    @Autowired
    private ArtisteSupplyContractMapper adao;
    public List<ArtisteSupplyContract> queryVo(){
        return adao.queryVo();
    }
    public List<ArtisteSupplyContract> queryVoSearch(){
        return adao.queryVoSearch();
    }
    //addd
}
