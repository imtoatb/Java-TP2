public class Odometer {
    private double total;
    private double partiel;

    public Odometer(double total, double partiel) {
        this.total = 0.0;
        this.partiel = 0.0;
    }

    public double getTotal() {
        return total;
    }
    public void setTotal(float total) {
        this.total = total;
    }

    public double getPartiel() {
        return partiel;
    }
    public void setPartiel(float partiel) {
        this.partiel = partiel;
    }

    public void addKilometers(double kilometers) {
        if (kilometers <= 0) {
            throw new IllegalArgumentException("Kilometers must be positive");
        }

        this.total += kilometers;
        this.partiel += kilometers;


        if (this.partiel == 1000.0) {
            this.partiel = 0.0;
        }
        else if (this.partiel > 1000.0) {
            this.partiel -= 1000.0;
        }
    }

    public void resetPartiel() {
        this.partiel = 0.0;
    }

    @Override
    public String toString() {
        return "Odometer = [Total: " + this.total + " km | Partiel: " + this.partiel + " km]";
    }
}
