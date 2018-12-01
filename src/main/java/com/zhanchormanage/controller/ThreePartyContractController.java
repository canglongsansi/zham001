package com.zhanchormanage.controller;

import com.zhanchormanage.service.ThreePartyContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ThreePartyContractController {
    @Autowired
    private ThreePartyContractService threePartyContractService;
    @RequestMapping(value = "/ThreePartyContract",method = RequestMethod.POST)
    public ResponseEntity getThreePartyContract(){
        return new ResponseEntity(threePartyContractService.queryVo(), HttpStatus.OK);
    }
}
