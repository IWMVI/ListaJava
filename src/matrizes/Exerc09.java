package matrizes;

/*  Criar e carregar uma matriz [4][4] com valores aleatórios,
    sendo que a diagonal principal terá seus dados carregados no programa segundo: 
    
    |01|  |  |  |
    |  |04|  |  |
    |  |  |16|  |
    |  |  |  |64| */

public class Exerc09 {
    public static void main(String[] args) {
        int[][] mat = new int[4][4];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == j) {
                    int res = (int) Math.pow(4, i);
                    System.out.print(res);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
