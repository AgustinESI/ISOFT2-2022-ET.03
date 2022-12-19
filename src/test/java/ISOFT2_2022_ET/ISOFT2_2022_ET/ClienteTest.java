package ISOFT2_2022_ET.ISOFT2_2022_ET;

import static org.junit.Assert.*;

import org.junit.Test;

import ISOFT2_2022_ET.ISOFT2_2022_ET.exceptions.SinCuentaException;
import ISOFT2_2022_ET.ISOFT2_2022_ET.model.Cliente;

public class ClienteTest {

	@Test(expected = SinCuentaException.class)
	public void cdp1() {
		Cliente cliente = new Cliente();
		cliente.setEdad(24);
		cliente.setEstudia_Trabaja(false);
		cliente.setViveSolo_VivePadres(true);
		
		cliente.tipoDeCuenta();
	}

	@Test(expected = SinCuentaException.class)
	public void cdp2() {
		Cliente cliente = new Cliente();
		cliente.setEdad(15);
		cliente.setEstudia_Trabaja(true);
		cliente.setViveSolo_VivePadres(true);
		
		cliente.tipoDeCuenta();
	}
	
	@Test()
	public void cdp3() {
		Cliente cliente = new Cliente();
		cliente.setEdad(15);
		cliente.setEstudia_Trabaja(false);
		cliente.setViveSolo_VivePadres(false);
		
		assertEquals(cliente.tipoDeCuenta(), "Cuenta Vamos que tu puedes");
	}
	
	@Test()
	public void cdp4() {
		Cliente cliente = new Cliente();
		cliente.setEdad(15);
		cliente.setEstudia_Trabaja(false);
		cliente.setViveSolo_VivePadres(true);
		
		assertEquals(cliente.tipoDeCuenta(), "Cuenta Confort");
	}
	
	@Test(expected = SinCuentaException.class)
	public void cdp5() {
		Cliente cliente = new Cliente();
		cliente.setEdad(30);
		cliente.setEstudia_Trabaja(false);
		cliente.setViveSolo_VivePadres(false);
		
		cliente.tipoDeCuenta();
	}
	
	@Test()
	public void cdp6() {
		Cliente cliente = new Cliente();
		cliente.setEdad(24);
		cliente.setEstudia_Trabaja(true);
		cliente.setViveSolo_VivePadres(false);
		
		assertEquals(cliente.tipoDeCuenta(), "Cuenta Saltando del Nido");
	}
	
	@Test()
	public void cdp7() {
		Cliente cliente = new Cliente();
		cliente.setEdad(24);
		cliente.setEstudia_Trabaja(false);
		cliente.setViveSolo_VivePadres(false);
		
		assertEquals(cliente.tipoDeCuenta(), "Cuenta Vamos que tu puedes");
	}
	
	@Test()
	public void cdp8() {
		Cliente cliente = new Cliente();
		cliente.setEdad(24);
		cliente.setEstudia_Trabaja(true);
		cliente.setViveSolo_VivePadres(true);
		
		assertEquals(cliente.tipoDeCuenta(), "Cuenta Ahorra ahora que puedes");
	}
	
	@Test(expected = SinCuentaException.class)
	public void cdp9() {
		Cliente cliente = new Cliente();
		cliente.setEdad(15);
		cliente.setEstudia_Trabaja(true);
		cliente.setViveSolo_VivePadres(false);
		
		cliente.tipoDeCuenta();
	}
	
	@Test(expected = SinCuentaException.class)
	public void cdp10() {
		Cliente cliente = new Cliente();
		cliente.setEdad(30);
		cliente.setEstudia_Trabaja(false);
		cliente.setViveSolo_VivePadres(true);
		
		cliente.tipoDeCuenta();
	}
	
	@Test()
	public void cdp11() {
		Cliente cliente = new Cliente();
		cliente.setEdad(30);
		cliente.setEstudia_Trabaja(true);
		cliente.setViveSolo_VivePadres(false);
		
		assertEquals(cliente.tipoDeCuenta(), "Cuenta Bienvenido a la Vida Adulta");
	}
	
	@Test()
	public void cdp12() {
		Cliente cliente = new Cliente();
		cliente.setEdad(30);
		cliente.setEstudia_Trabaja(true);
		cliente.setViveSolo_VivePadres(true);
		
		assertEquals(cliente.tipoDeCuenta(), "Cuenta Independizate que va siendo hora");
	}
	
}
