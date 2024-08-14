//66) Escreva um programa que leia um número qualquer e mostre a tabuada desse
//número, usando a estrutura “para”.
//Ex: Digite um valor: 5
//5 x 1 = 5
//5 x 2 = 10
//5 x 3 = 15 ...
package Exercicios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex066 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n,r;
        System.out.print("Digite um número: ");
        n = teclado.nextInt();
        for (int c=1;c<=10;c++){
            r=n*c;
            System.out.println(n+" x "+c+" = "+r);
        }
    }
}
