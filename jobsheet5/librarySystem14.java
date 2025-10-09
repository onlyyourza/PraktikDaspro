package jobsheet5;
import java.util.Scanner;

public class librarySystem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bringId, registeredOnline = false;

        System.out.print("Is the student bring Id? (true/false)");
        bringId = sc.nextBoolean();

        if (!bringId) {
        System.out.print("Is the student registered online? (true/false)");
        registeredOnline = sc.nextBoolean();
        }
    
        if(bringId || registeredOnline) {
            System.out.println("Allowed to enter the library");
        } else {
            System.out.println("Access Denied");
        }
        sc.close();
    }
}