package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_8 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero para ver sua tabuada até o 10: ");
        int numero = sc.nextInt();

        for (int i=1; i<=10; i++) {

            System.out.println(numero + " x " + i + " = " + (numero*i));

        }

        sc.close();
    }
}
