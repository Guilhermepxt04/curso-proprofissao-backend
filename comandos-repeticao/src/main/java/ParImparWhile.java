import java.util.Scanner;

public class ParImparWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pares = 0;
        int impares = 0;
        int n = 1;

        while (n<=10) {
            System.out.print("Digite um numero: ");
            int numero = sc.nextInt();

            if (numero%2 ==0) {
                pares++;
            } else {
                impares++;
            }
            n++;
        }

        System.out.println("Temos " + pares + " numeros pares e " + impares + " numeros impares");

    }
}
