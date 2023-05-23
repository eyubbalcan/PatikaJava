import java.util.Scanner;
//Kullanıcının girdiği yılın artık olup olmadığını bulan program.
public class ArtikYil {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.println("Yılı giriniz:");
        year = input.nextInt();
        //400 ve 4 ün katlarıysa bunu yap
        if(year % 400==0 || year % 4==0)System.out.println(year +"Artık yıldır");
        //değilse bunu
        else System.out.println(year +"  Artık yıl değildir");

    }
}
