import java.io.*;
import java.lang.Math;

public class MayorQue {
	
	public static void main (String[] args) {
		//Defino variables
		int n1, n2;
		int mayor;
		
		//Meto valores
		n1=10;
		n2=20;
		
		//Condicional
		if (n1>n2)
		{
			mayor=n1;
		}
		else
		{
			mayor=n2;
		}
		
		//Salida
		System.out.println("El numero mayor es " + mayor);
	}
}

