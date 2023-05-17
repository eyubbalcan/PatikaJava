import java.util.Scanner;

public class UcakBiletiUygulamasi {
    public static void main(String[] args) {
        int km,age,ttype;
        double km_fee=0.10;
        Scanner input= new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz :");
        km = input.nextInt();
        System.out.print("Yaşınızı giriniz :");
        age = input.nextInt();
        // Yaşa göre indirimleri kontrol et çocuk
        if(age<12){
            double total= (km*km_fee);
            System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
            ttype= input.nextInt();
            //Yolculuk türünü kontrol et
            if(ttype==2){
            total = (total*2)/2;

            System.out.print("Toplam Tutar =" +total+"TL");}
            if(ttype==1) System.out.print("Toplam Tutar =" +(total/2)+"TL");
        }  // Yaşa göre indirimleri kontrol et genç
        else if (age>12 && age<24) {
            double total= (km*km_fee);
            System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
            ttype= input.nextInt();
            //Yolculuk türünü kontrol et
            if(ttype==2){
                total = (total*2) *0.9;
                System.out.print("Toplam Tutar =" +total+"TL");}
            if(ttype==1) System.out.print("Toplam Tutar =" +(total*0.9)+"TL");

        }// Yaşa göre indirimleri kontrol et 24 yaş ve üstü
        else{
            double total= (km*km_fee);
            System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
            ttype= input.nextInt();
            //Yolculuk türünü kontrol et
            if(ttype==2){
                total = (total*2);
                System.out.print("Toplam Tutar =" +total+"TL");}
            if(ttype==1) System.out.print("Toplam Tutar =" +(total)+"TL");
        }


    }
}
