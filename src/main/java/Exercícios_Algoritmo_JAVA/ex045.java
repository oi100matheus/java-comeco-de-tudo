//45) O programa acima vai ter um problema quando digitarmos o primeiro valor
//maior que o último. Resolva esse problema com um código que funcione em qualquer
//situação.
package Exercícios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex045 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int p,u,i,c;
        System.out.print("Digite o primeiro número: ");
        p = teclado.nextInt();
        System.out.print("Digite o incremento: ");
        i = teclado.nextInt();
        System.out.print("Digite o último número: ");
        u = teclado.nextInt();
        c=p;
        if (c<u){
            while (c<=u) {
                System.out.print(c + " ");
                c +=i;
            }
        }else {
            while (c >= u) {
                System.out.print(c + " ");
                c -=i;
            }
        }
    }
}
