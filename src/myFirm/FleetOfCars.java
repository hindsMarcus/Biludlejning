package myFirm;

import java.util.ArrayList;

public class FleetOfCars {


    public ArrayList<Car> fleetOfCars = new ArrayList<>();

    
    public void addCarToFleet(Car car) {
        fleetOfCars.add(car);
        fleetOfCars.re
    }

    @Override
    public String toString() {
        return "Fleet of cars: " + fleetOfCars;
    }

    public String getTotalRegistrationFeeForFleet() {
        int totalRegistrationFee = 0;

        for (Car x : fleetOfCars) {
            totalRegistrationFee += x.getRegistrationFee();
        }
        return "Total fee of the fleet of cars: \n" + totalRegistrationFee;
    }
}
