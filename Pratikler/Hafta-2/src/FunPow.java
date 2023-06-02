import javax.sound.midi.Soundbank;
import java.util.Scanner;


public class FunPow {
    static double pow(double base, int exponent ) {
            //Üst sayısı eğer 0 ise 1 döndür deniyor
        if (exponent == 0) return 1;
            // Üst sayısı her defasında -1 azaltarak 0 a kadar fonksiyon çağırılır ve gelen tabanlar çarpılır.
        else if( exponent > 0) return base * pow(base,exponent--);
            // Sonucu hesaplamak için 1'e tabanı böler ve ardından üst fonksiyonu recursive olarak çağırır
        else return 1 / base * pow(base, exponent++);

    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        //Her zaman sorması için oluşturulan döngü
        while (true) {
            System.out.print("Taban sayısını giriniz  :");
            double base = inp.nextInt();
            System.out.print("Üst sayısını giriniz  :");
            int exponent = inp.nextInt();
            System.out.println("Sonuç  :" + pow(base, exponent));
        }
    }
}
