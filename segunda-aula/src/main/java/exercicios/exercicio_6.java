package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_6 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int x = sc.nextInt();

        System.out.print("Digite o segundo numero: ");
        int y = sc.nextInt();

        System.out.println("Valores antes da troca: x=" + x + " y=" + y );

        int z = y;
        y = x;
        x = z;

        System.out.println("Valores depois da troca: x=" + x + " y=" + y );

        sc.close();
    }
}
