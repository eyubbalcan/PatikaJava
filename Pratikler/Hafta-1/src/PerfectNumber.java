import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan sürekli olarak bir sayı girmesini isteyen ve girilen sayının mükemmel sayı olup olmadığını kontrol eden bir döngü
        while (true) {
            // Kullanıcıdan sayı girişi isteniyor
            System.out.print("Bir sayı giriniz: ");
            int pnum = inp.nextInt();
            int total = 0;

            for (int i = 1; i < pnum; i++) {
                if (pnum % i == 0) {
                    total += i; // pnum'un pozitif bölenlerini topluyoruz
                }
            }

            if (pnum == total) {
                System.out.println("Mükemmel sayıdır"); // Toplam, pnum'a eşitse mükemmel sayıdır
            } else {
                System.out.println("Değildir"); // Toplam, pnum'a eşit değilse mükemmel sayı değildir
            }

        }

    }
}

