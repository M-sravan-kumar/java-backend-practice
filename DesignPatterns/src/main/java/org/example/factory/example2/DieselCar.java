package org.example.factory.example2;

public class DieselCar implements Car{

    @Override
    public Speaker setSpeaker() {
        return new JBL();
    }

    @Override
    public Tyre setTyre() {
        return new IMC();
    }

    @Override
    public String makeSound() {
        return "making sound from JBL";
    }
}
