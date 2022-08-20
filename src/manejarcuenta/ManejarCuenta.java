package manejarcuenta;

import java.util.Scanner;

/*
 * Esta clase prueba diferentes acciones realizadas por cuentas bancarias de tipo Cuenta de ahorros y Cuenta corriente
 */
public class ManejarCuenta
{
    Scanner input = new Scanner(System.in);
    /*
     * Método menuGeneral que permite elegir el tipo de cuenta que
     * queremos manejar, dependiendo del tipo se accederá a sub menú de 
     * cada cuenta para tener las distintas funcionalidades
     */
    
    public void menuGeneral()
    {
        boolean salir = false;
        int opcion;
        
        while(!salir)
        {
           System.out.println("");
           System.out.println("|  Tipo de cuenta que deseas usar:     |");
           System.out.println("|  1. Ahorro                           |");
           System.out.println("|  2. Monetaria                        |");
           System.out.println("|  0. FINALIZAR                        |");
           System.out.println("| --------Selecciona la opción-------- |");
           opcion = input.nextInt();
           input.nextLine();
           switch(opcion)
           {
            case 1:
                menuAhorro(); //Llam al menú de la cuenta de ahorros
                break;
            case 2:
                menuMonetaria(); //Llam al menú de la cuenta monetaria
                break; 
            case 0:
                salir = true;               
                break;
            default:
                System.out.println("La opción ingresada es incorrecta");          
            } // End switch
        } // End while
    } // End menuGeneral
    
    //**************************************************************
    
    // Método menuahorro para acceder a las funciones que tiene una cuenta de ahorro
    public void menuAhorro()
    {
        boolean salir = false;
        int opcion;
        
        // Accedemos a la cuenta
        System.out.println("Ingrese número de cuenta");
        int cuenta = input.nextInt();
        System.out.println("Ingrese saldo inicial= Q");
        float saldoInicialAhorros = input.nextFloat();
        System.out.print("Ingrese tasa de interés= ");
        float tasaAhorros = input.nextFloat();
        
        // Instanciar objeto cuentaAhorros
	CuentaAhorros cuenta1 = new CuentaAhorros(cuenta, saldoInicialAhorros, tasaAhorros);
        
        // Ciclo para acceder a las operaciones sobre la cuenta
        while(!salir)
        {
           System.out.println("");
           System.out.println("|           **CUENTA DE AHORRO**          |");
           System.out.println("|  Tipo de transacción a realizar:        |");
           System.out.println("|  1. Depositar                           |");
           System.out.println("|  2. Debitar                             |");
           System.out.println("|  3. Consultar Saldo                     |");
           System.out.println("|  0. MENÚ PRINCIPAL                      |");
           System.out.println("| ---------Selecciona la opción---------- |");
           opcion = input.nextInt();
           input.nextLine();
           switch(opcion)
           {
            case 1:
                System.out.print("Ingresar cantidad a depositar: Q");
                float cantidadDepositar = input.nextFloat();
                cuenta1.consignar(cantidadDepositar);
                break;
            case 2:
                System.out.print("Ingresar cantidad a retirar: Q");
                float cantidadRetirar = input.nextFloat();
                cuenta1.retirar(cantidadRetirar);
                break;
            case 3:
                cuenta1.imprimir();
                break;
            case 0:
                salir = true;               
                break;
            default:
                System.out.println("La opción ingresada es incorrecta");          
            } // End switch
        } // End while
    } // End menuAhorros
    
    //**************************************************************
    
    // Método menuMonetaria para acceder a las funciones que tiene una cuenta monetaria
    void menuMonetaria()
    {
        boolean salir = false;
        int opcion;
        
        // Solicitar datos de la cuenta       
        System.out.println("Ingrese número de cuenta");
        int cuenta = input.nextInt();
        System.out.println("Ingrese saldo inicial= Q");
        float saldoInicialAhorros = input.nextFloat();
        
        // Instanciar objeto CuentaMonetaria
        CuentaMonetaria cuenta2 = new CuentaMonetaria(cuenta, saldoInicialAhorros, 0);
        
        // Ciclo para acceder a las operaciones sobre la cuenta
        while(!salir)
        {
           System.out.println("");
           System.out.println("|           **CUENTA MONETARIA**          |");
           System.out.println("|  Tipo de transacción a realizar:        |");
           System.out.println("|  1. Depositar                           |");
           System.out.println("|  2. Debitar                             |");
           System.out.println("|  3. Consultar Saldo                     |");
           System.out.println("|  0. MENÚ PRINCIPAL                      |");
           System.out.println("| ----------Selecciona la opción--------- |");
           opcion = input.nextInt();
           input.nextLine();
           switch(opcion)
           {
            case 1:
                System.out.print("Ingresar cantidad a depositar: Q");
                float cantidadDepositar2 = input.nextFloat();
                cuenta2.consignar(cantidadDepositar2);
                cuenta2.descuentoManejoCuenta();
                break;
            case 2:
                System.out.print("Ingresar cantidad a retirar: Q");
                float cantidadRetirar2 = input.nextFloat();
                cuenta2.retirar(cantidadRetirar2);
                cuenta2.descuentoManejoCuenta();
                break;
            case 3:
                cuenta2.imprimir();
                break;
            case 0:
                salir = true;               
                break;
            default:
                System.out.println("La opción ingresada es incorrecta");          
            } // End switch
        } // End while 
    } // End menuMonetaria
    
    //**************************************************************
    
    /* Método main que inicializará un objeto ManejarCuenta y accederá al método
     * menúGeneral el cual hará los llamados correspondientes
    */
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("|------------**BIENVENIDO**------------|"); 
        System.out.println("|          **BANCO CENTRAL**           |");
        System.out.println("|______________________________________|");
        
        // Solicitar datos de la persona
        System.out.println("Ingrese Nombres");
	String nombres = input.next();
	System.out.println("Ingrese Apellidos");
	String apellidos = input.next();
	System.out.println("Ingrese DPI");
	int dpi = input.nextInt();
		
	// Instanciar objeto persona
	Persona persona1 = new Persona(nombres, apellidos, dpi);
        ManejarCuenta menu = new ManejarCuenta();
        menu.menuGeneral();	
    }  //end main
}  // end clase principal