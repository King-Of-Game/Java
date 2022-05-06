/**
 * @author: YiXuan
 * @project: java_demo
 * @software: IntelliJ IDEA
 * @date: 2022/4/30 0:02
 */

package com.jack.classes.polymorphic;


abstract class Animal{
    void eat(){
        System.out.println("Any animal can eat");
    }
}

class Cat extends Animal{
    void eat(){
        System.out.println("cat like eating fish");
    }
    void work(){
        System.out.println("cat can crap mouse");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("dog like eating bone");
    }
    void work(){
        System.out.println("dog can defend house");
    }
}


/**
 * 多态存在的三个必要条件
 * 1. 继承
 * 2. 重写
 * 3. 父类引用指向子类对象：Parent p = new Child();
 *
 * 什么是多态？
 * 多态是同一个行为具有多个不同表现形式或形态的能力。
 * 比如：狗和猫都会吃，但是狗吃骨头，猫吃鱼
 *      它们都属于动物（继承）
 *      它们吃的行为不同（重写）
 *      它们的引用类型可以是 Animal（Animal a = new Cat()）
 *
 * 多态的实现方式
 * 1. 重写
 * 2. 接口
 * 3. 抽象类和抽象方法
 * 心得：抽象类和接口非常相似，它们一般都只定义好方法头，方法体则交给继承了他们的类去补充
 */
public class UsePolymorphic {
    public static void main(String[] args) {
        show(new Cat());
        show(new Dog());

        Animal animal = new Cat();
        animal.eat();
        Cat cat = new Cat();
        cat.work();
    }


    static void show(Animal animal){
        animal.eat();

        if (animal instanceof Cat){
            Cat cat = new Cat();
            cat.work();
        }
        else{
            Dog dog = new Dog();
            dog.work();
        }
    }
}
