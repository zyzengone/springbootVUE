package com.how2java.springboot.service.impl;

import com.how2java.springboot.mapper.HeroMapper;
import com.how2java.springboot.pojo.Hero;
import com.how2java.springboot.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class HeroServiceImpl implements HeroService {
    @Autowired
    HeroMapper heroMapper;
    public int add(Hero hero){
        return heroMapper.add(hero);
    }
    public void delete(int id){
        heroMapper.delete(id);
    }
    public Hero get(int id){
        return heroMapper.get(id);
    }
    public int update(Hero hero){
        return heroMapper.update(hero);
    }

    @Override
    public List<Hero> list() {
        return heroMapper.list();
    }
}
