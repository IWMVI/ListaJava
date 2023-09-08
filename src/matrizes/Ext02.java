package matrizes;

/*     X
 *    X
 *   X
 *  X
 */

public class Ext02 {
    public static void main(String[] args) {

        int[][] mat = new int[8][8];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (j == mat[i].length - i - 1) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
