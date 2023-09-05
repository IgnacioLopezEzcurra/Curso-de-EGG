/*
EJERCICIO ANIMAL
Vamos a crear una clase Animal que tenga un método hacerRuido() que devuelva un saludo 
“Hola”. Luego haremos clase Perro y clase Gato que extiendan de Animal y sobreescriban el 
método hacerRuido() con el ruido que corresponda a cada uno. Luego, en el main vamos a crear 
un ArrayList de animales y los siguientes animales

Animal a = new Animal();
Animal b = new Perro();
Animal c = new Gato();

Agregaremos a la lista a cada uno y luego, con un for each, recorreremos la lista llamando al 
método hacerRuido() de cada ítem.

// MANOS A LA OBRA 2
Vamos a crear una interfaz con un método abstracto. Luego desde el main intentaremos instanciar 
un objeto a partir de la interfaz
 */
package herenciamanosobraanimal;

import herenciamanosobraanimal.entidades.Animal;
import herenciamanosobraanimal.entidades.Gato;
import herenciamanosobraanimal.entidades.Perro;
import java.util.ArrayList;

public class HerenciaManosObraAnimal {

    public static void main(String[] args) {

        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();

        ArrayList<Animal> lista = new ArrayList();

        lista.add(a);
        lista.add(b);
        lista.add(c);

        for (Animal animal : lista) {
            System.out.println(animal.hacerRuido());
        }

        System.out.println("---");
        a.soySer();
        System.out.println("---");
        b.soySer();
        System.out.println("---");
        c.soySer();

    }

}
