package jobsheet5;

import java.util.Scanner;

public class nestedUjianSkripsi14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message;

        System.out.print("Has the student been cleared of compensation? (Y/N or yes/no): ");
        String compensationStatus = sc.nextLine().trim();

        if (compensationStatus.equalsIgnoreCase("Y") || compensationStatus.equalsIgnoreCase("yes")) {
            System.out.print("Enter the number of guidence logs with Supervisor 1: ");
            int supervisor1 = sc.nextInt();
            System.out.print("Enter the number of guidence logs with Supervisor 1: ");
            int supervisor2 = sc.nextInt();

            if (supervisor1 >= 8 && supervisor2 >= 4) {
                message = "All requirements are met. The student may register for the thesis exam.";
            } else if (supervisor1 < 8 && supervisor2 < 4) {
                message = "Failed: Guidance logs with Supervisor 1 are fewer than 8 AND Supervisor 2 fewer than 4.";
            } else if (supervisor1 < 8 && supervisor2 >= 4) {
                message = "Failed: Guidance logs with Supervisor 1 are fewer than 8.";
            } else {
                message = "Failed: Guidance logs with Supervisor 2 are fewer than 4.";
            }
        } else {
            message = "Failed: The student has not been cleared of compensation.";
        }
        System.out.println(message);
        sc.close();
    }
}
