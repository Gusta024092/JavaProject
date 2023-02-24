package academy.devdojo.lacosderepeticao.fors;

public class Aula02Exercicios2 {
    public static void main(String[] args) {
        int n1 = 1, res = 0;
        for (int i = 0; i <= 10; i++) {
            if (i == 10 && n1 < 10) {
                n1++;
                i = 0;
            }
            res = n1 * i;
            System.out.println(n1 + " * " + i + " = " + res);
        }
    }
}
