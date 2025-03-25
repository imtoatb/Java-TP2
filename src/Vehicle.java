public class Vehicle {

    private static int registrationCounter = 1;

    private final int registrationNumber;
    private final Odometer odometer;
    private double fuelGauge;
    private final double consumption;  // liters per 100 km


    public Vehicle(double consumption) {
        this.registrationNumber = registrationCounter++;
        this.odometer = new Odometer();
        this.fuelGauge = 50.0;
        this.consumption = consumption;
    }


    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public Odometer getOdometer() {
        return odometer;
    }

    public double getFuelGauge() {
        return fuelGauge;
    }

    // Fuel methods
    public void fillUp(double liters) {
        if (liters <= 0) return;
        fuelGauge = Math.min(50.0, fuelGauge + liters);
    }

    public void fullFillUp() {
        fuelGauge = 50.0;
    }

    // Drive method
    public double drive(double desiredDistance) {
        if (desiredDistance <= 0) return 0;

        double maxPossibleDistance = (fuelGauge * 100) / consumption;
        double actualDistance = Math.min(desiredDistance, maxPossibleDistance);

        odometer.increment(actualDistance);
        fuelGauge -= (actualDistance * consumption) / 100;

        return actualDistance;
    }

    // toString method
    @Override
    public String toString() {
        return String.format("Vehicle %d : counter = %s ;; fuel gauge = %.5f",
                registrationNumber,
                odometer.toString(),
                fuelGauge);
    }
}