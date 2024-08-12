//49) Crie um programa que leia 6 números inteiros e no final mostre quantos deles
//são pares e quantos são ímpares.
package Exercícios_Algoritmo_JAVA;

import java.util.Random;
import java.util.Scanner;

public class ex049 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        int p=0,i=0,c=1,r;
        while (c<6){
            r= random.nextInt(1,50);
            if (c%2==0){
                p++;
            }else {
                i++;
            }
            c++;
        }
        System.out.print(p+" números foram pares e "+i+" são impares");
    }
}
