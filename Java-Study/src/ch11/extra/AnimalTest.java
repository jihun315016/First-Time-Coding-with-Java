package ch11.extra;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a1 = new Dog("Buddy");
        Animal a2 = new Cat("Nabby");

        a1.makeSound();
        a2.makeSound();       
    }
}
