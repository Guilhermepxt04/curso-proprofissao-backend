import java.util.Scanner;

public class TabuadaDoWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Gostaria de ver a tabuada de qual numero?: ");
        int n = sc.nextInt();
        int i = 1;

        do  {
            System.out.println(n + " x " + i + " = " + (n*i));
            i++;
        } while (i <= 10);
    }
}
