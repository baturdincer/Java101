import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double ucret;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Kaç km yol gidildi: ");
        double yol= scanner.nextDouble();
        ucret = 10 + (yol*2.20);
        boolean yirmiMi= ucret<=20;
        double sonTutar = yirmiMi? 20 : ucret;
        System.out.println("Taksimetre tutarı: "+sonTutar);

    }
}