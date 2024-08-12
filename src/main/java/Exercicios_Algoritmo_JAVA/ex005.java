//5) Faça um programa que leia as duas notas de um aluno em uma matéria e mostre
//na tela a sua média na disciplina.
//Ex:
//Nota 1: 4.5
//Nota 2: 8.5
//A média entre 4.5 e 8.5 é igual a 6.5
package Exercicios_Algoritmo_JAVA;
import java.util.Scanner;
public class ex005 {
    public static void  main(String[]args){
        Scanner teclado = new Scanner(System.in);
        float n1,n2,media;
        System.out.print("Digite uma nota: ");
        n1 = teclado.nextFloat();
        System.out.print("Digite outra nota: ");
        n2 = teclado.nextFloat();
        media=(n1+n2)/2;
        System.out.println("A sua média de notas foi "+media);
    }
}
