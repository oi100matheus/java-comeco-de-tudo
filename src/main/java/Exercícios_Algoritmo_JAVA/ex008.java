//8) Desenvolva um programa que leia uma distância em metros e mostre os valores
//relativos em outras medidas.
//Ex:
//Digite uma distância em metros: 185.72
//A distância de 85.7m corresponde a:
//0.18572Km
//1.8572Hm
//18.572Dam
//1857.2dm
//18572.0cm
//185720.0mm
package Exercícios_Algoritmo_JAVA;
import java.util.Scanner;
public class ex008 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float n,km,hm,dam,dm,cm,mm;
        System.out.print("Digite um distância: ");
        n = teclado.nextFloat();
        km=n/1000;
        hm=n/100;
        dam=n/10;
        dm=n*10;
        cm=n*100;
        mm=n*1000;
        System.out.print("A distância de "+n+" corresponde as seguintes medidas: ");
        System.out.println(km+"km\n"+hm+"hm\n"+dam+"dam\n"+dm+"dm\n"+cm+"cm\n"+mm+"mm");
    }
}
