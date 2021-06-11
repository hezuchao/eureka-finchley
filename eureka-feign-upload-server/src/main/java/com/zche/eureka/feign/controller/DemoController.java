package com.zche.eureka.feign.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * Description：
 * Author：hezuchao
 * Date：2020/6/19 21:05
 */
@RestController
public class DemoController {

    @PostMapping(value = "/uploadFile", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String handleFileUpload(@RequestPart(value = "file") MultipartFile file) {
        System.out.println("--------------" + file.getName());
        System.out.println("--------------" + file.getOriginalFilename());
        return file.getOriginalFilename();
    }
}
