package com.zhanchormanage.service;

import com.zhanchormanage.mapper.ArtistBrokerageContractMapper;
import com.zhanchormanage.model.ArtistBrokerageContract;
import com.zhanchormanage.model.ArtistBrokerageContractExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistBrokerageContractService {
    @Autowired
    private ArtistBrokerageContractMapper adao;
    public List<ArtistBrokerageContract> queryVo(){
        return adao.queryVo();
    }
    public List<ArtistBrokerageContract> queryVoSearch(){
        return adao.queryVoSearch();
    }
}
