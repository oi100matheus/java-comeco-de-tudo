//90) Desenvolva um algoritmo que leia dois valores pelo teclado e passe esses
//valores para um procedimento Somador() que vai calcular e mostrar a soma entre
//eles.
package Exercicios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex090 {
    static void Somador(int n1,int n2){
        int soma;
        soma=n1+n2;
        System.out.println("Resultado da soma = "+soma);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1,n2;
        System.out.print("Digite um número: ");
        n1 = teclado.nextInt();
        System.out.print("Digite outro número: ");
        n2 = teclado.nextInt();
        Somador(n1,n2);
    }
}
