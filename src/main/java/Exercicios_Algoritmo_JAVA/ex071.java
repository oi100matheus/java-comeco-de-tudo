//71) Faça um programa que preencha automaticamente um vetor numérico com 8
//posições, conforme abaixo:
//999 999 999 999 999 999 999 999
//0 1 2 3 4 5 6 7
package Exercicios_Algoritmo_JAVA;


public class ex071 {
    public static void main(String[] args) {
        int []v=new int[8];
        for (int c=0;c<v.length;c++){
            v[c]=999;
            System.out.print(v[c]+" ");
        }
    }
}
