//76) Crie um programa que preencha automaticamente um vetor numérico com 7
//números gerados aleatoriamente pelo computador e depois mostre os valores
//gerados na tela.
package Exercicios_Algoritmo_JAVA;

import java.util.Random;

public class ex076 {
    public static void main(String[] args) {
        Random random = new Random();
        int []v=new int[7];
        for (int c=0;c<v.length;c++){
            v[c]= random.nextInt(100);
            System.out.print(v[c]+" ");
        }
    }
}
