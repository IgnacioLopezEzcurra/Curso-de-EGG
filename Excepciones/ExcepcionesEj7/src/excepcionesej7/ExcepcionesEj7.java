/*
    Dado el método metodoB de la clase B, indique:
    a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?

        class B {
        public void metodoB() {
        sentencia_b1

        try {
        sentencia_b2
        } catch (MioException e){ 
        sentencia_b3 
        }
        finally
        sentencia_b4
     }

    } 
    
    a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
    Primero se produce la sentencia b1
    Luego la b2, luego ejecutara la b3, y finalmente la b4

    b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
    Primero se produce la sentencia b1
    Luego la b2  y finalmente la b4


    CHAT GPT RESPONDE
a) Si se produce la excepción MioException:

Se ejecuta sentencia_b1.
Se intenta ejecutar sentencia_b2, pero si se produce una excepción de tipo MioException durante 
la ejecución de esta sentencia o en cualquier método llamado dentro de esta sentencia, el control
se transfiere inmediatamente al bloque catch y se ejecuta sentencia_b3.
Luego, se ejecuta el bloque finally y se ejecuta sentencia_b4.
En este caso, la sentencia sentencia_b4 siempre se ejecutará después de que se complete el bloque 
try-catch, independientemente de si se produjo una excepción o no.

b) Si no se produce la excepción MioException:

Se ejecuta sentencia_b1.
Se ejecuta sentencia_b2 sin problemas.
Después de que sentencia_b2 se completa, se ejecuta el bloque finally y se ejecuta sentencia_b4.
En resumen, en ambos casos, la sentencia sentencia_b1 se ejecuta siempre. Si se produce una excepción 
de tipo MioException dentro de sentencia_b2, se ejecutará sentencia_b3 en el bloque catch, seguido de 
sentencia_b4 en el bloque finally. Si no se produce la excepción, sentencia_b2 se ejecutará sin problemas,
seguido de sentencia_b4 en el bloque finally. El bloque finally se ejecuta después del bloque try-catch,
independientemente de si se produce una excepción o no.

 */
package excepcionesej7;


public class ExcepcionesEj7 {


    
    public static void main(String[] args) {
       
    }
    
}
