package com.zhanchormanage.controller;

import com.github.pagehelper.PageInfo;
import com.zhanchormanage.model.ThreePartyContract;
import com.zhanchormanage.service.ThreePartyContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ThreePartyContractController {
    @Autowired
    private ThreePartyContractService threePartyContractService;
    @RequestMapping(value = "/ThreePartyContract",method = RequestMethod.GET)
    public ResponseEntity getThreePartyContract(@RequestParam(value = "pageNum",defaultValue = "1") int pageNum,
                                                @RequestParam(value = "pageSiez",defaultValue = "20") int pageSize){
        List<ThreePartyContract> list = threePartyContractService.queryVo(pageNum,pageSize);
        PageInfo<ThreePartyContract> pageInfo = new PageInfo<>(list);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new ResponseEntity(pageInfo, HttpStatus.OK);
    }
    @RequestMapping(value = "/ThreePartyContract_search",method = RequestMethod.POST)
    public ResponseEntity getAristeSupplyContractSearch(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new ResponseEntity(threePartyContractService.queryVoSearch(), HttpStatus.OK);
    }
}
