package ISOFT2_2022_ET.ISOFT2_2022_ET.model;

import ISOFT2_2022_ET.ISOFT2_2022_ET.exceptions.NumerosValidosException;
import ISOFT2_2022_ET.ISOFT2_2022_ET.exceptions.SinCuentaException;

public class Cliente {
	int edad;
	boolean estudiaTrabaja;
	boolean viveSoloVivePadres;
	
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
		return estudiaTrabaja;
	}


	public void setEstudia_Trabaja(boolean estudiaTrabaja) {
		this.estudiaTrabaja = estudiaTrabaja;
	}


	public boolean getViveSolo_VivePadres() {
		return viveSoloVivePadres;
	}


	public void setViveSolo_VivePadres(boolean viveSoloVivePadres) {
		this.viveSoloVivePadres = viveSoloVivePadres;
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
		
		if(getEdad() > 18 && !getEstudia_Trabaja() && getViveSolo_VivePadres()) {
			throw new SinCuentaException("No tiene cuenta.");
		}
		
		if(getEdad() < 18 && getEstudia_Trabaja()) {
			throw new SinCuentaException("No tiene cuenta.");
		}
		
		if(getEdad() > 25 && !getEstudia_Trabaja()) {
			throw new SinCuentaException("No tiene cuenta.");
		}
		
		return cadena;
	}
}
