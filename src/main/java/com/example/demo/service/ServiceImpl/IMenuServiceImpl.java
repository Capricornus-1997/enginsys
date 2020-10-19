package com.example.demo.service.ServiceImpl;

import com.example.demo.mapper.MenuMapper;
import com.example.demo.model.Menu;
import com.example.demo.service.IMenueService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class IMenuServiceImpl implements IMenueService {

    @Resource
    MenuMapper menuMapper;

    @Override
    public List<Menu> selectMenu() {
        List<com.example.demo.model.Menu> menus = menuMapper.selectMenu();

        ArrayList<Menu> meunList = new ArrayList<>();
        //数据处理
        for (Menu fmenu : menus) {
            Integer id = fmenu.getId();
            for (Menu zmenu : menus) {
                ArrayList<Menu> zmenuList = new ArrayList<>();
                if (zmenu.getFid()==id){
                    Menu menu = new Menu();
                    menu.setText(zmenu.getText());
                    menu.setUrl(zmenu.getUrl());
                    zmenuList.add(menu);
                    fmenu.setChildren(zmenuList);
                }
            }
            if (fmenu.getFid()==null){
                Menu menu = new Menu();
                menu.setText(fmenu.getText());
                menu.setStatue(fmenu.getStatue());
                menu.setIconCls(fmenu.getIconCls());
                menu.setChildren(fmenu.getChildren());
                meunList.add(menu);
            }

        }
        return meunList;
    }
}
