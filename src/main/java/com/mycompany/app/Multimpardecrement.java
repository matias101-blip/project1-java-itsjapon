/**
 * @author      : thehunter101
 * @file        : Multimpardecrement
 * @created     : jueves sep 22, 2022 00:43:51 -05
 */

package com.mycompany.app;
import java.io.*;
import java.lang.Math;
import java.util.Scanner;
public class Multimpardecrement
{
    public static void main (String[] args)
    {
                int n1, cont, sum, mult;
		Scanner sc = new Scanner(System.in);
		
		do{
		       	System.out.println("Escriba un numero mayor que 0");
			n1 = sc.nextInt();
		
		}while (n1 <= 0);
				
		sum = 0;
	       	cont = 39;
					
		do{
			mult = cont * n1;
			sum = mult + sum;
			cont = cont - 2;
		}while (cont != 1);
						
		sum = sum + n1;

		System.out.println("La suma de los 20 primeros numeros impares de: " + n1 + " es: " + sum);
    }
}


