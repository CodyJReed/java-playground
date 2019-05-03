
import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {

       Impreza impreza = new Impreza(24);
       impreza.accelerate(80);
       impreza.steer(70);
       impreza.accelerate(-50);
       impreza.steer(0);
       impreza.accelerate(50);
       impreza.stop();
       impreza.accelerate(10);








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
}