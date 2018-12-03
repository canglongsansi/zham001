package com.zhanchormanage.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhanchormanage.model.CommentatorContract;
import com.zhanchormanage.service.CommentatorContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class CommentatorContractController {
    @Autowired
    private CommentatorContractService commentatorContractService;
    @RequestMapping(value = "/CommentatorContract",method = RequestMethod.GET)
    public ResponseEntity getCommentatorContract(int pageNum){
        List<CommentatorContract> list = commentatorContractService.queryVo(pageNum,13);
        PageInfo<CommentatorContract> personPageInfo = new PageInfo<>(list);
        return new ResponseEntity(personPageInfo, HttpStatus.OK);
    }
    @RequestMapping(value = "/CommentatorContract_search",method = RequestMethod.POST)
    public ResponseEntity getAristeSupplyContractSearch(){
        return new ResponseEntity(commentatorContractService.queryVoSearch(), HttpStatus.OK);
    }
}
