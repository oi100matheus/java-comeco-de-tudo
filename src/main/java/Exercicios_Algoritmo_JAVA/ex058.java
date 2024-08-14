//58) Faça um algoritmo que leia a idade de vários alunos de uma turma. O programa
//vai parar quando for digitada a idade 999. No final, mostre quantos alunos
//existem na turma e qual é a média de idade do grupo.
package Exercicios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex058 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade,media,c=0,cc=0,soma=0;
        while (c!=999){
            System.out.print("Digite sua idade: ");
            idade = teclado.nextInt();
            System.out.print("Quer parar? (999)sim,(1)não : ");
            c = teclado.nextInt();
            cc++;
            soma+=idade;
        }
        media = soma/cc;
        System.out.print("Existem "+cc+" alunos e a média foi "+media);
    }
}
