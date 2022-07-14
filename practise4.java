//Write a Java program to check whether Java is installed on your computer
/* 
public class practise4 {
    public static void main(String[] args)
    {
        System.out.println("\nJava Version: " + System.getProperty("java.version"));
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: " + System.getProperty("java.class.path") + "\n");
    }
}
*/


//Write a Java program to compare two numbers
/* 
import java.util.Scanner;
public class practise4{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;

        System.out.print("Input first integer: ");
        number1 = input.nextInt();

        System.out.print("Input second integer: ");
        number2 = input.nextInt();

        if (number1 == number2)
            System.out.printf("%d == %d\n", number1, number2);
        if (number1 != number2)
            System.out.printf("%d != %d\n", number1, number2);
        if (number1 < number2)
            System.out.printf("%d < %d\n", number1, number2);
        if (number1 > number2)
            System.out.printf("%d > %d\n", number1, number2);
        if (number1 <= number2)
            System.out.printf("%d <= %d\n", number1, number2);
        if (number1 >= number2)
            System.out.printf("%d >= %d\n", number1, number2);       
    }
}
*/

// Write a java program and compute the sum of the digits of an integer

/* 
import java.util.Scanner;
public class practise4{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Input an integer: ");
        long n = input.nextLong();
        System.out.println("The sum of the digits is: "+sumDigits(n));
    }

    public static int sumDigits(long n)
    {
        int sum = 0;
        while(n != 0)
        {
            sum += n%10;
            n = n/10;
        }
        return sum;
    }
}
*/

// Write a Java program to compute the area of a hexagon.

// Area of a hexagon = (6 * s^2)/(4*tan(π/6))

/* 
import java.util.Scanner;
public class practise4{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the length of a side of the hexagon: ");
        double s = input.nextDouble();
        System.out.print("The area of hexagon is: "+hexagonArea(s)+"\n");
    }

    public static double hexagonArea(double s)
    {
        return (6*(s*s)/(4*Math.tan(Math.PI/6)));
    }
}

*/

// Write a java program to compute the area of polygon
//Area of a polygon = (n*s^2)/(4*tan(π/n))

/* 
import java.util.Scanner;

public class practise4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input the number of sides on the polygon: ");
        int ns = input.nextInt();
        System.out.print("Input the length of one of the sides: ");
        double side = input.nextDouble();
        System.out.print("The area is: " + polygonArea(ns, side) + "\n");
    }

    public static double polygonArea(int ns, double side) {
        return (ns * (side * side)) / (4.0 * Math.tan((Math.PI / ns)));
    }
}
*/

// write a java program to reverse a string

/* 
import java.util.Scanner;
public class practise4{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        char[] letters = scanner.nextLine().toCharArray();
        System.out.print("Reverse string: ");
        for(int i = letters.length-1; i>=0; i--)
        {
            System.out.print(letters[i]);
        }
        System.out.println("\n");
    }
}
*/

// Write a java program to create and display unique three digit number using 1, 2, 3, 4. Also count how many three digit numbers are there

/* 
import java.util.Scanner;
public class practise4{
    public static void main(String args[])
    {
        int amount = 0; 
        for(int i = 1; i <= 4; i++)
        {
            for(int j = 1; j <= 4; j++)
            {
                for(int k = 1; k <= 4; k++)
                {
                    if(k != i && k != j && i != j)
                    {
                        amount++;
                        System.out.println(i + "" + j + "" + k);
                    }
                }
            }
        }
        System.out.println("Total number of the three digit number is" + amount);
    }
}

*/

// Write a java program to print the ascii value of a given character

/* 
public class practise4{
    public static void main(String[] args)
    {
        int chr = 'Z';
        System.out.println("The ascii value of Z is: "+chr);
    }
}

*/

// Write a java program to input and display your password:

import java.io.Console;
public class practise4{
    public static void main(String[] args)
    {
        Console cons;
        if((cons))
    }
}