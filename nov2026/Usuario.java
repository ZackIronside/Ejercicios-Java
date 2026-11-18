public class Usuario extends Persona {
    public String correo;
    public String contrasena;

    public Usuario(String correo, String contrasena, String nombre, int edad, String sexo, String apellido, int anios, String orientacion) {
        super(nombre, edad, sexo);
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public void informacionUsuario() {
        System.out.println("Correo: " + correo);
        System.out.println("Contraseña: " + contrasena);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
    }
}
