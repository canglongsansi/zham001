package com.zhanchormanage.controller;

import org.apache.commons.io.FileUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;

@Controller
public class DownLoadController {
    @RequestMapping(value = "/fileDownLoad_artiste_supply.action", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<byte[]> fileDownLoadArtisteSupply(@RequestParam("fileName") String fileName) throws Exception {
        String path = "C://AristeSupplyContract/" + fileName;
        File file = new File(path);
        HttpHeaders headers = new HttpHeaders();
        // String fileName=new
        // String("你好.xlsx".getBytes("UTF-8"),"iso-8859-1");//为了解决中文名称乱码问题
        String fileNameToUTF8 = new String(file.getName().getBytes("UTF-8"), "iso-8859-1");// 为了解决中文名称乱码问题
        headers.setContentDispositionFormData("attachment", fileNameToUTF8);
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/fileDownLoad_artist_brokerage.action",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<byte[]> fileDownLoadArtistBrokerage(@RequestParam("fileName") String fileName) throws Exception {
        String path = "C://ArtistBrokerageContract/"+fileName;
        File file = new File(path);
        HttpHeaders headers = new HttpHeaders();
        // String fileName=new
        // String("你好.xlsx".getBytes("UTF-8"),"iso-8859-1");//为了解决中文名称乱码问题
        String fileNameToUTF8 = new String(file.getName().getBytes("UTF-8"), "iso-8859-1");// 为了解决中文名称乱码问题
        headers.setContentDispositionFormData("attachment", fileNameToUTF8);
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers, HttpStatus.CREATED);
    }
    @RequestMapping(value = "/fileDownLoad_commentator.action",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<byte[]> fileDownLoadCommentator(@RequestParam("fileName") String fileName) throws Exception {
        String path = "C://CommentatorContract/"+fileName;
        File file = new File(path);
        HttpHeaders headers = new HttpHeaders();
        // String fileName=new
        // String("你好.xlsx".getBytes("UTF-8"),"iso-8859-1");//为了解决中文名称乱码问题
        String fileNameToUTF8 = new String(file.getName().getBytes("UTF-8"), "iso-8859-1");// 为了解决中文名称乱码问题
        headers.setContentDispositionFormData("attachment", fileNameToUTF8);
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers, HttpStatus.CREATED);
    }
    @RequestMapping(value = "/fileDownLoad_three_party_contract.action",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<byte[]> fileDownLoadThreePartyContract(@RequestParam("fileName") String fileName) throws Exception {
        String path = "C://ThreePartyContract/"+fileName;
        File file = new File(path);
        HttpHeaders headers = new HttpHeaders();
        // String fileName=new
        // String("你好.xlsx".getBytes("UTF-8"),"iso-8859-1");//为了解决中文名称乱码问题
        String fileNameToUTF8 = new String(file.getName().getBytes("UTF-8"), "iso-8859-1");// 为了解决中文名称乱码问题
        headers.setContentDispositionFormData("attachment", fileNameToUTF8);
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file), headers, HttpStatus.CREATED);
    }
}


