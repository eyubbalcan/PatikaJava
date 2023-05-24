import java.util.Scanner;

public class AsalNum {
    public static void main(String[] args) {
        // 2'den 100'e kadar olan tüm sayıları kontrol ediyoruz
        for (int i = 2; i <= 100; i++){
            boolean isItPrime =true;// isItPrime değişkeni her bir sayı için başlangıçta true olarak ayarlanır
            for(int j =2; j<i;j++){
                // Eğer i sayısı j sayısına tam bölünürse, asalMi değişkenini false yaparız ve döngüyü kırarız
                if(i % j==0){
                    isItPrime =false;
                    break;
                }
                // isItPrime değişkeni hala true ise, i sayısı asal bir sayıdır
                // Bu durumda i sayısını ekrana yazdırırız
            }if(isItPrime){
                System.out.print(i+" ");
            }

        }
    }
}
