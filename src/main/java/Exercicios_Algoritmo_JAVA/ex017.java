//17) Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse
//80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba
//o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida.
package Exercicios_Algoritmo_JAVA;
import java.util.Scanner;
public class ex017 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double velocidade,multa;
        float cobranca=5f;
        System.out.print("Digite a velocidade do carro: ");
        velocidade = teclado.nextDouble();
        multa=(velocidade-80)*cobranca;
        if (velocidade>80){
            System.out.print("Você passou acima de 80km/h e foi multada em R$"+multa);
        }else{
            System.out.println("Você não foi multado, muito bem !");
        }

    }
}
