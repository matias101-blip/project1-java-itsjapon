/**
 * @author      : thehunter101
 * @file        : MultiBucle
 * @created     : viernes sep 16, 2022 12:55:45 -05
 */
package com.mycompany.app;
import java.io.*;
import java.lang.Math;
import java.util.Scanner;
public class MultiBucle
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
       cont=2;

       do{
	       mult = cont*n1;
	       sum = mult + sum;
	       cont = cont + 2;
       }while (cont <= 18);

       sum = sum + n1;

       System.out.println("La suma de los 10 primeros multiplos de :" + n1 + " es: " + sum);
    }
}


