import java.util.Scanner;
public class KdvHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float kdvorani = 1.18f;
        float fiyat, sonuc,kdvhesabi;


        System.out.print("Fiyatı giriniz:");
        fiyat = input.nextFloat();
        sonuc= fiyat * kdvorani;
        kdvhesabi = sonuc-fiyat;
        System.out.print("Kdv Tutarınız:"+ kdvhesabi);






    }
}
