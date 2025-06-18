import java.util.Scanner;
public class TryCatch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        int n1 = sc.nextInt();
        System.out.print("Enter denominator: ");
        int n2 = sc.nextInt();
        try {
            int result = n1 / n2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        sc.close();
    }
}
