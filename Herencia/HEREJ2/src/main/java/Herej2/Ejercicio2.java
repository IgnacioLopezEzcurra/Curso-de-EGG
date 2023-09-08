package Herej2;

import Entidades.Electrodomestico;
import Servicio.ElectrodomesticoServicio;
import Servicio.LavadoraServicio;
import Servicio.TelevisorServicio;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ElectrodomesticoServicio es = new ElectrodomesticoServicio();
        LavadoraServicio ls = new LavadoraServicio();
        TelevisorServicio ts = new TelevisorServicio();

        System.out.println("Ingrese los datos del electrodomestico");
        System.out.println("Color:");
        String color = leer.next();
        System.out.println("Letra de consumo:");
        char letra = leer.next().charAt(0);
        System.out.println("Peso:");
        Double peso = leer.nextDouble();

        Electrodomestico e = es.crearElectrodomestico(peso,letra,color);
        System.out.println(e.toString());

        System.out.println("Ingrese los datosde la lavadora");
        System.out.println("Color:");
        String colorL = leer.next();
        System.out.println("Letra de consumo:");
        char letraL = leer.next().charAt(0);
        System.out.println("Peso:");
        Double pesoL = leer.nextDouble();
        System.out.println("Carga:");
        Double carga = leer.nextDouble();

        Electrodomestico e1 = ls.crearLavadora(pesoL, letraL, colorL, carga);
        System.out.println(e1.toString());

        System.out.println("Ingrese los datos del electrodomestico");
        System.out.println("Color:");
        String colorT = leer.next();
        System.out.println("Letra de consumo:");
        char letraT = leer.next().charAt(0);
        System.out.println("Peso:");
        Double pesoT = leer.nextDouble();
        System.out.println("resolucion en pulgadas");
        Double resolucion = leer.nextDouble();
        System.out.println("Posee sintonizador TDT? S/N");
        boolean sintonizador = (leer.next().equalsIgnoreCase("S"));

        Electrodomestico e2 = ts.crearTelevisor(pesoT, letraT, colorT, resolucion, sintonizador);
        System.out.println(e2.toString());

    }

}
