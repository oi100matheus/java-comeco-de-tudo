//6) Faça um programa que leia um número inteiro e mostre o seu antecessor e seu
//sucessor.
//Ex:
//Digite um número: 9
//O antecessor de 9 é 8
//O sucessor de 9 é 10
package Exercícios_Algoritmo_JAVA;
import java.util.Scanner;
public class ex006 {
    public static void  main(String[]args){
        Scanner teclado = new Scanner(System.in);
        int n,a,s;
        System.out.print("Digite um número: ");
        n = teclado.nextInt();
        a=n-1;
        s=n+1;
        System.out.println("O número digitado foi "+n+" e o seu antecessor é "+a+" o sucessor é "+s);

    }
}
