package ua.lviv.iot2022;

import java.util.ArrayList;

public interface Animal {
    public void animalSound();
    public void feed();
}

class Dog implements Animal {

    @Override
    public void animalSound() {
        System.out.println("dog voice");
    }

    @Override
    public void feed() {
        System.out.println("dog ate");
    }
}

class Cat implements Animal {

    @Override
    public void animalSound() {
        System.out.println("cat voice");
    }

    @Override
    public void feed() {
        System.out.println("cat ate");
    }
}

class animalList{
    public static void main(String [] args) {
        ArrayList<Animal> anim = new ArrayList<Animal>();

        Dog dog = new Dog();
        anim.add(dog);
        Cat cat = new Cat();
        anim.add(cat);
        anim.toString();


        for(int i = 0; i < anim.size(); i++) {
            anim.get(i).animalSound();
            System.out.println(anim.get(i));
        }

    }
}