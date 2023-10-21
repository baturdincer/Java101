import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double boy, kilo, index;
        System.out.print("Boyunuzu giriniz(m): ");
        boy= scanner.nextDouble();
        System.out.print("Kilonuzu giriniz(kg): ");
        kilo= scanner.nextDouble();

        index= kilo/(boy*boy);
        System.out.println("Vücut kitle indeksiniz: "+index);

    }
}