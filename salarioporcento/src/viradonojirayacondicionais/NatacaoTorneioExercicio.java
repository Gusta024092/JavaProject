package viradonojirayacondicionais;

import java.util.Scanner;

public class NatacaoTorneioExercicio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String usuario = teclado.nextLine();
        System.out.println("Digite sua idade");
        int idade = teclado.nextInt();
        String categoria = null;
        if (idade <= 10) {
            categoria = "Infantil";
            System.out.println(usuario + " participara da categoria " + categoria);
        } else if (idade <= 15) {
            categoria = "Juvenil";
            System.out.println(usuario + " participara da categoria " + categoria);
        } else if (idade <= 19) {
            categoria = "Pré Adulto";
            System.out.println(usuario + " participara da categoria " + categoria);
        } else {
            categoria = "Adulto";
            System.out.println(usuario + " participara da categoria " + categoria);
        }
    }
}
