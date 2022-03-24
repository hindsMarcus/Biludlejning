package myFirm;

public class GasolineCar extends AFuelCar {

    public GasolineCar(String regNumber, String make, String model, int numOfDoors, int kmPerLiter) {
        super(regNumber, make, model, numOfDoors, kmPerLiter);
    }

    @Override
    String getFuelType() {
        return "Gasoline";
    }

    @Override
    public int getRegistrationFee() {
        int kmPerLitre = kmPrLitre();
        int price = 0;

        if (kmPerLitre <= 50 && kmPerLitre >= 20) {
            price = 330;
        } else if (kmPerLitre < 20 && kmPerLitre >= 15) {
            price = 1050;
        } else if (kmPerLitre < 15 && kmPerLitre >= 10) {
            price = 2340;
        } else if (kmPerLitre < 10 && kmPerLitre >= 5) {
            price = 5500;
        } else if (kmPerLitre < 5) {
            price = 10470;
        }
        return price;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRegistration fee: " + getRegistrationFee() +"\n\n";
    }
}
