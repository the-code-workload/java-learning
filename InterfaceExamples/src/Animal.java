public interface Animal {

    void makeSound();
    String eat();
    default void roam(){
        System.out.println("I am roaming as an animal!");
    }
}
