package recursividade;

// Serie1 = (1+2+3+...+100)

public class Exerc01 {
    public static void main(String[] args) {
        int valor = 1;
        System.out.println("O resultado da sequência é: " + rec(valor));
    }

    public static int rec(int valor) {
        if (valor == 100) {
            return valor;
        } else {
            return valor + rec(valor + 1);
        }
    }
}