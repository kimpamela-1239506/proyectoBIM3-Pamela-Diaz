package proyectounidadagendakpdm;

import java.util.Scanner;

/*
El programa debe ser capaz de almacenar 15 contactos, las características de cada contacto son
número de teléfono, nombre y domicilio. Para buscar un contacto se debe realizar a través del
número de teléfono.*/
public class ProyectoUnidadAgendaKPDM {

    public static void main(String[] args) {
        int op = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("--------- MENU ---------");
        System.out.println("1. Guardar Contacto");
        System.out.println("2. Ver Todos Los Contactos");
        System.out.println("3. Buscar un Contacto");
        System.out.println("4. Salir");
        System.out.println("");
        System.out.println("Ingrese el numero de opcion:");
        op = entrada.nextInt();
        System.out.println("------------------------------------");
        if (op == 1) {

        } else if (op == 2) {

            System.out.println("----- Los Datos Del Contacto Son: -----");

        } else if (op == 3) {

            System.out.println("Progama Finalizado");

        } else {

            System.out.println("Opcion incorrecta");

        }

    }

    static public void guardarContacto() {

        if (contador >= 2) {

            System.out.println("---------------------------------------");

            System.out.println("-------- La Agenda Esta Llena --------");

            System.out.println("---------------------------------------");

        } else {

            Scanner teclado = new Scanner(System.in);

            System.out.println("-------------- Nuevo Contacto --------------");
            System.out.println("Ingrese el nombre del Contacto");
            String nombre = teclado.nextLine();

            System.out.println("Ingrese el domicilio del Contacto");
            String domicilio = teclado.nextLine();

            System.out.println("Ingrese el numero del Contacto");
            String numerotel = teclado.nextLine();

            System.out.println("Dato almacenado");

        }

    }
}
