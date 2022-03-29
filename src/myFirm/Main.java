package myFirm;

public class Main {

    public static void main(String[] args) {

        FleetOfCars fleetOfCars = new FleetOfCars();

        Car corvetteC3 = new GasolineCar("1234-CC", "Chevrolet", "Corvette C3 1971", 2, 7);
        Car dodgeChallenger = new GasolineCar("2345-DC", "Dodge", "Dodge Challenger SRT8", 2, 12);
        Car teslaModelS = new ElectricCar("3456-TM", "Tesla", "Tesla Model S", 4, 600, 50000);
        Car teslaRoadster = new ElectricCar("4567-TR", "Tesla", "Tesla Roadster", 2, 393, 25000);
        Car mercedesEClass = new DieselCar("5678-EC", "Mercedes-Benz", "Mercedes-Benz E-Klasse 220d", 2, 20, true);
        Car mercedesCClass = new DieselCar("6789-CC", "Mercedes-Benz", "Mercedes-Benz C-Klasse 220d", 2, 19, false);

        fleetOfCars.addCarToFleet(corvetteC3);
        fleetOfCars.addCarToFleet(dodgeChallenger);
        fleetOfCars.addCarToFleet(teslaModelS);
        fleetOfCars.addCarToFleet(teslaRoadster);
        fleetOfCars.addCarToFleet(mercedesEClass);
        fleetOfCars.addCarToFleet(mercedesCClass);

       // System.out.println(fleetOfCars);
       // System.out.println(fleetOfCars.getTotalRegistrationFeeForFleet());

        MainFeature mainFeature = new MainFeature();
        NewFeature newFeature = new NewFeature();

        System.out.println(mainFeature);
        System.out.println(newFeature);
    }
}
