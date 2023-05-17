import java.util.Scanner;
import java.text.DecimalFormat;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        double pear,apple,tomatoes,banana,aubergine,total;

        Scanner input = new Scanner(System.in);
        //Kaç kilo oldğunu alıyorum
        System.out.print("Armut kaç kilo ? :");
        pear = input.nextDouble();
        System.out.print("Elma kaç kilo ? :");
        apple = input.nextDouble();
        System.out.print("Domates kaç kilo ? :");
        tomatoes = input.nextDouble();
        System.out.print("Muz kaç kilo ? :");
        banana = input.nextDouble();
        System.out.print("Patlıcan kaç kilo ? :");
        aubergine = input.nextDouble();
        total = (pear * 2.14)+(apple*3.67)+(tomatoes*1.11)+(banana*0.95)+(aubergine*5);
        //Ondalık olarak yeni bir format oluşturuldu.
        // Noktadan sonra maksimum 2 basamak göstermek için DecimalFormat kullanılır.
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String formattedNumber = decimalFormat.format(total);
        System.out.println("Toplam tutar:" + formattedNumber);

    }
}
