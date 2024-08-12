//15) Crie um programa que leia o número de dias trabalhados em um mês e mostre o
//salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25
//por hora trabalhada.
package Exercicios_Algoritmo_JAVA;
import java.util.Scanner;
public class ex015 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dias;
        double salario;
        System.out.print("Digite quantos dias você trabalhou no mês: ");
        dias = teclado.nextInt();
        salario=8*dias*25;
        System.out.print("Você trabalhou por "+dias+" e vai receber R$"+salario+" pelos dias trabalhados");
    }
}
