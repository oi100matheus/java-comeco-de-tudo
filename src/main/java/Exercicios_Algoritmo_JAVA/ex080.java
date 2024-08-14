//80) Faça um algoritmo que preencha um vetor de 30 posições com números entre 1 e
//15 sorteados pelo computador. Depois disso, peça para o usuário digitar um
//número (chave) e seu programa deve mostrar em que posições essa chave foi
//encontrada. Mostre também quantas vezes a chave foi sorteada.
package Exercicios_Algoritmo_JAVA;

import java.util.Random;
import java.util.Scanner;

public class ex080 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner teclado = new Scanner(System.in);
        int []v=new int[30];
        int chave,qnt=0;
        for (int c=0;c<v.length;c++){
            v[c]= random.nextInt(1,15);
            System.out.print(v[c]+" ");
        }
        System.out.print("\n===========DADOS============\n");
        System.out.print("Digite uma chave: ");
        chave = teclado.nextInt();
        System.out.println("\nA chave foi encontradas nas seguintes posições: ");
        for (int cc=0;cc<v.length;cc++){
            if (chave==v[cc]){
                System.out.print(cc+" ");
                qnt++;
            }
        }
        System.out.println("\n"+qnt+" vezes!!");
    }
}
