/*
Dado el método metodoA de la clase A, indique:
a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?

    class A {

    public void metodoA() {  //ACA RESPONDO YO: CUANDO SE LLAME A ESTE METODO PRIMERO SE REALIZAN LAS SENTENCIA_A1 Y A2
    sentencia_a1
    sentencia_a2

    try { LUEGO INTENTARA REALIZAR LA A3 Y A4
    sentencia_a3    
    sentencia_a4
    } 
    catch (MioException e){ SI SE ENCONTRASE UNA EXCEPCION DEBERIA PROBAR REALIZAR LA SENTENCIA A6, SINO CONTINUA CON A5
    sentencia_a6 
    } 
    sentencia_a5 MAS ALLA DEL RESULTADO DE TRY Y CATCH AL FINAL DEL PROGRAMA REALIZARA LA SENTENCIA A5

    } ACA FINALIZA EL METODO
   } ACA FINALIZA LA CLASE


    CHAT GPT DICE
    a) Si se produce la excepción MioException:

    Se ejecuta sentencia_a1.
    Se ejecuta sentencia_a2.
    Se intenta ejecutar sentencia_a3, pero si se produce una excepción de tipo MioException durante la ejecución de esta sentencia o 
    en cualquier método llamado dentro de esta sentencia, el control se transfiere inmediatamente al bloque catch y se ejecuta sentencia_a6.
    Después de ejecutar sentencia_a6, se continúa con la sentencia siguiente, que sería sentencia_a5.

    b) Si no se produce la excepción MioException:
    Se ejecuta sentencia_a1.
    Se ejecuta sentencia_a2.
    Se ejecuta sentencia_a3 sin problemas.
    Se ejecuta sentencia_a4.
    Se ejecuta sentencia_a5.

    En resumen, las sentencias se ejecutan en el orden en que aparecen en el código, a menos que se produzca una excepción de tipo 
    MioException dentro del bloque try, en cuyo caso el flujo se desvía al bloque catch, se ejecuta sentencia_a6 y luego se continúa 
    con la sentencia siguiente después del bloque try-catch, que es sentencia_a5. Si no se produce una excepción MioException, todas 
    las sentencias se ejecutan en orden.

 */



package excepciones6;


public class Excepciones6 {

    public static void main(String[] args) {
        
        
        
    }
    
}
