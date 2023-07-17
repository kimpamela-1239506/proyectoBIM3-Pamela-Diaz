package proyectounidadagendakpdm;

public class Contactos {

    //atributos del contacto
    private String nombre, domicilio, numerotel;

    public Contactos(String nombre, String domicilio, String numerotel) {

        this.nombre = nombre;
        this.domicilio = domicilio;
        this.numerotel = numerotel;

    }

    public String verNombre() {
        return this.nombre;

    }

    public String verDomicilio() {
        return this.domicilio;

    }

    public String verNumero() {
        return this.numerotel;

    }
}
