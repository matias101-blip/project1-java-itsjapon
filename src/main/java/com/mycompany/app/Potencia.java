/**
 * @author      : thehunter101
 * @file        : Potencia
 * @created     : viernes sep 09, 2022 17:29:22 -05
 */
package com.mycompany.app;
import java.io.*;
import java.util.Scanner;
import java.lang.Math;

public class Potencia
{
    public static void main (String[] args)
    {
        int n1, n2, mult, cont;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Ingrese el numero a potenciar:");
	n1 = sc.nextInt();

	System.out.println("Ingrese la potencia:");
	n2 = sc.nextInt();

	mult = n1;
	cont = 1;

	do
	{
		mult = mult * n1;
		cont = cont + 1;
	}while (cont != n2);

	System.out.println("Respuesta: " + mult);

    }
}


