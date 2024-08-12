//40) Crie um aplicativo que mostre na tela a seguinte contagem:
//0 3 6 9 12 15 18 Acabou!
package Exercicios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex040 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int c=0;
        while (c<=18){
            System.out.print(c+" ");
            c+=3;
        }
        System.out.print("Acabou!");
    }
}
