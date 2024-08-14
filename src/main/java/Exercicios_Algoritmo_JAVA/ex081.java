//81) Crie um programa que leia a idade de 8 pessoas e guarde-as em um vetor. No
//final, mostre:
//a) Qual é a média de idade das pessoas cadastradas
//b) Em quais posições temos pessoas com mais de 25 anos
//c) Qual foi a maior idade digitada (podem haver repetições)
//d) Em que posições digitamos a maior idade
package Exercicios_Algoritmo_JAVA;

import java.util.Random;

public class ex081 {
    public static void main(String[] args) {
        Random random = new Random();
        int media, maioridade = 0, posicaomaior = 0, soma = 0, qnt = 0;
        int[] v = new int[8];
        for (int c = 0; c < v.length; c++) {
            v[c] = random.nextInt(60);
            System.out.print(v[c] + " ");
            soma += v[c];
            if (v[c] > maioridade) {
                maioridade = v[c];
                posicaomaior = c;
            }
        }
        media = soma / 8;
        System.out.print("\n=============DADOS=============\n");
        System.out.println("A média=" + media);
        System.out.println("Posições mais de 25 anos=");
        for (int cc = 0; cc < v.length; cc++) {
            if (v[cc] > 25) {
                System.out.print(cc + " ");
            }
        }
        System.out.println("\nA maior idade foi=" + maioridade);
        System.out.println("Posição maior idade=" + posicaomaior);
    }
}
