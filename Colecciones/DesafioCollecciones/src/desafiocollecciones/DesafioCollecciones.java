/*
Un hotel está alquilando habitaciones, y en esta temporada decidió realizar las reservas desde internet. el
hotel cuenta con 10 Habitaciones, de las cuales:
Habitacion 1 - 5: Entran 2 personas
Habitacion 6 - 8: Entran hasta 3 personas
Habitacion 9 - 10: Entra 1 sola persona
Realizar un programa en donde se muestren la siguiente información:

• Persona (Nombre, Edad, DNI, País)
• Habitacion (Numero de habitacion, fecha de ocupacion si tuviera)
• Reserva (ID, Numero de habitación, cantidad de personas, fechas)
• Alojamiento (una vez que la reserva es ocupada por las personas, pasa a ser un alojamiento, en donde
será necesario guardar el id de la reserva)

    IMPORTANTE
    • Se debe realizar un CRUD que sea necesario. (Crear, Leer, Modificar o Eliminar)
    • El programa debe tener un menú para las diferentes opciones.
    • Podrás crear los métodos que sean necesarios para que el programa sea más completo.
    • Se deberá subir a GitHub y compartir entre integrantes del mismo equipo.
    • Se deberán realizar las pruebas unitarias en JUnit para los métodos creados. (Solo si sobra tiempo)

 */
package desafiocollecciones;

import desafiocollecciones.servicios.HotelServicios;
import java.util.Scanner;

public class DesafioCollecciones {

    public static void main(String[] args) {
        
        HotelServicios hs = new HotelServicios();
        
//        hs.buscarHabitacion(1);

        /*Entro a una pag en internet del hotel, yo aqui quiero ver la informacion
        
        ---Bienvenido al mejor Hotel del Mundo---
        Que desea realizar?
        
        
        
        1-Ver informacion del hotel (descripcion de habitaciones: cantidad y capacidad) 
            - ver informacion de reservas realizadas
            - ver informacion de reservas disponibles
        
        2- Realizar una reserva: Se debe ingresar los datos de la persona que reserva, y esta persona
        debe indicar cuantas personas se alojarán en el hotel, fecha de ingreso y egreso, 
        una vez hecha la reserva SE DEBE CREAR EL ALOJAMIENTO.
        3- Si alcanza el tiempo y me pongo exquisito se podria hacer un metodo para cancelar reserva
        4- y otro para modificar reserva.
        5- Salir.
        
         */
        boolean bandera = true;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        while (bandera) {

            System.out.println("---Bienvenido al mejor Hotel del Mundo---");
            System.out.println("\n Que desea relizar?");
            System.out.println("\n  1-Ver informacion del hotel (descripcion de habitaciones: cantidad y capacidad) "
                    + "\n  2- Realizar una reserva"
                    + "\n 3- Si alcanza el tiempo y me pongo exquisito se podria hacer un metodo para cancelar reserva"
                    + "\n 4- y otro para modificar reserva."
                    + "\n 5- Salir.");

            System.out.print("\n Ingrese una opcion: ");
            int op = leer.nextInt();

            switch (op) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                default:
                    System.out.println("La opcion es inválida");
                    break;
            }

        } leer.close();
        
        System.out.println("Gracias por utilizar nuestros servicios ☻");

    }

}
