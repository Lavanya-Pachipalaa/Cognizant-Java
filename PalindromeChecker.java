import java.util.Scanner;
public class PalindromeChecker{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String alphanumericalInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        boolean isPalindrome = isPalindrome(alphanumericalInput);
        if (isPalindrome) {
            System.out.println("The entered string is a palindrome.");
        } else {
            System.out.println("The entered string is NOT a palindrome.");
        }
        sc.close();
    }
    public static boolean isPalindrome(String string) {
        int l = 0, r = string.length() - 1;
        while (l < r) {
            if (string.charAt(l) != string.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
