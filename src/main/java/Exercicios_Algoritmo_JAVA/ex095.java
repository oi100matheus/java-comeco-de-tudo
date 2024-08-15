//95) Refaça o exercício 90, só que agora em forma de função Somador(), que vai
//receber dois parâmetros e vai retornar o resultado da soma entre eles para o
//programa principal.
package Exercicios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex095 {
    static int Somador(int n1,int n2){
        int res;
        res=n1+n2;
        return res;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1,n2,s;
        System.out.print("Digite um número: ");
        n1 = teclado.nextInt();
        System.out.print("Digite outro número: ");
        n2 = teclado.nextInt();
        s=Somador(n1,n2);
        System.out.println("Resultado da soma="+s);
    }
}
