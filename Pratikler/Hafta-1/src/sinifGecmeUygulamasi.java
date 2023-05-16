import java.util.Scanner;

public class sinifGecmeUygulamasi {
    public static void main(String[] args) {
        int mat,fiz,kim,tur,muz,toplam, valid=0,validNumber=0;
        double average;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik kodunu giriniz:");
        mat = input.nextInt();
        if (mat>=0 && mat<=100) {
            valid +=mat;
            ++validNumber;}

        System.out.print("Fizik  kodunu giriniz:");
        fiz = input.nextInt();
        if (fiz>=0 && fiz<=100) {
            valid +=fiz;
            ++validNumber;}

        System.out.print("Kimya  kodunu giriniz:");
        kim = input.nextInt();
        if (kim>=0 && kim<=100) {
            valid +=kim;
            ++validNumber;}

        System.out.print("Türkçe  kodunu giriniz:");
        tur = input.nextInt();
        if (tur>=0 && tur<=100) {
            valid +=tur;
            ++validNumber;}

        System.out.print("Müzik  kodunu giriniz:");
        muz = input.nextInt();
        if (muz>=0 && muz<=100) {
            valid +=muz;
            ++validNumber;}

        average = valid/validNumber;

        if(average>=55){
            System.out.println("Geçtiniz.");
        }else{
            System.out.println("Kaldınız.");
        }
        System.out.println("Ortalamanız: " + average);
    }
}
