package jobsheet5;
import java.util.Scanner;

public class wifiAccess14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String userType;
        int credits = 0;

        System.out.println("--- Campus WiFi Access System ---");
        System.out.print("Enter user type (lecturer/student): ");
        userType = sc.nextLine().toLowerCase();

        if (!userType.equals("lecturer") && !userType.equals("student")) {
            System.out.println("Acces Denied. Invalid user type, Please enter 'lecturer' or 'student'.");
        } 
        else if (userType.equals("lecturer")) {
            System.out.println("WiFi access granted as lecturer.");
        } 
        else if (userType.equals("student")) {
            System.out.print("Enter the number of credits taken: ");
            credits = sc.nextInt();

            if (credits >= 12) {
                System.out.println("WiFi access granted as student.");
            } else {
                System.out.println("Access Denied. Minimum 12 credits required.");
            }
        }
        sc.close();
    }
}
