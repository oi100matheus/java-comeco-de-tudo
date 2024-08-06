/*2) Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boasvindas para ela:
Ex:
Qual é o seu nome? João da Silva
Olá João da Silva, é um prazer te conhecer!*/
package ex001;
import java.sql.SQLOutput;
import java.util.Scanner;
public class ex002 {
    public static void  main(String[]args){
        Scanner teclado = new Scanner(System.in);
    String name;
        System.out.print("Qual é seu nome ? ");
        name= teclado.next();
        System.out.println("Olá "+name+", é um prazer te conhecer!");
    }
}
