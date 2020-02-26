package account;

public class Main {

	public static void main(String[] args) {
		Password p = new Password();
		Cuenta alan = new Cuenta("Alan", 200.0,p);
		alan.mostrarEstado();
	}

}
