package teste_poo;

import java.util.Scanner;

public class TesteCaneta {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Caneta c = new Caneta("esferográfica", "azul", 5f, 0, false);

        System.out.println(c);

        c.rabiscar();

        System.out.println(c.getTampada());

        System.out.println(c.getCarga());

        System.out.println("-----------------------------------");

        Caneta c2 = new Caneta("esferográfica", "verde", 2f, 10, true);

        System.out.println(c2);

        c2.rabiscar();

        System.out.println(c2.getTampada());

        System.out.println(c2.getCarga());


    }
}
