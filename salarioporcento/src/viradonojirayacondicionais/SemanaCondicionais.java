package viradonojirayacondicionais;

import java.util.Scanner;

public class SemanaCondicionais {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com um número correspondente a semana: ");
        int dia = teclado.nextInt();
        if (dia == 1) {
            System.out.println("É Domingo");
        } else if (dia == 2) {
            System.out.println("É Segunda");
        } else if (dia == 3) {
            System.out.println("É Terça");
        } else if (dia == 4) {
            System.out.println("É Quarta");
        } else if (dia == 5) {
            System.out.println("É Quinta");
        } else if (dia == 6) {
            System.out.println("É Sexta");
        } else if (dia == 7) {
            System.out.println("É Sábado");
        } else {
            System.out.println("Não é dia válido");
        }

    }
}
