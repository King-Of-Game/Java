/**
 * @author: YiXuan
 * @project: java_demo
 * @software: IntelliJ IDEA
 * @date: 2022/4/28 9:49
 */

package com.jack.classes.override;




public class UseOverride {
    public static void main(String[] args) {
        Animal animal = new Animal("animal");
        animal.move();

        Animal dogA = new Dog("dogA", "bark");
        dogA.move();
        /**
         * 对象 dogA 调用 bark() 方法会抛出一个编译错误
         * 因为 dogA 的引用类型Animal没有bark方法。
         */
        // dogA.bark();

        Dog dog = new Dog("dog", "bark");
        dog.move();
        dog.bark();

    }
}
