//56) Crie um programa que leia vários números pelo teclado e mostre no final o
//somatório entre eles.
//Obs: O programa será interrompido quando o número 1111 for digitado
package Exercicios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex056 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int soma=0,n=0;
        while (n!=1111){
            System.out.print("Digite um número(O programa será interrompido quando o número for 1111): ");
            n = teclado.nextInt();
            soma+=n;
            System.out.println(n+"+");
        }
        System.out.println("= "+soma+" foi a soma dos números");
    }
}
