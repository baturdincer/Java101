import java.util.Scanner;

public class DaireAciliAlani {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double angle, radius, area,pi;
        System.out.print("Dairenin merkez açısını giriniz: ");
        angle= scanner.nextDouble();
        System.out.print("Dairenin yarıçapını giriniz:");
        radius= scanner.nextDouble();
        pi=3.14;
        area= (pi*radius*radius*angle)/360;
        System.out.println("Dairenin "+angle+" açılık bölümünün alanı= "+area);

    }
}
