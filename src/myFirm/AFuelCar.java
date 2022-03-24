package myFirm;

public abstract class AFuelCar extends ACar {

    int kmPerLitre;

    public AFuelCar(String regNumber, String make, String model, int numOfDoors, int kmPerLiter) {
        super(regNumber, make, model, numOfDoors);
        this.kmPerLitre = kmPerLiter;
    }

    abstract String getFuelType();

    public int kmPrLitre() {
        return kmPerLitre;
    }

    @Override
    public int getRegistrationFee() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + "Kilometer per litre: " + kmPerLitre;
    }
}
