package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class aula04maisexercicios {
    public static void main(String[] args) {
        final String usuarioSistema = "Gustavo";
        final String senhaSistema = "123456";
        boolean limite = true;
        Scanner teclado = new Scanner(System.in);
        while(limite) {
            System.out.println("Entre com o seu login: ");
            String usuario = teclado.nextLine();
            System.out.println("Entre com sua senha: ");
            String senha = teclado.nextLine();
            if (usuario.equals(usuarioSistema) && senha.equals(senhaSistema)){
                System.out.println("Acesso Concedido");
                limite = false;
            } else {
                System.out.println("Acesso Negado");
                System.out.println("----------------------");
            }
        }

    }
}
