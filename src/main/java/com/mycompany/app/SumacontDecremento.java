/**
 * @author      : thehunter101
 * @file        : SumacontDecremento
 * @created     : miércoles sep 21, 2022 22:39:26 -05
 */

package com.mycompany.app;
import java.util.Scanner;
import java.lang.Math;
import java.io.*;
public class SumacontDecremento
{
    public static void main (String[] args)
    {
        /*Defino variables*/
	Scanner sc = new Scanner(System.in);/*Esta linia sirve para poder guardar la entrada del teclado en una varible*/
	int n1, cont, sum;

	/*Primer bucle*/
	do{
		System.out.println("Escriba un numero mayor que 0");
		n1 = sc.nextInt();		
	}while (n1 <= 0);

	/*Defino variables*/
	sum = 0;
	cont = n1;

	/*Segundo bucle*/
	do{
		sum = sum + cont;
		cont = --cont;
	}while (cont != 0);

	System.out.println("La suma secuencial de: " + n1 + " es: " + sum);
    }
}

