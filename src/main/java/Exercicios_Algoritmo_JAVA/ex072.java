//72) Crie um programa que preencha automaticamente (usando lógica, não apenas
//atribuindo diretamente) um vetor numérico com 10 posições, conforme abaixo:
//5 10 15 20 25 30 35 40 45 50
//0 1 2 3 4 5 6 7 8 9
package Exercicios_Algoritmo_JAVA;

public class ex072 {
    public static void main(String[] args) {
        int []v=new int[10];
        int n=5;
        for (int c=0;c<v.length;c++){
            v[c]=n*(c+1);
            System.out.print(v[c]+" ");
        }
    }
}
