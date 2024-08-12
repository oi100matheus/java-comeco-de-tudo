//22) Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
//situação em relação ao alistamento militar.
// - Se estiver antes dos 18 anos, mostre em quantos anos faltam para o
//alistamento.
// - Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do
//alistamento.
package Exercicios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex022 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int ano,idade,falta,passaram;
        System.out.print("Digite o seu ano de nascimento: ");
        ano = teclado.nextInt();
        idade = 2024-ano;
        falta = 18-idade;
        passaram = idade - 18;
        if (idade>=18) {
            System.out.print("Você " + idade + " anos de idade, se passaram " + passaram + " anos desde o ano de alistamento e já pode se alistar");
        }else {
            System.out.print("Você tem "+idade+" anos de idade, ainda faltam "+falta+" anos para se alistar");
        }
    }
}
