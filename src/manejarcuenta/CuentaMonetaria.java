package manejarcuenta;

/***********************************************
* CuentaMonetaria.java
* Yellsmy Toj
*
* Esta clase denominada CuentaMonetaria modela una cuenta monetaria  
* que es una subclase de Cuenta
***********************************************/

public class CuentaMonetaria extends Cuenta
{
    private boolean activa;
    private int numeroTransacciones;

    //**************************************************************
    
    /*
     * Constructor de la clase CuentaMonetaria
     * 
     * @param saldo: Define el saldo de la cuenta monetaria
     * @param numeroCuenta: define el número de la cuenta de ahorro
     */
    public CuentaMonetaria(int numeroCuenta, float saldo, int transacciones) {
        super(numeroCuenta);
        super.setSaldo(saldo);
        if (super.getSaldo() < 100) // Si el saldo es menor a 100, la cuenta no se activa
            setActiva(false);
	else
            setActiva(true);
        setNumeroTransacciones(super.getNumeroDepositos()+super.getNumeroRetiros());      
    }
    
    //**************************************************************

    // Método accesor y modificador para el atributo de la clase CuentaMonetaria
    public boolean isActiva()
    {
        return activa;
    }

    public void setActiva(boolean activa)
    {
        this.activa = activa;
    }

    public int getNumeroTransacciones() {
        return numeroTransacciones;
    }

    public void setNumeroTransacciones(int numeroTransacciones) {
        this.numeroTransacciones = numeroTransacciones;
    }
    
    //**************************************************************
    
    /*
    * Método que recibe una cantidad de dinero a retirar y actualiza el saldo de la cuenta
    * @param saldo Parámetro que define la cantidad a retirar de una cuenta de ahorros
    */
    public void retirar(float cantidad)
    {
        if (activa) // Si la cuenta está activa, se puede retirar dinero 
            super.retirar(cantidad); // Invoca al método retirar de la clase padre
        setNumeroTransacciones(getNumeroTransacciones()+1);
    }

    //**************************************************************
    
    /*
     * Método que recibe una cantidad de dinero a consignar y actualiza el saldo de la cuenta
     * @param saldo Parámetro que define la cantidad a consignar en una cuenta de ahorros
     */
    public void consignar(float cantidad)
    {
	if (activa) // Si la cuenta está activa, se puede consignar dinero
            super.consignar(cantidad); // Invoca al método consignar de la clase padre
        setNumeroTransacciones(getNumeroTransacciones()+1);
    }

    //**************************************************************
    
    /*
    * Método para hacer un descuento de Q5.00 a razón de manejo de cuenta
    * según las políticas del banco
    */
    
    public void descuentoManejoCuenta()
    {
        if (getNumeroTransacciones()%5==0) // Si el usuario completó 5 transacciones, se hará el descuento
            super.setSaldo(super.getSaldo()-5);
        System.out.println("Se ha debitado Q.5.00 por manejo de cuenta");
    }
    
    //**************************************************************
    
    /*
     * Método que muestra en pantalla los datos de una cuenta de ahorros
     */
    public void imprimir()
    {
    	System.out.println("Saldo = $ " + super.getSaldo());
	System.out.println("Número de transacciones = " + (super.getNumeroDepositos() + super.getNumeroRetiros()));
	System.out.println();
    }
}  // End class CuentaMonetaria
