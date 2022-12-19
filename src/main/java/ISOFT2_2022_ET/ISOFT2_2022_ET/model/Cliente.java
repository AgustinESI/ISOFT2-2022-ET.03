package ISOFT2_2022_ET.ISOFT2_2022_ET.model;

import ISOFT2_2022_ET.ISOFT2_2022_ET.exceptions.NumerosValidosException;

public class Cliente {
	int edad;
	boolean estudia_Trabaja;
	boolean viveSolo_VivePadres;
	
	public Cliente() {
		super();
	}

	
	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public boolean getEstudia_Trabaja() {
		return estudia_Trabaja;
	}


	public void setEstudia_Trabaja(boolean estudia_Trabaja) {
		this.estudia_Trabaja = estudia_Trabaja;
	}


	public boolean getViveSolo_VivePadres() {
		return viveSolo_VivePadres;
	}


	public void setViveSolo_VivePadres(boolean viveSolo_VivePadres) {
		this.viveSolo_VivePadres = viveSolo_VivePadres;
	}


	public String tipoDeCuenta() {
		String cadena = "No existe ninguna coincidencia";
		
		if (getEdad() < 0) {
			throw new NumerosValidosException("Numeros negativos no validos");
		}
		
		if (getEdad() < 18 && !getEstudia_Trabaja() && getViveSolo_VivePadres()) {
			cadena = "Cuenta Confort";
		}
		if (getEdad() < 25 && !getEstudia_Trabaja() && !getViveSolo_VivePadres()) {
			cadena = "Cuenta Vamos que tu puedes";
		}
		if (getEdad() >= 18 && getEstudia_Trabaja()) {
			if (getViveSolo_VivePadres()) {
				cadena = "Cuenta Ahorra ahora que puedes";
			} else {
				cadena = "Cuenta Saltando del Nido";
			}
		}
		if (getEdad() > 25 && getEstudia_Trabaja()) {
			if (getViveSolo_VivePadres()) {
				cadena = "Cuenta Independizate que va siendo hora";
			} else {
				cadena = "Cuenta Bienvenido a la Vida Adulta";
			}
		}
		
		return cadena;
	}
}
