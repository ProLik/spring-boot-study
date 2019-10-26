package com.prolik.java.springbootstudy;

import org.springframework.web.bind.annotation.*;


/**
 * @author kang.li
 * @version $Id: .java, v 1.0 2019/9/24 kang.li Exp
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello spring boot!";
    }

    @PostMapping("pay_upload")
    public String payUpload(@RequestBody PayUploadVo payUploadVo, @RequestParam("tp") String tp, @RequestParam("timestamp") String timestamp, @RequestParam("nonce") String nonce, @RequestParam("sn") String sn){
        System.out.println(payUploadVo);
        System.out.println(tp);
        System.out.println(timestamp);
        System.out.println(nonce);
        System.out.println(sn);
        return "{\"code\":\"success\"}";
    }


}
