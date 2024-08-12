//44) Crie um algoritmo que leia o valor inicial da contagem, o valor final e o
//incremento, mostrando em seguida todos os valores no intervalo:
//Ex: Digite o primeiro Valor: 3
//Digite o último Valor: 10
//Digite o incremento: 2
//Contagem: 3 5 7 9 Acabou!
package Exercícios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex044 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int p,u,i,c;
        System.out.print("Digite o primeiro número: ");
        p = teclado.nextInt();
        System.out.print("Digite o incremento: ");
        i = teclado.nextInt();
        System.out.print("Digite o último número: ");
        u = teclado.nextInt();
        c=p;
        if (c<u){
            while (c<=u) {
                System.out.print(c + " ");
                c +=i;
            }
        }else {
            while (c >= u) {
                System.out.print(c + " ");
                c -=i;
            }
        }
    }
}
