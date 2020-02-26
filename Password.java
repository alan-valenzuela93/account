package account;

import java.util.Random;

public class Password {
	private int longitud =15;
	private String contraseña;
	private Random randomGenerator = new Random();
	private String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private String minusculas = mayusculas.toLowerCase();
	private String numeros = "0123456789";
	private String todo = mayusculas + minusculas + numeros;
	private int aleatoria;
	
	public Password() {		
		
		this.contraseña = generarPassword();
		while(esFuerte(this.contraseña)==false) {
			this.contraseña = generarPassword();
		}
	}

	public String generarPassword() {
		String nueva ="";
		for(int i =0;i<this.longitud;i++) {
			this.aleatoria = randomGenerator.nextInt(todo.length());
			nueva += todo.charAt(aleatoria);
		}
		return nueva;
	}
	
	public int cantidadMayusculas(String password) {
		int cant =0;
		for(int j =0;j<mayusculas.length();j++) {
			for(int i=0;i<password.length();i++) {
				if(mayusculas.charAt(j)==password.charAt(i)) {
					cant++;
				}
			}
			
		}
		return cant;
	}
	
	public int cantidadMinusculas(String password) {
		int cant =0;
		for(int j =0;j<minusculas.length();j++) {
			for(int i=0;i<password.length();i++) {
				if(minusculas.charAt(j)==password.charAt(i)) {
					cant++;
				}
			}
		}
		return cant;
	}
	
	public int cantidadNumeros(String password) {
		int cant =0;
		for(int j =0;j<numeros.length();j++) {
			for(int i=0;i<password.length();i++) {
				if(numeros.charAt(j)==password.charAt(i)) {
					cant++;
				}
			}
			
		}
		return cant;
	}
	
	
	public boolean esFuerte(String password) 
	{
		boolean fuerte = false;
		if(cantidadMayusculas(password)>=2 && cantidadMinusculas(password) >=1 && cantidadNumeros(password)>=3)
		{
			fuerte = true;
		}
		
		return fuerte;
	}

}
