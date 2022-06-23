package com.jack.classes.override;

public class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
        getInfo();
    }

    public void move(){
        System.out.println("动物可以移动");
    }

    public void getInfo(){
        System.out.printf("My name is %s\n", this.name);
    }
}
