
import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {

        Car porsche = new Car();
        Car honda = new Car();
        honda.setModal("civic");
        porsche.setModal("911");
        
        System.out.println(porsche.getModel());

        VipCustomer Jon = new VipCustomer("Jon", "$4.00");
        VipCustomer Cody = new VipCustomer();
        VipCustomer Tim = new VipCustomer("Tim", "$100.00", "Tim@code.com");

        System.out.println(Jon.getVipCustomer()); 
        System.out.println(Cody.getVipCustomer());
        System.out.println(Tim.getVipCustomer());
        
        
        Dog Calico = new Dog("Calico", 4, 135, 2, 4, 0, 12, "Brown");

        Calico.eat();








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