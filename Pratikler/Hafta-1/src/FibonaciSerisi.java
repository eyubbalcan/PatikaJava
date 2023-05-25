import java.util.Scanner;

public class FibonaciSerisi {
    public static void main(String[] args) {
        //Kullanıcıdan eleman sayısı istiyoruz.
        Scanner inp = new Scanner(System.in);
        System.out.print("Eleman sayısını yazınız: ");
        int n = inp.nextInt();
        int total=0,a=0,b=1;
        //0 ile 1 hep olacağı için ekrana yazdırıyoruz
        System.out.print(a+" "+b+" ");
        for (int i=2; i<=n;i++) {
            // Fibonacci serisini hesaplamak için önceki iki terimi topluyoruz
            total = a + b;
            System.out.print(total + " ");
            // Önceki iki terimi güncelliyoruz
            a = b;
            b = total;
        }


        }
}

