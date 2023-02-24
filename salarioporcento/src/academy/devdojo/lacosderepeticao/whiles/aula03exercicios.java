package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class aula03exercicios {
    public static void main(String[] args) {
        int contador = 1;
        Scanner teclado = new Scanner(System.in);
        while (contador <= 3) {
            System.out.println(contador + ". Calcular imposto");
            contador++;
            System.out.println(contador + ". Depositar salário");
            contador++;
            System.out.println(contador + ". Sair");
            System.out.println("Qual operação deseja realizar?: ");
            int num = teclado.nextInt();
            if (num == 3) {
                break;
            } else {
                System.out.println("\n");
                contador = 1;
            }
        }
    }
}
