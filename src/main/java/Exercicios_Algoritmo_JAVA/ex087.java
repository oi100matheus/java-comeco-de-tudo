//87) Crie um programa que melhore o procedimento Gerador() da questão anterior
//para mostrar uma mensagem personalizada, passada como parâmetro.
//Ex: Ao chamar Gerador("Aprendendo Portugol") aparece:
//+-------=======------+
// Aprendendo Portugol
//+-------=======------+
package Exercicios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex087 {

    static void Gerador(String frase){
        System.out.println("+-------=======------+");
        System.out.println(frase);
        System.out.println("+-------=======------+");
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String escreva;
        System.out.print("Escreva a frase que queira mostrar: ");
        escreva= teclado.next();
        Gerador(escreva);
    }
}
