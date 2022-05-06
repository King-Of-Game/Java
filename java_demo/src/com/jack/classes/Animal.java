/**
 * @author: YiXuan
 * @project: java_demo
 * @software: IntelliJ IDEA
 * @date: 2022/4/3 16:30
 */

package com.jack.classes;



public class Animal {



    public enum Color{
        WHITE,
        BLACK,
        OTHER;
    }

    public enum Size{
        BIG,
        MID,
        SMALL
    }

    private String name;
    private int age;
    private Color color;
    private Size size;

    public Animal(String name, int age, Color color, Size size) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.size = size;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }
    public void setSize(Size size) {
        this.size = size;
    }



    public int colorCode(Color color){
        switch (color){
            case WHITE:
                return 1;
            case BLACK:
                return 2;
            case OTHER:
                return 3;
            default:
                return 0;
        }
    }

    public int sizeCode(Size size){
        switch (size){
            case SMALL:
                return 1;
            case MID:
                return 2;
            case BIG:
                return 3;
            default:
                return 0;
        }
    }



    public void getInfo(){
        System.out.println("My name is " + this.name);
        System.out.printf("I'm %d years old\n", age);
        System.out.println("My color is " + this.color.name());
        System.out.printf("I'm %s animal\n", this.size.name());
    }

}
