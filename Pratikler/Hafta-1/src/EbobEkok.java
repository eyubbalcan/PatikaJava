import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1. Sayıyı giriniz:");
        int num1 = input.nextInt();
        System.out.print("2. Sayıyı giriniz:");
        int num2 = input.nextInt();
        int i = 1;
        int ebob = 0, ekok = 0;
        if (num1 > num2) {
            while (i <= num1) {
                if (num1 % i == 0 && num2 % i == 0) {
                    ebob = i;
                }
                i++;
            }
        } else {
            while (i <= num2) {
                if (num1 % i == 0 && num2 % i == 0) {
                    ebob = i;
                }
                i++;

            }
            ekok = (num1 * num2) / ebob;

            System.out.print("EBOB:" + ebob + "\nEKOK:" + ekok);


        }
    }
}