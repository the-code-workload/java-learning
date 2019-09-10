package com.learning;

public class Deer implements  Animal, TypeOfAnimal {
    @Override
    public void makeSound() {
        System.out.println("I am a deer!");
    }

    @Override
    public String eat() {
        return "I am eating as zoo animal";
    }

    @Override
    public void getType() {
        System.out.println("I am a zoo animal");
    }

//    public void roam(){
//        System.out.println("I am roaming in jungle!");
//    }
}
