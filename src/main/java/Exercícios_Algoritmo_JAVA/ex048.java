//48) Faça um programa que leia 7 números inteiros e no final mostre o somatório
//entre eles.
package Exercícios_Algoritmo_JAVA;

import java.util.Random;
import java.util.Scanner;

public class ex048 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        int c=1,r,soma=0;
        while (c<=7){
            r= random.nextInt(0,30);
            soma+=r;
            System.out.print(r+"+");
            c++;
        }
        System.out.print("= "+soma);
    }
}
