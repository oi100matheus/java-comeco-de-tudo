/*3) Crie um programa que leia o nome e o salário de um funcionário, mostrando
uma mensagem no final.
Ex:
Nome do Funcionário: Maria do Carmo
Salário: 1850,45
O funcionário Maria do Carmo tem um salário de R$1850,45 em junho.*/
package ex001;
import java.util.Scanner;
public class ex003 {
public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    String nome;
    float salario;
    System.out.print("Digite seu nome: ");
    nome = teclado.next();
    System.out.println("Digite seu salário: ");
    salario = teclado.nextFloat();
    System.out.println("O funcionário "+nome+" tem salário de R$"+salario+" em junho");
}
}
