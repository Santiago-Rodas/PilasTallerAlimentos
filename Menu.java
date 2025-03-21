
    
    import java.util.Scanner;
import java.util.Stack;

public class Menu {
    public static void main(String[] args) {
        Metodos m = new Metodos();
        boolean continuar = true;
        int opt2 = 0;
        Scanner sc = new Scanner(System.in);
        Stack<ObjInventario> pila = m.Registros();
        m.MostrarPila(pila);
        int opt = 0;
        while (continuar) {
            System.out.println("ingrese 1 si desea Registrar, 2 si desea modificar, 3 si desea actualizar");
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                
                    m.Registros();
                    break;
                case 2:
                    m.ModificarRegistro(pila);
                    break;
                    case 3:
                    m.ActualizarPila(pila);
                    break;
                default:
                    System.out.println("pagina en mantenimiento ");
                    break;
            }

            System.out.println("desea continuar con otra accion 1: si ,2: no");
            opt2 = sc.nextInt();
            if (opt2 == 2) {
                continuar = false;
            }
        }

    }
}

