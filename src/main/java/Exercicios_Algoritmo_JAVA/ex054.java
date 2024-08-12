//54) Desenvolva um aplicativo que leia o peso e a altura de 7 pessoas, mostrando
//no final:
//a) Qual foi a média de altura do grupo
//b) Quantas pessoas pesam mais de 90Kg
//c) Quantas pessoas que pesam menos de 50Kg tem menos de 1.60m
//d) Quantas pessoas que medem mais de 1.90m pesam mais de 100Kg.
package Exercicios_Algoritmo_JAVA;

import java.util.Random;

public class ex054 {
    public static void main(String[] args) {
        Random random = new Random();
        double peso,altura,somaa=0,mediaa;
        int c=1,pesam90=0,pesam50e160=0,p190e100=0;
        while(c<=7){
            altura= random.nextDouble(1.50,2.20);
            peso= random.nextFloat(120);
            if (peso>90){
                pesam90++;
            }
            if (peso<50 && altura<1.60){
                pesam50e160++;
            }
            if (peso>100 && altura>1.90){
                p190e100++;
            }
            System.out.println("altura:"+altura+" ");
            System.out.println("peso:"+peso+" ");
            somaa+=altura;
            c++;
        }
        mediaa=somaa/7;
        System.out.println("A média de altura foi de "+mediaa);
        System.out.println(pesam90+" pesam mais que 90kg");
        System.out.println(pesam50e160+" pesam menos que 50kg e tem menos de 1.60");
        System.out.println(p190e100+" medem mais de 1.90 e pesam mais de 100kg");
    }
}
