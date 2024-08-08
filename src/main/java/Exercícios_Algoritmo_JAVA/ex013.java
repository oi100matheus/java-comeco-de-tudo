//13) Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o
//seu novo salário, com 15% de aumento.
package Exercícios_Algoritmo_JAVA;
import java.util.Scanner;
public class ex013 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salario,nsalario;
        System.out.print("Digite seu salário: R$");
        salario = teclado.nextDouble();
        nsalario = salario+salario*0.15;
        System.out.print("Você recebeu um aumento de 15%, seu novo salário é de: R$"+nsalario);
    }
}
