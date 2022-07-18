// Write a java program to find the second largest element in the array

/* 
import java.util.Arrays;

public class practise7{
    public static void main(String[] args) {
        int[] my_array = {
                10789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456 };
        System.out.println("Original numeric array : " + Arrays.toString(my_array));
        Arrays.sort(my_array);
        int index = my_array.length - 1;
        while (my_array[index] == my_array[my_array.length - 1]) {
            index--;
        }
        System.out.println("Second largest value: " + my_array[index]);
    }
}
*/


// Write a java program to find the second smallest element in an array
/* 
import java.util.Arrays;

public class practise7{
    public static void main(String[] args) {

        int[] my_array = { -1, 4, 0, 2, 7, -3 };
        System.out.println("Original numeric array : " + Arrays.toString(my_array));
        int min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;
        for (int i = 0; i < my_array.length; i++) {
            if (my_array[i] == min) {
                second_min = min;
            } else if (my_array[i] < min) {
                second_min = min;
                min = my_array[i];
            } else if (my_array[i] < second_min) {
                second_min = my_array[i];
            }

        }
        System.out.println("Second lowest number is : " + second_min);
    }
}
*/


// Write a java program to add two matrices of the same size

/* 
import java.util.Scanner;

public class practise7{
    public static void main(String args[]) {
        int m, n, c, d;
        Scanner in = new Scanner(System.in);

        System.out.println("Input number of rows of matrix");
        m = in.nextInt();
        System.out.println("Input number of columns of matrix");
        n = in.nextInt();

        int array1[][] = new int[m][n];
        int array2[][] = new int[m][n];
        int sum[][] = new int[m][n];

        System.out.println("Input elements of first matrix");

        for (c = 0; c < m; c++)
            for (d = 0; d < n; d++)
                array1[c][d] = in.nextInt();

        System.out.println("Input the elements of second matrix");

        for (c = 0; c < m; c++)
            for (d = 0; d < n; d++)
                array2[c][d] = in.nextInt();

        for (c = 0; c < m; c++)
            for (d = 0; d < n; d++)
                sum[c][d] = array1[c][d] + array2[c][d];

        System.out.println("Sum of the matrices:-");

        for (c = 0; c < m; c++) {
            for (d = 0; d < n; d++)
                System.out.print(sum[c][d] + "\t");

            System.out.println();
        }
    }
}

*/

// Write a java program to convert an array to ArrayList

/* 
import java.util.ArrayList;
import java.util.Arrays;

public class practise7{
    public static void main(String[] args) {
        String[] my_array = new String[] { "Python", "JAVA", "PHP", "Perl", "C#", "C++" };
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(my_array));

        System.out.println(list);
    }
}
*/

// Write a java program to convert an ArrayList to an array
/* 
import java.util.ArrayList;
import java.util.Arrays;

public class practise7{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Python");

        list.add("Java");

        list.add("PHP");

        list.add("C#");

        list.add("C++");

        list.add("Perl");

        String[] my_array = new String[list.size()];

        list.toArray(my_array);

        for (String string : my_array) {
            System.out.println(string);
        }
    }
}

*/

// Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number.
/* 
public class practise7 {
    static void pairs_value(int inputArray[], int inputNumber) {
        System.out.println("Pairs of elements and their sum : ");

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] + inputArray[j] == inputNumber) {
                    System.out.println(inputArray[i] + " + " + inputArray[j] + " =  " + inputNumber);
                }
            }
        }
    }

    public static void main(String[] args) {
        pairs_value(new int[] { 2, 7, 4, -5, 11, 5, 20 }, 15);

        pairs_value(new int[] { 14, -15, 9, 16, 25, 45, 12, 8 }, 30);

    }
}
*/

// Write a java program to test the equality of two arrays
/* 
public class practise7{
    static void equality_checking_two_arrays(int[] my_array1, int[] my_array2) {
        boolean equalOrNot = true;

        if (my_array1.length == my_array2.length) {
            for (int i = 0; i < my_array1.length; i++) {
                if (my_array1[i] != my_array2[i]) {
                    equalOrNot = false;
                }
            }
        } else {
            equalOrNot = false;
        }

        if (equalOrNot) {
            System.out.println("Two arrays are equal.");
        } else {
            System.out.println("Two  arrays are not equal.");
        }
    }

    public static void main(String[] args) {
        int[] array1 = { 2, 5, 7, 9, 11 };
        int[] array2 = { 2, 5, 7, 8, 11 };
        int[] array3 = { 2, 5, 7, 9, 11 };

        equality_checking_two_arrays(array1, array2);
        equality_checking_two_arrays(array1, array3);
    }
}
*/