package com.zhanchormanage.service;

import com.zhanchormanage.mapper.ArtistBrokerageContractMapper;
import com.zhanchormanage.model.ArtistBrokerageContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistBrokerageContractService {
    @Autowired
    private ArtistBrokerageContractMapper adao;
    public List<ArtistBrokerageContract> queryAll(){
        return adao.queryAll();
    }
}