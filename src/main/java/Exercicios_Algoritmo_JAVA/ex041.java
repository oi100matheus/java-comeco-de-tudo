//41) Desenvolva um programa que mostre na tela a seguinte contagem:
//100 95 90 85 80 ... 0 Acabou!
package Exercicios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex041 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int c=100;
        while (c>=0){
            System.out.print(c+" ");
            c-=5;
        }
        System.out.print("Acabou!");
    }
}
