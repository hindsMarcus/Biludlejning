package myFirm;

public class ElectricCar extends ACar{

    public int maxRangeKM;
    public int batteryCapacity;

    public ElectricCar(String regNumber, String make, String model, int numOfDoors, int maxRange, int batteryCap) {
        super(regNumber, make, model, numOfDoors);
        this.maxRangeKM = maxRange;
        this.batteryCapacity = batteryCap;
    }

    public int getMaxRangeKM() {
        return this.maxRangeKM;
    }

    public int getBatteryCapacity() {
        return this.batteryCapacity;
    }

    public int getWhPrKM() {
        return getBatteryCapacity() / getMaxRangeKM();
    }

    @Override
    public int getRegistrationFee() {
        double whPerKM = (getWhPrKM() / 91.25);
        whPerKM = 100 / whPerKM;

        if (whPerKM <= 50 && whPerKM >= 20) {
            return 330;
        } else if (whPerKM < 20 && whPerKM >= 15) {
            return 1050;
        } else if (whPerKM < 15 && whPerKM >= 10) {
            return 2340;
        } else if (whPerKM < 10 && whPerKM >= 5) {
            return 5500;
        } else  {
            return 10470;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Registration fee: " + getRegistrationFee() + "\nWatt hours per kilometer: " + getWhPrKM() +"\n\n";
    }
}
