import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a;
        int sum=0;
        int count=0;
        double average;
        Scanner sc =new Scanner(System.in);
        System.out.println("Sayı Giriniz");
        a=sc.nextInt();
        for (int b=1;b<a;b++){
            if(b%12==0){
                sum+=b;
                count++;
            }
        }
        average=sum/count;
        System.out.println(average);
    }
}