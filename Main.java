package ed04_tarea;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {   
        CCuenta cuenta1;
        int opcion = 0;
        float ingresar, retirar;
        
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        
        do{
            System.out.println("### MENÚ ###");
            System.out.println("1. Ingresar.");
            System.out.println("2. Retirar.");
            System.out.println("3. Salir.");
            
            Scanner input = new Scanner (System.in);
            System.out.println("\nIntroduce una opción: ");
            opcion = input.nextInt();
            
            switch(opcion) {
                case 1:
                    System.out.println("Introduce cantidad a Ingresar: ");
                    ingresar = input.nextFloat();
                    operativa_cuenta(cuenta1, ingresar, opcion);
                    break;
                case 2:
                    System.out.println("Introduce cantidad a retirar: ");
                    retirar = input.nextFloat();
                    operativa_cuenta(cuenta1, retirar, opcion);
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            } 
            mostrar_saldo(cuenta1);
        }while(opcion!=3);
    }
    
    public static void operativa_cuenta(CCuenta cuenta1, float cantidad, int opcion){
            
        if (opcion == 2){
            try {
                cuenta1.retirar(cantidad);
            } catch (Exception e) {
                System.out.print("Fallo al retirar");
            }
        }
        else {
            try {
                System.out.println("Ingreso en cuenta");
                cuenta1.ingresar(cantidad);
            } catch (Exception e) {
                System.out.print("Fallo al ingresar");
            }
        }
    }
    
    public static void mostrar_saldo(CCuenta cuenta1){
        double saldoActual = cuenta1.getSaldo();
        System.out.println("El saldo actual es "+ saldoActual );
    }
}
