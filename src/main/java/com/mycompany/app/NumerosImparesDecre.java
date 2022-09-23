/**
 * @author      : thehunter101
 * @file        : NumerosImpares
 * @created     : viernes sep 16, 2022 17:21:31 -05
 */
package com.mycompany.app;
import java.io.*;
import java.lang.Math;
import java.util.Scanner;

public class NumerosImparesDecre
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
	cont = n1;

	do{
		sum = ++sum;
		System.out.println(cont);
		cont = cont - 3;
	}while (cont != 1);

	System.out.println("En el numero: " + n1 + " hay " + sum + " impares");
    }
}


