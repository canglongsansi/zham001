package com.zhanchormanage.controller;

import com.zhanchormanage.model.mUser;
import com.zhanchormanage.service.MUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class LoginController {
    @Autowired
    private MUserService userService;
    //登录
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity zhLogin(HttpServletRequest request, @RequestBody mUser zhu) {
        String truePwd=null;
        mUser zhuser1=new mUser();
        if(userService.selectByUsername(zhu.getUsername())!=null){
            zhuser1 = userService.selectByUsername(zhu.getUsername());
            truePwd = zhuser1.getPassword();
        }
        if (truePwd != null && truePwd.equals(zhu.getPassword())) {
            HttpSession session = request.getSession();
            session.setAttribute("zhid", zhuser1.getId());
            return new ResponseEntity(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }
    //验证是否登录
    @RequestMapping(value = "/loginstate", method = RequestMethod.POST)
    public ResponseEntity zhLoginstate(HttpServletRequest request) {
        HttpSession session = request.getSession();
        if (session.getAttribute("zhid") != null) {
            return new ResponseEntity(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }
}
