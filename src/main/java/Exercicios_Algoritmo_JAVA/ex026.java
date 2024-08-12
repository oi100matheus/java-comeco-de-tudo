//26) Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando
//na tela uma das mensagens abaixo:
// - O primeiro valor é o maior
// - O segundo valor é o maior
// - Não existe valor maior, os dois são iguais
package Exercicios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex026 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1,n2;
        System.out.print("Digite um número: ");
        n1 = teclado.nextInt();
        System.out.print("Digite outro número: ");
        n2 = teclado.nextInt();
        if (n1>n2){
            System.out.print(n1+" é maior que "+n2);
        } else if (n2>n1) {
            System.out.print(n2+" é maior que "+n1);
        }else {
            System.out.print("Não existe valor maior, os dois são iguais");
        }
    }
}
