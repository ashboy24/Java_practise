import java.util.Scanner;
public class program
{
    public static void main(String[] args)
    {
        int n1, n2, largest;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        n1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        n2 = sc.nextInt();
        
        if(n1 > n2)
        {
            largest = n1;
        }
        else
        {
            largest = n2;
        }
        System.out.print(largest);
    }
}