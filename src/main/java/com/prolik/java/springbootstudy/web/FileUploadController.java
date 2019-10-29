package com.prolik.java.springbootstudy.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@RestController
public class FileUploadController {

    private static Logger LOGGER = LoggerFactory.getLogger(FileUploadController.class);

    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");


    @PostMapping("/upload")
    public String upload(MultipartFile uploadFile, HttpServletRequest request){
        String realPath = request.getServletContext().getRealPath("/uploadFile/");
        String format = df.format(new Date());
        File file = new File(realPath + format);
        if(file.isDirectory()){
            file.mkdirs();
        }

        String oldName = uploadFile.getOriginalFilename();
        String newName = UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf("."), oldName.length());
        try {
            uploadFile.transferTo(new File(file, newName));
            String filePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + "/uploadFile/" + format + newName;
            return filePath;
        }catch (IOException ioe){
            LOGGER.error("文件保存失败", ioe);
        }
        return "文件上传失败！";
    }
}
