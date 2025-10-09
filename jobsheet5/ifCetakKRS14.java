package jobsheet5;
import java.util.Scanner;

public class ifCetakKRS14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("---Print KRS SIAKAD---");
        System.out.print("Have the tuition fees been paid in full? (true/false): ");
        boolean uktLunas = input.nextBoolean();

        // Bentuk IF-ELSE
        // if (uktLunas) {
        //     System.out.println("UKT Payment has been verified");
        //     System.out.println("KRS now can be printed and you can ask the academic advisor to sign it.");
        // } else {
        //     System.out.println("Registration rejected. Please pay UKT first.");
        // }

        // Bentuk Ternary Operator
        String message = uktLunas 
            ? "UKT Payment has been verified. KRS now can be printed and you can ask the academic advisor to sign it." 
            : "Registration rejected. Please pay UKT first.";
            
        System.out.println(message);

        input.close();
    }
}
