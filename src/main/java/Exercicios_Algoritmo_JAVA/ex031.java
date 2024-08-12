//31) [DESAFIO] Crie um jogo de JoKenPo (Pedra-Papel-Tesoura)
package Exercicios_Algoritmo_JAVA;

import java.util.Random;
import java.util.Scanner;

public class ex031 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        int r = random.nextInt(1,3);
        int escolha;
        System.out.print("Escolha uma das opções (1)pedra,(2)papel,(3)tesoura: ");
        escolha = teclado.nextInt();
        if (r==1){
            if (escolha==3){
                System.out.print("Você perdeu ! o computador escolher pedra!");
            }
            if (escolha==2){
                System.out.print("Você ganhou ! o computador escolher pedra!");
            }
            if (escolha==1){
                System.out.print("Deu EMPATE!");
            }
        }
        if (r==2){
            if (escolha==1){
                System.out.print("Você perdeu ! o computador escolher PAPEL!");
            }
            if (escolha==3){
                System.out.print("Você ganhou ! o computador escolher PAPEL!");
            }
            if (escolha==2){
                System.out.print("Deu EMPATE!");
            }
        }
        if (r==3){
            if (escolha==2){
                System.out.print("Você perdeu ! o computador escolher PAPEL!");
            }
            if (escolha==1){
                System.out.print("Você ganhou ! o computador escolher PAPEL!");
            }
            if (escolha==3){
                System.out.print("Deu EMPATE!");
            }
        }
    }
}
