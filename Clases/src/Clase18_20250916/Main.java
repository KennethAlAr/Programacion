package Clase18_20250916;

public class Main {
    public static void main (String[] args){

        Usuario user = new Usuario("PEPE", "pepe@email.com");
        Usuario admin = new Administrador("María", "maria@email.com", "Gestor");
        Usuario client = new Cliente ("Juan", "juan@email.com", 50);

        Usuario[] usuarios = {user, admin, client};

        for (Usuario u : usuarios){
            if(u instanceof Administrador){
                System.out.println("Administrador");
                u.mostrarInfo();
            }else if (u instanceof Cliente){
                System.out.println("Cliente");
                u.mostrarInfo();
            }else{
                System.out.println("Usuario");
                u.mostrarInfo();
            }
        }

    }
}
