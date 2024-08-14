//59) Crie um programa que leia o sexo e a idade de várias pessoas. O programa vai
//perguntar se o usuário quer continuar ou não a cada pessoa. No final, mostre:
//a) qual é a maior idade lida
//b) quantos homens foram cadastrados
//c) qual é a idade da mulher mais jovem
//d) qual é a média de idade entre os homens
package Exercicios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex059 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int sexo,idade,maioridade=0,qnthomens=0,mulhermaisjovem=300,somah=0,cc=0,media;
        while (cc!=2){
            System.out.print("Digite seu sexo: (1)homem,(2)mulher: ");
            sexo = teclado.nextInt();
            System.out.print("Digite sua idade: ");
            idade = teclado.nextInt();
            if (sexo==1){
                qnthomens++;
                somah+=idade;
            }
            if (sexo==2){
                if (idade<mulhermaisjovem){
                    mulhermaisjovem=idade;
                }
            }
            if (idade>maioridade){
                maioridade=idade;
            }
            System.out.print("Quer continuar ? (1)sim,(2)não: ");
            cc= teclado.nextInt();
        }
        media=somah/qnthomens;
        System.out.println("A maior idade lida foi de "+maioridade+" anos");
        System.out.println("Foram cadastrados "+qnthomens+" homens");
        System.out.println("A idade da mulher mais jovem é de "+mulhermaisjovem+" anos ");
        System.out.println("A média de idade entre homens é de "+media);
    }
}
