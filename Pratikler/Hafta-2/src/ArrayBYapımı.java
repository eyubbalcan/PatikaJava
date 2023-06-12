public class ArrayBYapımı {
    public static void main(String[] args) {
        String[][] listA = new String[6][4];

        for (int i = 0; i < listA.length; i++) {
            for (int j = 0; j < listA[i].length; j++) {
                if (i == 0 || i == 2) {
                    listA[i][j] = "*";
                } else if (j == 0 || j == 3) {
                    listA[i][j] = "*";
                } else if (i==5 || j==3) {
                    listA[i][j] = "*";

                }else {
                    listA[i][j] = " ";
            }

            }

        }
        for (String[] row : listA) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
