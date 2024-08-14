//70) [DESAFIO] Faça um programa que mostre os 10 primeiros elementos da Sequência
//de Fibonacci:
package Exercicios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex070 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1=1,n2=1,n3;
        System.out.print(n1+" "+n2+" ");
        for (int c=3;c<=10;c++){
            n3=n2+n1;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
    }
}
