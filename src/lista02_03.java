//Construa um programa em Java para ler dois valores e mostrar o
//maior deles.

import java.util.Scanner;

public class lista02_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num1, num2;

        System.out.print("Informe o primeiro numero: ");
        num1 = scanner.nextFloat();

        System.out.print("Informe o segundo numero: ");
        num2 = scanner.nextFloat();

        if (num1 > num2) {
            System.out.println("O maior numero é: " + num1);
        } else if (num2 > num1) {
            System.out.println("O maior numero é: " + num2);
        } else {
            System.out.println("Os dois numeros são iguais.");
        }

    }
}

