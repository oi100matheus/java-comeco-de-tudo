//25) [DESAFIO] Crie um programa que leia o tamanho de três segmentos de reta.
//Analise seus comprimentos e diga se é possível formar um triângulo com essas
//retas. Matematicamente, para três segmentos formarem um triângulo, o comprimento
//de cada lado deve ser menor que a soma dos outros dois.
package Exercícios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex025 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int r1,r2,r3;
        System.out.print("Digite um segmento de reta: ");
        r1 = teclado.nextInt();
        System.out.print("Digite um segmento de reta: ");
        r2 = teclado.nextInt();
        System.out.print("Digite um segmento de reta: ");
        r3 = teclado.nextInt();
        if (r1+r2>r3 && r1+r3>r2){
            System.out.print("Suas retas formam um triangulo !");
        }else {
            System.out.print("Suas retas não formam um triangulo !");
        }
    }
}
