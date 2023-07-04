/*
Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su 
correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo) y la 
letra (String o char) que le corresponde. Dispondrá de los siguientes métodos: 
 Métodos getters y setters para el número de DNI y la letra. 
 Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le 
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el 
resultado del calculo. 
 Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra 
en mayúscula; por ejemplo: 00395469-F). 
La letra correspondiente al dígito verificador se calculará a traves de un método que 
funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el 
número de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe 
buscar en un array (vector) de caracteres la posición que corresponda al resto de la 
división para obtener la letra correspondiente. La tabla de caracteres es la siguiente: 
POSICIÓN LETRA
0 T
1 R
2 W
3 A
4 G
5 M
6 Y
7 F
8 P
9 D
10 X
11 B
12 N
13 J
14 Z
15 S
16 Q
17 V
18 H
19 L
20 C
21 K
22 E
 */
package Servicios;

import Entidades.NIF;
import java.util.Scanner;

public class NIFServicios {

//     Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le 
//corresponderá. Una vez calculado, le asigna la letra que le corresponde según el 
//resultado del calculo.
    public NIF crearNif() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Por favor ingrese su dni: ");
        long dni = leer.nextLong();
        char letra = ' ';

        char arreglo[] = new char[23];
        arreglo[0] = 'T';
        arreglo[1] = 'R';
        arreglo[2] = 'W';
        arreglo[3] = 'A';
        arreglo[4] = 'G';
        arreglo[5] = 'M';
        arreglo[6] = 'Y';
        arreglo[7] = 'F';
        arreglo[8] = 'P';
        arreglo[9] = 'D';
        arreglo[10] = 'X';
        arreglo[11] = 'B';
        arreglo[12] = 'N';
        arreglo[13] = 'J';
        arreglo[14] = 'Z';
        arreglo[15] = 'S';
        arreglo[16] = 'Q';
        arreglo[17] = 'V';
        arreglo[18] = 'H';
        arreglo[19] = 'L';
        arreglo[20] = 'C';
        arreglo[21] = 'K';
        arreglo[22] = 'E';

        for (int i = 0; i < 23; i++) {
            if (i == dni % 23) {
               letra = arreglo[i];
            }
        }
        
        NIF nif = new NIF(dni, letra);
        
        return nif;

    }
    
    public void mostrar(NIF nif){
    
        System.out.println("El nif es: " + nif.getDni() + "-" + nif.getLetra());
    
    }

}
