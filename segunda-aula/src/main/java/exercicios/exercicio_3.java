package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_3 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base do triangulo: ");
        float base = sc.nextFloat();

        System.out.print("Digite a altura do triangulo: ");
        float altura = sc.nextFloat();

        System.out.printf("A área do triangulo é: %.2f", (base*altura) / 2);

        sc.close();
    }
}
