import java.util.Arrays;

public class ArrayReturnEvenNumber {
    public static void main(String[] args) {
        int[] list = {2, 3, 4, 5, 6, 7, 8, 9, 0, 10, 2, 3, 4, 5, 6, 8, 8, 5, 10};
        int[] evenList = new int[list.length];
        int startIndex = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (i != j && list[i] == list[j]) {
                    if (!isReturn(evenList, list[i])) {
                        if (list[i] % 2 == 0) {
                            evenList[startIndex] = list[i];
                            startIndex++;
                        }
                    }
                }
            }
        }
        System.out.println(Arrays.toString(evenList));
    }

    public static boolean isReturn(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }
}
