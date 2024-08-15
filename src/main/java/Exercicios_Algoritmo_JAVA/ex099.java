//99) Faça um programa que possua uma função chamada Potencia(), que vai receber
//dois parâmetros numéricos (base e expoente) e vai calcular o resultado da
//exponenciação.
//Ex: Potencia(5,2) vai calcular 52 = 25
package Exercicios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex099 {
    static int Potencia(int n1,int n2){
        int res=1;
        for (int c=1;c<=n2;c++){
            res=n1*res;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int base,expoente,res;
        System.out.print("Digite um base: ");
        base = teclado.nextInt();
        System.out.print("Digite um expoente: ");
        expoente = teclado.nextInt();
        res=Potencia(base,expoente);
        System.out.print("Resultado da potenciação: "+res);
    }
}
