//75) Crie um programa que preencha automaticamente (usando lógica, não apenas
//atribuindo diretamente) um vetor numérico com 15 posições com os primeiros
//elementos da sequência de Fibonacci:
//1 1 2 3 5 8 13 21 34 55 89 144 233 377 610
//0 1 2 3 4 5 6 7 8 9 10 11 12 13 14
package Exercicios_Algoritmo_JAVA;

public class ex075 {
    public static void main(String[] args) {
        int []v=new int[15];
        int n1=1,n2=1,n3;
        System.out.print(n1+" "+n2+" ");
        for (int c=3;c<=v.length;c++){
            n3=n2+n1;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
    }
}
