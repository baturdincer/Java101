import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double kisaKenar, uzunKenar, hipotenus;
        System.out.print("Kısa kenar uzunluğunu giriniz: ");
        kisaKenar= scanner.nextDouble();
        System.out.print("Uzun kenar uzunluğunu giriniz: ");
        uzunKenar= scanner.nextDouble();
        hipotenus=Math.sqrt((kisaKenar*kisaKenar)+(uzunKenar*uzunKenar));
        System.out.println("Hipotenüs uzunluğu= "+hipotenus);
    }
}