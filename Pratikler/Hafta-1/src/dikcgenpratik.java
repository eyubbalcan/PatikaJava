import java.util.Scanner;
public class dikcgenpratik {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int a,b;
        double c;
        System.out.println("1. Kenarı giriniz:");
        a = input.nextInt();

        System.out.println("2. Kenarı giriniz:");
        b = input.nextInt();

        c = Math.sqrt((a*a)+(b*b));

        System.out.println("Hipotenüs"+c);


    }
}
