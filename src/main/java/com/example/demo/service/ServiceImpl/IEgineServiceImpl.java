package com.example.demo.service.ServiceImpl;

import com.example.demo.mapper.EngineMapper;
import com.example.demo.model.Engine;
import com.example.demo.service.IEngineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

@Service
public class IEgineServiceImpl implements IEngineService {

    @Resource
    EngineMapper engineMapper;

    //添加工程
    @Override
    public int addEngine(Engine engine) {
        System.out.println(11);
        int i = engineMapper.addEngine(engine);
        System.out.println("添加"+i+"条数据");
        return 1;
    }

    //删除工程
    @Override
    public int deleteEngine(Integer id) {
        int i = engineMapper.deleteEngine(id);
        System.out.println("删除"+i+"条数据");
        return 0;
    }

    //修改工程
    @Override
    public int updateEngine(Engine engine) {
        int i = engineMapper.updateEngine(engine);
        System.out.println("修改"+i+"条数据");
        return 0;
    }

    //查询工程
    @Override
    public ArrayList<Engine> selectEngine() {
        ArrayList<Engine> engines = engineMapper.selectEngine();
        return engines;
    }
}
