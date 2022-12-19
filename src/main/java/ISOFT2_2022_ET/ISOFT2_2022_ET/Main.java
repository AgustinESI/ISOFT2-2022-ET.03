package ISOFT2_2022_ET.ISOFT2_2022_ET;

import java.util.Scanner;

import ISOFT2_2022_ET.ISOFT2_2022_ET.model.Cliente;


public class Main {
	public static final Scanner TECLADO = new Scanner(System.in);
	
	public static void main(String[] args) {
		Cliente c = new Cliente();
		System.out.println("Introduzca su edad: ");
		c.setEdad(leerEntero());
		System.out.println("¿Estudias o trabajas? Indique 't' si trabaja o 'f' si estudia: ");
		c.setEstudia_Trabaja(leerBooleanos());
		System.out.println("¿Vive con sus padres o en su propia vivienda? Indique 't' si vive con sus padres o 'f' en caso contrario: ");
		c.setViveSolo_VivePadres(leerBooleanos());
		System.out.println(c.tipoDeCuenta());
	}
	
	private static int leerEntero() {
		int valor = 0;
		try {
			valor = TECLADO.nextInt();
		} catch (Exception e) {
			System.out.println("No se pueden introducir caracteres");
		}

		return valor;
	}
	
	private static boolean leerBooleanos() {
		boolean valor = false;
		boolean control = false;
		
		while (!control) {
			String cadena = TECLADO.next();
			if (cadena.equalsIgnoreCase("t")) {
				valor = true;
				control = true;
			}
			if (cadena.equalsIgnoreCase("f")) {
				valor = false;
				control = true;
			}
			if (!control) {
				System.out.println("Debe introducir true o false.");
			}
		}
		
		return valor;
	}
}
