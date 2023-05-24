import java.util.Scanner;

public class MinMaxSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz : ");
        int piece = input.nextInt();

        int minValue = Integer.MAX_VALUE; // Başlangıçta en büyük değer atanmalı
        int maxValue = Integer.MIN_VALUE; // Başlangıçta en küçük değer atanmalı

        for(int i=1;i<=piece;i++){
            System.out.print(i+". Sayınızı giriniz: ");
            int num = input.nextByte();
            // maxValue ilk olarak -2147483648 başlar
            if(num > maxValue){
                maxValue =num;
            }
            // minValue ilk olarak 2147483648 başlar
            if(num< minValue){
                minValue =num;
            }

        }
        System.out.print("En büyük nız: "  + maxValue + "\nEn küçük sayınız: " +minValue);



    }
}
