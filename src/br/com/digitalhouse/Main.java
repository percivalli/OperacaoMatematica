package br.com.digitalhouse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            int numA;
            int numB;
            int option;

            Scanner scanner = new Scanner(System.in);

            Soma soma = new Soma();
            Subtracao subtracao = new Subtracao();
            Multiplicacao multiplicacao = new Multiplicacao();
            Divisao divisao = new Divisao();

            System.out.println("Digite aqui um número: ");
            numA = scanner.nextInt();

            System.out.println("Digite aqui outro número: ");
            numB = scanner.nextInt();

            System.out.println("Qual operação deseja realizar com os números " + numA + " e " + numB + "?" +
                    "\n1 - Soma;" +
                    "\n2 - Subtração;" +
                    "\n3 - Multiplicação;" +
                    "\n4 - Divisão;" +
                    "\n5 - Sair.");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println(soma.calcula(numA, numB));
                    break;
                case 2:
                    System.out.println(subtracao.calcula(numA, numB));
                    break;
                case 3:
                    System.out.println(multiplicacao.calcula(numA, numB));
                    break;
                case 4:
                    System.out.println(divisao.calcula(numA, numB));
                    break;
                case 5:
                    System.out.println("Saindo do progama...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        }
    }
}
