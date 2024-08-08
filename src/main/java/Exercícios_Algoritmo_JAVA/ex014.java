//14) A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva
//um programa que pergunte a quantidade de Km percorridos por um carro alugado e a
//quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar,
//sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.
package Exercícios_Algoritmo_JAVA;
import java.util.Scanner;
public class ex014 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double km,preco;
        int dias;
        System.out.print("Digite quantos Km você rodou: ");
        km = teclado.nextDouble();
        System.out.print("Digite por quantos dias você usou o carro: ");
        dias = teclado.nextInt();
        preco=(90*dias)+(0.20*km);
        System.out.print("Você deve pagar R$"+preco+" pelo serviço!");
    }
}
