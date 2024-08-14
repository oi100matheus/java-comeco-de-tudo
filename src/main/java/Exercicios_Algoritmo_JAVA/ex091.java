//91) Desenvolva um algoritmo que leia dois valores pelo teclado e passe esses
//valores para um procedimento Maior() que vai verificar qual deles é o maior e
//mostrá-lo na tela. Caso os dois valores sejam iguais, mostrar uma mensagem
//informando essa característica.
package Exercicios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex091 {
    static void Maior(int n1,int n2){
        if (n1>n2){
            System.out.print(n1+" é maior que "+n2);
        } else if (n2>n1) {
            System.out.print(n2+" é maior que "+n1);
        }else {
            System.out.println("Os dois são iguais !");
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1,n2;
        System.out.print("Digite um número: ");
        n1 = teclado.nextInt();
        System.out.print("Digite outro número: ");
        n2 = teclado.nextInt();
        Maior(n1,n2);
    }
}
