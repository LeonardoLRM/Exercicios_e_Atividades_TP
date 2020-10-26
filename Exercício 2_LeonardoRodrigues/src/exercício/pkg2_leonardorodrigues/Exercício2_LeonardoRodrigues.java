package exercício.pkg2_leonardorodrigues;

import java.util.Scanner;

public class Exercício2_LeonardoRodrigues {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b, c;
        
        //inicio

        System.out.print("Digite o valor de um lado do triângulo: ");
        a = entrada.nextDouble();
        System.out.print("Digite o valor de outro lado do triângulo: ");
        b = entrada.nextDouble();
        System.out.print("Digite o valor do último lado restante do triângulo: ");
        c = entrada.nextDouble();
        
        //processo

        if ((a + b > c) && (a + c > b) && (b + c > a)) 
        {
            System.out.print("As medidas enviadas correspondem a um triângulo padrão,");
            if ((a == b) && (a == c) && (b == c)) 
            {
                System.out.print(" sendo esse um equilátero.");
            }
            else if ((a != b) && (a != c) && (b != c)) 
            {
                System.out.print(" sendo esse um escaleno.");
            } 
            else if ((a == b) && (a != c) || (a == c) && (a != b) || (b == c) && (b != a)) 
            {
                System.out.print(" sendo esse um isósceles.");
            }
        } 
        else 
        {
            System.out.print("As medidas enviadas não correspondem a de um triângulo.");
        }
    }
}
