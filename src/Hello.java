
import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 1;
        int sum = 0;

        while (count < 10) {

            System.out.println("Enter number #" + count);

            boolean isAnInt = scanner.hasNextInt();

            if (!isAnInt) {
                System.out.println("Invalid Number");
            } else {
                int num = scanner.nextInt();
                count++;
                sum += num;
            }
            scanner.nextLine();
        }
        System.out.println("Sum = " + sum);
        scanner.close();

    }
}