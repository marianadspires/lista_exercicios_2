//Construa um programa em Java para ler um valor, verificar se é
//maior do que 100 e mostrar essa informação. (DICA: Usar if/else para mostrar se valor é >
//ou < 100)

import java.util.Scanner;

public class lista02_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int valor;

        System.out.print("Informe um numero:");
        valor = scanner.nextInt();

        if (valor > 100) {
            System.out.println("O valor é maior que 100.");
        } else if (valor == 100) {
            System.out.println("O valor é igual a 100.");
        } else {
            System.out.println("O valor é menor que 100.");
        }

    }
}


