//34) O Índice de Massa Corpórea (IMC) é um valor calculado baseado na altura e no
//peso de uma pessoa. De acordo com o valor do IMC, podemos classificar o
//indivíduo dentro de certas faixas.
// - abaixo de 18.5: Abaixo do peso
// - entre 18.5 e 25: Peso ideal
// - entre 25 e 30: Sobrepeso
// - entre 30 e 40: Obesidade
// - acima de 40: Obseidade mórbida
//Obs: O IMC é calculado pela expressão peso/altura² (peso dividido pelo quadrado
//da altura)
package Exercícios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex0034 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double altura,peso,imc;
        System.out.print("Digite sua altura: ");
        altura = teclado.nextDouble();
        System.out.print("Digite seu peso: ");
        peso = teclado.nextDouble();
        imc=(altura*altura)/peso;
        if (imc>40){
            System.out.println("OBESIDADE MÓRBIDA");
        }
        if (imc>30 && imc<40){
            System.out.println("OBESIDADE");
        }
        if (imc>25 && imc<30){
            System.out.print("SOBREPESO");
        }
        if (imc>18.5 && imc<25){
            System.out.print("PESO IDEAL");
        }
        if (imc<18.5){
            System.out.print("ABAIXO DO PESO");
        }
    }
}
