//16) [DESAFIO] Escreva um programa para calcular a redução do tempo de vida de um
//fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele
//já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule
//quantos dias de vida um fumante perderá e exiba o total em dias.
package Exercícios_Algoritmo_JAVA;
import java.util.Scanner;
public class ex016 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double pdias,perdaqnt,qntanos,qnt;
        System.out.print("Digite a quantidade de cigarros que você fuma por dia: ");
        qnt = teclado.nextInt();
        System.out.print("Digite a quantos anos você já fuma: ");
        qntanos = teclado.nextInt();
        pdias=(10*qnt*365*qntanos)/1440;
        System.out.print("Você perdeu "+pdias+" dias de sua vida!");
    }
}
