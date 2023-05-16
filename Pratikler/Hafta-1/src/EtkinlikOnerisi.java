import java.util.Scanner;

public class EtkinlikOnerisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int heat;
        String result;
        System.out.print("Sıcaklık giriniz:");
        heat = input.nextInt();
        result= (heat<5) ? "Kayağa Gidiniz." : "Diğer etkinliklere göz atınız.";
        System.out.println(result);
        if (heat >= 25){
            System.out.println("Yüzmeye gidebilirsin");
        }else if(heat >= 10){
            System.out.println("Piknige gidebilirsin");
        }else if(heat>=5) {
            System.out.println("Sinemaya gidebilirsin");
        }

    }
}
