package viradonojirayacondicionais;

public class SalarioCondicional {
    public static void main(String[] args) {
        float salario = 4700.50F;
        float resultado = 0;
        if (salario > 4500) {
            resultado = salario * 0.3F;
            System.out.println("30% do salário: " + resultado);
        } else {
            resultado = salario * 0.1F;
            System.out.println("10% do salário: " + resultado);
        }
    }
}
