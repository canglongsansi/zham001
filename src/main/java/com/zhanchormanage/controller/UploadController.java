package com.zhanchormanage.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@Controller
public class UploadController {
    @RequestMapping("/AristeSupplyContract_upload")
    @ResponseBody
    public ResponseEntity AristeSupplyContractUpLoadFile(MultipartFile file) throws IllegalStateException, IOException {
        BufferedOutputStream stream = null;
        if (!file.isEmpty()) {
            String path = "C://AristeSupplyContract";
            File newFile=new File(path+"/"+file.getOriginalFilename());
            if(!newFile.exists()){
                newFile.createNewFile();
            }
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(newFile));
            out.write(file.getBytes());
            out.flush();
            out.close();
            return new ResponseEntity(HttpStatus.OK);
        }
        return null;
    }
    @RequestMapping("/ArtistBrokerageContract_upload")
    @ResponseBody
    public ResponseEntity ArtistBrokerageContractUpLoadFile(MultipartFile file) throws IllegalStateException, IOException {
        BufferedOutputStream stream = null;
        if (!file.isEmpty()) {
            String path = "C://ArtistBrokerageContract";
            File newFile=new File(path+"/"+file.getOriginalFilename());
            if(!newFile.exists()){
                newFile.createNewFile();
            }
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(newFile));
            out.write(file.getBytes());
            out.flush();
            out.close();
            return new ResponseEntity(HttpStatus.OK);
        }
        return null;
    }
    @RequestMapping("/CommentatorContract_upload")
    @ResponseBody
    public ResponseEntity CommentatorContractUpLoadFile(MultipartFile file) throws IllegalStateException, IOException {
        BufferedOutputStream stream = null;
        if (!file.isEmpty()) {
            String path = "C://CommentatorContract";
            File newFile=new File(path+"/"+file.getOriginalFilename());
            if(!newFile.exists()){
                newFile.createNewFile();
            }
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(newFile));
            out.write(file.getBytes());
            out.flush();
            out.close();
            return new ResponseEntity(HttpStatus.OK);
        }
        return null;
    }
    @RequestMapping("/ThreePartyContract_upload")
    @ResponseBody
    public ResponseEntity ThreePartyContractUpLoadFile(MultipartFile file) throws IllegalStateException, IOException {
        BufferedOutputStream stream = null;
        if (!file.isEmpty()) {
            String path = "C://ThreePartyContract";
            File newFile=new File(path+"/"+file.getOriginalFilename());
            if(!newFile.exists()){
                newFile.createNewFile();
            }
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(newFile));
            out.write(file.getBytes());
            out.flush();
            out.close();
            return new ResponseEntity(HttpStatus.OK);
        }
        return null;
    }
}
