import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Yılı giriniz: ");
        int yil= scanner.nextInt();
        if(yil%4==0){
            if(yil%100==0&&yil%400!=0) System.out.println(yil+" Bir artık yıl değildir");
            else System.out.println(yil+" Bir artık yıldır");
        }
        else System.out.println(yil+" Bir artık yıl değildir");
    }
}