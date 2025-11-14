package exercicios;

import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n = sc.nextInt();

        if (n % 10 == 0) {
            System.out.println("O numero é divisivel por 10, 5 e 2");
        } else if (n % 5 == 0){
            System.out.println("O numero é divisivel por 5");
        } else if (n % 2 == 0) {
            System.out.println("O numero é divisivel por 2");
        } else {
            System.out.println("O numero não é divisivel por 10, 5 ou 2");
        }
    }
}
