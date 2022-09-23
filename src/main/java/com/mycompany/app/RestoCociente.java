/**
 * @author      : thehunter101
 * @file        : RestoCociente
 * @created     : viernes sep 09, 2022 14:17:01 -05
 */

package com.mycompany.app;

import java.lang.Math;
import java.util.Scanner;

import java.io.*;
public class RestoCociente
{
    public static void main (String[] args)
    {
	//Defino variables
        int n1, n2, cosi, resto;
	Scanner sc = new Scanner(System.in);
	
	//Entrada
	System.out.println("Ingrese su primer numerp: ");
	n1 = sc.nextInt();

	System.out.println("Ingrese su segundo numero: ");
	n2 = sc.nextInt();

	//Proceso
	cosi = n1 / n2;
	resto = Math.floorMod(n1, n2);
	
	//Salida
	System.out.println("Cosiente: "+cosi);
	System.out.println("Residuo: "+resto);

    }
}


