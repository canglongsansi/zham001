package com.zhanchormanage.controller;

import com.zhanchormanage.service.ArtistBrokerageContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ArtistBrokerageContractController {
    @Autowired
    private ArtistBrokerageContractService artistBrokerageContractService;
    @RequestMapping(value = "/yirenjingji",method = RequestMethod.POST)
    public ResponseEntity getArtistBrokerageContract(){
        return new ResponseEntity(artistBrokerageContractService.queryVo(), HttpStatus.OK);
    }
    @RequestMapping(value = "/yirenjingjii_search",method = RequestMethod.POST)
    public ResponseEntity getAristeSupplyContractSearch(){
        return new ResponseEntity(artistBrokerageContractService.queryVoSearch(), HttpStatus.OK);
    }
}
