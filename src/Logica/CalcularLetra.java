package Logica;

/*
 * By Paco Gomez
 * Esta clase realiza el calculo
 * 
 * */
public class CalcularLetra {
	
	private String dni="";
	private int dni_numero=0;
	private char letra=' ';
	
	//El constructor recibe el DNI en formato String
	public CalcularLetra(String dni) {
		this.dni=dni;
	}
	
	//REaliza el calculo
	public char devolverLetra(){
		if(compruebaDigitos()){
			this.dni_numero=Integer.parseInt(this.dni);
			int posicion = calculaModulo();
			char[] letrasDni = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
			this.letra=letrasDni[posicion];
		}else
			System.out.println("Error: Debe insertar 8 digitos");
		return this.letra;
	}
	
	public boolean compruebaDigitos(){
		if(this.dni.matches("[0-9]{8}"))
			return true;
		return false;
	}
	
	public int calculaModulo(){
		return this.dni_numero%23;
	}
	
}

