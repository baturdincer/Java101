import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number1, number2, sonuc;
        int select;
        Scanner scanner= new Scanner(System.in);
        System.out.print("İlk sayıyı girin: ");
        number1= scanner.nextInt();
        System.out.print("İkinci sayıyı girin: ");
        number2= scanner.nextInt();
        System.out.println("1- Toplama\n2- Çıkarma\n3- Çarpma\n4- Bölme");
        select= scanner.nextInt();
        switch (select){
            case 1:
                sonuc= number1+number2;
                System.out.println("İşleminizin sonucu: "+sonuc);
                break;
            case 2:
                sonuc= number1-number2;
                System.out.println("İşleminizin sonucu: "+sonuc);
                break;
            case 3:
                sonuc= number1*number2;
                System.out.println("İşleminizin sonucu: "+sonuc);
                break;
            case 4:
                if(number2==0){
                    System.out.println("Bir sayıyı 0'a bölemezsin");
                }
                else {
                    sonuc = number1 / number2;
                    System.out.println("İşleminizin sonucu: "+sonuc);
                }
                break;
            default:
                System.out.println("Yanlış sayı girdiniz!");
                break;
        }

    }
}