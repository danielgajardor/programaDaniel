
/**
 *
 * @author Daniel Gajardo
 * @version 28_08_2023
 */
public class TestPersona {
    
    public static void main(String[] args) {
        
        Persona per1 = new Persona();
        per1.imprimir();
        System.out.println("**********");
        Persona per2 = new Persona("Daniel", 23, 'm');
        per2.imprimir();
        Persona per3 = new Persona();
        System.out.println("**********");
        per2.setNombre("Ignacio");
        per2.imprimir();
    
    }
}
