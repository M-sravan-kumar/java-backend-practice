package org.example.factory;

import org.example.factory.example1.Animal;
import org.example.factory.example1.AnimalFactory;
import org.example.factory.example1.Dog;
import org.example.factory.example2.Car;
import org.example.factory.example2.Tata;

public class Client {
    public static void main(String[] args) {
//        AnimalFactory animalFactory  = new AnimalFactory();
//        Animal dog =  animalFactory.getAnimal("cat");
//        System.out.println(dog.makeSound());

        Tata tata = new Tata("petrol");
        Car car =  tata.createCar();
        System.out.println(car.makeSound());
    }
}
