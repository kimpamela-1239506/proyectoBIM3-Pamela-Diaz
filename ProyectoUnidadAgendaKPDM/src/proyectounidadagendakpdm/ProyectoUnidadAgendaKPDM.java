package proyectounidadagendakpdm;

import java.util.Scanner;

/*
El programa debe ser capaz de almacenar 15 contactos, las características de cada contacto son
número de teléfono, nombre y domicilio. Para buscar un contacto se debe realizar a través del
número de teléfono.*/
public class ProyectoUnidadAgendaKPDM {

    static Contactos misContactos[] = new Contactos[15];

    static int contador = 0;

    public static void main(String[] args) {

        int op = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("----------------- AGENDA TELEFONICA -------------------");

        while (op != 4) {
            System.out.println("");
            System.out.println("--------- MENU ---------");
            System.out.println("1. Guardar Contacto");
            System.out.println("2. Ver Todos Los Contactos");
            System.out.println("3. Buscar un Contacto");
            System.out.println("4. Salir");
            System.out.println("");
            System.out.println("Ingrese el numero de opcion:");

            op = entrada.nextInt();

            System.out.println("------------------------------------");
            switch (op) {

                case 1 ->
                    guardarContacto();

                case 2 ->
                    verTodos();

//Se busca el contacto por el numero de telefono
                case 3 -> {

                    System.out.println("----- BUSCAR CONTACTO -----");

                    System.out.println("Ingrese el nombre del contacto porfavor: ");

                    String nombre = entrada.nextLine();

                    System.out.println(verContacto(nombre));

//Salir del programa
                }

                case 4 ->
                    System.out.println("Progama Finalizado");

                default ->
                    System.out.println("Opcion incorrecta");

            }

        }

    }

//crear nuevo contacto
    static public void guardarContacto() {

//al llegar a 15, aparece
        if (contador >= 15) {

            System.out.println("---------------------------------------");
            System.out.println("-------- La Agenda Esta Llena --------");
            System.out.println("---------------------------------------");

//si no, se ingresan los datos del nuevo contacto
        } else {

            Scanner teclado = new Scanner(System.in);

            System.out.println("----------- Nuevo Contacto -----------");

            System.out.println("Ingrese el nombre del Contacto");
            String nombre = teclado.nextLine();

            System.out.println("Ingrese el domicilio del Contacto");
            String domicilio = teclado.nextLine();

            System.out.println("Ingrese el numero del Contacto");
            String numerotel = teclado.nextLine();

//se almacena el dato con los atributos
            System.out.println("--- Dato almacenado! ---");

            misContactos[contador] = new Contactos(nombre, domicilio, numerotel);

            contador++;

        }

    }

//ver los datos del contacto
    static public void verTodos() {

        for (int i = 0; i < contador; i++) {

            System.out.println("Nombre: " + misContactos[i].verNombre());

            System.out.println("Domicilio: " + misContactos[i].verDomicilio());

            System.out.println("Numero de telefono: " + misContactos[i].verNumero());

            System.out.println("------------------------------------------------------------");

        }

    }

//buscar el contacto de manera individual
    static public String verContacto(String nombre) {

        int posicion = -1;

        for (int i = 0; i < 15; i++) {
            if (misContactos[i].verNombre().equals(nombre)) {
                posicion = i;

                break;

            }

        }

        if (posicion != -1) {
            return "Numero: " + misContactos[posicion].verNumero() + " Domicilio: " + misContactos[posicion].verDomicilio();

        } else {

            return "OPS!"
                    + "-- Lo sentimos! No hemos podido encontral al contacto --";

        }

    }
}
