package com.how2java.springboot.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.how2java.springboot.pojo.Hero;
import com.how2java.springboot.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class HeroController {
    @Autowired
    HeroService heroService;
    //restful部分
    @GetMapping("/heroes")
    public PageInfo<Hero> list(@RequestParam(value = "start",defaultValue = "1")int start,@RequestParam(value = "size",defaultValue = "5") int
                               size) throws Exception{
        PageHelper.startPage(start,size,"id desc");
        List<Hero> hs = heroService.list();
        PageInfo<Hero> page = new PageInfo<>(hs,5); //5表示能看到的分页为5页
        return page;
    }
    @GetMapping("/heroes/{id}")
    public Hero get(@PathVariable("id") int id) throws Exception{
        Hero h = heroService.get(id);
        return h;
    }
    @DeleteMapping("hero/{id}")
    public String delete(int id) throws Exception{
        heroService.delete(id);
        return "success";
    }
    @
}
