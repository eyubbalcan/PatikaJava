import java.util.Scanner;
public class taksiMetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kmucreti=2.2,km,sonuc=10;
        System.out.println("Kaç kilometre giriniz:");
        km = input.nextInt();
        sonuc+= km * kmucreti;

        sonuc = (sonuc<20) ? 20 : sonuc;
        System.out.println("Ücretiniz:"+sonuc);

        /*if(sonuc<20){

            System.out.println("Ücretiniz 20 Tldir");
        }
        /* else{
            System.out.println("Ücretiniz:"+sonuc);
        }
        */
    }
}
