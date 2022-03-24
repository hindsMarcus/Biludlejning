package myFirm;

public interface Car {

    //The number on the number plate
    String getRegistrationNumber();

    // The make of the car
    String getMake();

    // The model of the car
    String getModel();

    // The number of doors
    int getNumberOfDoors();

    // Calculates the registration fee for the car
    int getRegistrationFee();
}
