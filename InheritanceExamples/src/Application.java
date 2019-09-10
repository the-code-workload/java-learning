public class Application {
    public static void main(String[] args) {
        Animal a = new Dog();
        Animal b = new Wolf();

        a.setType("Pet");
        b.setType("Jungle");

        a.makeSound();
        b.makeSound();

        a.eat();
        b.eat();

    }
}
