package manejarcuenta;

/*
 * Esta clase denominada CuentaAhorros modela una cuenta de ahorros  
 * que es una subclase de Cuenta. Tiene un nuevo atributo: activa.
 */

public class CuentaAhorros extends Cuenta
{
    // Atributo que identifica si una cuenta está activa; lo está si su saldo es superior a 100.00
    private boolean activa;
    // Atributo que define la tasa anual de intereses de una cuenta bancaria
    protected float tasaAnual;

    //**************************************************************
    
    /*
     * Constructor de la clase CuentaAhorros
     * 
     * @param saldo Parámetro que define el saldo de la cuenta de ahorros
     * @param tasa  Parámetro que define la tasa anual de interés de la cuenta de ahorros
     * @param numeroCuenta: define el número de la cuenta de ahorro
     */
    public CuentaAhorros(int numeroCuenta, float saldo, float tasa)
    {
	super(numeroCuenta);
        super.setSaldo(saldo);
	setTasaAnual(tasa);
	if (saldo < 100) // Si el saldo es menor a 100, la cuenta no se activa
            setActiva(false);
	else
            setActiva(true);
    }

    //**************************************************************
    
    // Métodos accesores y modificadores para los atributos de la clase CuentaAhorros
    public boolean isActiva()
    {
        return activa;
    }

    public void setActiva(boolean activa)
    {
        this.activa = activa;
    }

    public float getTasaAnual()
    {
        return tasaAnual;
    }
    
    public void setTasaAnual(float tasaAnual)
    {
        this.tasaAnual = tasaAnual;
    }
    
    //**************************************************************
    
    /*
    * Método que calcula interés mensual de la cuenta a partir de la tasa anual aplicada
    */
    public void calcularInterés()
    {
	float tasaMensual = getTasaAnual() / 12; // Convierte la tasa anual en mensual
	float interesMensual = saldo * tasaMensual;
	saldo += interesMensual; // Actualiza el saldo aplicando el interés mensual
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
}  // End class CuentaAhorro