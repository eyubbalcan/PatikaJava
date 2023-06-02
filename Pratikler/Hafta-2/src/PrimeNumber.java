import java.util.Scanner;

public class PrimeNumber {
    static boolean isPrime(int num,int i){
        // 2 tek çift asal sayıdır
      if (num <= 2) return num == 2;

        if (num % i == 0) {
            // num, i'ye tam bölünüyorsa, num asal değildir
            System.out.println(num+" sayınız Asal değildir.");
            return false;

        } else if (i * i > num) {
            // i'nin karesi num'dan büyükse, num asaldır
            System.out.println(num+" sayınız Asaldır");
            return true;
        } // i'yi bir artırarak recursive olarak isPrime fonksiyonunu çağır
            else return isPrime(num, i + 1);

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int num = input.nextInt();
        System.out.println(isPrime(num,2) );
    }
}
