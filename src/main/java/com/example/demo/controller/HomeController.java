package com.example.demo.controller;

import com.example.demo.model.Engine;
import com.example.demo.model.Menu;
import com.example.demo.service.IEngineService;
import com.example.demo.service.IMenueService;
import com.example.demo.service.ServiceImpl.IEgineServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("home")
public class HomeController {

    @Autowired
    IMenueService iMenueService;


    @Resource
    IEngineService iEngineService;

    @ResponseBody
    @RequestMapping("/menu")
    public List<Menu> menu(){
        List<Menu> menus = iMenueService.selectMenu();
        return menus;
    }

    @RequestMapping("/index")
    public ModelAndView index(){
        List<Menu> menus = iMenueService.selectMenu();
        ModelAndView mv = new ModelAndView();
        mv.addObject("menus",menus);
        mv.setViewName("index");
        return mv;
    }



    @RequestMapping("/engine")
    public ModelAndView engine(){
        ArrayList<Engine> engines = iEngineService.selectEngine();
        ModelAndView mv = new ModelAndView();
        mv.addObject("engines",engines);
        mv.setViewName("engine");
        return mv;
    }

    @RequestMapping("/hrmresource")
    public String hrmresource(){
        return "hrmresource";
    }

    @RequestMapping("/material")
    public String material(){
        return "material";
    }

    @RequestMapping("/attendance")
    public String attendance(){
        return "attendance";
    }





}
