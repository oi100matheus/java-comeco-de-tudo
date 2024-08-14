//67) Faça um programa usando a estrutura “para” que leia um número inteiro
//positivo e mostre na tela uma contagem de 0 até o valor digitado:
//Ex: Digite um valor: 9
//Contagem: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, FIM!
package Exercicios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex067 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.print("Digite um número: ");
        n = teclado.nextInt();
        if (n>0) {
            for (int c = 0; c <= n; c++) {
                System.out.print(c+" ");
            }
        }else {
            for (int c = 0; c >= n; c--){
                System.out.print(c+" ");
            }
        }
        System.out.println("FIM!");
    }
}
