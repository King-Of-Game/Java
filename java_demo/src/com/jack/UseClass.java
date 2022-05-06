package com.jack;


import com.jack.classes.*;

public class UseClass {

    public static void main(String[] args){
        useDogClass();
//        useInstanceVariable();
//        useStaticVariable();

    }


    // dog class
    static void useDogClass(){
        Dog dog = new Dog("puppy", 8, Dog.Color.BLACK, Dog.Size.SMALL, Dog.Breed.BREED1);
        dog.getInfo();
        dog.run();

        int breedCode = dog.breedCode(dog.getBreed());
        int colorCode = dog.colorCode(dog.getColor());
        int sizeCode = dog.sizeCode(dog.getSize());
        System.out.printf("breedCode: %d, colorCode: %d, sizeCode: %d", breedCode,colorCode, sizeCode);
    }


    // instance variable class
    static void useInstanceVariable(){
        InstanceVariable instanceVariable = new InstanceVariable("jack");
        System.out.println(instanceVariable.name);
        instanceVariable.printInfo();
    }

    // static variable class
    static void useStaticVariable(){
        double salary = StaticVariable.salary;
        System.out.println(salary);
        salary = StaticVariable.salary = 3.1415926;
        System.out.println(salary);
    }
}
