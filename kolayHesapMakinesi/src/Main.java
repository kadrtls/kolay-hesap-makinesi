import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int n1,n2,select;
        Scanner scanner=new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz");
        n1= scanner.nextInt();
        System.out.println("ikinci sayıyı giriniz");
        n2= scanner.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Yapacağınız işlemi seçiniz:");
        select= scanner.nextInt();

        if (select==1){
            System.out.println("sonuç :" +(n1+n2));
        } else if (select==2) {
            System.out.println("sonuc :" +(n1-n2));
        } else if (select==3) {
            System.out.println("sonuc :" +(n1*n2));
        } else if (select==4) {
            if (n2!=0){
                System.out.println("sonuc :" +(n1/n2));
            }else {
                System.out.println("sayı 0'a bölünemez");
            }
        }else {
            System.out.println("yanlış işlem yaptınız tekrar deneyin");
        }


    }
}