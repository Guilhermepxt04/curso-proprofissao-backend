package testandoVariaveis;

import java.util.Locale;

public class Exemplo_1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        int numero = 10;
        String nome = "Débora";
        float altura = 1.78f;
        double salario = 28000.0;

        System.out.println("O número é: " + numero);
        System.out.println("O nome é: " + nome);
        System.out.println("A altura é: " + altura);
        System.out.println("O salario é: " + String.format("%.2f", salario));

    }
}
