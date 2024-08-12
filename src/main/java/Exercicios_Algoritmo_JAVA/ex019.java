//19) Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua
//média e mostre na tela. No final, analise a média e mostre se o aluno teve ou
//não um bom aproveitamento (se ficou acima da média 7.0).
package Exercicios_Algoritmo_JAVA;
import java.util.Scanner;
public class ex019 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float nota1,nota2,media;
        System.out.print("Digite sua primeira nota: ");
        nota1 = teclado.nextFloat();
        System.out.print("Digite sua segunda nota: ");
        nota2 = teclado.nextFloat();
        media=(nota1+nota2)/2;
        if (media>=7.0){
            System.out.print("Parabéns, você teve um bom aproveitamento!!, sua média foi "+media);
        }else{
            System.out.println(media+"Vixi, seu aproveitamento foi ruim!, sua média foi "+media);
        }
    }
}
