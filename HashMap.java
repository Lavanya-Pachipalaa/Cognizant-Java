import java.util.HashMap;
import java.util.Scanner;
public class HashMap{
    public static void main(String[] args) {
        HashMap<Integer, String> student = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student ID and student Name and type '-1' to stop:");
        while (true) {
            System.out.print("Enter student ID: ");
            int stdid = sc.nextInt();
            sc.nextLine();
            if (stdid == -1) {
                break;
            }
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            student.put(stdid, name);
        }
        System.out.print("\nEnter student ID to search: ");
        int searchId = sc.nextInt();
        if (student.containsKey(searchId)) {
            System.out.println("Value: " + student.get(searchId));
        } else {
            System.out.println("No student found with ID: " + searchId);
        }
        sc.close();
    }
}
