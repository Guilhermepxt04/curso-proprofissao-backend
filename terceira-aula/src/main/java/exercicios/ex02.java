package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        float peso = sc.nextFloat();

        System.out.print("Digite sua altura: ");
        float altura = sc.nextFloat();

        float imc = (float) (peso / Math.pow(altura, 2));

        if (imc < 18.5) {
            System.out.printf("Seu imc é de %.2f você está abaixo do peso", imc);
        } else if (imc > 20 && imc < 25 ) {
            System.out.printf("Seu imc é de %.2f você está com um peso normal", imc);
        } else if (imc > 25 && imc < 30 ) {
            System.out.printf("Seu imc é de %.2f você está com sobre peso", imc);
        } else if (imc > 30 && imc < 40 ) {
            System.out.printf("Seu imc é de %.2f você está obeso", imc);
        } else if (imc > 40) {
            System.out.printf("Seu imc é de %.2f você está obeso morbido", imc);
        }
    }
}
