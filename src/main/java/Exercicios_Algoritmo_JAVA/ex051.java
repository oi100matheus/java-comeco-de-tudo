//51) Faça um aplicativo que leia o preço de 8 produtos. No final, mostre na tela
//qual foi o maior e qual foi o menor preço digitados
package Exercicios_Algoritmo_JAVA;

import java.util.Random;

public class ex051 {
    public static void main(String[] args) {
        Random random = new Random();
        int c=0,preco,maior=0,menor=120;
        while (c<=8){
            preco= random.nextInt(10,101);
            if (preco>maior){
                maior=preco;
            }
            if (preco<menor){
                menor=preco;
            }
            c++;
            System.out.println(preco+" ");
        }
        System.out.print("\nR$"+maior+" foi o maior preço e R$"+menor+" foi o menor preço");
    }
}
