//79) Desenvolva um programa que leia 10 números inteiros e guarde-os em um vetor.
//No final, mostre quais são os números pares que foram digitados e em que
//posições eles estão armazenados.
package Exercicios_Algoritmo_JAVA;

import java.util.Random;

public class ex079 {
    public static void main(String[] args) {
        Random random = new Random();
        int []v=new int[10];
        for (int c=0;c<v.length;c++){
            v[c]= random.nextInt(100);
            System.out.print(v[c]+" ");
        }
        System.out.print("\n===============DADOS================\n");
        for (int cc=0;cc<v.length;cc++){
            if (v[cc]%2==0){
                System.out.println(v[cc]+" é um número par da posição "+cc);
            }
        }
    }
}
