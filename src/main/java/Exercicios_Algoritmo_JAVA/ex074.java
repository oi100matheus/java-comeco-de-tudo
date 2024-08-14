//74) Crie um programa que preencha automaticamente (usando lógica, não apenas
//atribuindo diretamente) um vetor numérico com 10 posições, conforme abaixo:
//5 3 5 3 5 3 5 3 5 3
//0 1 2 3 4 5 6 7 8 9
package Exercicios_Algoritmo_JAVA;

public class ex074 {
    public static void main(String[] args) {
        int []v=new int[10];
        for (int c=0;c<v.length;c++){
            if (c%2==0){
                v[c]=5;
            }else {
                v[c]=3;
            }
            System.out.print(v[c]+" ");
        }
    }
}
