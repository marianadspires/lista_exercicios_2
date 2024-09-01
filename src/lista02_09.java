//Laranjas em um mercado de produtos orgânicos custam R$ 0,30 se
//forem compradas menos que uma dúzia, e R$ 0,25 se forem compradas pelo menos doze.
//Construa um programa em Java que leia o número de laranjas compradas, calcule e escreva o
//valor total da compra. Implementar uma validação da quantidade de frutas a serem
//compradas para evitar que seja lido um número de laranjas menor (negativo) ou igual a zero.

import java.util.Scanner;

class Lista02_09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numItensCompra;
        double valorDuzia = 0.25;
        double valorUnidade = 0.30;

        System.out.print("Informe a quantidade de laranjas compradas: ");
        numItensCompra = scanner.nextInt();

        if (numItensCompra <= 0) {
            System.out.println("Nenhum item foi comprado.");
        } else {
            double valorTotal;
            if (numItensCompra >= 12) {
                valorTotal = numItensCompra * valorDuzia;
                System.out.printf("%d unidade(s) de laranja a R$ %.2f a unidade = R$ %.2f\n", numItensCompra, valorDuzia, valorTotal);
            } else {
                valorTotal = numItensCompra * valorUnidade;
                System.out.printf("%d unidade(s) de laranja a R$ %.2f a unidade = R$ %.2f\n", numItensCompra, valorUnidade, valorTotal);
            }
        }

    }
}
