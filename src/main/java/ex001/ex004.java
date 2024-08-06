//4) Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório
//entre eles.
//Ex:
//Digite um valor: 8
//Digite outro valor: 5
//A soma entre 8 e 5 é igual a 13.
package ex001;
import java.util.Scanner;
public class ex004 {
    public static void  main(String[]args){
        Scanner teclado = new Scanner(System.in);
        int n1,n2,soma;
        System.out.print("Digite um número: ");
        n1 = teclado.nextInt();
        System.out.print("Digite outro número: ");
        n2 = teclado.nextInt();
        soma = n1+n2;
        System.out.println("A soma dos número foi: "+soma);
    }
}
