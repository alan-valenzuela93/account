package account;

public class Cuenta {
	private String titular;
	private double cantidad;
	private String contraseña;
	
	public Cuenta(String titular, double cantidad,Password contraseña) {
		this.titular = titular;
		this.cantidad = cantidad;
		this.contraseña = contraseña.generarPassword();
	}
	
	public void ingresar(double monto) {
		this.cantidad += monto;
	}
	
	public void retirar(double monto) {
		this.cantidad -=monto;
		if(monto<0) {
			this.cantidad =0;
		}
	}
		
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getCantidad() {
		return cantidad;
	}
	
	@Override
	public String toString() {
		return "Saldo: " + cantidad;
	}

	public void mostrarEstado() {
		System.out.println("Nombre del titular: " + this.titular);
		System.out.println(toString());
		System.out.println("Su contraseña es: "+this.contraseña);
	}
}
