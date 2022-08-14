
package manejarcuenta;

/*
 * Clase Cuenta modela una cuenta bancaria con los atributos
 * nombres, apellidos, número de cuenta, saldo, número de depósitos, número de retiros y tasa anual de interés
 */
public class Cuenta
{
    // Atributo que define el número de cuenta
    protected int numeroCuenta;
    // Atributo que define el saldo de la cuenta
    protected float saldo;
    // Atributo que define el número de depósitos realizados en una cuenta bancaria
    protected int numeroDepositos = 0;
    // Atributo que define el número de retiros de una cuenta bancaria
    protected int numeroRetiros = 0;
    
    //**************************************************************
    
    /*
    * Constructor de la clase Cuenta
    *
    * @param numeroCuenta: Define el número de cuenta correspondiente
    */
    public Cuenta(int numeroCuenta)
    {
        this.numeroCuenta = numeroCuenta;
    }
    
    //**************************************************************
    
    // Métodos accesores y modificadores de los atributos
    public int getNumeroCuenta()
    {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta)
    {
        this.numeroCuenta = numeroCuenta;
    }
 
    public float getSaldo()
    {
        return saldo;
    }

    public void setSaldo(float saldo)
    {
        this.saldo = saldo;
    }

    public int getNumeroDepositos()
    {
        return numeroDepositos;
    }

    public void setNumeroDepositos(int numeroDepositos)
    {
        this.numeroDepositos = numeroDepositos;
    }

    public int getNumeroRetiros()
    {
        return numeroRetiros;
    }

    public void setNumeroRetiros(int numeroRetiros)
    {
        this.numeroRetiros = numeroRetiros;
    }

    //**************************************************************
    
    /*
    * Método que recibe una cantidad de dinero a consignar y actualiza el saldo de la cuenta
    * @param saldo Parámetro que define la cantidad de dinero a consignar en la cuenta
    */
    public void consignar(float cantidad)
    {
	saldo = saldo + cantidad; // Se actualiza el saldo con la cantidad consignada
	// Se actualiza el número de consignaciones realizadas en la cuenta
	numeroDepositos = numeroDepositos + 1;
    }

    //**************************************************************
    
    /*
    * Método que recibe una cantidad de dinero a retirar y actualiza el saldo de la cuenta
    * @param saldo Parámetro que define la cantidad de dinero a retirar de la cuenta
    */
    public void retirar(float cantidad)
    {
	float nuevoSaldo = saldo - cantidad;
	/* Si la cantidad a retirar no supera el saldo, el retiro no se puede realizar */
	if (nuevoSaldo >= 0)
        {
            saldo -= cantidad;
            numeroRetiros = numeroRetiros + 1;
	} // End if
        else
        {
            System.out.println("La cantidad a retirar excede el saldo actual.");
	} // End else
    }
}  // End class Cuenta