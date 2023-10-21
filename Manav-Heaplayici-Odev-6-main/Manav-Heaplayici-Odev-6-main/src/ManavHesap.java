import java.util.Scanner;

public class ManavHesap {
    public static void main(String[] args) {
        double armut, elma, domates, muz, patlican, toplam;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Armut kaç kilo: ");
        armut = scanner.nextDouble();
        System.out.print("Elma kaç kilo: ");
        elma=  scanner.nextDouble();
        System.out.print("Domates kaç kilo: ");
        domates=  scanner.nextDouble();
        System.out.print("Muz kaç kilo: ");
        muz=  scanner.nextDouble();
        System.out.print("Patlıcan kaç kilo: ");
        patlican=  scanner.nextDouble();

        toplam= (2.14*armut)+(3.67*elma)+(1.11*domates)+(0.95*muz)+(5*patlican);
        System.out.println("Toplam tutar: "+toplam+" TL");
    }
}