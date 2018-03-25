package com.pw.test.spring.security.controller;

import com.alibaba.fastjson.JSON;
import com.pw.test.spring.security.entity.SysUser;
import com.pw.test.spring.security.repository.SysUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.util.List;

@RestController
@RequestMapping("/test")
public class TesTController {

    @Autowired
    private SysUserRepository sysUserRepository;


    @RequestMapping("/t1")
    public String test1() throws Exception{
        List<SysUser> all = sysUserRepository.findAll();
        OutputStream stream = new FileOutputStream(new File("D:\\test.txt"));
        String json = JSON.toJSONString(all);
        stream.write(json.getBytes());
        stream.close();
        return "OK";
    }


    @RequestMapping("/t2")
    public String test2() throws Exception{
        InputStream stream = new FileInputStream(new File("D:\\test.txt"));
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        StringBuffer stringBuffer = new StringBuffer();
        String lineTxt = null;
        while ((lineTxt = reader.readLine()) != null) {
            System.out.println(lineTxt);
            stringBuffer.append(lineTxt);
        }
        return stringBuffer.toString();
    }

}
