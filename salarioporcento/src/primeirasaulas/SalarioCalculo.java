package primeirasaulas;

import java.util.Scanner;

public class SalarioCalculo {
    public static void main(String[] args) {
        float salario = 5000L;
        float percent1 = 30.00F;

        float res = (salario * percent1) / 100;
        System.out.println(res);
        res = (salario * (percent1 - 15) ) / 100;
        System.out.println(res);
        res = (salario * (percent1 - 25)) / 100;
        System.out.println(res);
    }
}
