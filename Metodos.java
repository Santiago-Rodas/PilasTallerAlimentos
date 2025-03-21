import java.util.Scanner;
import java.util.Stack;

import javax.swing.JOptionPane;

public class Metodos {

    int opt = 0;
    Scanner sc = new Scanner(System.in);

    public Stack<ObjInventario> Registros() {
        Stack<ObjInventario> pila = new Stack<>();
        Boolean bandera = true;

        while (bandera) {
            ObjInventario o = new ObjInventario();
            System.out.println("ingrese el nombre: ");
            o.setNombre(sc.next());
            o.setCantidad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad")));
            System.out.println("ingrese el precio: ");
            o.setPrecio(sc.nextDouble());

            pila.push(o);
            System.out.println("Desea agregar mas registros 1: SI, 2: NO");
            while (!sc.hasNextInt()) {
                System.out.println("Ingrese un dato numerico");
                sc.next();
            }
            opt = sc.nextInt();
            while (opt < 1 || opt > 2) {
                System.out.println("Opcion Incorrecta ");
                opt = sc.nextInt();
            }
            if (opt == 2) {
                bandera = false;
            }
        }
        return pila;
    }

    public void MostrarPila(Stack<ObjInventario> pila) {
        for (ObjInventario o : pila) {
            System.out.println(o.getNombre());
            System.out.println(o.getCantidad());
            System.out.println(o.getPrecio());
        }
    }

    public void ModificarRegistro(Stack<ObjInventario> pila) {
        String nombre = "";
        System.out.println("ingrese el nombre del registro que desea modificar");
        nombre = sc.next();
        for (ObjInventario Obj : pila) {
            if (Obj.getNombre().equalsIgnoreCase(nombre)) {

                System.out.println("ingrese el nombre");
                Obj.setNombre(sc.next());
                System.out.println("Ingrese la cantidad: ");
                Obj.setCantidad(sc.nextInt());
                System.out.println("Ingrese el precio:");
                Obj.setPrecio(sc.nextDouble());
                

            }
        }
        MostrarPila(pila);
    }

    public Stack<ObjInventario> ActualizarPila(Stack<ObjInventario> pila){

        boolean existe = false;
       String  nombre = "";
       int cantidad = 0;
       double precio = 0;
        System.out.println("Ingrese el nombre que desea actualizar: ");
        nombre = sc.next();
        System.out.println("Ingrese la cantidad: ");
        cantidad = sc.nextInt();
        System.out.println("Ingrese el precio: ");
        precio = sc.nextDouble();
        for (ObjInventario o : pila) {
            
       
            if (o.getNombre().equalsIgnoreCase(nombre)){
                o.setNombre(nombre);
                o.setCantidad(cantidad);
                o.setPrecio(precio);
            }
        }
        return pila;
    }
    
}
