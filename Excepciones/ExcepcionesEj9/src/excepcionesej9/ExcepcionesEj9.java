/*
9 Dado el método metodoC de la clase C, indique:
a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
c) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción TuException?


    class C {
    void metodoC() throws TuException{  
    sentencia_c1
    try {
    sentencia_c2
    sentencia_c3
    } catch (MioException e){ 
    sentencia_c4 
    } catch (TuException e){ 
    sentencia_c5
    throw (e) 
    }
    finally
    sentencia_c6
    }
   }

        Te respondo yo: Si se produce la MioExcepcion el orden de ejecucion seria
        c1, c2 y/o c3 (porque puede que MioException se produzca luego de c2 o luego de c3), c4, c6

        Si no se produce MioException la ejecicion seria: c1, c2, c3, podria producirce c5(dependiendo de c2 o c3) y finalmente c6

        Si se ejecuta TuExcepcion seria c1, c2, c3, c5, c6


        CHATGPT DICE:
        a) Si se produce la excepción MioException, las sentencias se ejecutan en el siguiente orden:

        sentencia_c1 (se ejecuta antes de entrar en el bloque try-catch).
        sentencia_c2 (se ejecuta dentro del bloque try).
        sentencia_c3 (se ejecuta dentro del bloque try).
        Se lanza la excepción MioException y se captura en el bloque catch (MioException e):
        sentencia_c4 se ejecuta (dentro del bloque catch).
        sentencia_c6 (se ejecuta en el bloque finally).

        b) Si no se produce la excepción MioException, pero se produce la excepción TuException, las sentencias se ejecutan en el siguiente orden:

        sentencia_c1 (se ejecuta antes de entrar en el bloque try-catch).
        sentencia_c2 (se ejecuta dentro del bloque try).
        sentencia_c3 (se ejecuta dentro del bloque try).
        La excepción TuException se lanza y se captura en el bloque catch (TuException e):
        sentencia_c5 se ejecuta (dentro del bloque catch).
        throw (e) relanza la excepción TuException.
        sentencia_c6 (se ejecuta en el bloque finally).

        c) Si se produce la excepción TuException, pero no se produce la excepción MioException, las sentencias se ejecutan en el siguiente orden:

        sentencia_c1 (se ejecuta antes de entrar en el bloque try-catch).
        sentencia_c2 (se ejecuta dentro del bloque try).
        sentencia_c3 (se ejecuta dentro del bloque try).
        La excepción TuException se lanza y se captura en el bloque catch (TuException e):
        sentencia_c5 se ejecuta (dentro del bloque catch).
        throw (e) relanza la excepción TuException.
        sentencia_c6 (se ejecuta en el bloque finally).
        Es importante tener en cuenta que el bloque finally siempre se ejecuta, independientemente de si se lanzan excepciones o no en el bloque try o en los bloques catch.

        
 */
package excepcionesej9;


public class ExcepcionesEj9 {

 
    public static void main(String[] args) {
        
        
        
    }
    
}
