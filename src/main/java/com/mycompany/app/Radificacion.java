/**
 * @author      : thehunter101
 * @file        : Radificacion
 * @created     : viernes sep 09, 2022 17:48:42 -05
 */
package com.mycompany.app;
import java.io.*;
import java.util.Scanner;
import java.lang.Math;

public class Radificacion
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
	double  n1, n2, result;
	
	System.out.println("Escriba un numero:");
	n1 = sc.nextInt();

	System.out.println("Escriba otro numero:");
	n2 = sc.nextInt();
	
	
	double radi = n1 / n2;

	do{
		result = radi;
		radi = (result +(n1 / result)) / n2;
	}while ((result - radi)!=0);

	System.out.println("Raiz; " + radi);


    }
}


