//43) Desenvolva um algoritmo que mostre uma contagem regressiva de 30 até 1,
//marcando os números que forem divisíveis por 4, exatamente como mostrado abaixo:
//30 29 [28] 27 26 25 [24] 23 22 21 [20] 19 18 17 [16]...
package Exercicios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex043 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int c=30;
        while (c>=1){
            if (c%4==0){
                System.out.print("["+c+"] ");
                c--;
                continue;
            }
            System.out.print(c+" ");
            c--;
        }
    }
}
