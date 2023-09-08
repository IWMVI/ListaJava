package matrizes;

/*
 *  X X X X X X
 *          X X
 *        X   X
 *      X     X
 *    X       X
 *  X         X
 */
public class Ext03 {
    public static void main(String[] args) {

        int[][] mat = new int[5][5];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == 0) {
                    System.out.print("X");
                } else if (j == mat[j].length - 1) {
                    System.out.print("X");
                } else if (j == mat[i].length - i - 1) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
