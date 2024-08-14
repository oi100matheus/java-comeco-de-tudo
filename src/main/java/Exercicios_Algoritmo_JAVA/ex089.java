//89) Crie um programa que melhore o procedimento Gerador() da questão anterior
//para que o programador possa escolher uma entre três bordas:
// +-------=======------+ Borda 1
// ~~~~~~~~:::::::~~~~~~~ Borda 2
// <<<<<<<<------->>>>>>> Borda 3
//Ex: Uma chamada válida seria Gerador("Portugol Studio", 3, 2)
//~~~~~~~~:::::::~~~~~~~
// Portugol Studio
// Portugol Studio
// Portugol Studio
//~~~~~~~~:::::::~~~~~~~
package Exercicios_Algoritmo_JAVA;

public class ex089 {
    static void Gerador(String frase,int qnt,int borda){
        if (borda==1){
            System.out.println("+-------=======------+");
        }
        if (borda==2){
            System.out.println("~~~~~~~~:::::::~~~~~~~");
        }
        if (borda==3){
            System.out.println("<<<<<<<<------->>>>>>>");
        }
        for (int c=0;c<qnt;c++){
            System.out.println(frase);
        }
        if (borda==1){
            System.out.println("+-------=======------+");
        }
        if (borda==2){
            System.out.println("~~~~~~~~:::::::~~~~~~~");
        }
        if (borda==3){
            System.out.println("<<<<<<<<------->>>>>>>");
        }
    }

    public static void main(String[] args) {
        Gerador("Aprendendo JAVA",4,3);
    }
}
