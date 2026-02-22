package org.example.factory.example1;

public class AnimalFactory {

    public Animal getAnimal(String animal)
    {
        if(animal=="dog")
            return new Dog();
        else
            return new Cat();
    }
}
