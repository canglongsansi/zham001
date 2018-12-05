package com.zhanchormanage.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhanchormanage.model.CommentatorContract;
import com.zhanchormanage.service.CommentatorContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class CommentatorContractController {
    @Autowired
    private CommentatorContractService commentatorContractService;
    @RequestMapping(value = "/CommentatorContract",method = RequestMethod.GET)
    public ResponseEntity getCommentatorContract(@RequestParam(value = "pageNum",defaultValue = "1") int pageNum,
                                                 @RequestParam(value = "pageSize",defaultValue = "20") int pageSize){
        List<CommentatorContract> list = commentatorContractService.queryVo(pageNum,pageSize);
        PageInfo<CommentatorContract> personPageInfo = new PageInfo<>(list);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new ResponseEntity(personPageInfo, HttpStatus.OK);
    }
    @RequestMapping(value = "/CommentatorContract_search",method = RequestMethod.POST)
    public ResponseEntity getAristeSupplyContractSearch(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new ResponseEntity(commentatorContractService.queryVoSearch(), HttpStatus.OK);
    }
}
