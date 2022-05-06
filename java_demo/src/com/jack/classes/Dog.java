package com.jack.classes;


public class Dog extends Animal{
    public enum Breed{
        BREED1,
        BREED2,
        BREED3;

    }

    // 私有变量，仅在该类可见
    private Breed breed;

    public Dog(String name, int age, Color color, Size size, Breed breed) {
        super(name, age, color, size);
        this.breed = breed;
    }

    public Breed getBreed() {
        return this.breed;
    }
    public void setBreed(Breed breed) {
        this.breed = breed;
    }


    public int breedCode(Breed breed){
        switch (breed){
            case BREED1:
                return 1;
            case BREED2:
                return 2;
            case BREED3:
                return 3;
            default:
                return 0;
        }
    }



    public void eat(){
        String name = getName();
        System.out.printf("\n%s is eating\n", name);
    }
    public void run(){
        String name = getName();
        System.out.printf("\n%s is running\n", name);
    }
    public void sleep(){
        String name = getName();
        System.out.printf("\n%s is sleeping\n", name);
    }

    public void getInfo(){
        String name = getName();
        int age = getAge();
        String size = getSize().name();
        String bread = this.breed.name();
        String color = getColor().name();
        String info = "===The dog's info===" +
                "\nName: %s" +
                "\nAge: %d" +
                "\nSize: %s" +
                "\nBreed: %s" +
                "\nColor: %s" +
                "\n===The dog's info===";
        System.out.printf(info, name, age, size, bread, bread, color);
    }
}
