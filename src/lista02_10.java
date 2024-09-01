//Produtos em uma mercearia possuem preços variados de acordo com
//o tipo de produto e a quantidade a ser comprada. Implemente um programa em Java que
//apresente a lista de produtos disponíveis juntamente com seus preços e solicite ao usuário
//que escolha (1) o produto a ser comprado e (2) a quantidade escolhida do produto e informe
//o valor da compra. Os produtos e seus preços são: banana (R$ 0,30 se forem compradas
//menos que uma dúzia, e R$ 0,25 se forem compradas pelo menos doze), laranja (R$ 0,40 se
//forem compradas menos que uma dúzia, e R$ 0,35 se forem compradas pelo menos doze),
//maçã (R$ 0,50 se forem compradas menos que uma dúzia, e R$ 0,45 se forem compradas pelo
//menos doze), kiwi (R$ 0,40 se forem compradas menos que uma dúzia, e R$ 0,30 se forem
//compradas pelo menos doze).

import java.util.Scanner;

public class lista02_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // tabela de preços
        System.out.println("Produtos disponíveis:");
        System.out.println("1. Banana (R$ 0,30 por unidade, ou R$ 0,25 a partir de 12 unidades)");
        System.out.println("2. Laranja (R$ 0,40 por unidade, ou R$ 0,35 a partir de 12 unidades)");
        System.out.println("3. Maçã (R$ 0,50 por unidade, ou R$ 0,45 a partir de 12 unidades)");
        System.out.println("4. Kiwi (R$ 0,40 por unidade, ou R$ 0,30 a partir de 12 unidades)");

        System.out.print("Escolha o produto (1-4): ");
        int produtoEscolhido = scanner.nextInt();

        System.out.print("Informe a quantidade desejada: ");
        int quantidade = scanner.nextInt();

        double precoUnidade = 0.0;
        double precoDuzia = 0.0;

        switch (produtoEscolhido) {
            case 1:
                precoUnidade = 0.30;
                precoDuzia = 0.25;
                break;
            case 2:
                precoUnidade = 0.40;
                precoDuzia = 0.35;
                break;
            case 3:
                precoUnidade = 0.50;
                precoDuzia = 0.45;
                break;
            case 4:
                precoUnidade = 0.40;
                precoDuzia = 0.30;
                break;
            default:
                System.out.println("Produto inválido!");
                return; // Termina o programa se o produto for inválido
        }

        if (quantidade <= 0) {
            System.out.println("Nenhum item foi comprado.");
        } else {
            double valorTotal;
            if (quantidade >= 12) {
                valorTotal = quantidade * precoDuzia;
            } else {
                valorTotal = quantidade * precoUnidade;
            }

            System.out.printf("O valor total da compra é: R$ %.2f\n", valorTotal);
        }

    }

}


