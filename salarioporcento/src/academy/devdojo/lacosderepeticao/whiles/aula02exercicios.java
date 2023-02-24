package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class aula02exercicios {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com um número: ");
        int numero = teclado.nextInt();
        int contador = 0;
        while (contador <= numero){
            if (contador % 2 != 0){
                System.out.println("Os números impares são: " + contador);
            }
            contador++;
        }
    }
}
