//Write a Java program to get a number from the user and print whether its is positive or negative.

/* 
import java.util.Scanner;
public class practise2{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int input = in.nextInt();

        if(input>0)
        {
            System.out.println("Number is positive");
        }
        else if(input<0)
        {
            System.out.println("Number is negative");
        }
        else
        {
            System.out.println("Number is zero");
        }
    }
}
*/

// Write a Java program to solve the quadratic equations
/* 
import java.util.Scanner;
public class practise2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Input a: ");
        double a = input.nextDouble();
        System.out.print("Input b: ");
        double b = input.nextDouble();
        System.out.print("Input c: ");
        double c = input.nextDouble();

        double result = b*b - 4.0*a*c;

        if(result > 0.0)
        {
            double r1 = (-b + Math.pow(result, 0.5))/ (2.0*a);
            double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
            System.out.println("The roots are "+r1+"and"+r2);
        }
        else if(result == 0.0)
        {
            double r1 = -b/(2.0*a);
            System.out.println("The roots are "+r1);
        }
        else
        {
            System.out.println("The equation has no real roots");
        }
    }
}
*/

// Take three numbers from the user and print the greatest number
/* 
import java.util.Scanner;
public class practise2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int num1 = in.nextInt();
        System.out.print("Input the second number: ");
        int num2 = in.nextInt();
        System.out.print("Input the third number: ");
        int num3 = in.nextInt();

        if(num1>num2)
        {
            if(num1>num3)
            {
                System.out.println("The greatest: "+num1);
            }
        }
        if(num2>num1)
        {
            if(num2>num3)
            {
                System.out.println("The greatest: "+num2);
            }
        }
        if(num3>num1)
        {
            if(num3>num2)
            {
                System.out.println("The greatest: "+num3);
            }
        }
    }
}
*/


// Write a java program that reads a floating point number and prints zero if the number is zero. Otherwise print positive or negative. Add small if the absolute value of the number is less that 1, or large if it exceeds 1,00,000.
/* 
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class practise2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input value: ");
        double input = in.nextDouble();

        if(input>0)
        {
            if(input<1)
            {
                System.out.println("Positive small number");
            }
            else if(input>100000)
            {
                System.out.println("Positive large number");
            }
            else
            {
                System.out.println("Postive number");
            }
        }
        else if(input<0)
        {
            if(Math.abs(input)<1)
            {
                System.out.println("Negative small number");
            }
            else if(Math.abs(input)>100000)
            {
                System.out.println("Negative large number");
            }
            else
            {
                System.out.println("Negative number");
            }
        }
        else
        {
            System.out.println("Zero");
        }
    }
}
*/

// Write a Java program that keeps a number from the user and generates integer between 1 and 7 and displays the name of the weekday
/* 
import java.util.Scanner;
public class practise2{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int day = in.nextInt();

        System.out.println(getDayName(day));
    }

    public static String getDayName(int day)
    {
        String dayName = " ";
        switch(day)
        {
            case 1: dayName = "Monday";
            break;
            case 2: dayName = "Tuesday";
            break;
            case 3: dayName = "Wednesday";
            break;
            case 4: dayName = "Thrusday";
            break;
            case 5: dayName = "Friday";
            break;
            case 6: dayName = "Saturday";
            break;
            case 7: dayName = "Sunday";
            break;
            default: dayName = "Invalid day range: ";
        }
        return dayName;
    }
}
*/

// Write a Java program that reads in two floating point numbers and tests whether they are the same up to three decimal places
/* 
import java.util.Scanner;
public class practise2{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input floating point number: ");
        double x = in.nextDouble();
        System.out.print("Input floadting point another number: ");
        double y = in.nextDouble();

        x = Math.round(x*1000);
        x = x/1000;

        y = Math.round(y*1000);
        y = y/1000;

        if(x==y)
        {
            System.out.println("They are the same up to three decimal places"); 
        }
        else
        {
            System.out.println("They are different");
        }
    }
}
*/

// Write a Java program to find the number of days in a month.
/* 
import java.util.Scanner;

public class practise2 {

    public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        int number_Of_DaysInMonth = 0;
        String MonthOfName = "Unknown";

        System.out.print("Input a month number: ");
        int month = input.nextInt();

        System.out.print("Input a year: ");
        int year = input.nextInt();

        switch (month) {
            case 1:
                MonthOfName = "January";
                number_Of_DaysInMonth = 31;
                break;
            case 2:
                MonthOfName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    number_Of_DaysInMonth = 29;
                } else {
                    number_Of_DaysInMonth = 28;
                }
                break;
            case 3:
                MonthOfName = "March";
                number_Of_DaysInMonth = 31;
                break;
            case 4:
                MonthOfName = "April";
                number_Of_DaysInMonth = 30;
                break;
            case 5:
                MonthOfName = "May";
                number_Of_DaysInMonth = 31;
                break;
            case 6:
                MonthOfName = "June";
                number_Of_DaysInMonth = 30;
                break;
            case 7:
                MonthOfName = "July";
                number_Of_DaysInMonth = 31;
                break;
            case 8:
                MonthOfName = "August";
                number_Of_DaysInMonth = 31;
                break;
            case 9:
                MonthOfName = "September";
                number_Of_DaysInMonth = 30;
                break;
            case 10:
                MonthOfName = "October";
                number_Of_DaysInMonth = 31;
                break;
            case 11:
                MonthOfName = "November";
                number_Of_DaysInMonth = 30;
                break;
            case 12:
                MonthOfName = "December";
                number_Of_DaysInMonth = 31;
        }
        System.out.print(MonthOfName + " " + year + " has " + number_Of_DaysInMonth + " days\n");
    }
}
*/

// Write a java program that takes the user to provide a single character from the alphabet. Print vowel or consonant, depending on the user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
/* 
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class practise2{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input an alphabet: ");
        String input = in.next().toLowerCase();

        boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
        boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
        boolean vowels = input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o") || input.equals("u");

        if (input.length() > 1)
        {
            System.out.println("Error. Not a single character.");
        }
        else if(!(uppercase || lowercase))
        {
            System.out.println("Error. Not a letter. Enter uppercase or lowercase letter");
        }
        else if(vowels)
        {
            System.out.println("Input letter is vowel");
        }
        else
        {
            System.out.println("Input letter is consonant");
        }
    }
}
*/

// Write a java program that takes a year from user and print whether that year is a leap year or not.
/* 
import java.util.Scanner;
public class practise2{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the year: ");
        int year = in.nextInt();

        boolean x = (year%4) == 0;
        boolean y = (year%100) != 0;
        boolean z = ((year%100 == 0) && (year%400) == 0);

        if(x && (y || z))
        {
            System.out.println(year+"is a leap year");
        }
        else
        {
            System.out.println(year+"is not a leap year");
        }
    }
}
*/

// Write a program in Java to display the first 10 natural numbers

/* 
public class practise2{
    public static void main(String[] args)
    {
        int i;
        System.out.println("The first 10 natural numbers are: \n");
        for(i = 1; i <= 10; i++)
        {
            System.out.println(i);
        }
        System.out.println("\n");
    }
}
*/


// Write a program in Java to display n terms of natural numbers and their sum
/* 
import java.util.Scanner;
public class practise2{
    public static void main(String[] args)
    {
        int i, n, sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("input number: ");
        n = in.nextInt();
        System.out.println("The first n natural numbers are : " + n);
        for(i = 1; i <= n; i++)
        {
            System.out.println(i);
            sum = sum + i;
        }
        System.out.println("The sum of natural number upto"+n+"terms: "+sum);
    }   
}
*/

// Write a java program to convert temperature from farenheit to celsius degree: 

/* 
import java.util.Scanner;
public class practise2{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a degree in farenheit: ");
        double farenheit = input.nextDouble();
        double celsius = ((5*(farenheit-32.0))/9.0);
        System.out.println(farenheit+"degree farenheit is equal to"+celsius+"in celsius");
    }
}
*/


// Write a java program that reads a number in inches, converts it to meters.
/* 
import java.util.Scanner;
public class practise2{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a value for inch: ");
        double inch = input.nextDouble();
        double meters = inch*0.0254;
        System.out.println(inch + "inch is "+meters+ "meters");
    }
}
*/

// Write a java program that reads an integer between 0 and 1000 and adds all the digits in the integer
/* 
import java.util.Scanner;

public class practise2 {

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input an integer between 0 and 1000: ");
        int num = input.nextInt();

        int firstDigit = num % 10;
        int remainingNumber = num / 10;
        int SecondDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int thirdDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int fourthDigit = remainingNumber % 10;
        int sum = thirdDigit + SecondDigit + firstDigit + fourthDigit;
        System.out.println("The sum of all digits in " + num + " is " + sum);

    }
}
*/

// Write a java program to convert minutes into a number of years and days
/* 
import java.util.Scanner;
public class practise2{
    public static void main(String[] args)
    {
        double minutesInYear = 60*24*365;
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number of minutes: ");
        double min = input.nextDouble();
        long years = (long)(min/minutesInYear);
        int days = (int)(min/60/24)%365;

        System.out.println((int)min+"minutes is approximately"+years+"years and "+days+"days");
    }
}
*/

// Write a java program that prints the current time in GMT
/* 
import java.util.Scanner;
public class practise2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input the time zone offset to GMT: ");
        long timeZoneChange = input.nextInt();

        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds/1000;
        
        long currentSecond = totalSeconds % 60;
        
        long totalMinutes = totalSeconds / 60;
        
        long currentMinute = totalMinutes % 60;
        
        long totalHours = totalMinutes / 60;
        
        long currentHour = ((totalHours + timeZoneChange) % 24);

        System.out.println("Current time is "+currentHour+":"+currentMinute+":"+currentSecond);
    }
}
*/