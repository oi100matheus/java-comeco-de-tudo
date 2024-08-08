//7) Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a
//sua terça parte.
//Ex:
//Digite um número: 3.5
//O dobro de 3.5 é 7.0
//A terça parte de 3.5 é 1.16666
package Exercícios_Algoritmo_JAVA;
import java.util.Scanner;
public class ex007 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float n,dobro,terca;
        System.out.print("Digite um número: ");
        n = teclado.nextFloat();
        dobro=n*2;
        terca=n/3;
        System.out.print("O dobro de "+n+" é "+dobro+" e sua terça parte é "+terca);
    }
}
