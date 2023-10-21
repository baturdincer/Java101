import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hava sıcaklığını girin: ");
        double temp= scanner.nextDouble();
        scanner.close();
        if (temp<5) System.out.println("Size kayak yapmanızı öneririm");
        else if (temp>=5&&temp<=25) {
            if (temp>=5&&temp<10) System.out.println("Size sinemaya gitmenizi öneririm");
            else if (temp>=10&&temp<=15) {
                System.out.println("Size sinemaya gitmenizi veya piknik yapmanızı öneririm");
            }
            if (temp>15&&temp<=25) System.out.println("Size piknik yapmanızı öneririm");
        } else if (temp>25) {
            System.out.println("Size yüzmeye gitmenizi öneririm");
        }
    }
}