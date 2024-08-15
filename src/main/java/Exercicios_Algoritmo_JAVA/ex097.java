//97) Refaça o exercício 91, só que agora em forma de função Maior(), mas faça uma
//adaptação que vai receber TRÊS números como parâmetro e vai retornar qual foi o
//maior entre eles.
package Exercicios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex097 {
    static int Maior(int n1,int n2, int n3){
        if (n1>n2 && n1>n3){
            return n1;
        } else if (n2>n1 && n2>n3) {
            return n2;
        }else {
            return n3;
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1,n2,n3,res;
        System.out.print("Digite n1: ");
        n1 = teclado.nextInt();
        System.out.print("Digite n2: ");
        n2 = teclado.nextInt();
        System.out.print("Digite n3: ");
        n3 = teclado.nextInt();
        res=Maior(n1,n2,n3);
        System.out.print("O maior valor é "+res);
    }
}
