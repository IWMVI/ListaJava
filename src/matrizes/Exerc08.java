package matrizes;

/*  Criar e carregar uma matriz [4][3] inteiro com quantidade de produtos vendidos em 4 semanas. Calcular e exibir:
    a. A quantidade de cada produto vendido no mês; 
    b. A quantidade de produtos vendidos por semana;
    c. O total de produtos vendidos no mês. */

public class Exerc08 {
    public static void main(String[] args) {
        int[][] mat = new int[4][3];
        // i = Semana
        // j = Produto

        for (int i = 0; i < mat.length; i++) {
            System.out.println("Semana " + (i + 1));
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print("Informe a quantidade de produtos do tipo " + (j + 1) + " vendidas no mês: ");
                mat[i][j] = Integer.parseInt(System.console().readLine());
            }
        }

        produtoMes(mat);
        produtoSemana(mat);
        vendaMes(mat);
    }

    public static void produtoMes(int[][] mat) {
        int prod1 = 0, prod2 = 0, prod3 = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                switch (j) {
                    case 0:
                        prod1 += mat[i][j];
                        break;

                    case 1:
                        prod2 += mat[i][j];
                        break;
                        
                    case 2:
                        prod3 += mat[i][j];
                        break;
                }
            }
        }
        System.out.println("\nVendas do produto 1: " + prod1);
        System.out.println("Vendas do produto 2: " + prod2);
        System.out.println("Vendas do produto 3: " + prod3);
    }

    public static void produtoSemana(int[][] mat) {
        int sem1 = 0, sem2 = 0, sem3 = 0, sem4 = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                switch (i) {
                    case 0:
                        sem1 += mat[i][j];
                        break;

                    case 1:
                        sem2 += mat[i][j];
                        break;

                    case 2:
                        sem3 += mat[i][j];
                        break;

                    case 3:
                        sem4 += mat[i][j];
                        break;
                }
            }
        }

        System.out.println("\nVendas na semana 1: " + sem1);
        System.out.println("Vendas na semana 2: " + sem2);
        System.out.println("Vendas na semana 3: " + sem3);
        System.out.println("Vendas na semana 4: " + sem4);
    }

    public static void vendaMes(int[][] mat) {
        int cont = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                cont += mat[i][j];
            }
        }

        System.out.println("\nTotal de produtos vendidos: " + cont);
    }
}
