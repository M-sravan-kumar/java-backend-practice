package org.example.factory.example2;

public class EvCar implements Car{

    @Override
    public Speaker setSpeaker() {
        return new Bose();
    }

    @Override
    public Tyre setTyre() {
        return new IMC();
    }

    @Override
    public String makeSound() {
        return "making sound from Bose";
    }

}
