public class Main {
    public static void main(String[] args) {
        CurrentDate d1 = new CurrentDate(0,0,0);
        d1.setDay(27);
        d1.setMonth(3);
        d1.setYear(2022);
        System.out.println("The date d1 is = " + d1);

        CurrentDate d2 = new CurrentDate(27, 3, 2021);
        System.out.println("The date d2 is = " + d2);

        if (!d1.equals(d2)) {
            System.out.println(d1 + " is different of " + d2);
        }

        System.out.println("The day of d2 is: " + d2.getDay());
    }
}