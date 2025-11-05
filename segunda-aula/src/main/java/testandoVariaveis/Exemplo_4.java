package testandoVariaveis;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo_4 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        float peso = sc.nextFloat();

        System.out.print("Digite sua altura: ");
        float altura = sc.nextFloat();

        System.out.printf("Seu imc é: %.2f", (peso/(Math.pow(altura, 2))));


    }
}
