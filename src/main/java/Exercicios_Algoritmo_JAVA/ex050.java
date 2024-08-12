//50) Desenvolva um programa que faça o sorteio de 20 números entre 0 e 10 e
//mostre na tela:
//a) Quais foram os números sorteados
//b) Quantos números estão acima de 5
//c) Quantos números são divisíveis por 3
package Exercicios_Algoritmo_JAVA;

import java.util.Random;

public class ex050 {
    public static void main(String[] args) {
        Random random = new Random();
        int c=1,acima=0,divi=0,n;
        while (c<=20){
            n= random.nextInt(11);
            System.out.print(n+" ");
            if (n>5){
                acima++;
            }
            if (n%3==0){
                divi=divi+1;
            }
            c++;
        }
        System.out.println("\n"+acima+" números acima de 5 e "+divi+" divisíveis por 3");
    }
}
