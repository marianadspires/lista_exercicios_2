//Construa um programa em Java para ler três valores que
//representam três segmentos de reta. Verificar se com esses segmentos é possível compor
//um triângulo e mostrar uma mensagem dizendo se é ou não possível. (DICA: Usar if/else e
//operador lógico &&. Regra para ser um triângulo: (A < B + C) e (B < A + C) e (C < A + B), OU
//SEJA, todos os lados devem ser menores que a soma dos outros dois lados)

import java.util.Scanner;

public class lista02_06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int  a, b, c;
        System.out.print("Informe o primeiro segmento de reta: ");
        a = scanner.nextInt();

        System.out.print("Informe o segundo segmento de reta: ");
        b = scanner.nextInt();

        System.out.print("Informe o terceiro segmento de reta: ");
        c = scanner.nextInt();

        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("Os segmentos podem formar um triângulo.");
        } else {
            System.out.println("Os segmentos não podem formar um triângulo.");
        }


    }

}
