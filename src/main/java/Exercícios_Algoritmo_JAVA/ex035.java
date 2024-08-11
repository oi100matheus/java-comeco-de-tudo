//35) Uma empresa de aluguel de carros precisa cobrar pelos seus serviços. O
//aluguel de um carro custa R$90 por dia para carro popular e R$150 por dia para
//carro de luxo. Além disso, o cliente paga por Km percorrido. Faça um programa
//que leia o tipo de carro alugado (popular ou luxo), quantos dias de aluguel e
//quantos Km foram percorridos. No final mostre o preço a ser pago de acordo com a
//tabela a seguir:
// - Carros populares (aluguel de R$90 por dia)
// - Até 100Km percorridos: R$0,20 por Km
// - Acima de 100Km percorridos: R$0,10 por Km
// - Carros de luxo (aluguel de R$150 por dia)
// - Até 200Km percorridos: R$0,30 por Km
// - Acima de 200Km percorridos: R$0,25 por Km
package Exercícios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex035 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int carro,dias;
        float km,preco,aluguel;
        System.out.print("Digite qual carro , (1)popular, (2)luxo: ");
        carro = teclado.nextInt();
        System.out.print("Digite quantos dias: ");
        dias = teclado.nextInt();
        System.out.print("Digite quantos km foram percorridos: ");
        km = teclado.nextFloat();
        if (carro==1){
            aluguel=90;
            if (km>100){
                preco=(aluguel*dias)+km*0.10f;
            }else {
                preco=(aluguel*dias)+km*0.20f;
            }
        }else {
            aluguel=150;
            if (km>200){
                preco=(aluguel*dias)+km*0.25f;
            }else {
                preco=(aluguel*dias)+km*0.30f;
            }
        }
        System.out.print("O preço a ser pago é de: R$"+preco);
    }
}
