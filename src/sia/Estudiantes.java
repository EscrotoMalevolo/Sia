package sia;

/**
 *
 * @author Juan Jose Hernandez Medina
 */
public class Estudiantes {
    
    // Variable de objeto
    private String nombre;
    private int edad;
    private float PAPA;
    private String FechaDeNacimiento;
    private char TipoDeSangre;
    
    // Variable de clase
    static int CodClase;
    static int PBM;
    static int CreditosT;
    
    
    public Estudiantes(String name, int age, float Promedio, String Birthday, char Blood ){
        nombre = name;
        edad = age;
        PAPA = Promedio;
        FechaDeNacimiento = Birthday;
        TipoDeSangre =  Blood;
        
    }
    
    public static void setCodClase(int codClase){
        CodClase = codClase;
        
    }
    
    public static void setPBM(int pbm){    
        PBM = pbm;
        
    }
    
    public static void setCreditosTotales(int Credi){
        CreditosT = Credi;
    
    }
 
}
