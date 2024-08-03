package sia;

/**
 *
 * @author Juan José Hernández Medina, Tarea parte 2
 */

import java.util.Scanner;

public class Sia {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite su nombre completo: ");
        String nombree = scan.nextLine();
        
        System.out.println("Digite su Edad: ");
        int eDad = scan.nextInt();
        
        System.out.println("Digite su PAPA: ");
        float Notas = scan.nextFloat();
        
        System.out.println("Digite su tipo de sangre (Sin RH): ");
        char KindOfBlood = scan.next().charAt(0);
        
        // Consumir el carácter de nueva línea pendiente
        scan.nextLine();
        
        System.out.println("Digite su Fecha de Nacimiento (AAAA-MM-DD): ");
        String FDNacimiento = scan.nextLine();
        
        // Creación del estudiante 
        Estudiantes estudiante1 = new Estudiantes(nombree, eDad, Notas, FDNacimiento, KindOfBlood);
        
        //Parte donde se asignan las variables de clase
        
        Estudiantes.setCodClase(123);
        Estudiantes.setPBM(50);
        Estudiantes.setCreditosTotales(120);
        
        System.out.println("Estudiante creado exitosamente. "+ estudiante1);
        
    }
    
}
