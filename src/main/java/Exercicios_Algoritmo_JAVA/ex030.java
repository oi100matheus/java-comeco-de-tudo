package Exercicios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex030 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int r1, r2, r3;
        System.out.print("Digite a primeira reta: ");
        r1 = teclado.nextInt();
        System.out.print("Digite a segunda reta: ");
        r2 = teclado.nextInt();
        System.out.print("Digite a terceira reta: ");
        r3 = teclado.nextInt();

        if (r1 + r2 > r3 && r1 + r3 > r2 && r2 + r3 > r1) {
            if (r1 == r2 && r2 == r3) {
                System.out.println("Triângulo EQUILÁTERO");
            } else if (r1 == r2 || r1 == r3 || r2 == r3) {
                System.out.println("Triângulo ISÓSCELES");
            } else {
                System.out.println("Triângulo ESCALENO");
            }
        } else {
            System.out.println("Não forma um triângulo");
        }
    }
}
