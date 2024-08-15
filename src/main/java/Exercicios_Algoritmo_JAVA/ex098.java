//98) Crie um programa que tenha uma função SuperSomador(), que vai receber dois
//números como parâmetro e depois vai retornar a soma de todos os valores no
//intervalo entre os valores recebidos.
//Ex:
//SuperSomador(1, 6) vai somar 1 + 2 + 3 + 4 + 5 + 6 e vai retornar 21
//SuperSomador(15, 19) vai somar 15 + 16 + 17 + 18 + 19 e vai retornar 85
package Exercicios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex098 {
    static int SuperSomador(int n1,int n2){
        int soma=0;
        for (int c=n1;c<n2;c++){
            soma+=c;
        }
        return soma;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int ini,fin,soma;
        System.out.print("Digite o número inicial: ");
        ini = teclado.nextInt();
        System.out.print("Digite o número final: ");
        fin = teclado.nextInt();
        soma=SuperSomador(ini,fin);
        System.out.print("Soma dos intervalos: "+soma);
    }
}
