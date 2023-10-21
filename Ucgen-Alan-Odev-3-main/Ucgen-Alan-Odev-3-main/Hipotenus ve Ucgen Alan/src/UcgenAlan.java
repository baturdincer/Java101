import java.util.Scanner;

public class UcgenAlan {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double a, b, c, u, alan;
        System.out.print("1. kenar uzunluğunu girin: ");
        a= scanner.nextDouble();
        System.out.print("2. kenar uzunluğunu girin: ");
        b= scanner.nextDouble();
        System.out.print("3. kenar uzunluğunu girin: ");
        c= scanner.nextDouble();

        u= (a+b+c)/2;
        alan= Math.sqrt(u* (u-a) * (u-b)* (u-c));
        System.out.println("Üçgenin alanı= "+alan);
    }
}
