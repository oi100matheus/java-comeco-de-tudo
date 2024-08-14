//78) Escreva um programa que leia 15 números e guarde-os em um vetor. No final,
//mostre o vetor inteiro na tela e em seguida mostre em que posições foram
//digitados valores que são múltiplos de 10.
package Exercicios_Algoritmo_JAVA;

import java.util.Random;

public class ex078 {
    public static void main(String[] args) {
        Random random = new Random();
        int []v=new int[15];
        for (int c=0;c<v.length;c++){
            v[c]=random.nextInt(100);
            System.out.print(v[c]+" ");
        }
        System.out.print("\n================MÚLTIPLOS===============\n");
        for (int cc=0;cc<v.length;cc++){
            if (v[cc]%10==0){
                System.out.print(v[cc]+" ");
            }
        }
    }
}
