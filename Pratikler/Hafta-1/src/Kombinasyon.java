import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,r,i,a,nf=1,rf=1,af=1,c;
        System.out.print("Küme kaç elemanlı olsun: ");
        n = input.nextInt();
        System.out.print("Kaç elemanlı farklı grupları olsun: ");
        r = input.nextInt();

        // n sayısının faktöriyelini bulmak için:
        for(i= n; i>0; i--){
            nf = nf * i;
        }

        // r sayısının faktöriyelini bulmak için:
        for(i=r; i>0; i--){
            rf = rf * i;
        }

        a = n-r;

        // a sayısının faktöriyelini bulmak için:
        for(i=a; i>0; i--){
            af = af * i;
        }

        c = nf / (rf * af);
        System.out.print(c);
    }
}
