import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the first price: ");
        int X = x.nextInt();
        Scanner y = new Scanner(System.in);
        System.out.print("Enter the second price: ");
        int Y = y.nextInt();
        if ((Y - 12 * X) > 0) {
            System.out.println("Profit");
            System.out.print(12 * X - Y);
        } else {
            System.out.print("Loss");
        }
    }
}