package com.zhanchormanage.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhanchormanage.model.ArtistBrokerageContract;
import com.zhanchormanage.service.ArtistBrokerageContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ArtistBrokerageContractController {
    @Autowired
    private ArtistBrokerageContractService artistBrokerageContractService;
    @RequestMapping(value = "/yirenjingji",method = RequestMethod.GET)
    public ResponseEntity getArtistBrokerageContract(@RequestParam(value = "pageNum",defaultValue = "1") int pageNum,
                                                     @RequestParam(value = "pageSize",defaultValue = "20") int pageSize){
        List<ArtistBrokerageContract> list = artistBrokerageContractService.queryVo(pageNum,pageSize);
        PageInfo<ArtistBrokerageContract> pageInfo  = new PageInfo<>(list);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new ResponseEntity(pageInfo, HttpStatus.OK);
    }
    @RequestMapping(value = "/yirenjingjii_search",method = RequestMethod.POST)
    public ResponseEntity getAristeSupplyContractSearch(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new ResponseEntity(artistBrokerageContractService.queryVoSearch(), HttpStatus.OK);
    }
}
