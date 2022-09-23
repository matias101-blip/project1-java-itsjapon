/**
 * @author      : thehunter101
 * @file        : NumerosInversos
 * @created     : viernes sep 09, 2022 18:48:30 -05
 */

package com.mycompany.app;
import java.io.*;
import java.lang.Math;
import java.util.Scanner;

public class NumerosInversos
{
    public static void main (String[] args)
    {
	int res, n1, invertir;
	Scanner sc = new Scanner(System.in);
	
	do
	{
		System.out.println("Ingrese un numero de 5 diguitos: ");
		n1 = sc.nextInt();
	}while (n1 >= 99999);
	
	invertir=0;

	do
	{
		res = n1 % 10;
		invertir = invertir *10 + res;
		n1 = n1 / 10;
	}while (n1 != 0);
	System.out.println(invertir);
    }
}


