import java.util.Arrays;

public class AgainNumber {

    public static void main(String[] args) {
        int[] list = {2, 3, 4, 5, 6, 8, 9, 8, 8, 5, 10};
        int[] number = new int[list.length];
        int[] againnumber = new int[list.length];
        int sayac = 0;
        System.out.println("Dizi : " + Arrays.toString(list));
        System.out.println("Tekrar Sayıları");
        for (int i = 0; i < list.length; i++) {
            int num = list[i];
            boolean again = false;
            for (int j = 0; j < list.length; j++) {
                if (number[j] == num) {
                    againnumber[j]++;
                    again = true;
                    break;
                }

            }
            if (!again) {
                number[sayac] = num;
                againnumber[sayac] = 1;
                sayac++;
            }
        }
        for (int i = 0; i < sayac; i++) {
            System.out.println(number[i] + " sayısı " + againnumber[i] + " kez tekrar ediyor.");

        }
    }
}
