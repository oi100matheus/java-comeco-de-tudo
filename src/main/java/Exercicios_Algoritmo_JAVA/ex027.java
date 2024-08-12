//27) Crie um programa que leia duas notas de um aluno e calcule a sua média,
//mostrando uma mensagem no final, de acordo com a média atingida:
// - Média até 4.9: REPROVADO
// - Média entre 5.0 e 6.9: RECUPERAÇÃO
// - Média 7.0 ou superior: APROVADO
package Exercicios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex027 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float n1,n2,media;
        System.out.print("Digite a nota1: ");
        n1 = teclado.nextFloat();
        System.out.print("Digite a nota2: ");
        n2 = teclado.nextFloat();
        media=(n1+n2)/2;
        if (media>7.0){
            System.out.print("APROVADO");
        } else if (media>5.0 && media<6.9) {
            System.out.print("RECUPERAÇÃO");
        }else {
            System.out.print("REPROVADO");
        }
    }
}
