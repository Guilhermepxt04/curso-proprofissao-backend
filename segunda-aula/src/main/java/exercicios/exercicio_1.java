package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int x = sc.nextInt();

        System.out.print("Digite o segundo numero: ");
        int y = sc.nextInt();

        System.out.println("A soma entre os números é: " + (x+y));
        System.out.println("A subtração entre os números é: " + (x-y));
        System.out.println("A multiplicação entre os números é: " + (x*y));
        System.out.println("A divisao entre os números é: " + (x/y));


        sc.close();
    }
}
