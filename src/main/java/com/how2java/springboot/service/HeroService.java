package com.how2java.springboot.service;

import com.how2java.springboot.pojo.Hero;

import java.util.List;

public interface HeroService {
    int add(Hero hero);
    void delete(int id);
    Hero get(int id);
    int update(Hero hero);
    List<Hero>  list();
}
