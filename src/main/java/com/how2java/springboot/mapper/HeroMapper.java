package com.how2java.springboot.mapper;

import com.how2java.springboot.pojo.Hero;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HeroMapper {
    int add(Hero hero);
    void delete(int id);
    Hero get(int id);
    int update(Hero hero);
    List<Hero> list();
}
