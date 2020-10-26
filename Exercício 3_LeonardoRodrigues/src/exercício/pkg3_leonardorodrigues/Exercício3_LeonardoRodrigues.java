package exercício.pkg3_leonardorodrigues;

import java.util.Scanner;

public class Exercício3_LeonardoRodrigues 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        double a, b, c, delta, x1, x2;
        
        //inicio
        
        System.out.print("Digite o número da variável A: ");
        a = entrada.nextDouble();
        System.out.print("Digite o número da variável B: ");
        b = entrada.nextDouble();
        System.out.print("Digite o número da variável C: ");
        c = entrada.nextDouble();
        
        //processo
        
        if (a != 0)
        {
            delta = (b * b)- 4 * a * c;
            if (delta < 0)
            {
                System.out.print("A equação não apresenta resultados reais.");
            }    
            else if (delta == 0)
            {    
                x1 = (- b + Math.sqrt(delta))/ (2 * a);
                System.out.printf("O X1 gerado a partir desses valores corresponde a %5.2f",x1,".");
            }    
            else if (delta > 0)
            {
                x1 = (- b + Math.sqrt(delta))/ (2 * a);
                x2 = (-b - Math.sqrt(delta))/ (2 * a);
                System.out.printf("A partir desses valores, X1 e X2 correspondem respectivamente a %5.2f",x1);
                System.out.printf(" e %5.2f",x2,".");
            }
        }
        else
        {
            System.out.print("A variável A precisa ser diferente de 0 para ser efetuado os cálculos.");
        }
    } 
}
