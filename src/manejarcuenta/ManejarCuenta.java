package manejarcuenta;

import java.util.Scanner;

/*
 * Esta clase prueba diferentes acciones realizadas por cuentas bancarias de tipo Cuenta de ahorros y Cuenta corriente
 */
public class ManejarCuenta
{
    /*
     * Método main que crea una cuenta de ahorros con un saldo inicial 
     * y una tasa de interés solicitados por teclado, a la cual se realiza una 
     * consignación y un retiro, y luego se le genera el extracto mensual
     */
    public static void main(String args[])
    {
	Scanner input = new Scanner(System.in);
	System.out.println("Cuenta de ahorros");
               
        // Solicitar datos de la persona
	System.out.println("Ingrese Nombres");
	String nombres = input.next();
	System.out.println("Ingrese Apellidos");
	String apellidos = input.next();
        System.out.println("Ingrese DPI");
	int dpi = input.nextInt();
                
        // Instanciar objeto persona
        Persona persona1 = new Persona(nombres, apellidos,dpi);
		
        // Solicitar datos de la cuenta       
        System.out.println("Ingrese número de cuenta");
        int cuenta = input.nextInt();
        System.out.println("Ingrese saldo inicial= Q");
        float saldoInicialAhorros = input.nextFloat();
        System.out.print("Ingrese tasa de interés= ");
        float tasaAhorros = input.nextFloat();
                
        // Instanciar objeto cuentaAhorros
	CuentaAhorros cuenta1 = new CuentaAhorros(cuenta, saldoInicialAhorros, tasaAhorros);
        
        CuentaMonetaria cuenta2 = new CuentaMonetaria(cuenta, saldoInicialAhorros, 0);
		
        // Operaciones sobre la cuenta. 
        System.out.print("Ingresar cantidad a depositar: Q");
        float cantidadDepositar = input.nextFloat();
    	cuenta1.consignar(cantidadDepositar);
	System.out.print("Ingresar cantidad a retirar: Q");
	float cantidadRetirar = input.nextFloat();
	cuenta1.retirar(cantidadRetirar);
	cuenta1.imprimir();
        
        // Operaciones sobre la cuenta. 
        System.out.print("Ingresar cantidad a depositar: Q");
        float cantidadDepositar2 = input.nextFloat();
    	cuenta2.consignar(cantidadDepositar);
	System.out.print("Ingresar cantidad a retirar: Q");
	float cantidadRetirar2 = input.nextFloat();
	cuenta2.retirar(cantidadRetirar);
	cuenta2.imprimir();
    }  //end main
}  // end clase principal