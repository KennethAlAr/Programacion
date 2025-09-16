package Clase18_20250916;

public class Usuario {
    //Protected es un atributo que solo pueden ver las clases hijas
    protected String nombre;
    protected String email;

    public Usuario(String nombre, String email){
        this.nombre = nombre;
        this.email = email;
    }

    public void mostrarInfo(){
        System.out.println("Usuario genérico: " + nombre + " - " + email);
    }
}
