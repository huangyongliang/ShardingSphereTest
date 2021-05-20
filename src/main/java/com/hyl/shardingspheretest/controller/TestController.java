package com.hyl.shardingspheretest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hyl.shardingspheretest.service.intf.IFirst;

/**
 * @author huangyl25800@yunrong.cn
 * @version V3.0
 * @since 3.0.3 2021-05-19 17:02
 */
@RestController
public class TestController {

    @Autowired
    private IFirst first;

    @GetMapping("/add")
    public String add(){
          return first.add();
    }

    @GetMapping("/query")
    public String query( @RequestParam("id") int id){
       return first.select(id);
    }

}
