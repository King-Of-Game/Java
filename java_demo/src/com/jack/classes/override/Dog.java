package com.jack.classes.override;

public class Dog extends Animal{
    private String skill;

    public Dog(String name, String skill){
        super(name);

        this.skill = skill;
    }

    public void move(){
        System.out.println("狗可以跑和走");
    }
    public void bark(){
        System.out.println("狗可以吠叫");
    }
}
