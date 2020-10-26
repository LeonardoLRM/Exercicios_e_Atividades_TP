package exercício.pkg1_.leonardorodrigues;

import java.util.Scanner;

public class Exercício1_LeonardoRodrigues 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner( System.in );
        double num, resto;
        
        //inicio
        
        System.out.print("Digite um número inteiro: ");
        num = entrada.nextDouble();
        
        //processo
        
        resto = num % 2;
        
        if (resto == 0)
        {
            System.out.print("O número "+num+" é considerado par.");                                                        
        }
        else if (resto > 0)
        {
            System.out.print("O número "+num+" é considerado ímpar.");
        }
    }    
}
