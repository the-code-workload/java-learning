public class Application {

    public static void main(String[] args) {
        Animal animal = new Dog();
        // animal = new Wolf();
        //animal = new Deer();
        System.out.println(animal.eat());
        animal.makeSound();
        animal.roam();

        Animal animal1 = getAnimal();
        Animal animal2 = animal1;

        Animal a = new Dog();
        Animal b = new Wolf();
        System.out.println(a instanceof Animal);
        System.out.println(a instanceof Dog);
        System.out.println(a instanceof Wolf);
        System.out.println(a instanceof Object);





    }

    private static Animal getAnimal() {

        return new Dog();
    }
}
