/*
7. Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, 
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro 
atributo, puede hacerlo. Los métodos que se implementarán son: 
 Un constructor por defecto. 
 Un constructor con todos los atributos como parámetro. 
 Métodos getters y setters de cada atributo. 
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos 
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto 
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o 
O. Si no es correcto se deberá mostrar un mensaje 
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en 
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, 
significa que la persona está por debajo de su peso ideal y la función devuelve un -1. 
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la 
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado 
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la 
función devuelve un 1. 
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función 
devuelve un booleano. 
A continuación, en la clase main hacer lo siguiente: 
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos 
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, 
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la 
persona es mayor de edad. 
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en 
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas 
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y 
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores 
 */
package pooej7;

public class POOEj7 {

    public static void main(String[] args) {

        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();

        p1.crearPersona();
        p1.calcularIMC();
        if (p1.calcularIMC() == -1) {
            System.out.println("La persona está por debajo de un peso ideal");
        } else if (p1.calcularIMC() == 0) {
            System.out.println("La persona esta en su peso ideal");
        } else if (p1.calcularIMC() == 1) {
            System.out.println("La persona tiene sobrepeso");
        }
        int ideal1 = p1.calcularIMC();
        System.out.println("Es mayor de edad?");
        System.out.println(p1.esMayorDeEdad());
        boolean mayor1 = p1.esMayorDeEdad();

        p2.crearPersona();
        p2.calcularIMC();
        if (p2.calcularIMC() == -1) {
            System.out.println("La persona está por debajo de un peso ideal");
        } else if (p2.calcularIMC() == 0) {
            System.out.println("La persona esta en su peso ideal");
        } else if (p2.calcularIMC() == 1) {
            System.out.println("La persona tiene sobrepeso");
        }
        int ideal2 = p2.calcularIMC();
        System.out.println("Es mayor de edad?");
        System.out.println(p2.esMayorDeEdad());
        boolean mayor2 = p2.esMayorDeEdad();
//        
        p3.crearPersona();
        p3.calcularIMC();
        if (p3.calcularIMC() == -1) {
            System.out.println("La persona está por debajo de un peso ideal");
        } else if (p3.calcularIMC() == 0) {
            System.out.println("La persona esta en su peso ideal");
        } else if (p3.calcularIMC() == 1) {
            System.out.println("La persona tiene sobrepeso");
        }
        int ideal3 = p3.calcularIMC();
        System.out.println("Es mayor de edad?");
        System.out.println(p3.esMayorDeEdad());
        boolean mayor3 = p3.esMayorDeEdad();
//        
        p4.crearPersona();
        p4.calcularIMC();
        if (p4.calcularIMC() == -1) {
            System.out.println("La persona está por debajo de un peso ideal");
        } else if (p4.calcularIMC() == 0) {
            System.out.println("La persona esta en su peso ideal");
        } else if (p4.calcularIMC() == 1) {
            System.out.println("La persona tiene sobrepeso");
        }
        int ideal4 = p4.calcularIMC();
        System.out.println("Es mayor de edad?");
        System.out.println(p4.esMayorDeEdad());
        boolean mayor4 = p4.esMayorDeEdad();

//        calcular un porcentaje de esas 4 personas 
//        cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y 
//        también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores 
        int total_pes[] = new int[4];
        total_pes[0] = ideal1;
        total_pes[1] = ideal2;
        total_pes[2] = ideal3;
        total_pes[3] = ideal4;

        int debajoPeso = 0;
        int pesoIdeal = 0;
        int porEncima = 0;

        for (int i = 0; i < 4; i++) {
            
            if (total_pes[i] == -1) {
                debajoPeso = debajoPeso + 1;
                
            } else if (total_pes[i] == 0) {
                pesoIdeal = pesoIdeal + 1;
                
            } else if (total_pes[i] == 1) {
                porEncima = porEncima + 1;
            }
        }

        System.out.println("Cuantas están por debajo de su peso?: " + debajoPeso + " en porcentaje es " + ((debajoPeso*100)/4) + "%");
        System.out.println("Cuantas están en su peso ideal?: " + pesoIdeal + " en porcentaje es " + ((pesoIdeal*100)/4) + "%");
        System.out.println("Cuantas están por encima de su peso?: " + porEncima + " en porcentaje es " + ((porEncima*100)/4) + "%");
        System.out.println("");

        boolean total_edad[] = new boolean[4];
        total_edad[0] = mayor1;
        total_edad[1] = mayor2;
        total_edad[2] = mayor3;
        total_edad[3] = mayor4;

        int cantMayor = 0;
        int cantMenor = 0;
        
        for (int i = 0; i < 4; i++) {  
            if (total_edad[i] == true) {
                cantMayor = cantMayor + 1;
            } else if (total_edad[i] == false) {
                cantMenor = cantMenor + 1;
            }
        }
        
        System.out.println("Cuantos son menores?: " + cantMenor);
        System.out.println("Cuantos son mayores?: " + cantMayor);

    }

}
