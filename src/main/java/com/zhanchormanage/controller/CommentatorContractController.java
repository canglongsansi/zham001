package com.zhanchormanage.controller;

import com.zhanchormanage.service.CommentatorContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class CommentatorContractController {
    @Autowired
    private CommentatorContractService commentatorContractService;
    @RequestMapping(value = "/CommentatorContract",method = RequestMethod.POST)
    public ResponseEntity getCommentatorContract(){
        return new ResponseEntity(commentatorContractService.queryVo(), HttpStatus.OK);
    }
}
