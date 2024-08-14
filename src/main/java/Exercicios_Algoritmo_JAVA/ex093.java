//93) Faça um programa que tenha um procedimento chamado Contador() que recebe
//três valores como parâmetro: o início, o fim e o incremento de uma contagem. O
//programa principal deve solicitar a digitação desses valores e passá-los ao
//procedimento, que vai mostrar a contagem na tela.
//Ex: Para os valores de início (4), fim (20) e incremento(3) teremos
//Contador(4, 20, 3) vai mostrar na tela 4 >> 7 >> 10 >> 13 >> 16 >> 19 >> FIM
package Exercicios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex093 {
    static void Contador(int ini, int fim, int comple) {
        if (ini < fim) {
            for (int c = ini; c <= fim; c += comple) {
                System.out.print(c+">>");
            }
        } else {
            for (int c = ini; c >= fim; c -= comple) {
                System.out.print(c+">>");
            }
        }
        System.out.print("FIM!");
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int ini, fim, comple;
        System.out.print("Digite o número inicial: ");
        ini = teclado.nextInt();
        System.out.print("Digite o incremento: ");
        comple = teclado.nextInt();
        System.out.print("Digite o final: ");
        fim = teclado.nextInt();
        Contador(ini,fim,comple);
    }
}
