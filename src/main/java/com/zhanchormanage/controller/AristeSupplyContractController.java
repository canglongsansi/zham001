package com.zhanchormanage.controller;

import com.zhanchormanage.service.AristeSupplyContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class AristeSupplyContractController {
    @Autowired
    private AristeSupplyContractService aristeSupplyContractService;
    @RequestMapping(value = "/AristeSupplyContract",method = RequestMethod.GET)
    public ResponseEntity getAristeSupplyContract(){
        return new ResponseEntity(aristeSupplyContractService.queryVo(), HttpStatus.OK);
    }
}
