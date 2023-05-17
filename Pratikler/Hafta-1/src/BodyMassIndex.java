import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {

        double kg,size,index;
        Scanner input = new Scanner(System.in);

        //Burada kullanıcadan kilo ve boyu alıyoruz
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
        size = input.nextDouble();


        //Burada yanlış boyu yanlış girmemesini sağlıyorum
        if(size<2.5 && size>1)
            {
            System.out.print("Lütfen kilonuzu giriniz : ");

            kg = input.nextDouble();
            index= kg/(size*size);
            System.out.println(index);
            }

        else {
            System.out.println("Boyu yanlış girdiniz");
        }



    }
}
