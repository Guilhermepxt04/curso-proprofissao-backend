package app;

import entities.Conta;
import utils.MenuBanco;
import java.util.Locale;
import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o numero da conta: ");
        int numeroConta = sc.nextInt();

        sc.nextLine();

        System.out.print("Insira o nome do titular da conta: ");
        String titular = sc.nextLine();

        System.out.print("Insira o saldo da conta: ");
        double saldo = sc.nextDouble();

        Conta conta = new Conta(numeroConta, titular, saldo);


        MenuBanco.escolherOperacao(conta);


        sc.close();
    }
}
