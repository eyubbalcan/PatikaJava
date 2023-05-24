import java.util.Scanner;

public class MinMaxSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz : ");
        int piece = input.nextInt();

        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        for(int i=1;i<=piece;i++){
            System.out.print(i+". Sayınızı giriniz: ");
            int sayi = input.nextByte();
            if(sayi > maxValue){
                maxValue =sayi;
            }
            if(sayi< minValue){
                minValue =sayi;
            }

        }
        System.out.print("En büyük sayınız: " + maxValue + "\nEn küçük sayınız: "+minValue);



    }
}
