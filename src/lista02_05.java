//Construa um programa em Java para ler um valor, verificar se está no
//intervalo (100, 200) e mostrar essa informação.

import java.util.Scanner;

public class lista02_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num;

        System.out.print("Informe um numero : ");
        num = scanner.nextFloat();

        if (num > 100 && num < 200) {
            System.out.println("O numero está no intervalo entre 100 e 200.");
        } else {
            System.out.println("O numero não está no intervalo entre 100 e 200.");
        }


    }
}


