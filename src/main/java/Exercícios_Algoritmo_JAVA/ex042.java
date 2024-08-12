//42) Faça um algoritmo que pergunte ao usuário um número inteiro e positivo
//qualquer e mostre uma contagem até esse valor:
//Ex: Digite um valor: 35
//Contagem: 1 2 3 4 5 6 7 ... 33 34 35 Acabou!
package Exercícios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex042 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n,c=1;
        System.out.print("Digite um número: ");
        n = teclado.nextInt();
        while (c<=n){
            System.out.print(c+" ");
            c++;
        }
        System.out.print("Acabou!");
    }
}
