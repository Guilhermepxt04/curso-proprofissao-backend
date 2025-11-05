package exercicios;

import java.util.Scanner;

public class exercicio_9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos anos você tem: ");
        int anos = sc.nextInt();

        System.out.print("Digite quantos meses você tem: ");
        int meses = sc.nextInt();

        System.out.println("Digite quantos dias você tem: ");
        int dias = sc.nextInt();

        int totalDias = (anos * 365) + (meses * 30) + dias;

        System.out.printf("Aproximadamente você tem %d dias de vida", totalDias);


        sc.close();
    }
}
