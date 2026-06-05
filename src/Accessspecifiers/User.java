package Accessspecifiers;

public class User {

    public String nombre;
    protected String correo;
    String tipoCuenta;
    private String contrasena;

    public User(String nombre, String correo, String tipoCuenta, String contrasena) {
        this.nombre = nombre;
        this.correo = correo;
        this.tipoCuenta = tipoCuenta;
        this.contrasena = contrasena;
    }

    public void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
    }

    protected void mostrarCorreo() {
        System.out.println("Correo: " + correo);
    }

    void mostrarTipoCuenta() {
        System.out.println("Tipo de cuenta: " + tipoCuenta);
    }

    private void mostrarContrasena() {
        System.out.println("Contraseña: " + contrasena);
    }

    public void mostrarInformacionGeneral() {
        mostrarNombre();
        mostrarCorreo();
        mostrarTipoCuenta();
        mostrarContrasena();
    }
}