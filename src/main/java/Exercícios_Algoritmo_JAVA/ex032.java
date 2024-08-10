//32) [DESAFIO] Crie um jogo onde o computador vai sortear um número entre 1 e 5 o
//jogador vai tentar descobrir qual foi o valor sorteado.
package Exercícios_Algoritmo_JAVA;

import java.util.Random;
import java.util.Scanner;

public class ex032 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        int j,c= random.nextInt(1,5);
        System.out.print("Tente adivinha o número que o computador vai sortear de 1 a 5: ");
        j = teclado.nextInt();
        if (j==c){
            System.out.print("Você ACERTOU!");
        }else {
            System.out.println("Você ERROU!");
        }
    }
}
