import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz: ");
        int birthYear=scanner.nextInt();
        scanner.close();
        String animal;

        int zodiac= birthYear%12;
        switch (zodiac){
            case 0:
                animal="Maymun";
                break;
            case 1:
                animal="Horoz";
                break;
            case 2:
                animal= "Köpek";
                break;
            case 3:
                animal= "Domuz";
                break;
            case 4:
                animal= "Fare";
                break;
            case 5:
                animal="Öküz";
                break;
            case 6:
                animal="Kaplan";
                break;
            case 7:
                animal="Tavşan";
                break;
            case 8:
                animal= "Ejderha";
                break;
            case 9:
                animal="Yılan";
                break;
            case 10:
                animal= "At";
                break;
            case 11:
                animal= "Koyun";
                break;
            default:
                animal= "hesaplanamadı";
                break;
        }
        System.out.println("Çin zodyağı burcunuz "+animal);
    }
}