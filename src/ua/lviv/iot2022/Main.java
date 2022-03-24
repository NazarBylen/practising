package ua.lviv.iot2022;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.animalSound();
        dog.feed();
        cat.animalSound();
        cat.feed();
    }
}
