package utils;

import entities.Conta;
import java.util.Scanner;

public class MenuBanco {

    static Scanner sc = new Scanner(System.in);


    public static void exibirMenu() {
        System.out.println("Bem vindo ao banco Proa Bank!");
        System.out.println("Escolha a operação desejada");
        System.out.println("1 - Ver saldo");
        System.out.println("2 - Sacar");
        System.out.println("3 - Depositar");
        System.out.println("4 - Empréstimo");
        System.out.println("5 - Liberar Cartão");
        System.out.println("6 - Finalizar");
    }

    public static void escolherOperacao(Conta conta) {

        exibirMenu();

        int digito;
        do {
            digito = sc.nextInt();
            switch (digito) {
                case 1:
                    conta.verSaldo();
                    break;
                case 2:
                    System.out.println("Digite o valor do saque: ");
                    double saque = sc.nextDouble();
                    conta.saque(saque);
                    break;
                case 3:
                    System.out.println("Digite o valor do deposito: ");
                    double deposito = sc.nextDouble();
                    conta.deposito(deposito);
                    break;
                case 4:
                    System.out.println("Digite o valor do empréstimo");
                    double emprestimo = sc.nextDouble();
                    conta.emprestimo(emprestimo);
                    break;
                case 5:
                    conta.liberarCartao();
                    break;
                case 6:
                    System.out.println("Encerrando sistema");
                    break;
                default:
                    System.out.println("Por favor selecione ume operação valida");
            }
        } while (digito != 6);
    }
}
