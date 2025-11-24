package entities;

public class Conta {

    private final int numeroConta;
    private final String titularConta;
    private double saldo;
    private double emprestimo;
    private boolean cartao;

    public Conta(int numeroConta, String titularConta, double saldo, double emprestimo) {
        this.numeroConta = numeroConta;
        this.titularConta = titularConta;
        this.saldo = saldo;
        this.emprestimo = 0.0;
        this.cartao = false;
    }

    public void verSaldo() {
        System.out.println("Seu saldo atual é: " + saldo);
    }

    public void saque(double valorSaque) {

        if (valorSaque < this.saldo) {
            this.saldo -= valorSaque;
            System.out.println("O saldo atual é: " + saldo);
        } else {
            System.out.println("Você não tem saldo suficiente para realizar um saque com esse valor");
        }
    }

    public void deposito (double valorDeposito) {
        if (valorDeposito <= 0) {
            System.out.println("Valor do depósito inválido");
        } else {
            saldo += valorDeposito;
            verSaldo();
        }
    }

    public void emprestimo (double valorEmprestimo) {
        if (saldo < 5000.00) {
            System.out.println("Voê precisa ter um saldo maior que R$5000.00 para realizar um empréstimo");
            verSaldo();
        } else {
            emprestimo += valorEmprestimo;
            saldo += valorEmprestimo;
            verSaldo();
            System.out.println("Emprestimo realizado, agora você tem um pagamento pendente de: " + emprestimo);

        }
    }

    public void liberarCartao () {
        if (saldo >= 2500) {
            System.out.println("Cartão de crédito liberado");
            this.cartao = true;
        } else {
            System.out.println("Para liberar um cartão de crédito precisa de no minimo R$2500.00 de saldo");
            verSaldo();
        }
    }
}
