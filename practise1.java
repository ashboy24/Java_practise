// Write a Java program to print 'Hello' on screen and then print your name on a seperate line.

/*
 * public class Main{
 * public static void main(String[] args){
 * System.out.println("Hello\nAseesh!");
 * }
 * }
 */


// Write a Java program to print the sum of two numbers

 /*
  * public class practise1 {
  * public static void main(String[] args) {
  * System.out.println(24 + 26);
  * }
  * }
  */

// Write a Java program to divide two numbers and print on the and print on the screen

/*
 * public class practise1{
 * public static void main(String[] args){
 * System.out.println(50/3);
 * }
 * }
 */

// Write a Java program to print the result of the following operations. Go to the editor
//a. -5 + 8 * 6
//b. (55+9) % 9
//c. 20 + -3*5 / 8
//d. 5 + 15 / 3 * 2 - 8 % 3
//Expected Output :
//43
//1
//19
//13

/*
 * public class practise1 {
 * public static void main(String[] args) {
 * System.out.println(-5 + (8 * 6));
 * System.out.println((55 + 9) % 9);
 * System.out.println(20 - (3 * 5) / 8);
 * System.out.println(5 + (15 / 3) * 2 - (8 % 3));
 * }
 * }
 */

/*
 * import java.util.Scanner;
 * 
 * public class practise1{
 * public static void main(String[] args){
 * Scanner in = new Scanner(System.in);
 * 
 * System.out.println("Input first number: ");
 * int num1 = in.nextInt();
 * 
 * System.out.println("Input second number: ");
 * int num2 = in.nextInt();
 * 
 * System.out.println(num1+"x"+num2+"="+num1*num2);
 * }
 * }
 */

 // Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

/*
 * import java.util.Scanner;
 * 
 * public class practise1 {
 * public static void main(String[] args) {
 * Scanner in = new Scanner(System.in);
 * 
 * System.out.print("Input first number: ");
 * int num1 = in.nextInt();
 * 
 * System.out.print("Input second number: ");
 * int num2 = in.nextInt();
 * 
 * System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
 * 
 * System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
 * 
 * System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
 * 
 * System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
 * 
 * System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));
 * }
 * }
 */

// Write a Java program that takes a number as input and prints its multiplication table upto 10.

/*
 * import java.util.Scanner;
 * 
 * public class practise1{
 * public static void main(String[] args){
 * Scanner in = new Scanner(System.in);
 * 
 * System.out.print("Input a number: ");
 * int num1 = in.nextInt();
 * 
 * for(int i = 0; i < 10; i++)
 * {
 * System.out.println(num1+"x"+(i+1)+"="+(num1*(i+1)));
 * }
 * }
 * }
 */

 //Write a Java program to compute a specified formula.
//Specified Expression :
//4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))

/*
  public class practise1{
  public static void main(String[] args){
  double result = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
   System.out.println(result);
 }
}
 */

 // Write a Java program to print the area and perimeter of a circle.
/* 
 public class practise1 {
     private static final double radius = 7.5;

     public static void main(String[] args) {
         double perimeter = 2 * Math.PI * radius;
         double area = Math.PI * radius * radius;

         System.out.println("Perimeter is = " + perimeter);
         System.out.println("Area is = " + area);
     }
 }
*/

// Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

/* 
import java.util.Scanner;

public class practise1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = in.nextInt();

        System.out.print("Input second number: ");
        int num2 = in.nextInt();

        System.out.print("Input third number: ");
        int num3 = in.nextInt();

        System.out.print("Input fourth number: ");
        int num4 = in.nextInt();

        System.out.print("Enter fifth number: ");
        int num5 = in.nextInt();

        System.out.println("Average of five numbers is: " +
                (num1 + num2 + num3 + num4 + num5) / 5);
    }
}
*/

// Write a Java program to print the area and perimeter of a rectangle.
/* 
public class practise1 {
    public static void main(String[] args) {
        final double width = 5.6;
        final double height = 8.5;
        double perimeter = 2 * (height + width);
        double area = width * height;
        System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.1f\n", height, width, perimeter);
        System.out.printf("Area is %.1f*%.1f = %.2f \n", width, height, area);
    }
}
*/

// Write a Java program to swap two variables.
/* 
public class practise1 {
    public static void main(String[] args) {
        int a, b, temp;
        a = 15;
        b = 27;
        System.out.println("Before swapping : a, b = " + a + ", " + +b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping : a, b = " + a + "," + +b);
    }
}
*/

// Write a Java program to add two binary numbers.
/* 
import java.util.Scanner;

public class practise1 {
    public static void main(String[] args) {
        long binary1, binary2;
        int i = 0, remainder = 0;
        int[] sum = new int[20];
        Scanner in = new Scanner(System.in);

        System.out.print("Input first binary number: ");
        binary1 = in.nextLong();
        System.out.print("Input second binary number: ");
        binary2 = in.nextLong();

        while (binary1 != 0 || binary2 != 0) {
            sum[i++] = (int) ((binary1 % 10 + binary2 % 10 + remainder) % 2);
            remainder = (int) ((binary1 % 10 + binary2 % 10 + remainder) / 2);
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }
        if (remainder != 0) {
            sum[i++] = remainder;
        }
        --i;
        System.out.print("Sum of two binary numbers: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        System.out.print("\n");
    }
}
*/

// Java program to multiply two binary numbers

/* 
import java.util.Scanner;

public class practise1 {
    public static void main(String[] args) {
        long binary1, binary2, multiply = 0;
        int digit, factor = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first binary number: ");
        binary1 = in.nextLong();
        System.out.print("Input the second binary number: ");
        binary2 = in.nextLong();
        while (binary2 != 0) {
            digit = (int) (binary2 % 10);
            if (digit == 1) {
                binary1 = binary1 * factor;
                multiply = binaryproduct((int) binary1, (int) multiply);
            } else {
                binary1 = binary1 * factor;
            }
            binary2 = binary2 / 10;
            factor = 10;
        }
        System.out.print("Product of two binary numbers: " + multiply + "\n");
    }

    static int binaryproduct(int binary1, int binary2) {
        int i = 0, remainder = 0;
        int[] sum = new int[20];
        int binary_prod_result = 0;

        while (binary1 != 0 || binary2 != 0) {
            sum[i++] = (binary1 % 10 + binary2 % 10 + remainder) % 2;
            remainder = (binary1 % 10 + binary2 % 10 + remainder) / 2;
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }
        if (remainder != 0) {
            sum[i++] = remainder;
        }
        --i;
        while (i >= 0) {
            binary_prod_result = binary_prod_result * 10 + sum[i--];
        }
        return binary_prod_result;
    }
}
*/

// Write a Java program to convert a decimal number to binary number.

/* 
import java.util.Scanner;
public class practise1{
  public static void main(String args[])
  {
    int dec_num, quot, i = 1, j;
    int bin_num[] = new int[100];
    Scanner scan = new Scanner(System.in);
    System.out.print("Input a decimal number: ");
    dec_num = scan.nextInt();

    quot = dec_num;

    while(quot!=0)
      {
        bin_num[i++] = quot%2;
        quot = quot/2;
      }
    System.out.print("Binary number is: ");
    for(j = i-1; j>0; j--)
      {
        System.out.print(bin_num[j]);
      }
    System.out.print("\n");
  }
}
*/

// Write a Java program to convert a decimal number to hexadecimal number.

/* 
import java.util.Scanner;
public class practise1 {
      public static void main(String args[])
    {
        int dec_num, rem;
        String hexdec_num="";
        
        // hexadecimal number digits 
        
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        
        Scanner in = new Scanner(System.in);
		
        System.out.print("Input a decimal number: ");
        dec_num = in.nextInt();
		
        while(dec_num>0)
        {
            rem = dec_num%16;
            hexdec_num = hex[rem] + hexdec_num;
            dec_num = dec_num/16;
        }
        System.out.print("Hexadecimal number is : "+hexdec_num+"\n");         
    }
}
*/