import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner dato=new Scanner(System.in);
        dato.useDelimiter("\n");
        boolean salir = false;
        int opc;
        Agenda agendaTelefonica = new Agenda(3);
        String nomb;
        int telf;
        Contacto c;
        while(!salir){
            System.out.println("");
            System.out.println("Agenda");
            System.out.println("1 Añadir contacto | 2 Listar contacto | 3 Buscar | 4 Existe contacto?");
            System.out.println("5 Eliminar | 6 Espacio disponible | 7 Agenda llena? | 8 Salir");
            try {
                System.out.println("Seleccione rapido");
                System.out.println("");
                opc = dato.nextInt();
                switch (opc) {

                    case 1:
                        System.out.println("Digita nombres");
                        nomb = dato.next();
                        System.out.println("Digita numero de telefono");
                        telf = dato.nextInt();
                        c = new Contacto(nomb, telf);
                        agendaTelefonica.add(c);
                        break;

                    case 2:
                        agendaTelefonica.listar();
                        break;

                    case 3:
                        System.out.println("Ingrese el nombre para buscar el contacto");
                        nomb = dato.next();
                        agendaTelefonica.buscar(nomb);
                        break;

                    case 4:
                        System.out.println("Ingrese el contacto a verificar");
                        nomb = dato.next();

                        c = new Contacto(nomb, 0);
                        if (agendaTelefonica.existContacto(c)) {
                            System.out.println("Existe contacto");
                        } else {
                            System.out.println("No Existe contacto");
                        }
                        break;

                    case 5:
                        nomb = dato.next();
                        System.out.println("Ingrese el contacto a verificar");
                        c = new Contacto(nomb, 0);
                        agendaTelefonica.eliminar(c);
                        break;

                    case 6:
                        System.out.println("Hay " + agendaTelefonica.espaciosLibres() + " de espacios en tu agenda");
                        break;

                    case 7:
                        if (agendaTelefonica.agendaLlena()) {
                            System.out.println("Tu agenda esta llena");
                        } else {
                            System.out.println("Aun puedes almacenar en tu agenda");
                        }
                        break;

                    case 8:
                        salir = true;
                        break;

                    default:
                        System.out.println("Ingresa del 1 al 8");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un numero");
            }
        }
    }
}
