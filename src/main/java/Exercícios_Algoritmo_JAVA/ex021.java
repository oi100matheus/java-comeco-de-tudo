//21) Faça um algoritmo que leia um determinado ano e mostre se ele é ou não
//BISSEXTO.
package Exercícios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex021 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int ano;
        System.out.print("Digite um ano: ");
        ano = teclado.nextInt();
        if (ano%4==0 && (ano%100!=0||ano%400==0)){
            System.out.print(ano+" é um ano bissexto!!");
        }else{
            System.out.print(ano+" não é um ano bissexto!!");
        }
    }
}
