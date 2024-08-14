package Exercicios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex063 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int c=0,n,menorvalor=99900,media,soma=0,pares=0,qnt=0;
        do {
            System.out.print("Digite um número: ");
            n = teclado.nextInt();
            soma+=n;
            qnt++;
            if (n%2==0){
                pares++;
            }
            if (n<menorvalor){
                menorvalor=n;
            }
            System.out.print("Deseja continuar ? (1)sim,(2)não: ");
            c = teclado.nextInt();
        }while (c!=2);
        media=soma/qnt;
        System.out.println("=================DADOS===================");
        System.out.println("O somatório dos valores foi = "+soma);
        System.out.println("O menor valor = "+menorvalor);
        System.out.println("A média = "+media);
        System.out.println("Valores pares = "+pares);
    }
}
