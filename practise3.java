// Write a program in Java to display n terms of natural numbers and their sum
/*
 * import java.util.Scanner;
 * 
 * public class practise3 {
 * 
 * public static void main(String[] args)
 * 
 * {
 * int i, n, sum = 0;
 * {
 * Scanner in = new Scanner(System.in);
 * System.out.print("Input number: ");
 * n = in.nextInt();
 * }
 * System.out.println("The first n natural numbers are : " + n);
 * 
 * for (i = 1; i <= n; i++) {
 * System.out.println(i);
 * sum += i;
 * }
 * System.out.println("The Sum of Natural Number upto " + n + " terms : " +
 * sum);
 * 
 * }
 * }
 */

// Write a program in Java to input 5 numbers from keyboard and find their sum
// and average

/* 
import java.util.Scanner;

public class practise3 {

    public static void main(String[] args)

    {
        int i, n = 0, s = 0;
        double avg;
        {

            System.out.println("Input the 5 numbers : ");

        }
        for (i = 0; i < 5; i++) {
            Scanner in = new Scanner(System.in);
            n = in.nextInt();

            s += n;
        }
        avg = s / 5;
        System.out.println("The sum of 5 no is : " + s + "\nThe Average is : " + avg);

    }
}

*/

// Write a program in Java to display the cube of the number upto a given integer:
/* 
import java.util.Scanner;;
public class practise3{
    public static void main(String[] args)
    {
        int i, n;
        System.out.print("Input number of terms: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        for(i = 0; i <= n; i++)
        {
            System.out.println("Number is: "+i+"and cube of "+i+"is"+(i*i*i));
        }
    }
}
*/

//Write a program in Java to display the multiplication table of a given integer
/* 
import java.util.Scanner;
public class practise3{
    public static void main(String[] args)
    {
        int i, n;
        System.out.print("Input number of terms: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.println("\n");
        for(i = 0; i <= n; i++)
        {
            System.out.println(n+"X"+i+" = "+n*i);
        }
    }
}
*/

// Write a program in Java to display the n terms of odd natural number and their sum: 
/*
import java.util.Scanner;
public class practise3{
    public static void main(String[] args)
    {
        int i, n, sum = 0;
        System.out.print("Input number of terms is: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.println("\nThe odd numbers are: ");
        for(i = 1; i <= n; i++)
        {
            System.out.println(2*i-1);
            sum = sum + 2*i-1;
        }
        System.out.println("The sum of odd natural numbers upto"+n+"terms is"+sum);
    }
}
*/


// Write a program in Java to display the pattern like right angle triangle with a number: 
/* 
import java.util.Scanner;
public class practise3{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}

*/

// Write a program to make such a pattern like right angle triangle with a number which will repeat a number in a row.
/* 
import java.util.Scanner;
public class practise3{
    public static void main(String[] args)
    {
        int i, j, n;
        System.out.print("Input number of n: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        for(i = 1; i <= n; i++)
        {
            for(j = 1; i <= i; j++)
            {
                System.out.print(i);
            }
            System.out.println("\n");
        }
    }
}
*/

// Write a program in java to make such a patter like right angle triangle with number increased by 1

/* 
import java.util.Scanner;
public class practise3{
    public static void main(String[] args)
    {
        int i, j, n, k = 1;
        System.out.print("Input the number of rows: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        for(i = 1; i <= n; i++)
        {
            for(j = 1; j <= i; j++)
            {
                System.out.print(k++);
            }
            System.out.println("");
        }
    }
}
*/

