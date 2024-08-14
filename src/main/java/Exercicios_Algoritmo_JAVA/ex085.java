//85) Faça um algoritmo que leia o nome, o sexo e o salário de 5 funcionários e
//guarde esses dados em três vetores. No final, mostre uma listagem contendo
//apenas os dados das funcionárias mulheres que ganham mais de R$5 mil.
package Exercicios_Algoritmo_JAVA;

import java.util.Random;
import java.util.Scanner;

public class ex085 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner teclado = new Scanner(System.in);
        int []sexo=new int[5];
        String []nome=new String[5];
        int []salario=new int[5];
        for (int c=0;c< sexo.length;c++){
            System.out.print("Digite seu nome: ");
            nome[c]= teclado.next();
            sexo[c]= random.nextInt(1,3);
            salario[c]= random.nextInt(4000,6000);
        }
        for (int cd=0;cd< sexo.length;cd++){
            System.out.print("\n"+nome[cd]+"\t\t\t"+sexo[cd]+"\t\t\t"+salario[cd]);
        }
        for (int cc=0;cc< sexo.length;cc++){
            if (sexo[cc]==2 && salario[cc]>5000){
                System.out.print("\n"+nome[cc]+"\t\t\t"+sexo[cc]+"\t\t\t"+salario[cc]);
            }
        }
    }
}
