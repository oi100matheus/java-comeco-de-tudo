//11) Desenvolva uma lógica que leia os valores de A, B e C de uma equação do
//segundo grau e mostre o valor de Delta. Δ = b2 – 4ac
package Exercícios_Algoritmo_JAVA;
import java.util.Scanner;
public class ex011 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double A,B, C ,delta;
        System.out.print("Digite um número para A: ");
        A= teclado.nextDouble();
        System.out.print("Digite um número para B: ");
        B= teclado.nextDouble();
        System.out.print("Digite um número para C: ");
        C= teclado.nextDouble();
        delta=(B*B)-4*A*C;
        System.out.print("O delta dessa equação deu: "+delta);
    }
}
