package com.zhanchormanage.service;

import com.github.pagehelper.PageHelper;
import com.zhanchormanage.mapper.ArtistBrokerageContractMapper;
import com.zhanchormanage.model.ArtistBrokerageContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistBrokerageContractService {
    @Autowired
    private ArtistBrokerageContractMapper adao;
    public List<ArtistBrokerageContract> queryVo(int pageNum,int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        return adao.queryVo();
    }
    public List<ArtistBrokerageContract> queryVoSearch(){
        return adao.queryVoSearch();
    }
    public void updateFilehost(ArtistBrokerageContract artistBrokerageContract){
        adao.updateByPrimaryKeySelective(artistBrokerageContract);
    }
}
