public abstract class Animal {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract void makeSound();

    public void eat(){
        System.out.println("I am eating as "+this.type);
    }
}

