//24) Faça um algoritmo que pergunte a distância que um passageiro deseja
//percorrer em Km. Calcule o preço da passagem, cobrando R$0.50 por Km para
//viagens até 200Km e R$0.45 para viagens mais longas.
package Exercícios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex024 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float distancia,preco;
        System.out.print("Digite a distância que deseja percorrer em Km: ");
        distancia = teclado.nextFloat();
        if (distancia<=200){
            preco=0.5f*distancia;
            System.out.print("Você será cobrado em R$"+preco+" pela distância");
        }else {
            preco=0.45f*distancia;
            System.out.print("Você será cobrado em R$"+preco+" pela distância");
        }
    }
}
