public class Garage {
    
    private Vehicle[] vehicles;
    private int count;

    public Garage() {
        this.vehicles = new Vehicle[100];
        this.count = 0;
    }


    public boolean addVehicle(Vehicle vehicle) {
        if (count < 100) {
            vehicles[count++] = vehicle;
            return true;
        }
        return false;
    }

    public int removeHighMileageVehicles(double threshold) {
        int removed = 0;
        for (int i = 0; i < count; i++) {
            if (vehicles[i].getOdometer().getTotal() > threshold) {
                // Shift remaining vehicles left
                for (int j = i; j < count - 1; j++) {
                    vehicles[j] = vehicles[j + 1];
                }
                count--;
                i--; // Check current index again as we shifted elements
                removed++;
            }
        }
        return removed;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Garage Contents:\n");
        for (int i = 0; i < count; i++) {
            sb.append(vehicles[i].toString()).append("\n");
        }
        sb.append("Total vehicles: ").append(count);
        return sb.toString();
    }
}