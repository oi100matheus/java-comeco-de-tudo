package Exercicios_Algoritmo_JAVA;

import java.util.Scanner;
public class ex085t {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] nome = new String[5];
        char[] sexo = new char[5];
        double[] salario = new double[5];

        for (int c = 0; c < nome.length; c++) {
            System.out.print("Digite o nome do funcionário " + (c + 1) + ": ");
            nome[c] = teclado.next();
            System.out.print("Digite o sexo do funcionário (M/F): ");
            sexo[c] = teclado.next().charAt(0);
            System.out.print("Digite o salário do funcionário: ");
            salario[c] = teclado.nextDouble();
        }

        System.out.println("\nDados dos funcionários:");
        for (int c = 0; c < nome.length; c++) {
            System.out.printf("%-20s %-6c %-10.2f%n", nome[c], sexo[c], salario[c]);
        }

        System.out.println("\nFuncionárias mulheres com salário acima de R$ 5 mil:");
        for (int c = 0; c < nome.length; c++) {
            if (sexo[c] == 'F' && salario[c] > 5000) {
                System.out.printf("%-20s %-6c %-10.2f%n", nome[c], sexo[c], salario[c]);
            }
        }

        teclado.close();
    }
}
