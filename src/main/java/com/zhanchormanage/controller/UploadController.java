package com.zhanchormanage.controller;

import com.sun.deploy.net.HttpResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletResponse;
import java.io.*;

@Controller
public class UploadController {
    @RequestMapping("/AristeSupplyContract_upload")
    @ResponseBody
    public void AristeSupplyContractUpLoadFile(MultipartFile file,HttpServletResponse httpServletResponse) throws IllegalStateException, IOException {
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
            //TODO 重定向不如ajax异步刷新好，因为重定向的话会重新加载布局，如果用户在第n页，重定向会让页面重新进入第1页展示，否则需要记录当前用户的所在的页码数，很麻烦
            httpServletResponse.setCharacterEncoding("utf-8");
            PrintWriter pw = httpServletResponse.getWriter();
            pw.print(
                    "<script charset='UTF-8' language='javascript'>alert('上传成功！');" +
                            "window.location.href='supply.html';" +
                    "</script>");
        }
    }
    @RequestMapping("/ArtistBrokerageContract_upload")
    @ResponseBody
    public void ArtistBrokerageContractUpLoadFile(MultipartFile file,HttpServletResponse httpServletResponse) throws IllegalStateException, IOException {
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
            httpServletResponse.setCharacterEncoding("utf-8");
            PrintWriter pw = httpServletResponse.getWriter();
            pw.print(
                    "<script charset='UTF-8' language='javascript'>alert('上传成功！');" +
                            "window.location.href='artist.html';" +
                    "</script>");
        }
    }
    @RequestMapping("/CommentatorContract_upload")
    @ResponseBody
    public void CommentatorContractUpLoadFile(MultipartFile file, HttpServletResponse httpResponse) throws IllegalStateException, IOException {
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
            httpResponse.setCharacterEncoding("utf-8");
            PrintWriter pw = httpResponse.getWriter();
            pw.print(
                    "<script charset='UTF-8' language='javascript'>alert('上传成功！');" +
                            "window.location.href='commentator.html';" +
                    "</script>");
        }
    }
    @RequestMapping("/ThreePartyContract_upload")
    @ResponseBody
    public void ThreePartyContractUpLoadFile(MultipartFile file,HttpServletResponse httpServletResponse) throws IllegalStateException, IOException {
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
            httpServletResponse.setCharacterEncoding("utf-8");
            PrintWriter pw = httpServletResponse.getWriter();
            pw.print(
                    "<script charset='UTF-8' language='javascript'>alert('上传成功！');" +
                            "window.location.href='threePart.html';" +
                    "</script>");
        }
    }
}
