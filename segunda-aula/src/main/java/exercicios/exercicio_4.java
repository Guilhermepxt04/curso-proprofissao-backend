package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_4 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a 1° nota do aluno: ");
        float nota1 = sc.nextFloat();

        System.out.print("Digite a 2° nota do aluno: ");
        float nota2 = sc.nextFloat();

        System.out.print("Digite a 3° nota do aluno: ");
        float nota3 = sc.nextFloat();

        float media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;

        System.out.printf("A média do aluno é: %.2f", media);

        sc.close();
    }
}
