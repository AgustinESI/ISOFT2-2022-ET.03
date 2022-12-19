package ISOFT2_2022_ET.ISOFT2_2022_ET.model;

import ISOFT2_2022_ET.ISOFT2_2022_ET.exceptions.NumerosValidosException;

public class Cliente {
	int edad;
	boolean estudia;
	boolean viveConSusPadres;
	
	public Cliente() {
		super();
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean getEstudia() {
		return estudia;
	}

	public void setEstudia(boolean estudia) {
		this.estudia = estudia;
	}

	public boolean getViveConSusPadres() {
		return viveConSusPadres;
	}

	public void setViveConSusPadres(boolean viveConSusPadres) {
		this.viveConSusPadres = viveConSusPadres;
	}
	
	public String tipoDeCuenta() {
		String cadena = null;
		
		if (getEdad() < 0) {
			throw new NumerosValidosException("Numeros negativos no validos");
		}
		
		if (getEdad() < 18 && getEstudia() && getViveConSusPadres()) {
			cadena = "Cuenta Confort";
		} else if (getEdad() < 25 && getEstudia() && !getViveConSusPadres()) {
			cadena = "Cuenta Vamos que tu puedes";
		} else if (getEdad() >= 18 && !getEstudia()){
			if (getViveConSusPadres()) {
				cadena = "Cuenta Ahorra ahora que puedes";
			} else {
				cadena = "Cuenta Saltando del Nido";
			}
		} else {
			if (getViveConSusPadres()) {
				cadena = "Cuenta Independizate que va siendo hora";
			} else {
				cadena = "Cuenta Bienvenido a la Vida Adulta";
			}
		}
		
		if (getEdad() < 18 && getEstudia() && getViveConSusPadres()) {
			cadena = "Cuenta Confort";
		}
		if (getEdad() < 25 && getEstudia() && !getViveConSusPadres()) {
			cadena = "Cuenta Vamos que tu puedes";
		}
		if (getEdad() >= 18 && !getEstudia()){
			if (getViveConSusPadres()) {
				cadena = "Cuenta Ahorra ahora que puedes";
			} else {
				cadena = "Cuenta Independízate que va siendo hora";
			}
		}
		if (getEdad() > 25 && !getEstudia()){
			if (getViveConSusPadres()) {
				cadena = "Cuenta Independizate que va siendo hora";
			} else {
				cadena = "Cuenta Bienvenido a la Vida Adulta";
			}
		}
		
		return cadena;
	}
}
