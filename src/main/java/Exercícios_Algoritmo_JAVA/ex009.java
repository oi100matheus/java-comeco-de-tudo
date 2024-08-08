//9) Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$)
//e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45.
package Exercícios_Algoritmo_JAVA;
import java.util.Scanner;
public class ex009 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double dinheiro,dolar;
        System.out.print("Digite quanto de dinheiro você tem na carteira: R$");
        dinheiro = teclado.nextDouble();
        dolar=dinheiro/3.45;
        System.out.println("Você pode comprar US$"+dolar);
    }
}
