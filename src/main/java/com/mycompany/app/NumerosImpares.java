/**
 * @author      : thehunter101
 * @file        : NumerosImpares
 * @created     : viernes sep 16, 2022 17:21:31 -05
 */
package com.mycompany.app;
import java.io.*;
import java.lang.Math;
import java.util.Scanner;

public class NumerosImpares
{
    public static void main (String[] args)
    {
        int n1, cont, sum;
	Scanner sc = new Scanner(System.in);

	do{
		System.out.println("Escriba un numero mayor que 10");
		n1 = sc.nextInt();
	}while (n1 <= 10);

	sum=0;
	cont = 1;

	do{
		sum = sum + cont;
		System.out.println(cont);
		cont = cont + 2;
	}while (sum != n1);

	System.out.println("En el numero: " + n1 + " hay " + cont + " impares");
    }
}


