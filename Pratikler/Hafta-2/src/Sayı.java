import java.util.Scanner;

public class Sayı {


    static void Don(int num) {
        if (num <= 0) {
            System.out.print(num + " ");
            return;
        }
        System.out.print(num + " ");
        Don(num - 5);
        System.out.print(num + " ");

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int number = input.nextInt();
        System.out.print("Çıktınız :" );
        Don(number);
    }
}
