//20) Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou
//ÍMPAR.
package Exercícios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex020 {
    public static void main(String[] args) {
        Scanner tecaldo = new Scanner(System.in);
        int numero;
        System.out.print("Digite um número: ");
        numero = tecaldo.nextInt();
        if(numero%2==0){
            System.out.print(numero+" é um número PAR");
        }else {
            System.out.print(numero+" é um número IMPAR");
        }
    }
}
