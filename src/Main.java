public class Main {


    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 43;
        cliente.nombre = "Marta Sanchez";
        cliente.telefono = 55554444;
        cliente.credito = 2000000.50F;

        System.out.print("edad del cliente: "); System.out.println(cliente.edad);
        System.out.print("nombre del cliente: ");System.out.println(cliente.nombre);
        System.out.print("telefono del cliente: ");System.out.println(cliente.telefono);
        System.out.print("credito del cliente: ");System.out.println(cliente.credito);

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 30;
        trabajador.nombre = "Marta Sanchez";
        trabajador.telefono = 55554444;
        trabajador.salario = 1000000.50F;

        System.out.println("");
        System.out.print("edad del trabajador: "); System.out.println(trabajador.edad);
        System.out.print("nombre del trabajador: ");System.out.println(trabajador.nombre);
        System.out.print("telefono del trabajador: ");System.out.println(trabajador.telefono);
        System.out.print("salario del trabajador: ");System.out.println(trabajador.salario);
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;

}

class Cliente extends Persona {
    float credito;
}

class Trabajador extends Persona {

    float salario;
}
