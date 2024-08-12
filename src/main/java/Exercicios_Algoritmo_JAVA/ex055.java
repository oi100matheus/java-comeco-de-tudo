//55) [DESAFIO] Vamos melhorar o jogo que fizemos no exercício 32. A partir de
//agora, o computador vai sortear um número entre 1 e 10 e o jogador vai ter 4
//tentativas para tentar acertar.
package Exercicios_Algoritmo_JAVA;

import java.util.Random;
import java.util.Scanner;

public class ex055 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        int s,n,c=1,t;
        s= random.nextInt(1,11);
        while (c<4){
            System.out.println("Tente adivinha um número de 1 a 10: ");
            n = teclado.nextInt();
            t=c+1;
            if (n==s){
                System.out.print("Você acertou !!!!");
                break;
            }else {
                System.out.printf("Você errou !! tente novamente. (tentativa "+t+")\n");
            }
            c++;
        }
        System.out.println("\nACABOU!!");
    }
}
