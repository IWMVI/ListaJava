package matrizes;

public class Ext04 {

    public static void main(String[] args) {

        int[][] mat = new int[8][8];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == 0 || j == mat[j].length - 1 || i == mat[i].length - 1 || j == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
