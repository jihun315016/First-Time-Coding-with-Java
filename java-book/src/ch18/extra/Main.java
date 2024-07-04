package ch18.extra;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("xxxxx");
            }
        };

        animal.makeSound();
    }
}
