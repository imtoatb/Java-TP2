public class Main {
    public static void main(String[] args) {
        CurrentDate d1 = new CurrentDate(0,0,0);
        d1.setDay(27);
        d1.setMonth(3);
        d1.setYear(2025);
        //System.out.println("The date d1 is = " + d1);

        CurrentDate d2 = new CurrentDate(15, 4, 2024);
        //System.out.println("The date d2 is = " + d2);
        /*
        if (!d1.equals(d2)) {
            System.out.println(d1 + " is different of " + d2);
        }

        System.out.println("The day of d2 is: " + d2.getDay());
        System.out.println("The month of d2 is: " + d2.getMonth());
         */
        Odometer odometer = new Odometer(0.0, 0.0);
        System.out.println(odometer);

        odometer.addKilometers(500.0);
        odometer.addKilometers(600.0);
        System.out.println(odometer);

        odometer.resetPartiel();
        System.out.println(odometer);


    }
}