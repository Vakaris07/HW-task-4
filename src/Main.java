//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter third number: ");
        int c = sc.nextInt();
        sc.close();
        int smallest;
        if (a <= b && c <= a) {
            smallest = a;
        } else if (b <= c && c <= a) {
            smallest = b;
        } else {
            smallest = c;
        }
        System.out.println("Smallest number is: " + smallest);
    }
}