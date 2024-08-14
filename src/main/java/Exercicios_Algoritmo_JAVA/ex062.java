//62) Faça um programa usando a estrutura “faça enquanto” que leia a idade de
//várias pessoas. A cada laço, você deverá perguntar para o usuário se ele quer ou
//não continuar a digitar dados. No final, quando o usuário decidir parar, mostre
//na tela:
//a) Quantas idades foram digitadas
//b) Qual é a média entre as idades digitadas
//c) Quantas pessoas tem 21 anos ou mais.
package Exercicios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex062 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade,c=0,media,soma=0,maisde21=0,qnt=0;
        do {
            System.out.print("Digite sua idade: ");
            idade = teclado.nextInt();
            soma+=idade;
            qnt++;
            if (idade>=21){
                maisde21++;
            }
            System.out.print("Deseja continuar? (1)sim,(2)não: ");
            c = teclado.nextInt();
        }while(c!=2);
        media=soma/qnt;
        System.out.println("Foram digitada "+qnt+" idades");
        System.out.println("A média entre as idades foi de "+media);
        System.out.println(maisde21+" pessoas tem 21 anos ou mais");
    }
}
