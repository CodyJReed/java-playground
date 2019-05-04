
import java.util.Scanner;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.wheels = 4;
        this.name = name;
        this.cylinders = cylinders;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String accelerates() {
        return "Car accelerates";
    }

    public String startCar() {
        return "Car starts...";
    }
}

class Honda extends Car {

    public Honda() {
        super(4,"Civic");
    }

    @Override
    public String accelerates() {
        return  getName() + " burns out.";
    }

    public String startCar() {
        return "Honda begins to rumble";
    }
}

class Tundra extends Car {

    public Tundra() {
        super(8, "Tundra");
    }

    public String startCar() {
        return "Throaty roar errupts as the truck springs to life.";
    }
}

public class Hello {


    public static void main(String[] args) {

        int[] ordered = {106, 26, 81, 5, 15};
        boolean flag = true;
        int temp;

        while(flag) {
            flag = false;
            for(int i = 0; i < ordered.length-1; i++) {
                if(ordered[i] < ordered[i+1]) {
                    temp = ordered[i];
                    ordered[i] = ordered[i+1];
                    ordered[i+1] = temp;
                    flag = true;
                }
            }
        }

        for (int i = 0; i < ordered.length; i++) {
            System.out.println(ordered[i]);
        }





        // Car car = Honda();
        // System.out.println(car.startCar() + " " + car.accelerates());

    //    Printer printer = new Printer();
    //    printer.print(2);
    //    System.out.println(printer.checkPaperTray()); 
    //    printer.print(8);
    //    printer.addPaper(20);
    //    printer.print(16);

       
       








        // Scanner scanner = new Scanner(System.in);

        // int count = 1;
        // int sum = 0;

        // while (count < 10) {

        //     System.out.println("Enter number #" + count);

        //     boolean isAnInt = scanner.hasNextInt();

        //     if (!isAnInt) {
        //         System.out.println("Invalid Number");
        //     } else {
        //         int num = scanner.nextInt();
        //         count++;
        //         sum += num;
        //     }
        //     scanner.nextLine();
        // }
        // System.out.println("Sum = " + sum);
        // scanner.close();

    }

    public static Car Honda() {
        return new Honda();
    }
}