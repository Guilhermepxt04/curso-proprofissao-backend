package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio do circulo: ");
        float raio = sc.nextFloat();

        System.out.printf("A área do circulo é: %.2f%n", Math.PI * Math.pow(raio, 2));
        System.out.printf("O perimetro do circulo é: %.2f", 2 * Math.PI * raio);

        sc.close();
    }
}
