//46) Crie um programa que calcule e mostre na tela o resultado da soma entre 6 +
//8 + 10 + 12 + 14 + ... + 98 + 100.
package Exercícios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex046 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int c=6,soma=0;
        while (c<=100){
            System.out.print(c+"+");
            soma+=c;
            c+=2;
        }
        System.out.print("="+soma);
    }
}
