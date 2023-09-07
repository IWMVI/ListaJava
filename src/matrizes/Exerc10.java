package matrizes;

/*  Criar uma matriz [8][8] onde o programa irá carregar segundo:
 *  Casa : 1 | 2 | 3 | 4 | ... |
 *  Valor: 1 | 2 | 4 | 8 | ... |
 */

public class Exerc10 {
    public static void main(String[] args) {
        double[][] mat = new double[8][8];
        double anterior = 1;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = (int) anterior;
                anterior *= 2;
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.println(mat[i][j] + " ");
            }
        }
    }
}
