/*
La clase "ServicioCliente" debe tener los siguientes métodos de CRUD:
• registrarCliente: lo registra en el sistema.
• obtenerClientes(): devuelve una lista con todos los clientes registrados en el sistema.
• actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo): recibe el identificador
de un cliente existente y los nuevos datos del cliente, y actualiza la información correspondiente en el sistema.
eliminarCliente(int id): recibe el identificador de un cliente existente y lo elimina del sistema.
 */
package Servicios;

import Entidades.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioCliente {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cliente registrarCliente() {
        Cliente c = new Cliente();
        
        System.out.println("Ingrese id del cliente");
        c.setId(leer.nextInt());
        System.out.println("Ingrese nombre del cliente");
        c.setNombre(leer.next());
        System.out.println("Ingrese la edad del cliente");
        c.setEdad(leer.nextInt());
        System.out.println("Ingrese la altura del cliente");
        c.setAltura(leer.nextDouble());
        System.out.println("Ingrese el peso (KG) del cliente");
        c.setPeso(leer.nextDouble());
        System.out.println("Ingrese el objetivo del cliente");
        c.setObjetivo(leer.next());
        
        return c;
    }
    
    public ArrayList<Cliente> obtenerClientes(ArrayList<Cliente> lista) {
        
        for (Cliente cliente : lista) {
            System.out.println("Cliente: " + cliente.toString());
        }
        
        return lista;
        
    }
    
    public void actualizarCliente(int id, ArrayList<Cliente> lista) {
        
        boolean bandera = false;
        
        for (Cliente cliente : lista) {
            
            if (cliente.getId() == id) {
                System.out.println("Actualiza tu peso: ");
                cliente.setPeso(leer.nextDouble());
                System.out.println("Actualiza tu objetivo: ");
                cliente.setObjetivo(leer.next());
                bandera = true;
                break;
            }
            
        }
        
        if (!bandera){
            System.out.println("El usuario o cliente no se ha encontrado.");
        }
        
    }
    
     public void eliminarCliente(int id, ArrayList<Cliente> lista) {
        
        boolean bandera = false;
        
        for (Cliente cliente : lista) {
            
            if (cliente.getId() == id) {
                lista.remove(cliente);
                bandera = true;
                break;
            }
            
        }
        
        if (!bandera){
            System.out.println("El usuario o cliente no se ha encontrado.");
        }
        
    }
    
}
