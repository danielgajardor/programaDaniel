

/**
 *
 * @author Daniel Gajardo
 * @version 28-08-2023
 */
public class Persona{
    
    //acá declaramos los atributos de la clase
    //encap + tipoDato + nombreVariable
    private String nombre;
    private int edad;
    private char sexo;
    
    //constructor sin parámetros
    public Persona(){
    
    }
    
    //constructor con parámetros
    public Persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        
    }
   
    
    //mutadores
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
      public void setEdad(int edad){
        this.edad = edad;
    }
      public void setSexo(char sexo){
        this.sexo = sexo;
    }        
    
    //accesadores
      public String getNombre(){
          return nombre;
      }
      public int getEdad(){
          return edad;
      }
      public char getSexo(){
          return sexo;
      }
            
    //metodo custoomer
    public void imprimir (){
        System.out.println("EL NOMBRE ES : " + nombre);
        System.out.println("LA EDAD ES : " + edad);
        System.out.println("EL SEXO ES : " + sexo);
    }
    public void imprimir2 (){
        System.out.println("EL NOMBRE ES : " + this.nombre);
        System.out.println("LA EDAD ES : " + this.edad);
        System.out.println("EL SEXO ES : " + this.sexo);
    }
    
    
    
    
    
    
    
}
