public class Dog extends Animal {

    // Animal methods
    @Override
    public void makeSound() {
        System.out.println("Woof.");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }

    @Override
    public void mood(boolean happy) {
        System.out.println(happy ? "Logrer." : "Knurrer.");
    }
}
