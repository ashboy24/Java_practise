// Write a java program to remove a specific element from an array:

/* 
import java.util.Arrays;
public class practise6{
    public static void main(String[] args)
    {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println("Original array: "+Arrays.toString(my_array));
        //Remove the second element index 1 and value 14 from the array
        int removeIndex = 1;
        for(int i = removeIndex; i < my_array.length-1; i++)
        {
            my_array[i] = my_array[i+1];
        }
        // we cannot alter the size of an array, after the removal, the last and second last element in the array will exist
        System.out.println("After removing the second element: " + Arrays.toString(my_array));
    }
}
*/

// Write a java program to copy an array by iterating an array

/* 
import java.util.Arrays;
public class practise6{
    public static void main(String[] args) {
        int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
        int[] new_array = new int[10];

        System.out.println("Source Array : " + Arrays.toString(my_array));

        for (int i = 0; i < my_array.length; i++) {
            new_array[i] = my_array[i];
        }
        System.out.println("New Array: " + Arrays.toString(new_array));
    }
}
*/

//Write a java program to insert the number in the given array

/* 
import java.util.Arrays;

public class practise6{

    public static void main(String[] args) {

        int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };

        // Insert an element in 3rd position of the array (index->2, value->5)

        int Index_position = 2;
        int newValue = 5;

        System.out.println("Original Array : " + Arrays.toString(my_array));

        for (int i = my_array.length - 1; i > Index_position; i--) {
            my_array[i] = my_array[i - 1];
        }
        my_array[Index_position] = newValue;
        System.out.println("New Array: " + Arrays.toString(my_array));
    }
}
*/

// Write a java program find the maximum and minimum value of the array

/* 
import java.util.Arrays;
public class practise6{
    static int max;
    static int min;

    public static void max_min(int my_array[])
    {
        max = my_array[0];
        min = my_array[0];

        int len = my_array.length;
        for(int i = 1; i < len-1; i+=2)
        {
            if(i+1>len)
            {
                if(my_array[i] > max)
                {
                    max = my_array[i];
                }
                if(my_array[i] < min)
                {
                    min = my_array[i+1];
                }
            }
            if(my_array[i] > my_array[i+1])
            {
                if(my_array[i] > max)
                {
                    max = my_array[i];
                }
            }
            if(my_array[i+1] < min)
            {
                min = my_array[i+1];
            }
            if(my_array[i] < my_array[i+1])
            {
                if(my_array[i] < min)
                {
                    min = my_array[i];
                }
                if(my_array[i+1] > max)
                {
                    max = my_array[i+1];
                }
            }
        }
    }
    public static void main(String[] args)
    {
        int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        max_min(my_array);

        System.out.println(" Original Array: " + Arrays.toString(my_array));
        System.out.println(" Maximum value for the above array = " + max);
        System.out.println(" Minimum value for the above array = " + min);
    }
}
*/

// Write a java program to reverse an array of integer values

/* 
import java.util.Arrays;
public class practise6{
    public static void main(String[] args)
    {
        int[] my_array1 = {
            1789, 2035, 1899, 1456, 2013, 
            1458, 2458, 1254, 1472, 2365, 
            1456, 2165, 1457, 2456};
        
            System.out.println("Original array: "+Arrays.toString(my_array1));

            for(int i = 0; i < my_array1.length/2; i++)
            {
                int temp = my_array1[i];
                my_array1[i] = my_array1[my_array1.length-i-1];
                my_array1[my_array1.length-i-1] = temp;
            }
        System.out.println("Reverse string: "+Arrays.toString(my_array1));
    }
}

*/

// Write a java program to find the duplicate values of an array of integer values

/* 
import java.util.Arrays;
public class practise6{
    public static void main(String[] args)
    {
        int[] my_array = { 1, 2, 5, 5, 6, 6, 7, 2 };
        for(int i = 0; i < my_array.length-1; i++)
        {
            for(int j = i+1; j < my_array.length; j++)
            {
                if((my_array[i] == my_array[j]) && (i != j))
                {
                    System.out.println("Duplicate Element : " + my_array[j]);
                }
            }
        }
    }
}

*/

// Write a java program to find the common elements between two arrays(string values)

/* 
import java.util.*;
public class practise6{
    public static void main(String[] args)
    {
        String[] array1 = { "Python", "JAVA", "PHP", "C#", "C++", "SQL" };

        String[] array2 = { "MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA" };

        System.out.println("Array1 : " + Arrays.toString(array1));
        System.out.println("Array2 : " + Arrays.toString(array2));

        HashSet<String> set = new HashSet<String>();

        for(int i = 0; i < array1.length; i++)
        {
            for(int j = 0; j < array2.length; j++)
            {
                if(array1[i].equals(array2[j]));
                {
                    set.add(array1[i]);
                }
            }
        }
        System.out.println("Common element : "+(set));
        //OUTPUT: [THREE, FOUR, FIVE]
    }
}
*/

// Write a java program to find the common elements between two arryas of integers

/* 
import java.util.Arrays;
public class practise6{
    public static void main(String[] args)
    {
        int[] array1 = { 1, 2, 5, 5, 8, 9, 7, 10 };
        int[] array2 = { 1, 0, 6, 15, 6, 4, 7, 0 };

        System.out.println("Array1 : " + Arrays.toString(array1));
        System.out.println("Array2 : " + Arrays.toString(array2));


        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == (array2[j])) {

                    System.out.println("Common element is : " + (array1[i]));
                }
            }
        }
    }
}

*/

// Write a java program to remove duplicate elements from an array

/* 
import java.util.Arrays;

public class practise6{
    static void unique_array(int[] my_array) {
        System.out.println("Original Array : ");

        for (int i = 0; i < my_array.length; i++) {
            System.out.print(my_array[i] + "\t");
        }

        // Assuming all elements in input array are unique

        int no_unique_elements = my_array.length;

        // Comparing each element with all other elements

        for (int i = 0; i < no_unique_elements; i++) {
            for (int j = i + 1; j < no_unique_elements; j++) {
                // If any two elements are found equal

                if (my_array[i] == my_array[j]) {
                    // Replace duplicate element with last unique element

                    my_array[j] = my_array[no_unique_elements - 1];

                    no_unique_elements--;

                    j--;
                }
            }
        }

        // Copying only unique elements of my_array into array1

        int[] array1 = Arrays.copyOf(my_array, no_unique_elements);

        // Printing arrayWithoutDuplicates

        System.out.println();

        System.out.println("Array with unique values : ");

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }

        System.out.println();

        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        unique_array(new int[] { 0, 3, -2, 4, 3, 2 });

        unique_array(new int[] { 10, 22, 10, 20, 11, 22 });

    }
}

*/