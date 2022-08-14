package manejarcuenta;

/***********************************************
* Persona.java
* Yellsmy Toj
*
* Esta clase denominada Persona contiene los atributos de una persona
***********************************************/

public class Persona
{
    // Atributo que define los nombres del titular de la cuenta bancaria
    private String nombres;
    // Atributo que define los apellidos del titular de la cuenta bancaria
    private String apellidos;
    // Atributo que define el número de DPI de una persona
    private int dpi;

    //**************************************************************
    
    /*
     * Constructor de la clase Persona
     * 
     * @param nombres: Define el nombre de la persona
     * @param apellidos: Define los apellidos de una persona
     * @param dpi: Define el número de identificación personal de la persona
     */
    public Persona(String nombres, String apellidos, int dpi) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dpi = dpi;
    }
    
    //**************************************************************
    
    // Métodos accesores y modificadores
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }  
}  // End class Persona
