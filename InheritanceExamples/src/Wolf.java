public class Wolf extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Wolf's sound! as "+this.getType());
    }
}
