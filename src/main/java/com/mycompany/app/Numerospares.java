/**
 * @author      : thehunter101
 * @file        : Numerospares
 * @created     : viernes sep 16, 2022 13:24:58 -05
 */
package com.mycompany.app;
import java.io.*;
import java.lang.Math;
import java.util.Scanner;

public class Numerospares
{
    public static void main (String[] args)
    {
        int n1, cont, sum;
	Scanner sc = new Scanner(System.in);

	do{
		System.out.println("Escriba un numero mayor que 10");
		n1 = sc.nextInt();
	}while (n1 <= 10);

	sum = 0;
	cont = 0;

	do{
		sum = sum + 2;
		System.out.println(sum);
		cont = cont + 1;
	}while (sum != n1);

	System.out.println("En el numero: " + n1 + " hay " + cont + " pares");
    }
}


