package laboratorio6;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Laboratorio6 implements PlanTuristico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al configurador de planes turisticos a Hawaii.");

        PlanTuristico plan = new PaqueteBase();
        ArrayList<Integer> planes = new ArrayList<>();
        boolean salir = false;
        while (!salir) {
            try {
                System.out.println("Seleccione una opcion:");
                System.out.println("1. Agregar Pearl Harbor");
                System.out.println("2. Agregar Nature");
                System.out.println("3. Agregar Amazing Hawaii");
                System.out.println("4. Cotizar");
                System.out.println("5. Salir");
                System.out.println("Ingrese el numero de la opcion que desea:");
                int opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        if (planes.contains(1)) {
                            System.out.println("Ya se ha agregado este plan.");
                            break;
                        }
                        plan = new PearlHarbor(plan);
                        planes.add(1);
                        break;
                    case 2:
                        if (planes.contains(2)) {
                            System.out.println("Ya se ha agregado este plan.");
                            break;
                        }
                        plan = new Nature(plan);
                        planes.add(2);
                        break;
                    case 3:
                        if (planes.contains(3)) {
                            System.out.println("Ya se ha agregado este plan.");
                            break;
                        }
                        plan = new AmazingHawaii(plan);
                        planes.add(3);
                        break;
                    case 4:
                        cotizar(plan);
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción no valida.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Ingrese una opcion valida.");
                scanner.nextLine();
            }
            System.out.println("Gracias por usar el configurador de planes turisticos a Hawaii.");
        }

        double costoPersona = plan.getCosto();
        int duracion = plan.getDuracion();
        String descripcion = plan.getDescripcion();
        System.out.println("Cotizacion del plan turistico:");
        System.out.println("Costo por persona: $" + costoPersona);
        System.out.println("Duracion del plan: " + duracion + " dias");
        System.out.println("Descripcion del plan: \n" + descripcion);
    }

    public static void cotizar(PlanTuristico plan) {
        double costoPersona = plan.getCosto();
        int duracion = plan.getDuracion();
        String descripcion = plan.getDescripcion();
        System.out.println("Cotizacion del plan turistico:");
        System.out.println("Costo por persona: $" + costoPersona);
        System.out.println("Duracion del plan: " + duracion + " dias");
        System.out.println("Descripcion del plan: \n" + descripcion);
    }
}
