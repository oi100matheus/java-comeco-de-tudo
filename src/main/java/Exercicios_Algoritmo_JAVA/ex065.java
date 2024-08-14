//65) Desenvolva um programa usando a estrutura “para” que mostre na tela a
//seguinte contagem:
//100 90 80 70 60 50 40 30 20 10 0 Acabou!
package Exercicios_Algoritmo_JAVA;

public class ex065 {
    public static void main(String[] args) {
        for (int c=100;c>=0;c-=10){
            System.out.print(c+" ");
        }
        System.out.println("Acabou!");
    }
}
