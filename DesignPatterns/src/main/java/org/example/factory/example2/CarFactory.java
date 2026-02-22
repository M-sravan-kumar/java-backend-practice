package org.example.factory.example2;

import javax.security.auth.kerberos.KerberosTicket;

public class CarFactory {
    public static Car getCar(String type)
    {
        if(type=="EV")
            return new EvCar();
        else if(type=="Diesel")
            return new DieselCar();
        else if(type=="petrol")
            return  new PetrolCar();
        else
            return null;
    }

}
