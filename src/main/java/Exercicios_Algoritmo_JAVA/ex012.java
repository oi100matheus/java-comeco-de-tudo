//12) Crie um programa que leia o preço de um produto, calcule e mostre o seu
//PREÇO PROMOCIONAL, com 5% de desconto.
package Exercicios_Algoritmo_JAVA;
import java.util.Scanner;
public class ex012 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double preco,precop;
        System.out.print("Digite o preço do produto: R$");
        preco = teclado.nextDouble();
        precop=preco-(preco*0.05);
        System.out.println("O PREÇO PROMOCIONAL, com 5% de desconto foi de: R$"+precop);
    }
}
