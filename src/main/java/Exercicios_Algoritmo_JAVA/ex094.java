//94) [DESAFIO] Desenvolva um aplicativo que tenha um procedimento chamado
//Fibonacci() que recebe um único valor inteiro como parâmetro, indicando quantos
//termos da sequência serão mostrados na tela. O seu procedimento deve receber
//esse valor e mostrar a quantidade de elementos solicitados.
//Obs: Use os exercícios 70 e 75 para te ajudar na solução
//Ex:
//Fibonacci(5) vai gerar 1 >> 1 >> 2 >> 3 >> 5 >> FIM
//Fibonacci(9) vai gerar 1 >> 1 >> 2 >> 3 >> 5 >> 8 >> 13 >> 21 >> 34 >> FIM
package Exercicios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex094 {
    static void Fibonacci(int t){
        int n1=1,n2=1,n3;
        System.out.print(n1+">>"+n2+">>");
        for (int c=3;c<=t;c++){
            n3=n2+n1;
            System.out.print(n3+">>");
            n1=n2;
            n2=n3;
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int t;
        System.out.print("A partir de 3 digite até qual elemento deseja da Fibonacci: ");
        t= teclado.nextInt();
        Fibonacci(t);
    }
}
