//Escreva um programa em Java para ler o número de eleitores de um
//município, o número de votos brancos, nulos e válidos. Calcular e escrever o percentual que
//cada um representa em relação ao total de eleitores. (DICA: regra de três para calcular o
//percentual de cada voto em relação ao número de eleitores que é 100%, ou seja, X = (brancos
//ou nulos ou validos) * 100 / eleitores)

import java.util.Scanner;

public class lista02_07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total_eleitores, votos_brancos, votos_nulos, votos_validos;

        System.out.print("Informe o número total de eleitores: ");
        total_eleitores = scanner.nextInt();

        System.out.print("Informe o número de votos brancos: ");
        votos_brancos = scanner.nextInt();

        System.out.print("Informe o número de votos nulos: ");
        votos_nulos = scanner.nextInt();

        System.out.print("Informe o número de votos válidos: ");
        votos_validos = scanner.nextInt();

        double percentual_brancos = (double) votos_brancos * 100 / total_eleitores;
        double percentual_nulos = (double) votos_nulos * 100 / total_eleitores;
        double percentual_validos = (double) votos_validos * 100 / total_eleitores;

        System.out.println("Percentual de votos brancos: " + percentual_brancos + "%");
        System.out.println("Percentual de votos nulos: " + percentual_nulos + "%");
        System.out.println("Percentual de votos válidos: " + percentual_validos + "%");

    }
}
