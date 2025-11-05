package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_7 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do deposito mensal: ");
        float deposito = sc.nextFloat();

        System.out.print("Digite a taxa de juros mensal: ");
        float juros = sc.nextFloat();

        float poupanca = 0f;

        for (int i=1; i <= 12; i++) {

            poupanca += deposito;

            poupanca += (poupanca * (juros / 100));

        }

        System.out.printf("Após 12 meses sua poupança final é de: R$ %.2f", poupanca);

        sc.close();
    }
}
