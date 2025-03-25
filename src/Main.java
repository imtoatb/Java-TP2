//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        CurrentDate date1 = new CurrentDate(0, 0, 0);
        date1.setDay(29);
        date1.setMonth(2);
        date1.setYear(2024);
        CurrentDate date2 = new CurrentDate(1, 2, 2024);
        date2.setDay(13);
        date2.setMonth(9);
        date2.setYear(2025);
        CurrentDate date3 = date1;

        //System.out.println(date1.ToString());
        //date1.DisplayDate();

        System.out.println(date1.equals(date2)); // false
        System.out.println(date1.equals(date3)); // true
    }
}