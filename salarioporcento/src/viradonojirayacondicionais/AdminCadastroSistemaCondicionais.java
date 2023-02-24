package viradonojirayacondicionais;

import java.util.Scanner;

public class AdminCadastroSistemaCondicionais {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com seu nome de usuário: ");
        String usuario = teclado.nextLine();
        if (usuario.isBlank() || usuario.equals("") || usuario.equals("admin") || usuario.equals("administrador")){
            System.out.println("Usuário Inválido");
        } else {
            System.out.println("Usuário Cadastrado com sucesso");
        }
    }
}
