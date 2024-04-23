public class Cat extends Animal {

    // Animal method
    @Override
    public void makeSound() {
        System.out.println("Meow.");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }
}