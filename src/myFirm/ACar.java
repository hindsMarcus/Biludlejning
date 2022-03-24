package myFirm;

public abstract class ACar implements Car {

    String regNumber;
    String make;
    String model;
    int numOfDoors;

    public ACar(String regNumber, String make, String model, int numOfDoors) {
        this.regNumber = regNumber;
        this.make = make;
        this.model = model;
        this.numOfDoors = numOfDoors;
    }

    @Override
    public String getRegistrationNumber() {
        return this.regNumber;
    }

    @Override
    public String getMake() {
        return this.make;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public int getNumberOfDoors() {
        return this.numOfDoors;
    }


    @Override
    public String toString() {
        return "\nRegistration number: " + regNumber + "\nMake: " + make + "\nModel: " + model + "\nNumber of doors: " + numOfDoors + "\n";
    }

}
