import java.util.Scanner;

public class BasResult {
    public static void main(String[] args) {
        //Girilen sayının basamak sayılarının toplamını hesaplayan program
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int number = input.nextInt();
        int tempNumber= number;
        int basValue=0;
        int result=0;
        while ( tempNumber != 0) {
            basValue = tempNumber %10;
            result += basValue;
            tempNumber /= 10;

        }
        System.out.println(result);


    }
}
