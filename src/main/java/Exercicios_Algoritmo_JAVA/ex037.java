//37) Uma empresa precisa reajustar o salário dos seus funcionários, dando um
//aumento de acordo com alguns fatores. Faça um programa que leia o salário atual,
//o gênero do funcionário e há quantos anos esse funcionário trabalha na empresa.
//No final, mostre o seu novo salário, baseado na tabela a seguir:
//- Mulheres
// - menos de 15 anos de empresa: +5%
// - de 15 até 20 anos de empresa: +12%
// - mais de 20 anos de empresa: +23%
//- Homens
// - menos de 20 anos de empresa: +3%
// - de 20 até 30 anos de empresa: +13%
// - mais de 30 anos de empresa: +25%
package Exercicios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex037 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float asalario,nsalario=0;
        int anos,genero;
        System.out.print("Digite seu gênero: (1)masculino,(2)feminino.:");
        genero = teclado.nextInt();
        System.out.print("Digite quantos anos tem de empresa: ");
        anos = teclado.nextInt();
        System.out.print("Digite o salário atual: R$");
        asalario = teclado.nextFloat();
        if (genero==1){
            if (anos>20){
                nsalario=asalario+(asalario*0.23f);
            }
            if (anos>15 && anos<20){
                nsalario=asalario+(asalario*0.12f);
            }
            if (anos<15){
                nsalario=asalario+(asalario*0.05f);
            }
        }else if (genero==2){
            if (anos>30){
                nsalario=asalario+(asalario*0.25f);
            }
            if (anos>20 && anos<30){
                nsalario=asalario+(asalario*0.13f);
            }
            if (anos<20){
                nsalario=asalario+(asalario*0.03f);
            }

        }
        System.out.print("R$"+nsalario+" é seu novo salário!");

    }
}
