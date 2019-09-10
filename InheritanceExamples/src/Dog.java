public class Dog extends  Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog's sound! as "+this.getType());
    }
}
