import java.util.Scanner;

public class ForcesofNumbers {
    public static void main(String[] args) {
        int n,total;
        Scanner input=new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        n=input.nextInt();
        System.out.println("4 sayısının kuvvetleri");
        for(int i=1; i<=n;i*=4){
            System.out.println(+i);

        }
        System.out.println("5 sayısının kuvvetleri");
        for(int i=1; i<=n;i*=5){
            System.out.println(+i);
        }
    }
}
