//Write a java program to compute body mass index(BMI)

/* 
import java.util.Scanner;
public class practise9
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Input height in inches: ");
        double inches = input.nextDouble();

        double BMI = weight * 0.45359237 / (inches * 0.0254 * inches * 0.0254);
        System.out.print("Body mass index is "+BMI+"\n");
    }
}
*/

// Write a java program that reads a number and display the square, cube, and fourth power.

/* 
import java.util.Scanner;
public class practise9
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the side length value: ");
        double val = in.nextDouble();

        System.out.printf("Square: %12.2f\n", val*val);
        System.out.printf("Cube: %14.2f\n", val * val * val);
        System.out.printf("Fourth power: %6.2f\n", Math.pow(val, 4));
    }
}
*/

// Write a java program to break an integer into a sequence of individual digits

/* 
import java.util.Scanner;
public class practise9
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("input six non negative digits: ");
        int input = in.nextInt();
        int n1 = input / 100000 % 10;
        int n2 = input / 10000 % 10;
        int n3 = input / 1000 % 10;
        int n4 = input / 100 % 10;
        int n5 = input / 10 % 10;
        int n6 = input % 10;
        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6);
    }
}
*/


// Write a java program to get the character at the index within the string

/* 
public class practise9
{
    public static void main(String[] args)
    {
        String str = "Java Exercises!";
        System.out.println("Original string = " + str);
        // Get the character at positions 0 and 10.
        int index1 = str.charAt(0);
        int index2 = str.charAt(10);

        // Print out the results
        System.out.println("The character at position 0 is " + (char)index1);
        System.out.println("The character at position 10 is " + (char)index2);
    }
}
*/


// Write a java program to get the character(unicode code point) at the given index within the string

/* 
public class practise9
{
    public static void main(String[] args)
    {
        String str = "w3resource.com";
        System.out.println("Original string: "+str);

        //codepoint at index 1
        int val1 = str.codePointAt(1);
        //codepoint at index 9
        int val2 = str.codePointAt(9);
        
        //prints character at index1 in string
        System.out.println("Character(unicode point) = "+val1);
        //prints character at index 9 in string
        System.out.println("Character(unicode point) = "+val2);
    }
}
*/


// Write a java program to get the character(unicode code point) before the specified index with the string

/* 
public class practise9
{
    public static void main(String[] args)
    {
        String str = "w3resource.com";
        System.out.println("Original string: "+str);
        //codepoint before index1
        int val1 = str.codePointAt(1);
        //codepoint before index9
        int val2 = str.codePointAt(9);

        //prints character before index1 in string
        System.out.println("Character(unicode point) = "+val1);
        //prints character before index9 in string
        System.out.println("Character(unicode point) = "+val2);
    }
}
*/

// Write a java program to create a new string object with the contents of a character array
/* 
public class practise9
{
    public static void main(String[] args)
    {
        //character array with data.
        char[] arr_num = new char[] {'1', '2', '3', '4'};

        //create a string containing the contents of arr_num 
        //starting at index1 for length 2
        String str = String.copyValueOf(arr_num, 1, 3);
        //display the resilts of the new string
        System.out.println("\nThe book contains "+str+"pages.\n");
    }
}

*/

//Write a java program to check whether a given string ends with the contents of another string

/* 
public class practise9
{
    public static void main(String[] args)
    {
        String str1 = "Python Exercise";
        String str2 = "Python Exercises";

        //The string to check the above two strings to see if they end with this value(se).
        String end_str = "se";

        //check first two strings end with end_str
        boolean ends1 = str1.endsWith(end_str);
        boolean ends2 = str2.endsWith(end_str);

        if(ends1 == ends2)
        {
            System.out.println("Same :)");
        }
        else
        {
            System.out.println("Different :(");
        }
    }
}
*/

//Find the Greatest Common Divisor for the 2  numbers input by user
/* 
import java.util.Scanner;

import javax.swing.text.StyledEditorKit;
public class practise9
{
    public static void main(String[] args)
    {
        int x, y, gcd = 0;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        gcd = practise9(x, y);
        System.out.println(gcd);
    }
    public static int practise9(int x, int y)
    {
        while(y!=0)
        {
            if(x>y)
            {
                x = x-y;
            }
            else
            {
                y = y-x;
            }
        }
        return x;
    }
}
*/

/* 
import java.util.Scanner;

class ReverseNumberWhile {
    public static void main(String args[]) {
        int num = 0;
        int reversenum = 0;
        System.out.println("Input your number and press enter: ");
        // This statement will capture the user input
        Scanner in = new Scanner(System.in);
        // Captured input would be stored in number num
        num = in.nextInt();
        // While Loop: Logic to find out the reverse number
        while (num != 0) {
            reversenum = reversenum * 10;
            reversenum = reversenum + num % 10;
            num = num / 10;
        }

        System.out.println("Reverse of input number is: " + reversenum);
    }
}
*/

// ips question in the class

/* 
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();


           if (a < 0 || b < 0 || c < 0 || d < 0 || e < 0) {
               System.out.println("Try Again");
           } else if ((a >= b) && (a >= c) && (a >= d) && (a >= e)) { // a >= b,c,d,e
               System.out.println(a);
           } else if ((b >= c) && (b >= d) && (b >= e)) { // b >= c,d,e
               System.out.println(b);
           } else if ((c >= d) && (c >= e)) { // c >= d,e
               System.out.println(c);
           } else if (d >= e) { // d >= e
               System.out.println(d);
           } else { // e > d
               System.out.println(e);
           }
    }
}
*/