import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        //Kullanıdan kaç adet yıldızla başlamsını gerektiğini istiyoruz
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı giriniz :  ");
        int value = inp.nextInt();
        //Girilen değeri
        for (int i = value - 1; i >= 1; i--) {
            // Satırın başına boşluk eklemek için döngü
            for (int k = 1; k <= (value - i); k++) {
                System.out.print(" ");
            }
            // Yıldızları düzenlemek için döngü
            for (int j = 1; j <= (2*i)-1 ; j++) {
                System.out.print("*");

            }
            System.out.println();// Bir sonraki satıra geçmek için boş bir satır yazdırılır
        }
    }
}
