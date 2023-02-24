package viradonojirayacondicionais;

import java.util.Scanner;

public class AlistamentoMilitarCadastro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com o seu sexo: ");
        char sexo = teclado.next().charAt(0);
        System.out.println("Entre com sua idade: ");
        int idade = teclado.nextInt();

        if (sexo == 'M' && idade >= 18){
            System.out.println("Alistamento Obrigatório");
        } else if (sexo == 'M' && idade < 18){
            System.out.println("Alistamento não permitido");
        } else if (sexo == 'F' && idade >= 18){
            System.out.println("Deseja se alistar? Digite S para sim ou N para não ");
            char pergunta1 = teclado.next().charAt(0);
            if (pergunta1 == 'S'){
                System.out.println("Alistada com sucesso");
            } else {
                System.out.println("Ok, obrigado pela resposta");
            }
        } else {
            System.out.println("Alistamento não permitido");
        }


    }
}
