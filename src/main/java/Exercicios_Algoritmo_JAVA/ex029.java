//29) Desenvolva um programa que leia o nome de um funcionário, seu salário,
//quantos anos ele trabalha na empresa e mostre seu novo salário, reajustado de
//acordo com a tabela a seguir:
// - Até 3 anos de empresa: aumento de 3%
// - entre 3 e 10 anos: aumento de 12.5%
// - 10 anos ou mais: aumento de 20%
package Exercicios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex029 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        float salario,aumento;
        int anos;
        System.out.print("Digite seu nome: ");
        nome = teclado.nextLine();
        System.out.print("Digite seu salario: R$");
        salario = teclado.nextFloat();
        System.out.print("Digite quantos anos tem de empresa: ");
        anos = teclado.nextInt();
        if (anos>10){
            aumento=salario+salario*0.2f;
            System.out.print(nome+" recebeu o aumento para: R$"+aumento);
        } else if (anos>3 && anos<10) {
            aumento=salario+salario*0.125f;
            System.out.print(nome+" recebeu o aumento para: R$"+aumento);
        }else {
            aumento=salario+salario*0.03f;
            System.out.print(nome+" recebeu o aumento para: R$"+aumento);
        }
    }
}
