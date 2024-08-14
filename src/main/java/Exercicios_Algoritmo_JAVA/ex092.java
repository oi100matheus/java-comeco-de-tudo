//92) Crie uma lógica que leia um número inteiro e passe para um procedimento
//ParOuImpar() que vai verificar e mostrar na tela se o valor passado como
//parâmetro é PAR ou ÍMPAR.
package Exercicios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex092 {
    static void ParOuImpar(int n1){
        if (n1%2==0){
            System.out.print(n1+" é um número par!");
        }else {
            System.out.print(n1+" é um número impar!");
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1;
        System.out.print("Digite um número: ");
        n1 = teclado.nextInt();
        ParOuImpar(n1);
    }
}
