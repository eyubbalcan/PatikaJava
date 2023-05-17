import java.util.Scanner;

public class DongulerKalanSayiHesaplama {
    public static void main(String[] args) {
        int k,total=0,count=0;
        double average;
        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        k = input.nextInt();

        for(int i=0; i<=k ;i++){

            if((i % 3==0)&&(i % 4==0)){
                System.out.println(i);
                total+=i;
                count++;
            }

        }
        average=  total /  count;
        System.out.println("Ortalamanız: "+average);
    }
}
