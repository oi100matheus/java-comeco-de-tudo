//38) Escreva um programa que mostre na tela a seguinte contagem:
//6 7 8 9 10 11 Acabou
package Exercicios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex038 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int c=6;
        while (c<=11){
            System.out.print(c+" ");
            c++;
        }
        System.out.print("Acabou");
    }
}
