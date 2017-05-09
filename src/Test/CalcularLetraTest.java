package Test;

import static org.junit.Assert.*;

import javax.swing.JButton;
import javax.swing.JTextField;

import org.junit.Test;

import Logica.CalcularLetra;

public class CalcularLetraTest {

	@Test
	public void test() {
		//Campo de texto de prueba para representar el DNI introducido por el usuario
		JTextField dni = new JTextField("44891334");
		//Creamos una instancia de CalcularLetra
		CalcularLetra cl = new CalcularLetra(dni.getText());
		
		//Comprobamos si pasa el test
		assertEquals(cl.devolverLetra(),'A');		
	}

}
