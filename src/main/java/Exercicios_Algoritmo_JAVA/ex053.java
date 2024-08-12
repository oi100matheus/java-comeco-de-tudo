//53) Faça um programa que leia a idade e o sexo de 5 pessoas, mostrando no final:
//a) Quantos homens foram cadastrados
//b) Quantas mulheres foram cadastradas
//c) A média de idade do grupo
//d) A média de idade dos homens
//e) Quantas mulheres tem mais de 20 anos
package Exercicios_Algoritmo_JAVA;

import java.util.Random;

public class ex053 {
    public static void main(String[] args) {
        Random random = new Random();
        int idade,sexo,soma=0;
        int qnthomens=0,qntmulheres=0,media=0,mediah=0,mulheres20=0,hmedia;
        int c=1;
        while (c<=5){
            idade= random.nextInt(1,61);
            sexo= random.nextInt(1,3);
            if (sexo==1){
                qnthomens++;
                mediah+=idade;
            }
            if (sexo==2){
                qntmulheres++;
                if (idade>20){
                    mulheres20++;
                }
            }
            System.out.print(idade+" ");
            soma+=idade;
            c++;
        }
        media=soma/5;
        hmedia=mediah/qnthomens;
        System.out.println("\n"+qnthomens+" homens foram cadastrados");
        System.out.println(mulheres20+" mulheres foram cadastradas");
        System.out.println("A média de idade do grupo é de "+media+" anos");
        System.out.println("A média de idade do grupo de homens é de "+mediah+" anos");
    }
}
