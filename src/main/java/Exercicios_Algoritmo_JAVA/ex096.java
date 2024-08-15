//96) Crie um programa que tenha uma função Media(), que vai receber as 2 notas de
//um aluno e retornar a sua média para o programa principal.
package Exercicios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex096 {
    static float Media(float n1,float n2){
        float media;
        media=(n1+n2)/2f;
        return media;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float n1,n2,res;
        System.out.print("Digite sua nota1: ");
        n1 = teclado.nextFloat();
        System.out.print("Digite sua nota2: ");
        n2 = teclado.nextFloat();
        res=Media(n1,n2);
        System.out.print("Resultado da média: ="+res);
    }
}
