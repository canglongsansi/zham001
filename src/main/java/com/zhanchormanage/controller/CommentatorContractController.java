package com.zhanchormanage.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhanchormanage.model.CommentatorContract;
import com.zhanchormanage.service.CommentatorContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
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
    public ResponseEntity getAristeSupplyContractSearch() throws IOException {
        double ramdon =  Math.random();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(ramdon < 0.5){
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity(commentatorContractService.queryVoSearch(), HttpStatus.OK);
    }
    @RequestMapping(value = "/commentSearchByName",method = RequestMethod.POST)
    public ResponseEntity searchByname(@RequestParam String name){
        return new ResponseEntity(commentatorContractService.searchByname(name),HttpStatus.OK);
    }
}
