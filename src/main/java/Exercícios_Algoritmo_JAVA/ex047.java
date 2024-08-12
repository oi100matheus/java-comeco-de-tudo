//47) Desenvolva um aplicativo que mostre na tela o resultado da expressão 500 +
//450 + 400 + 350 + 300 + ... + 50 + 0
package Exercícios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex047 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int c=500,soma=0;
        while (c>=0){
            System.out.print(c+"+");
            soma+=c;
            c-=50;
        }
        System.out.print("="+soma);
    }
}