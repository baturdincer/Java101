import java.util.Scanner;

public class DaireCevreAlan {
    public static void main(String[] args) {
        double r, pi, cevre, alan;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz: ");
        r= scanner.nextDouble();
        pi=3.14;
        cevre= 2*pi*r;
        alan= pi*r*r;
        System.out.println("Dairenin alanı: "+alan);
        System.out.println("Dairenin çevresi: "+ cevre);

    }
}
