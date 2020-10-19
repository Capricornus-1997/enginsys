package com.example.demo.service;

import com.example.demo.model.Engine;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public interface IEngineService {

    //添加工程
    int addEngine(Engine engine);

    //删除工程
    int deleteEngine(Integer id);

    //修改工程
    int updateEngine(Engine engine);

    //查询工程
    ArrayList<Engine>  selectEngine();

}
