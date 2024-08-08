//10) Faça um algoritmo que leia a largura e altura de uma parede, calcule e
//mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
//sabendo que cada litro de tinta pinta uma área de 2metros quadrados.
package Exercícios_Algoritmo_JAVA;
import java.util.Scanner;
public class ex010 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double l,b,a,t;
        System.out.print("Digite a largura: ");
        l = teclado.nextDouble();
        System.out.print("Digite a altura: ");
        b = teclado.nextDouble();
        a=l*b;
        t=a/2;
        System.out.println("Você vai precisar de "+t+"Litros de tinta para pintar "+a+"m2 de ârea!");
    }
}
