package academy.devdojo.switchcase;

import java.util.Scanner;

public class Exercicio02DiaSemana {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com o tipo de conta: ");
        String conta = teclado.nextLine();
        switch (conta){
            case "CONTA_POUPANCA":
                System.out.println("Os juros são de 0,05%");
                break;
            case "CONTA_CORRENTE":
                System.out.println("Os juros são de 0,02%");
                break;
            case "CONTA_INVESTIMENTO":
                System.out.println("Os juros são de 0,1%");
                break;
        }
    }
}
