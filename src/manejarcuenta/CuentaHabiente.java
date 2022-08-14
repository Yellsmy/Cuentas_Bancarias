
package manejarcuenta;

/***********************************************
* CuentaHabiente.java
* Yellsmy Toj
*
* Esta clase denominada CuentaHabiente contiene la relación de una
* persona y una cuenta bancaria
***********************************************/
public class CuentaHabiente 
{
    // atributo de tipo Persona
    Persona persona;
    // atributo de tipo CuentaAhorros
    CuentaAhorros cuenta;

    //**************************************************************
    
    /*
     * Constructor de la clase CuentaHabiente
     * 
     * @param persona: Define a la persona que creará la cuenta
     * @param cuenta: Define la cuenta que corresponderá a la persona
     */
    public CuentaHabiente(Persona persona, CuentaAhorros cuenta)
    {
        this.persona = persona;
        this.cuenta = cuenta;
    }   
}  // End class CuentaHabiente
