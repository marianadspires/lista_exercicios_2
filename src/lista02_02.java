//Construa um programa em Java para ler um valor, verificar se é par
//ou ímpar e mostrar essa informação. (DICA: Usar if/else e o operador aritmético % para
//mostrar se valor é par ou ímpar. Ex. (valor % 2 == 0) é par...)

import java.util.Scanner;

public class lista02_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float valor;

        System.out.print("Informe um número: ");
        valor = scanner.nextFloat();

        if (valor % 2 == 0) {
            System.out.println("O valor informado é par.");
        } else {
            System.out.println("O valor informado é ímpar.");
        }

    }
}


