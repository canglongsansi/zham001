package com.zhanchormanage.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhanchormanage.model.ArtistBrokerageContract;
import com.zhanchormanage.model.ArtisteSupplyContract;
import com.zhanchormanage.service.AristeSupplyContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class AristeSupplyContractController {
    @Autowired
    private AristeSupplyContractService aristeSupplyContractService;
    @RequestMapping(value = "/yirengongji",method = RequestMethod.GET)
    public ResponseEntity getAristeSupplyContract(@RequestParam(value = "pageNum",defaultValue = "1") int pageNum,
                                                  @RequestParam(value = "pageSize",defaultValue = "20") int pageSize){
        List<ArtisteSupplyContract> list = aristeSupplyContractService.queryVo(pageNum,pageSize);
        PageInfo<ArtisteSupplyContract> pageInfo = new PageInfo<>(list);
        return new ResponseEntity(pageInfo, HttpStatus.OK);
    }

    @RequestMapping(value = "/yirengongji_search",method = RequestMethod.POST)
    public ResponseEntity getAristeSupplyContractSearch(){
        return new ResponseEntity(aristeSupplyContractService.queryVoSearch(), HttpStatus.OK);
    }
}
