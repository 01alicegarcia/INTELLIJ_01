package br.unipar.main;

import java.util.Scanner;

public class ExempleFor {
    public static void main(String[] args) {

        int numero = 0;
        int ateQuanto = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um valor para multiplicar :");
        numero = scanner.nextInt();
        System.out.print("Até quanto deseja multiplicar?:");
        ateQuanto = scanner.nextInt();

//i++ é igual a i= i+1
        for (int i = 0; i <= ateQuanto; i++) {
            System.out.println(numero + "x" + i + " = " + i * numero);

            if ((i * numero) % 2 == 0) {
                System.out.println("--É par");
            } else
                System.out.println("--É impar");
        }
    }
}
