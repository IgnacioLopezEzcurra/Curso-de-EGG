/*
5. Crea una clase en Java donde declares una variable de tipo array de Strings que 
contenga los doce meses del año, en minúsculas. A continuación, declara una variable 
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo, 
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el 
usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar 
el mes secreto. Un ejemplo de ejecución del programa podría ser este: 
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero 
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto 
¡Ha acertado! 

 */
package Entidades;

public class Meses {

    private String meses[] = new String[12];

    public Meses() {
        this.meses[0] = "enero";
        this.meses[1] = "febrero";
        this.meses[2] = "marzo";
        this.meses[3] = "abril";
        this.meses[4] = "mayo";
        this.meses[5] = "junio";
        this.meses[6] = "julio";
        this.meses[7] = "agosto";
        this.meses[8] = "septiembre";
        this.meses[9] = "octubre";
        this.meses[10] = "noviembre";
        this.meses[11] = "diciembre";

    }


    public String getMeses(int i) {
        return meses[i];
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }
    
    

}
