//83) [DESAFIO] Crie uma lógica que preencha um vetor de 20 posições com números
//aleatórios (entre 0 e 99) gerados pelo computador. Logo em seguida, mostre os
//números gerados e depois coloque o vetor em ordem crescente, mostrando no final
//os valores ordenados.
package Exercicios_Algoritmo_JAVA;

import java.util.Arrays;
import java.util.Random;

public class ex083 {
    public static void main(String[] args) {
        Random random = new Random();
        int []v=new int[20];
        for (int c=0;c<v.length;c++){
            v[c]= random.nextInt(0,99);
            System.out.print(v[c]+" ");
        }
        System.out.print("\n==============VALORES=============\n");
        for (int cc=0;cc<v.length;cc++){
            Arrays.sort(v);
            System.out.print(v[cc]+" ");
        }
    }
}
