package matrizes;

/*  Criar uma matriz [8][8] inteiro e o programa irá carregar segundo:
 * 
 *  1 1 1 1 1 1 1 1
 *  1 2 2 2 2 2 2 1
 *  1 2 3 3 3 3 2 1
 *  1 2 3 4 4 3 2 1
 *  1 2 3 4 4 3 2 1
 *  1 2 3 3 3 3 2 1
 *  1 2 2 2 2 2 2 2
 *  1 1 1 1 1 1 1 1
 * 
 */

public class Exerc11 {
    public static void main(String[] args) {
        int[][] mat = new int[8][8];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                //Independente do tamanho da matriz o código irá manter o padrão.
                mat[i][j] = Math.min(Math.min(i, j), Math.min(mat.length - i - 1, mat[i].length - j - 1)) + 1;
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
