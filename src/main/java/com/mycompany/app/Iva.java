/**
 * @author      : thehunter101
 * @file        : Iva
 * @created     : viernes sep 09, 2022 16:20:15 -05
 */
package com.mycompany.app;
import java.util.Scanner;
import java.io.*;
import java.lang.Math;
public class Iva
{
    public static void main (String[] args)
    {
       double iva, pv, valor;
       Scanner sc = new Scanner(System.in);

       System.out.println("Ingrese valor del producto: ");
       valor = sc.nextInt();
       
       iva=0.19;
       iva = valor*0.19;

       pv= valor + iva;

       System.out.println("Iva: " + iva + " / " + "Precio de Vente: " + pv);
    }
}


