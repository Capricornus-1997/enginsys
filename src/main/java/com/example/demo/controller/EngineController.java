package com.example.demo.controller;

import com.example.demo.model.Engine;
import com.example.demo.service.IEngineService;
import com.example.demo.service.ServiceImpl.IEgineServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("engine")
public class EngineController {

    @Autowired
    IEngineService iEngineService;

    //添加工程
    @RequestMapping("/addEngine")
    public String addEngine(@RequestParam(value = "gcmc") String gcmc,@RequestParam(value = "dz") String dz){
        System.out.println(gcmc);
        System.out.println(dz);
//        Engine engine = new Engine();
//        engine.setGcmc("工程4");
//        engine.setDz("千岛湖镇新安大街111号");
//        engine.setDelete(0);
//        iEngineService.addEngine(engine);
        return "engine";
    }

    //删除工程
    @RequestMapping("/deleteEngine")
    public String deleteEngine(){
        int id = 1;
        iEngineService.deleteEngine(id);
        return "engine";
    }

    //修改工程
    @RequestMapping("/updateEngine")
    public String updateEngine(){
        Engine engine = new Engine();
        engine.setId(2);
        engine.setGcmc("工程修改");
        engine.setDz("新花园");
        iEngineService.updateEngine(engine);
        return "engine";
    }

    //查询工程
    @ResponseBody
    @RequestMapping("/selectEngine")
    public List<Engine> selectEngine(){
        ArrayList<Engine> engines = iEngineService.selectEngine();
        return engines;
    }


}
