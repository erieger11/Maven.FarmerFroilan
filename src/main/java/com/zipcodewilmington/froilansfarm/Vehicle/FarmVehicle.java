package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Person.Person;
import com.zipcodewilmington.froilansfarm.Person.Pilot;
import com.zipcodewilmington.froilansfarm.TheInterfaces.Vehicle_Interface;

public abstract class FarmVehicle implements Vehicle_Interface {

    public void fly() {
    }

    public String makeNoise() {
        return null;
    }

    @Override
    public void addRider(Person person) {

    }

    public void addRider(Pilot pilot) {
    }

    public boolean hasRidder() {
        return false;
    }

    public void removeRider() {
    }

    @Override
    public Boolean hasBeenRidden() {
        return null;
    }
}
