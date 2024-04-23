public class Dog extends Animal {

    // Animal method
    @Override
    public void makeSound() {
        System.out.println("Woof.");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }
}
