package com.zhanchormanage.service;

import com.github.pagehelper.PageHelper;
import com.zhanchormanage.mapper.CommentatorContractMapper;
import com.zhanchormanage.model.CommentatorContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentatorContractService {
    @Autowired
    private CommentatorContractMapper cdao;
    public List<CommentatorContract> queryVo(int pageNum,int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        return cdao.queryVo();
    }
    public List<CommentatorContract> queryVoSearch(){
        return cdao.queryVoSearch();
    }
}
