package com.czweb.service;

import org.springframework.stereotype.Service;

@Service
public class user {

    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  void test(){
        System.out.println("-------------------hhhhhh-----------------------");
    }
}
