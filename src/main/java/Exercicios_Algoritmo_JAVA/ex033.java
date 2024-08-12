//33) Escreva um programa para aprovar ou não o empréstimo bancário para a compra
//de uma casa. O programa vai perguntar o valor da casa, o salário do comprador e
//em quantos anos ele vai pagar. Calcule o valor da prestação mensal, sabendo que
//ela não pode exceder 30% do salário ou então o empréstimo será negado.
package Exercicios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex033 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float casa,salario,prestacao,parcelas;
        int anos;
        System.out.print("Digite qual o valor da casa: R$");
        casa = teclado.nextFloat();
        System.out.print("Digite seu salario: ");
        salario = teclado.nextFloat();
        System.out.print("Digite em quantos anos vai pagar: ");
        anos = teclado.nextInt();
        parcelas=12*anos;
        prestacao=casa/parcelas;
        if (prestacao>(salario*0.3)){
            System.out.println("EMPRÉSTIMO NEGADO!!");
        }else {
            System.out.println("As prestações sairão em R$"+prestacao+" mensais");
        }

    }
}
