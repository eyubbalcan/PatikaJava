import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        Scanner input = new Scanner(System.in);
        int number = rand.nextInt(100);
        int right = 0;
        int[] wrong =new int[5];
        boolean isWin = false;
        boolean i
        while (right < 5) {
            System.out.println("Lütfen tahmininizi giririnz.");
            int value = input.nextInt();
            if (value < 0 || value > 100) {
                System.out.println("0-100 arası bir sayı giriniz.");
                continue;
            }
            if (value == number) {
                System.out.println("Tebrikler bildiniz.");
                break;
            } else {

                System.out.println("Malesef yanlış, sayı : " + number);
                if(value > number) System.out.println(value + "sayısı, gizli sayıdan büyüktür.");
                else System.out.println(value + "sayısı, gizli sayıdan küçüktür.");
                wrong[right]= value;
                right ++;

                System.out.println("Kalan hakkı : " + (5-right));
            }
        }

        if(!isWin){
            System.out.println("Kaybettiniz");
            System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
        }

    }
}
