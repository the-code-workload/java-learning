package com.learning;

public class Wolf implements Animal, TypeOfAnimal {
    @Override
    public void makeSound() {
        System.out.println("I am making sound as wolf!");
    }

    @Override
    public String eat() {
        return "I am eating as jungle animal";
    }

    @Override
    public void getType() {
        System.out.println("I live as jungle animal");
    }
}
