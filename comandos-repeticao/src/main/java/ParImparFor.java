import java.util.Scanner;

public class ParImparFor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pares = 0;
        int impares = 0;

        for (int i = 1; i<=10; i++) {
            System.out.print("Digite um numero: ");
            int numero = sc.nextInt();

            if (numero%2 ==0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Temos " + pares + " numeros pares e " + impares + " numeros impares");

    }
}
