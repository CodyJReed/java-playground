public class Hello {

    public static void main(String[] args) {

        System.out.println("Hello, Tim!");

        int myFirstJavaInt = 5;

        System.out.println(myFirstJavaInt);

        myFirstJavaInt += 6;

        System.out.println(myFirstJavaInt);

        var typeCoerce = "Six";

        System.out.println(myFirstJavaInt);
        System.out.println(typeCoerce);

        var sum = (typeCoerce + myFirstJavaInt);

        System.out.println(sum);

        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;

        System.out.println(myMinValue +" "+ myMaxValue);

        byte whyThis = 100;

        System.out.println(whyThis * whyThis);

        // Comments still work like this!!!!

        long ultimateInt = (myMaxValue+10L);

        System.out.println(ultimateInt);

        byte timsByte = 102;
        short timsShort = 29000;
        int timsInt = 999999999;
        long timsLong = 5000L + 10 * (timsByte + timsShort + timsInt);

        System.out.println("Tim's number is" + " " + timsLong);

        float indigosWeight = 23.6f;
        double kilo = 0.45359237d;
        
        System.out.println("Indy's kilo weight" + (indigosWeight*kilo));
    }
}