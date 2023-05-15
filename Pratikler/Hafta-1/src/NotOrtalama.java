import java.util.Scanner;

public class NotOrtalama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float mat,fiz,kim,tur,tar,muz,sonuc;

        System.out.print("Matematik Notnuzu Giriniz:");
        mat = input.nextFloat();

        System.out.print("Fizik Notunuzu Giriniz:");
        fiz = input.nextFloat();

        System.out.print("Kimya Notunuzu Giriniz:");
        kim = input.nextFloat();

        System.out.print("Türkçe Notunuzu Giriniz:");
        tur = input.nextFloat();

        System.out.print("Tarih Notunuzu Giriniz:");
        tar=input.nextFloat();

        System.out.print("Müzik Notunuzu Giriniz:");
        muz=input.nextFloat();

        sonuc= (mat+fiz+kim+tur+tar+muz)/6;
        System.out.print("Ortalamanız:" + sonuc);

    }

}
