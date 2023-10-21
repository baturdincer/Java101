import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Doğduğunuz ay: ");
        String ay = scanner.next();
        System.out.print(ay+" Ayının kaçıncı gününde doğdunuz: ");
        int day= scanner.nextInt();
        if (ay.equalsIgnoreCase("ocak")&&(day>=1&&day<=31)){
            if (day<=21)System.out.println("Oğlak");
            else System.out.println("Kova");
        }
        else if (ay.equalsIgnoreCase("şubat")&&(day>=1&&day<=29)) {
            if (day<=19) System.out.println("Kova");
            else System.out.println("Balık");
        }
        else if(ay.equalsIgnoreCase("mart")&&(day>=1&&day<=31)){
            if (day<=20) System.out.println("Balık");
            else System.out.println("Koç");
        }
        else if(ay.equalsIgnoreCase("nisan")&&(day>=1&&day<=30)){
            if (day<=20) System.out.println("Koç");
            else System.out.println("Boğa");
        }
        else if(ay.equalsIgnoreCase("mayıs")&&(day>=1&&day<=31)){
            if (day<=21) System.out.println("Boğa");
            else System.out.println("İkizler");
        }
        else if (ay.equalsIgnoreCase("haziran")&&(day>=1&&day<=30)) {
            if(day>=22) System.out.println("İkizler");
            else System.out.println("Yengeç");
        }
        else if(ay.equalsIgnoreCase("temmuz")&&(day>=1&&day<=31)){
            if (day<=22) System.out.println("Yengeç");
            else System.out.println("Aslan");
        }
        else if (ay.equalsIgnoreCase("ağustos")&&(day>=1&&day<=31)) {
            if(day<=22) System.out.println("Aslan");
            else System.out.println("Başak");
        }
        else if (ay.equalsIgnoreCase("eylül")&&(day>=1&&day<=30)) {
            if (day<=22) System.out.println("Başak");
            else System.out.println("Terazi");
        }
        else if (ay.equalsIgnoreCase("ekim")&&(day>=1&&day<=31)) {
            if (day<=22) System.out.println("Terazi");
            else System.out.println("Akrep");
        }
        else if (ay.equalsIgnoreCase("kasım")&&(day>=1&&day<=30)) {
            if (day<=21) System.out.println("Akrep");
            else System.out.println("Yay");
        }
        else if (ay.equalsIgnoreCase("aralık")&&(day>=1&&day<=31)) {
            if (day<=21) System.out.println("Yay");
            else System.out.println("Oğlak");
        }
        else System.out.println("Geçersiz bir tarih girdiniz!");


    }
}