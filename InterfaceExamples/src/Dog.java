public class Dog implements Animal, TypeOfAnimal {
    @Override
    public void makeSound() {
        System.out.println("I am a dog!");
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
