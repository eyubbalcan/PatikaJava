import java.util.Scanner;

public class PrimeNumber {
    static boolean isPrime(int num,int i){
      if (num <= 2) {
            return num == 2;

        }

        if (num % i == 0) {
            System.out.println("Sayınız asal değildir.");
            return false;

        } else if (i * i > num) {
            System.out.println("Sayınız asaldır");
            return true;
        } else {
            return isPrime(num, i + 1);
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int num = input.nextInt();
        System.out.println(isPrime(num,2));
    }
}
