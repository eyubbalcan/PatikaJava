import java.util.Scanner;

public class YildizliElmas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Elmas değerinin sayısını giriniz:");
        int value = input.nextInt();
        for(int i = 1; i<=value;i++){
            for (int k=1; k<=(value-i);k++){
                System.out.print(" ");
            }
            for (int j=1; j<=(2*i)-1;j++){
                System.out.print("*");

            }
            System.out.println();
        }
        for(int i = value - 1; i >= 1; i--){
            for (int k=1; k<=(value-i);k++){
                System.out.print(" ");
            }
            for (int j=1; j<=(2*i)-1;j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
