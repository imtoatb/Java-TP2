import java.util.Scanner;

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

         */


        /*
        Stack stack = new Stack1(3);
        stack.push(10);
        stack.push(20);

        System.out.println(stack);
        stack.toString()
        stack.isEmpty();
        stack.size();
        stack.pop();
        stack.toString()
        stack.pop();
        stack.isEmpty();
        stack.toString()

        Stack stack2 = new Stack1(3);
        stack2.push(1);
        stack2.push(2);
        stack1.equals(stack2);

        Queue queue = new Queue(5);
        queue.isEmpty();
        queue.size();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.isEmpty();
        queue.size();
        queue.remove();
        queue.remove();
        queue.isEmpty();
        queue.toString();


        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.remove(20);
        System.out.println(list);
        list.remove(10);
        System.out.println(list);

         */

        Stack stack = new Stack(100);
        Queue queue = new Queue(100);
        LinkedList linkedList = new LinkedList();

        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("1. Manage a stack");
        System.out.println("2. Manage a queue");
        System.out.println("3. Manage a linked list");
        System.out.println("0. Exit");
        System.out.print("Your choice: ");
        choice = sc.nextInt();

        if (choice == 1) {
            int choice2;
            Scanner sc2 = new Scanner(System.in);
            System.out.println("1. Push an element");
            System.out.println("2. Pop an element");
            System.out.println("3. Check if the stack is empty");
            System.out.println("4. Display the stack");
            System.out.println("0. Return to main menu");
            System.out.print("Your choice: ");
            choice2 = sc2.nextInt();

            if (choice2 == 1) {
                int element;
                Scanner scElement = new Scanner(System.in);
                System.out.print("Enter the element to push: ");
                element = scElement.nextInt();
                stack.push(element);
            }

            else if (choice2 == 2) {
                stack.pop();
            }

            else if (choice2 == 3) {
                stack.isEmpty();
            }

            else if (choice2 == 4) {
                System.out.println(stack);
            }

            else if (choice2 == 0) {
                System.out.println("Return to main menu");
            }

            else {
                System.out.println("Invalid choice");
            }
        }

        else if (choice == 2) {
            int choice3;
            Scanner sc3 = new Scanner(System.in);
            System.out.println("1. Add an element");
            System.out.println("2. Remove an element");
            System.out.println("3. Check if the queue is empty");
            System.out.println("4. Display the queue");
            System.out.println("0. Return to main menu");
            System.out.print("Your choice: ");
            choice3 = sc3.nextInt();

            if (choice3 == 1) {
                int element;
                Scanner scElement = new Scanner(System.in);
                System.out.print("Enter the element to add: ");
                element = scElement.nextInt();
                queue.add(element);
            }

            else if (choice3 == 2) {
                queue.remove();
            }

            else if (choice3 == 3) {
                queue.isEmpty();
            }

            else if (choice3 == 4) {
                System.out.println(queue);
            }

            else if (choice3 == 0) {
                System.out.println("Return to main menu");
            }

            else {
                System.out.println("Invalid choice");
            }
        }

        else if (choice == 3) {
            int choice4;
            Scanner sc4 = new Scanner(System.in);
            System.out.println("1. Add an element");
            System.out.println("2. Remove an element");
            System.out.println("3. Display the linked list");
            System.out.println("0. Return to main menu");
            System.out.print("Your choice: ");
            choice4 = sc4.nextInt();

            if (choice4 == 1) {
                int element;
                Scanner scElement = new Scanner(System.in);
                System.out.print("Enter the element to add: ");
                element = scElement.nextInt();
                linkedList.add(element);
            }

            else if (choice4 == 2) {
                int element;
                Scanner scElement = new Scanner(System.in);
                System.out.print("Enter the element to remove: ");
                element = scElement.nextInt();
                linkedList.remove(element);
            }

            else if (choice4 == 3) {
                System.out.println(linkedList);
            }

            else if (choice4 == 0) {
                System.out.println("Return to main menu");
            }

            else {
                System.out.println("Invalid choice");
            }
        }

        else if (choice == 0) {
            System.out.println("Exit");
        }

        else{
            System.out.println("Invalid choice");
        }

    }
}