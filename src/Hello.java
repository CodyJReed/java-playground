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

        // Code blocks if else if else
    //    int highScore = thisTrick(true, 10000, 8, 200);

    //     System.out.println("This happens after the method call!");
    //     if (highScore == 11600) {
    //       System.out.println("Great job!");
    //       }

    //     int burger = calculateHighScorePosition(333);
    //     displayhighScorePosition("jim", burger);
        
        // printConversion(1.5);

        printMegaBytesAndKiloBytes(1024);
        boolean wake = shouldWakeUp(true, 4);
        System.out.println(wake);

        System.out.println(isLeapYear(1924));
        int twentyFour = 1800 % 400;
        System.out.println(twentyFour);
        
    }

    // public static int thisTrick(boolean gameOver, int score, int levelCompleted, int bonus) {

    //     int specialNumber = 333;

    //     if (gameOver) {
    //         int finalScore = score + (levelCompleted * bonus);
    //         System.out.println("Your final score was " + finalScore);
    //         return finalScore;
    //     } else {
    //         System.out.println("Your special " + specialNumber);
    //         return specialNumber;
    //     }
    // }

    // public static void displayhighScorePosition(String name, int highScorePosition) {
    //     System.out.println(name + " managed to get into position " + highScorePosition + " on the high score table!");
    // }

    // public static int calculateHighScorePosition(int score) {
    //     int position;
    //     if (score >= 1000) {
    //         position = 1;
    //     } else if (score >= 500) {
    //         position = 2;
    //     } 
    //         position = 3;
    //         return position;
    // }


    // // write your code here
    // public static long toMilesPerHour(double kilometersPerHour) {

    //     if (kilometersPerHour < 0) {
    //         return -1;
    //     }
        
    //     return (long) kilometersPerHour % Math.round(1.609);
    
    // }
    
    // public static void printConversion(double kilometersPerHour) {
        
    //     long mph = toMilesPerHour(kilometersPerHour);
    //     if (kilometersPerHour < 0) {
    //        return System.out.println("Invalid Value");
    //     }
    //     System.out.println(kilometersPerHour + " km/h" + " = " + mph + " mi/h" );
    // }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
   if (kiloBytes < 0) {
    System.out.println("Invalid Value");
   } else {
   
   int YY = kiloBytes / 1024;
   int zz = kiloBytes % 1024;
   
   System.out.println(kiloBytes + " KB " + "= " + YY + " MB " + "and " + zz + " KB");
    }
  }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 8 || hourOfDay > 22) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if (year % 100 == 0 && year % 400 == 0) {
            return true;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}