package Initializerblock;

public class BankAccount {

	    String titular;
	    double saldo;
	    static String banco;

	    static {
	        banco = "Banco Estudiantil";
	        System.out.println("Bloque static ejecutado: banco asignado.");
	    }

	    {
	        saldo = 100.00;
	        System.out.println("Bloque inicializador ejecutado: saldo inicial agregado.");
	    }

	    public BankAccount(String titular) {
	        this.titular = titular;
	        System.out.println("Constructor ejecutado para: " + titular);
	    }

	    public void mostrarCuenta() {
	        System.out.println("Banco: " + banco);
	        System.out.println("Titular: " + titular);
	        System.out.println("Saldo: Q" + saldo);
	    }

	    public static void main(String[] args) {

	    	BankAccount cuenta1 = new BankAccount("Gabriel");
	        cuenta1.mostrarCuenta();

	        System.out.println();

	        BankAccount cuenta2 = new BankAccount("Angel ");
	        cuenta2.mostrarCuenta();
	    }
	}
	