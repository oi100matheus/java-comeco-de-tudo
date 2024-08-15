//100) Melhore o exercício 96, criando além da função Media() uma outra função
//chamada Situacao(), que vai retornar para o programa principal se o aluno está
//APROVADO, em RECUPERAÇÃO ou REPROVADO. Essa nova função, vai receber como
//parâmetro o resultado retornado pela função Media().
package Exercicios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex100 {
    static float Media(float n1,float n2){
        float res;
        res=(n1+n2)/2f;
        return res;
    }
    static String Situacao(float res){
        if (res>=4.5 && res<=5.9){
            return "RECUPERAÇÃO";
        } else if (res<4.5) {
            return "REPROVADO";
        }else {
            return "APROVADO";
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float nota1,nota2,res;
        String situ;
        System.out.print("Digite sua nota1: ");
        nota1 = teclado.nextFloat();
        System.out.print("Digite sua nota2: ");
        nota2 = teclado.nextFloat();
        res = Media(nota1,nota2);
        situ = Situacao(res);
        System.out.print("Sua média: "+res);
        System.out.print("\nSua situação: "+situ);
    }
}
