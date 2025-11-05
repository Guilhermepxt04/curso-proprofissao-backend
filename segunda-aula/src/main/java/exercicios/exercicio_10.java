package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_10 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salario do funcionario: ");
        float salario = sc.nextFloat();

        System.out.println("O salario do funcionario com aumento de 15% é: " + String.format("%.2f", salario + (salario*0.15)));

        sc.close();
    }
    }

