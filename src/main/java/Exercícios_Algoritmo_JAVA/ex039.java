//39) Faça um algoritmo que mostre na tela a seguinte contagem:
//10 9 8 7 6 5 4 3 Acabou!
package Exercícios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex039 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int c=10;
        while (c>=3){
            System.out.print(c+" ");
            c--;
        }
        System.out.print("Acabou!");
    }
}
