public class ArrayHarmonicAverage {
   public static void main(String[] args) {
       int[] list = {1, 2, 3, 4, 5, 6};
       double harm = 0.0;
       double sum = 0.0;
       for (int i = 0; i < list.length; i++) {
           sum += 1.0 / list[i];
       }
       harm = list.length / sum;

       System.out.println(harm);
    }
}
