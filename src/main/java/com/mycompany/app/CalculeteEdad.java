/*
 * CalculeteEdad.java
 * 
 * Copyright 2022 Unknown <thehunter101@Subaru-Dell>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., import java.io.*;
import java.lang.Math;51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 */
package com.mycompany.app;
import java.io.*;
import java.lang.Math;
import java.util.Scanner;

public class CalculeteEdad {
	
	public static void main (String[] args) {
		//Defino variables
		Scanner sc = new Scanner(System.in);
		int año_a, año_n, edad;
		
		//Ingreso valores
		do{
			System.out.println("Ingrese el año actual: ");
			año_a = sc.nextInt();
			}while (año_a < 1900);
		
		do {
			System.out.println("Ingrese su año de nacimiento: ");
			año_n = sc.nextInt();
			} while (año_a < año_n);
		
		//Proceso
		edad = año_a - año_n;
		
		//Condicion
		if(edad >= 18)
		{
			System.out.println("Usted tiene: " + edad + " años" + " ,es mayor de edad");
		}
		else
		{
			System.out.println("Usted tiene: " + edad + " años" + " ,es menor de edad");
		}
	}

}
