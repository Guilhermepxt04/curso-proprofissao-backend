package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_5 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salario base do funcionario: ");
        float salario = sc.nextFloat();

        System.out.println("O salario do funcionario com 5% de comissão é: " + String.format("%.2f", salario + (salario*0.05)));

        sc.close();
    }
}
