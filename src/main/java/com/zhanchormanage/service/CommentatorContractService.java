package com.zhanchormanage.service;

import com.zhanchormanage.mapper.CommentatorContractMapper;
import com.zhanchormanage.model.CommentatorContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentatorContractService {
    @Autowired
    private CommentatorContractMapper cdao;
    public List<CommentatorContract> queryAll(){
        return cdao.queryAll();
    }
}
