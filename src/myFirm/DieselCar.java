package myFirm;

public class DieselCar extends AFuelCar{

    public boolean particleFilter;

    public DieselCar(String regNumber, String make, String model, int numOfDoors, int kmPerLiter, boolean particleFilter) {
        super(regNumber, make, model, numOfDoors, kmPerLiter);
        this.particleFilter = particleFilter;
    }

    @Override
    String getFuelType() {
        return "Diesel";
    }

    @Override
    public int getRegistrationFee() {
        int kmPerLitre = kmPrLitre();
        int price = 0;
        boolean particleFilter = hasParticleFilter();

        if (kmPerLitre <= 50 && kmPerLitre >= 20) {
            price = 330 + 130;
        } else if (kmPerLitre < 20 && kmPerLitre >= 15) {
            price = 1050 + 1390;
        } else if (kmPerLitre < 15 && kmPerLitre >= 10) {
            price = 2340 + 1850;
        } else if (kmPerLitre < 10 && kmPerLitre >= 5) {
            price = 5500 + 2770;
        } else if (kmPerLitre < 5) {
            price = 10470 + 15260;
        }

        if (particleFilter == false) {
            price -= 1000;
        }
        return price;
    }

    public boolean hasParticleFilter() {
        return particleFilter;
    }


    @Override
    public String toString() {
        return super.toString() + "\nRegistration fee: " + getRegistrationFee() + "\nHas particle filter: " + hasParticleFilter()+ "\n\n";
    }
}
