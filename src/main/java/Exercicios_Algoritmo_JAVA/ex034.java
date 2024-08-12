package Exercicios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex034 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Declaração das variáveis
        double altura, peso, imc;

        // Entrada de dados
        System.out.print("Digite sua altura (em metros): ");
        altura = teclado.nextDouble();
        System.out.print("Digite seu peso (em kg): ");
        peso = teclado.nextDouble();

        // Calcula o IMC
        imc = peso / (altura * altura);

        // Classificação do IMC
        if (imc >= 40) {
            System.out.println("OBESIDADE MÓRBIDA");
        } else if (imc >= 30) {
            System.out.println("OBESIDADE");
        } else if (imc >= 25) {
            System.out.println("SOBREPESO");
        } else if (imc >= 18.5) {
            System.out.println("PESO IDEAL");
        } else {
            System.out.println("ABAIXO DO PESO");
        }

        teclado.close();
    }
}
