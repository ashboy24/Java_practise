//Write a Java program to sort numeric array and string array
/* 
import java.util.Arrays;
import java.util.Scanner;
public class practise5{
    public static void main(String[] args)
    {
        int[] my_array1 = {
            1789, 2035, 1899, 1456, 2013, 
            1458, 2458, 1254, 1472, 2365, 
            1456, 2165, 1457, 2456
        };

        String[] my_array2 = {
            "Java",
			
            "Python",
            "PHP",
            "C#",
            "C Programming",
            "C++"
        };
        
        System.out.println("Original numeric array: "+Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("Sorted numeric array : " + Arrays.toString(my_array1));

        System.out.println("Original string array : " + Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println("Sorted string array : " + Arrays.toString(my_array2));
    }
}
*/


// Write a java program to find the sum of an array

/* 
public class practise5{
    public static void main(String[] args)
    {
        int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for(int i: my_array)
        {
            sum = sum + i;
        }
        System.out.println("The sum is: "+sum);
    }
}
*/

// Write a java program to print the following grid

/* 
public class practise5{
    public static void main(String[] args)
    {
        int [][]a = new int[10][10];

        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                System.out.printf("%2d", a[i][j]);
            }
            System.out.println();
        }
    }
}
*/

// Write a java program to calculate the average value of array elements

/* 
public class practise5{
    public static void main(String[] args)
    {
        int[] numbers = new int[] { 20, 30, 25, 35, -16, 60, -100 };
        int sum = 0;
        for(int i = 0; i <= numbers.length; i++)
        {
            sum += numbers[i];
        }
        double average = sum / numbers.length;
        System.out.println("Average value of the array elements is : " + average);
    }
}
*/

// Write a java program to test if an array contains a specific value

/* 
public class practise5{
    public static boolean contains(int[] arr, int item) {
        for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, 2456 };
        System.out.println(contains(my_array1, 2013));
        System.out.println(contains(my_array1, 2015));
    }
}
*/

//Write a java program to find the index of an array element

/* 
public class practise5{
    public static int findIndex(int[] my_array, int t) {
        if (my_array == null)
            return -1;
        int len = my_array.length;
        int i = 0;
        while (i < len) {
            if (my_array[i] == t)
                return i;
            else
                i = i + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
        System.out.println("Index position of 25 is: " + findIndex(my_array, 25));
        System.out.println("Index position of 77 is: " + findIndex(my_array, 77));
    }
}
*/

