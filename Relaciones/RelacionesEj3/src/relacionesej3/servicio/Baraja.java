/*
3. Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o 
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de 
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero 
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna 
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y 
luego se llama al método, este no mostrara esa primera carta.
 */
package relacionesej3.servicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import relacionesej3.entidades.Carta;

public class Baraja {

    private ArrayList<Carta> baraja;
    private Scanner leer;
    private Collections c;

    public Baraja() {
        baraja = new ArrayList();
        leer = new Scanner(System.in).useDelimiter("\n");
    }

    public Baraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }

    public ArrayList<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }

    @Override
    public String toString() {
        return "Baraja{" + "baraja=" + baraja + ", leer=" + leer + '}';
    }

    public void cargarBaraja() {

        for (int i = 0; i < 12; i++) {

            if (i + 1 == 8 || i + 1 == 9) {
                //NADA
            } else {
                Carta c = new Carta(String.valueOf(i + 1), "Espada");
                baraja.add(c);
            }

        }

        for (int i = 0; i < 12; i++) {

            if (i + 1 == 8 || i + 1 == 9) {
                //NADA
            } else {
                Carta c = new Carta(String.valueOf(i + 1), "Basto");
                baraja.add(c);
            }

        }

        for (int i = 0; i < 12; i++) {

            if (i + 1 == 8 || i + 1 == 9) {
                //NADA
            } else {
                Carta c = new Carta(String.valueOf(i + 1), "Oro");
                baraja.add(c);
            }

        }

        for (int i = 0; i < 12; i++) {

            if (i + 1 == 8 || i + 1 == 9) {
                //NADA
            } else {
                Carta c = new Carta(String.valueOf(i + 1), "Copa");
                baraja.add(c);
            }

        }

        System.out.println("Baraja cargada correctamente");

    }

    public void barajar() {
        c.shuffle(baraja);
        System.out.println("\n Mazo barajeado correctamente.");
    }

    public void mostrarBaraja() {

        if (baraja.size() == 0) {
            System.out.println("No hay mas cartas en el mazo.");
        } else {

            for (Carta carta : baraja) {
                System.out.println(carta);
            }

        }

    }

    public void cartasMonton() {

        if (baraja.size() == 0) {
            System.out.println("\n No hay cartas que se hayan entregado.");
        } else {

            for (Carta carta : baraja) {
                System.out.println(carta);
            }

        }

    }

    public void siguienteCarta() {

        if (baraja.size() == 0) {
            System.out.println("\nNo quedan mas cartas en el mazo.");
        } else {

            System.out.println("\nLa siguiente carta es " + baraja.get(0));

        }

    }

    public void cartasDisponibles() {

        System.out.println("\nCartas disponibles: " + baraja.size());

    }

    public void darCartas(Baraja mazoQueRecibe) {

        int cant = 0;
        System.out.println("\nIndique la cantidad de cartas que desea obtener: ");
        cant = leer.nextInt();

        if (baraja.size() < cant || baraja.size() == 0) {
            System.out.println("\nEl mazo no dispone de la cantidad que pide");
        } else {
//        for (int i = 0; i < cant; i++) {
//            System.out.println("\nSe entrega la carta " + baraja.get(i));
//            Carta cartaQueAgrego = baraja.get(i);
//            mazoQueRecibe.baraja.add(cartaQueAgrego);
//            baraja.remove(i);
//         } ASI LO PENSE YO ORIGINALMENTE
            ArrayList<Carta> cartasEntregadas = new ArrayList<>();

            for (int i = 0; i < cant; i++) {
                System.out.println("\nSe entrega la carta " + baraja.get(i));
                Carta cartaQueAgrego = baraja.get(i);
                cartasEntregadas.add(cartaQueAgrego);
            }

            baraja.removeAll(cartasEntregadas);
            mazoQueRecibe.baraja.addAll(cartasEntregadas);
        }

    }

}
