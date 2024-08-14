//77) Faça um programa que leia 7 nomes de pessoas e guarde-os em um vetor. No
//final, mostre uma listagem com todos os nomes informados, na ordem inversa
//daquela em que eles foram informados.
package Exercicios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex077 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String []v=new String[7];
        for (int c=0;c<v.length;c++){
            System.out.print("Digite um nome: ");
            v[c]= teclado.next();
        }
        for (int i=6;i>=0;i--){
            System.out.print(v[i]+" ");
        }
    }
}
