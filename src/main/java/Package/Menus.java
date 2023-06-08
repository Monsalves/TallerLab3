package Package;

import java.util.Scanner;

public class Menus {
    public void mostrarMenu() {
        Camion cuchau = new Camion("Nike",true,"redondas","motorcito"  );
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== MENÚ ===");
            System.out.println("1. Mostrar datos de un camion");
            System.out.println("2. Modificar datos de un camion");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(cuchau);

                    break;
                case 2:
                    System.out.println("Modificar datos camion");
                    modificarCamion(cuchau);


                    break;
                case 0:
                    System.out.println("Saliendo.............");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.");
            }
        } while (opcion != 0);



    }
    public void modificarCamion(Camion camioncito) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la nueva marca del camión:");
        String nuevaMarca = scanner.nextLine();
        camioncito.setMarca(nuevaMarca);


        scanner.nextLine(); // Limpiar el buffer del Scanner

        System.out.println("Ingresa el nuevo tipo de ruedas del camión:");
        String nuevoTipoRuedas = scanner.nextLine();
        camioncito.setRuedas(nuevoTipoRuedas);

        System.out.println("Ingresa el nuevo tipo de motor del camión:");
        String nuevoTipoMotor = scanner.nextLine();
        camioncito.setMotor(nuevoTipoMotor);

        System.out.println("Los datos del camión han sido modificados.");

    }
}




