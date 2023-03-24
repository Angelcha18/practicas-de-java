public class tarea4 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        cliente.laEdad = 18;
        cliente.elTelefono = 1866305853;
        cliente.nombre = "angel";
        cliente.credito = 250;
        System.out.println("Soy " + cliente.nombre + ", tengo " + cliente.laEdad + " años y mi telefono es " + cliente.elTelefono
                + " y mi credito disponible es " + cliente.credito + "€");

        trabajador.elTelefono = 1265345953;
        trabajador.laEdad = 20;
        trabajador.nombre = "anderson";
        trabajador.salario = 1200;
        System.out.println("Soy " + trabajador.nombre + ", tengo " + trabajador.laEdad + " años y mi telefono es " + trabajador.elTelefono
                + " y mi salario es de " + trabajador.salario + "€");
    }
}
    class Persona {
        int laEdad;
        String nombre;
        int elTelefono;
    }
    class Cliente extends Persona{
        double credito;
    }

    class Trabajador extends Persona{
    double salario;
    }

