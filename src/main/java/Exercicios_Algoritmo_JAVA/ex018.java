//18) Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade
//dela e depois mostre se ela pode ou não votar.
package Exercicios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex018 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nascimento,idade;
        System.out.print("Digite seu ano de nascimento: ");
        nascimento = teclado.nextInt();
        idade=2024-nascimento;
        if (idade>=18){
            System.out.print("Você tem "+idade+" anos e pode votar!");
        }else {
            System.out.print("Você tem "+idade+" anos e ainda não pode voltar");
        }
    }
}
