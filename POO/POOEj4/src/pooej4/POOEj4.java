/*
4. Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package pooej4;


public class POOEj4 {


    public static void main(String[] args) {
       
        Rectangulo rec = new Rectangulo();
        rec.crearRectangulo();
        System.out.println(rec.calculaPerimetro());
        System.out.println(rec.calcularSuperficie());
        System.out.println("");
        System.out.println("El rectangulo dibujado con relleno es asi:");
        rec.dibujar(rec.getBase(), rec.getAltura());
        System.out.println("");
        System.out.println("El rectangulo sin relleno es asi: ");
        rec.dibujarSinRelleno(rec.getBase(), rec.getAltura());
        
    }
    
}
