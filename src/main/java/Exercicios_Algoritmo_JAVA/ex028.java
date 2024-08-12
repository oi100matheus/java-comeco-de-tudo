//28) Faça um programa que leia a largura e o comprimento de um terreno
//retangular, calculando e mostrando a sua área em m². O programa também
//devemostrar a classificação desse terreno, de acordo com a lista abaixo:
// - Abaixo de 100m² = TERRENO POPULAR
// - Entre 100m² e 500m² = TERRENO MASTER
// - Acima de 500m² = TERRENO VIP
package Exercicios_Algoritmo_JAVA;

import java.util.Scanner;

public class ex028 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float largura,comprimento,media;
        System.out.print("Digite a largura: ");
        largura = teclado.nextFloat();
        System.out.print("Digite o comprimento: ");
        comprimento = teclado.nextFloat();
        media=largura*comprimento;
        if (media>500){
            System.out.print("TERRENO VIP");
        } else if (media>100 && media<500) {
            System.out.print("TERRENO MASTER");
        }else {
            System.out.print("TERRENO POPULAR");
        }
    }
}
