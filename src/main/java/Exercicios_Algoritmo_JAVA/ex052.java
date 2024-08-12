//52) Crie um algoritmo que leia a idade de 10 pessoas, mostrando no final:
//a) Qual é a média de idade do grupo
//b) Quantas pessoas tem mais de 18 anos
//c) Quantas pessoas tem menos de 5 anos
//d) Qual foi a maior idade lida
package Exercicios_Algoritmo_JAVA;

import java.util.Random;

public class ex052 {
    public static void main(String[] args) {
        Random random = new Random();
        int c=0,idade,mais=0,menos=0,qmaior=0,media,soma=0;
        while (c<=10){
            idade = random.nextInt(61);
            if (idade>18){
                mais++;
            }
            if (idade<5){
                menos++;
            }
            System.out.print(idade+" ");
            qmaior=(idade>qmaior)?idade:qmaior;
            soma+=idade;
            c++;
        }
        media=soma/10;
        System.out.println("A média de idade foi de "+media+" anos");
        System.out.println(mais+" pessoas tem mais de 18 anos");
        System.out.println(menos+" pessoas tem menos de 5 anos");
        System.out.println(qmaior+" foi a maior idade lida");
    }
}
