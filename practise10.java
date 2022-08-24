// Write a java program that return the missing letter from an array of increasing letters(upper or lower). Assume there will always be one letter missing in the array.

/* 
import java.util.Scanner;
import java.util.Arrays;

public class practise10
{
    public static void main(String[] args)
    {
        String[] str_arra = {"p", "r", "s", "t"};
        System.out.printf("Original array of elements:\n" + Arrays.toString(str_arra));
        String result = test(str_arra);
        System.out.printf("\nMissing letter in the said array: "+ result);
    }

    public static String test(String[] str_arra)
    {
        int c = str_arra[0].charAt(0) + 1;
        for(int i = 1; i < str_arra.length; i++, c++)
        {
            if(str_arra[i].charAt(0) != c)
            {
                return String.valueOf((char)c);
            }
        }
        return "";
    }
}
*/


// Write a java program that checks an array is negative dominant or not. Of the array is negative dominant return true otherwise false.

/* 
import java.util.Scanner;
import java.util.Arrays;

public class practise10
{
    public static void main(String[] args)
    {
        int[] nums = {1, -2 ,-5, 3, -6};
        System.out.printf("\nOriginal array of numbers:\n" + Arrays.toString(nums));
        boolean result = test(nums);
        System.out.printf("\nCheck Negative dominance in the said array!" + result);
    }

    public static boolean test(int[] nums)
    {
        long count_negative, count_positive;
        nums = Arrays.stream(nums).distinct().toArray();
        //toArray() returns an array of T types if the parameter T[] arr is passed to the method
        // return an array of Object type if the parameter is not passed
        count_negative = Arrays.stream(nums).filter(s -> s < 0).count();
        count_positive = Arrays.stream(nums).filter(s -> s > 0).count();
        return count_negative > count_positive;
    }
}
*/


// Write a java program that checks whether an array of integers alternates between positive and negative values

/* 
import java.util.Scanner;
import java.util.Arrays;

public class practise10
{
    public static void main(String[] args)
    {
        int[] nums = {1, -2, 5, -4, 3, -6};
        boolean result = test(nums);
        System.out.printf("\nCheck the said array of integers alternates between positive and negative values!" + result);
    }

    public static boolean test(int[] nums)
    {
        for(int n: nums)
        {
            if(n == 0)
            {
                return false;
            }
        }
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i-1] > 0 && nums[i] > 0)
            {
                return false;
            }
            else if(nums[i-1] < 0 && nums[i] < 0)
            {
                return false;
            }
        }
        return true;
    }
}
*/

// Write a java program to calculate the largeest gap between sorted elements of an array of integers

/* 
import java.util.Scanner;
import java.util.Arrays;

public class practise10
{
    public static void main(String[] args)
    {
        int[] nums = {23, -2, 45, 38, 12, 4, 6};
        int result = test(nums);
        System.out.printf("\nLargest gap betwen sorted elements of the said array: "+ result);
    }

    public static int test(int[] nums)
    {
        Arrays.sort(nums);
        int max_val = 0;
        for(int i = 0; i < nums.length - 1; i++)
        {
            max_val = Math.max(nums[i+1]-nums[i], max_val);
        }
        return max_val;
    }
}
*/

// Write a java program to find and print one continous subarray(from a given array of integers) that if you sort the said subarray in ascending order then the entire array will be sorted in ascending order

/* 
import java.util.Scanner;
import java.util.Arrays;

public class practise10{
    public static int[] findUnsortedSubarray(int[] nums) {
        int[] result = new int[3];
        int n = nums.length;
        int start = -1;
        int end = -2;
        int min = nums[n - 1];
        int max = nums[0];
        for (int i = 1; i < n; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[n - 1 - i]);
            if (nums[i] < max) {
                end = i;
            }
            if (nums[n - 1 - i] > min) {
                start = n - 1 - i;
            }
        }
        result[0] = start;
        result[1] = end;

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 4, 6 };
        System.out.printf("\nOriginal array: " + Arrays.toString(nums1));

        int[] result1 = findUnsortedSubarray(nums1);
        System.out.printf("\nContinuous subarray:\n");
        for (int i = result1[0]; i <= result1[1]; i++) {
            System.out.print(nums1[i] + " ");
        }

        int[] nums2 = { 1, 3, 2, 7, 5, 6, 4, 8 };
        System.out.printf("\n\nOriginal array: " + Arrays.toString(nums2));
        System.out.printf("\nContinuous subarray:\n");
        int[] result2 = findUnsortedSubarray(nums2);

        for (int i = result2[0]; i <= result2[1]; i++) {
            System.out.print(nums2[i] + " ");
        }
    }
}
*/