public class Main {
    public static void main(String[] args) {

        Animal cat = new Cat();
        Animal dog = new Dog();

        cat.makeSound();
        dog.makeSound();

        cat.eat("fish");
        dog.eat("dogfood");

        cat.mood(true);
        dog.mood(false);
    }
}