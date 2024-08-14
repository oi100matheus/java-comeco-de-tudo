//68) Crie um programa que leia sexo e peso de 8 pessoas, usando a estrutura
//“para”. No final, mostre na tela:
//a) Quantas mulheres foram cadastradas
//b) Quantos homens pesam mais de 100Kg
//c) A média de peso entre as mulheres
//d) O maior peso entre os homens
package Exercicios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex068 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int sexo,qntm=0,qnt100=0,media,soma=0;
        float peso,maiorpesoh=0;
        for (int c=1;c<=8;c++){
            System.out.print("Digite seu sexo (1)homem, (2)mulher: ");
            sexo = teclado.nextInt();
            System.out.print("Digite seu peso: ");
            peso = teclado.nextFloat();
            if (sexo==2){
                qntm++;
                soma+=peso;
            }
            if (sexo==1 && peso>100){
                qnt100++;
                if (peso>maiorpesoh){
                    maiorpesoh=peso;
                }
            }
        }
        media=soma/qntm;
        System.out.println("Foram cadastradas "+qntm+" mulheres");
        System.out.println("Homens que pesam mais de 100kg foram = "+qnt100);
        System.out.println("A média de peso das mulheres = "+media);
        System.out.println("O maior peso entre os homens foi = "+maiorpesoh);
    }
}
