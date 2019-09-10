public class Application {

    public static void main(String[] args) {
        Animal animal = new Dog();
        // animal = new Wolf();
        //animal = new Deer();
        System.out.println(animal.eat());
        animal.makeSound();
        animal.roam();
    }
}
