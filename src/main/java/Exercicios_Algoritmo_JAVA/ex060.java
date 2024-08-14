//60) Desenvolva um algoritmo que leia o nome, a idade e o sexo de várias pessoas.
//O programa vai perguntar se o usuário quer ou não continuar. No final, mostre:
//a) O nome da pessoa mais velha
//b) O nome da mulher mais jovem
//c) A média de idade do grupo
//d) Quantos homens tem mais de 30 anos
//e) Quantas mulheres tem menos de 18 anos
package Exercicios_Algoritmo_JAVA;

import java.util.Random;
import java.util.Scanner;

public class ex060 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        String nome,nmais=" ",nmulherjovem=" ";
        int imais=' ',imulherjovem=' ';
        int idade,sexo,c=0,media,soma=0,qnt=0,qnth30=0,qntm18=0;
        while (c!=2){
            System.out.println("Digite seu nome: ");
            nome = teclado.next();
            idade = random.nextInt(5,60);
            sexo = random.nextInt(1,2);
            qnt++;
            soma+=idade;
            if (idade>imais){
                imais=idade;
                nmais=nome;
            }
            if (sexo==1 && idade>30){
                qnth30++;
            }
            if (sexo==2) {
                if (idade < imulherjovem) {
                    nmulherjovem = nome;
                    imulherjovem = idade;
                }
                if (idade<18){
                    qntm18++;
                }
            }
            System.out.print("Deseja continuar? (1)sim,(2)não: ");
            c = teclado.nextInt();
        }
        media=soma/qnt;
        System.out.println("O nome da pessoa mais velha é "+nmais);
        System.out.println("O nome da mulher mais jovem é "+nmulherjovem);
        System.out.println("A média do grupo é de: "+media);
        System.out.println("A quantidade de homens com mais de 30 é de "+qnth30);
        System.out.println("A quantidade de mulheres com menos de 18 é de "+qntm18);
    }
}
