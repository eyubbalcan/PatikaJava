import java.util.Scanner;

public class DeseneGoreMetotOlusturma {


    static void Don(int num) {

        if (num <= 0) {
            System.out.print(num + " "); // Negatif sayıya ulaşıldığında sayıyı yazdır
            return;
        }
        System.out.print(num + " "); // Sayıyı yazdır
        Don(num - 5); // 5 azaltarak recursive olarak Don fonksiyonunu çağır
        System.out.print(num + " "); // Eksiye düştükten sonra recursive olan bütün sayıları geri yazdırır

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int number = input.nextInt();
        System.out.print("Çıktınız :" );
        Don(number);
    }
}
