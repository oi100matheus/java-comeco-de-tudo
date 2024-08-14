//69) [DESAFIO] Desenvolva um programa que leia o primeiro termo e a razão de uma
//PA (Progressão Aritmética), mostrando na tela os 10 primeiros elementos da PA e
//a soma entre todos os valores da sequência.an=a1+(n-1)*r
package Exercicios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex069 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a1,r,an,soma=0;
        System.out.print("Digite o primeiro termo da PA: ");
        a1 = teclado.nextInt();
        System.out.print("Digite a razão da PA: ");
        r = teclado.nextInt();
        for (int n=1;n<=10;n++){
            an=a1+(n-1)*r;
            System.out.print(an+" ");
            soma+=an;
        }
        System.out.println("A soma dos termos foi igual a: "+soma);
    }
}
