/**
 * @author      : thehunter101
 * @file        : Promedio
 * @created     : lunes sep 19, 2022 23:24:55 -05
 */

package com.mycompany.app;
import java.io.*;
import java.lang.Math;
import java.util.Scanner;
public class PromedioDecre
{
    public static void main (String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int n1, sum, cont;
      int div;

      do{
	      System.out.println("Escriba un numero mayor que 0");
	      n1 = sc.nextInt();
      }while (n1 <= 0);

      sum=0;
      cont=n1;

      do{
	      sum = sum + cont;
	      cont = --cont;
      }while (cont != 0);

      div = sum / n1;


      System.out.println("El promedio de " + n1 + " es: " + div);
    }
}


