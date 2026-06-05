package Accessspecifiers;

public class PremiumUser extends User {

	    public PremiumUser(String nombre, String correo, String tipoCuenta, String contrasena) {
	        super(nombre, correo, tipoCuenta, contrasena);
	    }

	    public void mostrarBeneficios() {
	        System.out.println("Usuario premium con acceso a funciones especiales.");

	        System.out.println("Acceso public: " + nombre);
	        System.out.println("Acceso protected: " + correo);
	        System.out.println("Acceso default: " + tipoCuenta);

	        
	    }
	}