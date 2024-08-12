//23) Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos
//para todos, mas especialmente para mulheres. Faça um programa que leia nome,
//sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo
//que:
// - Homens ganham 5% de desconto
// - Mulheres ganham 13% de desconto
package Exercicios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex023 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        int sexo;
        float valor,promo;
        System.out.println("Digite seu nome: ");
        nome = teclado.nextLine();
        System.out.print("Digite sexo (1)masculino (2)feminino: ");
        sexo = teclado.nextInt();
        System.out.print("Digite o valor do produto: R$");
        valor = teclado.nextFloat();
        if (sexo==2){
            promo=valor-(valor*0.13f);
            System.out.print("Senhora "+nome+" você recebeu 13% de desconto e seu produto sairá por R$"+promo);
        }else {
            promo=valor-(valor*0.05f);
            System.out.print("Senhor "+nome+" você recebeu 5% de desconto e seu produto sairá por R$"+promo);
        }

    }
}
