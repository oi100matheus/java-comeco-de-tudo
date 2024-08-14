//57) Desenvolva um aplicativo que leia o salário e o sexo de vários funcionários.
//No final, mostre o total de salários pagos aos homens e o total pago às
//mulheres. O programa vai perguntar ao usuário se ele quer continuar ou não
//sempre que ler os dados de um funcionário.
package Exercicios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex057 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float salario,somah=0,somam=0;
        int sexo,c=0;
        while (c!=2){
            System.out.print("Digite seu salário: ");
            salario = teclado.nextFloat();
            System.out.print("Digite seu sexo: (1)masculino,(2)feminino: ");
            sexo = teclado.nextInt();
            if (sexo==1){
                somah+=salario;
            }
            if (sexo==2){
                somam+=salario;
            }
            System.out.print("Deseja continuar: (1)sim,(2)não: ");
            c = teclado.nextInt();
        }
        System.out.println("R$"+somam+" para mulheres e R$"+somah+" para homens");
    }
}
