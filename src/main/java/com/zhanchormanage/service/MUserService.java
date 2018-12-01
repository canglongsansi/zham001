package com.zhanchormanage.service;

import com.zhanchormanage.mapper.mUserMapper;
import com.zhanchormanage.model.mUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MUserService {
    @Autowired
    private mUserMapper mdao;
    public mUser selectByUsername(String username){
        return mdao.selectByUsername(username);
    }
}
