//88) Crie um programa que melhore o procedimento Gerador() da questão anterior
//para que mostre uma mensagem vário
//Ex: Ao chamar Gerador("Aprendendo Portugol", 4) aparece:
//+-------=======------+
// Aprendendo Portugol
// Aprendendo Portugol
// Aprendendo Portugol
// Aprendendo Portugol
//+-------=======------+
package Exercicios_Algoritmo_JAVA;

public class ex088 {
    static void Gerador(String frase,int qnt){
        System.out.println("+-------=======------+");
        for (int c=0;c<=qnt;c++) {
            System.out.println(frase);
        }
        System.out.println("+-------=======------+");
    }
    public static void main(String[] args) {
        Gerador("Aprendendo JAVA!!!",5);
    }
}
