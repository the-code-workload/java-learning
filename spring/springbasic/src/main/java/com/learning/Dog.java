package com.learning;

import org.springframework.beans.factory.annotation.Autowired;

public class Dog implements Animal, TypeOfAnimal {

    AnimalPlace animalPlace;

    public void setAnimalPlace(AnimalPlace animalPlace) {
        this.animalPlace = animalPlace;
    }

    @Override
    public void makeSound() {
        System.out.println("I am a dog!");
        animalPlace.getPlace();
    }

    @Override
    public String eat() {
       return "I am eating as pet";
    }

    @Override
    public void getType() {
        System.out.println("I am a pet animal");
    }
}
