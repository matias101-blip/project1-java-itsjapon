/**
 * @author      : thehunter101
 * @file        : Sumacont
 * @created     : viernes sep 09, 2022 19:54:49 -05
 */
package com.mycompany.app;
import java.io.*;
import java.lang.Math;
import java.util.Scanner;

public class Sumacont
{
    public static void main (String[] args)
    {
	Scanner sc = new Scanner(System.in);
	int n1, cont, sum;
	
	System.out.println("Escrba un numero > 0");
	n1 = sc.nextInt();
	System.out.println("Proceso");
	sum = 0;
	cont = 1;

	do
	{
		System.out.println(cont);
		sum = sum + cont;
		cont = ++cont;
	}while (cont <= n1);
	System.out.println("Respuesta: " + sum);
    }
}


