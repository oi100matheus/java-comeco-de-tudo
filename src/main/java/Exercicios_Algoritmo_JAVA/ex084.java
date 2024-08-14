//84) Crie um programa que leia o nome e a idade de 9 pessoas e guarde esses
//valores em dois vetores, em posições relacionadas. No final, mostre uma listagem
//contendo apenas os dados das pessoas menores de idade.
package Exercicios_Algoritmo_JAVA;

import java.util.Random;
import java.util.Scanner;

public class ex084 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        int []i=new int[9];
        String []n=new String[9];
        for (int c=0;c<i.length;c++){
            System.out.print("Digite seu nome: ");
            n[c]= teclado.next();
            i[c]= random.nextInt(5,100);
        }
        for (int cd=0;cd<i.length;cd++){
            System.out.print(n[cd]+"\t\t\t"+i[cd]+"\n");
        }
        System.out.print("\n==============DADOS==============\n");
        for (int cc=0;cc<i.length;cc++){
            if (i[cc]<18){
                System.out.print(n[cc]+"\t\t\t"+i[cc]+"\n");
            }
        }
    }
}
