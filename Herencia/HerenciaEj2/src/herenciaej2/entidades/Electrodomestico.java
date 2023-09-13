/*

2. Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color, 
consumo energético (letras entre A y F) y peso.

Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.

Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, 
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el 
objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es, 
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son 
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en 
minúsculas. Este método se invocará al crear el objeto y no será visible.
• Metodo crearElectrodomestico(): le pide la información al usuario y llena el 
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al 
precio se le da un valor base de $1000.

• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del 
precio. Esta es la lista de precios:

LETRA PRECIO        PESO PRECIO
A $1000           Entre 1 y 19 kg $100
B $800            Entre 20 y 49 kg $500
C $600            Entre 50 y 79 kg $800
D $500            Mayor que 80 kg $1000
E $300          
F $100                    
                   
A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga, 
además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes 
llamar al constructor de la clase padre.

Los métodos que se implementara serán:
• Método get y set del atributo carga.
• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase 
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos 
el atributo propio de la lavadora.
• Método precioFinal(): este método será heredado y se le sumará la siguiente 
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la 
carga es menor o igual, no se incrementará el precio. Este método debe llamar al 
método padre y añadir el código necesario. Recuerda que las condiciones que hemos 
visto en la clase Electrodoméstico también deben afectar al precio.

Se debe crear también una subclase llamada Televisor con los siguientes atributos: 
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos 
heredados. 

Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.

Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase 
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos 
los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente 
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se 
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará 
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico 
también deben afectar al precio.
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar 
el precio final de los dos electrodomésticos. 

 */
package herenciaej2.entidades;

public class Electrodomestico {

    private static final String[] COLORES_VALIDOS = {"blanco", "negro", "rojo", "azul", "gris"};
    private static final char[] LETRA_VALIDA = {'A', 'B', 'C', 'D', 'E', 'F'};

    private double precio;
    private String color;
    private char consumoEnergetico;
    private double peso;

    public Electrodomestico() {

        // Valores por defecto o inicialización
        precio = 1000;
        color = "blanco";
        consumoEnergetico = 'F'; // Por defecto 'F'
        peso = 0.0;

    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {

        color = color.toLowerCase();

        for (String colores : COLORES_VALIDOS) {
            if (color.equalsIgnoreCase(colores)) {
                this.color = color;
                break;
            } else {
                this.color = "blanco";
            }
        }

    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {

        // Convertir la letra a mayúsculas para comparación insensible a mayúsculas
        consumoEnergetico = Character.toUpperCase(consumoEnergetico);

        // Comprobar si la letra es válida
        for (char letraValida : LETRA_VALIDA) {
            if (consumoEnergetico == letraValida) {
                this.consumoEnergetico = consumoEnergetico; // La letra es válida, la establecemos
                break;
            } else {
                this.consumoEnergetico = 'F';
            }
        }

        // Si no es válida, establecer la letra por defecto ('F')
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Método privado para comprobar y establecer el consumo energético correcto
    public char comprobarConsumoEnergetico(char letra) {

        // Convertir la letra a mayúsculas para comparación insensible a mayúsculas
        letra = Character.toUpperCase(letra);

        // Comprobar si la letra es válida
        for (char letraValida : LETRA_VALIDA) {
            if (letra == letraValida) {
                return letra; // La letra es válida, la establecemos
            }
        }

        // Si no es válida, establecer la letra por defecto ('F')
        return 'F';
    }

    // Método privado para comprobar y establecer el color correcto
    public String comprobarColor(String color) {
        // Convertir a minúsculas para comparación insensible a mayúsculas
        String colorMin = color.toLowerCase();

        // Comprobar si el color es válido
        for (String colorValido : COLORES_VALIDOS) {
            if (colorMin.equals(colorValido)) {
                return colorMin; // El color es válido, lo establecemos
            }
        }

        // Si no es válido, establecer el color por defecto (blanco)
        return "blanco";
    }

    /*
    • Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del 
precio. Esta es la lista de precios:

LETRA PRECIO        PESO PRECIO
A $1000           Entre 1 y 19 kg $100
B $800            Entre 20 y 49 kg $500
C $600            Entre 50 y 79 kg $800
D $500            Mayor que 80 kg $1000
E $300          
F $100       
     */
    public double precioFinal(Electrodomestico elec) {

        double precioFinal;
        double precioPeso;
        double precioLetra = 0;

        switch (elec.getConsumoEnergetico()) {
            case 'A':
                precioLetra = 1000;
                break;
            case 'B':
                precioLetra = 800;
                break;
            case 'C':
                precioLetra = 600;
                break;
            case 'D':
                precioLetra = 500;
                break;
            case 'E':
                precioLetra = 300;
                break;
            case 'F':
                precioLetra = 100;
                break;
        }

        if (elec.getPeso() < 80) {
            if (elec.getPeso() < 50) {
                if (elec.getPeso() < 20) {
                    if (elec.getPeso() < 1) {
                        precioPeso = 0d;
                    } else {
                        precioPeso = 100d;
                    }
                } else {
                    precioPeso = 500d;
                }
            } else {
                precioPeso = 800d;
            }
        } else {
            precioPeso = 1000d;
        }
        
        precioFinal = elec.getPrecio() + precioPeso + precioLetra;
        
        this.precio = precioFinal;

        return precioFinal;

    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }

}
