public class Main {
    public static void main(String[] args) {
        /*
        CurrentDate d1 = new CurrentDate(0,0,0);
        d1.setDay(27);
        d1.setMonth(3);
        d1.setYear(2025);
        System.out.println("The date d1 is = " + d1);

        CurrentDate d2 = new CurrentDate(15, 4, 2024);
        System.out.println("The date d2 is = " + d2);

        if (!d1.equals(d2)) {
            System.out.println(d1 + " is different of " + d2);
        }

        System.out.println("The day of d2 is: " + d2.getDay());
        System.out.println("The month of d2 is: " + d2.getMonth());

        Odometer odometer = new Odometer(0.0, 0.0);
        System.out.println(odometer);

        odometer.addKilometers(500.0);
        odometer.addKilometers(600.0);
        System.out.println(odometer);

        odometer.resetPartiel();
        System.out.println(odometer);
        */

        /*
        Vehicle vehicle0 = new Vehicle(5.3);
        System.out.println("Vehicle 0 : " + vehicle0);

        vehicle0.drive(100.1);
        System.out.println("Vehicle 0 drive 100.0");
        System.out.println("Vehicle 0 : " + vehicle0);

        vehicle0.drive(300.99);
        System.out.println("vehicle 0 drive 300.0");
        System.out.println("Vehicle 0 : " + vehicle0);

        vehicle0.drive(543.0);
        System.out.println("vehicle 0 drive 543.39");
        System.out.println("Vehicle 0 : " + vehicle0);

        vehicle0.fullFillUp();
        System.out.println("Vehicle 0 : " + vehicle0);

        vehicle0.drive(260.0);
        System.out.println("vehicle 0 drive 260.0");
        System.out.println("Vehicle 0 : " + vehicle0);

        try {
            vehicle0.fillUp(60.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Tank capacity is not enough to fill up 60.0 liters of fuel !");
        }
        System.out.println("Vehicle 0 : " + vehicle0);

        vehicle0.fillUp(12.0);
        System.out.println("Vehicle 0 : " + vehicle0);

        Vehicle vehicle1 = new Vehicle(6.0); // Consumption doesn't matter for this test
        System.out.println("Vehicle 1 : " + vehicle1);
        */

        Garage garage = new Garage();
        Vehicle v1 = new Vehicle(5.0);
        v1.drive(500);

        Vehicle v2 = new Vehicle(6.0);
        v2.drive(1500);

        Vehicle v3 = new Vehicle(7.0);
        v3.drive(800);

        Vehicle v4 = new Vehicle(8.0);
        v4.drive(200);

        garage.addVehicle(v1);
        garage.addVehicle(v2);
        garage.addVehicle(v3);
        garage.addVehicle(v4);

        System.out.println(garage);

        int removed = garage.removeHighMileageVehicles(1000);
        System.out.println("\nRemoved " + removed + " vehicles with mileage > 1000 km");

        System.out.println(garage);

        Vehicle v5 = new Vehicle(4.5);
        v5.drive(300);
        garage.addVehicle(v5);

        System.out.println(garage);
    }
}