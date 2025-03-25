public class Odometer {
    private double total;
    private double partiel;

    public Odometer() {
        this.total = 0.0;
        this.partiel = 0.0;
    }

    public double getTotal() {
        return total;
    }

    public double getPartiel() {
        return partiel;
    }

    public void increment(double kilometers) {
        if (kilometers > 0) {
            this.total += kilometers;
            this.partiel += kilometers;

            // Handle partiel reset when reaching 1000 km
            if (this.partiel >= 1000.0) {
                this.partiel %= 1000.0;
            }
        }
    }

    public void resetPartiel() {
        this.partiel = 0.0;
    }

    @Override
    public String toString() {
        return String.format("[total = %.0f | partial = %.0f]", total, partiel);
    }
}