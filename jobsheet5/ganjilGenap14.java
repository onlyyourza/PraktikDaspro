package jobsheet5;
import java.util.Scanner;;

public class ganjilGenap14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;
        System.out.print("Input Angka: ");
        angka = sc.nextInt();

        if(angka % 2 ==0) {
            System.out.println("Angka Genap");
        } else {
            System.out.println("Angka Ganjil");
        }
        sc.close();
    }
}
