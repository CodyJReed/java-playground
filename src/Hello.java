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

        // Precision floats and doubles

        // Width of 4 bytes (32bit)
        float indigosWeight = 23.6f;
        // Width of 8 bytes (32bit)
        double kilo = 0.45359237d;
        
        System.out.println("Indy's kilo weight" + (indigosWeight*kilo));

        // Char and Boolean

        // Can only hold one character
        char myChar = '\u00A9';
        System.out.println(myChar);

        double twenty = 20d;
        double eighty = 80d;
        double remainder = (twenty + eighty) * 25 % 40;
        if (remainder <= 20)
            System.out.println("Total was over the limit " + remainder);




    }
}