//64) Desenvolva um programa usando a estrutura “para” que mostre na tela a
//seguinte contagem:
//0 5 10 15 20 25 30 35 40 Acabou!
package Exercicios_Algoritmo_JAVA;

public class ex064 {
    public static void main(String[] args) {
        for (int c=0;c<=40;c+=5){
            System.out.print(c+" ");
        }
        System.out.println("Acabou!");
    }
}
