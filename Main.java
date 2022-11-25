import java.util.Scanner;
public class Main {
    private static Scanner sc = new Scanner(System.in);
  
    public static void main (String[] args){

        boolean respuesta= true;
        int opcion;
        clearScreen();


        do{
            menu();
            opcion = capturaopcion();
            clearScreen();
             respuesta = evaluaropcion(opcion);
            
        } while(respuesta == true);


    }

    private static int capturaopcion(){
        return Integer.parseInt(sc.nextLine());

    }
    private static void clearScreen(){
        System.out.print("\033[H\033[2J");
         System.out.flush();
    }
    private static void menu(){
        System.out.println("Seleccione un tema del Taller");
        System.out.println("1. Tema [1]: ***** Vector *****");
        System.out.println("2. Tema [2]: ***** Vector Aleatorio *****");
        System.out.println("3. Tema [3]: ***** Numeros Primos*****");
        System.out.println("4. Tema [4]: ***** Matrices *****");
        System.out.println("5. Tema [5]: ***** Tabla Multiplicar *****");
        System.out.println("0.  *****  Salir del taller *****");
        System.out.println("-----------------------------------------------");
      
        
    }
    private static boolean evaluaropcion(int opcion){

        switch(opcion){
            case 1:
                Tema1 t1 = new Tema1();
                t1.Vector();
            return true;
            case 2:
                Tema2 t2 = new Tema2();
                t2.vectorAleatorio();
               
            return true;  
            case 3:
                Tema3 t3 = new Tema3();
                t3.numerosPrimos();
            
            return true;

            case 4:
                Tema4 t4 = new Tema4();
                t4.matriz();
               
            return true;

            case 5:
               Tema5 t5 = new Tema5();
               t5.tabla();
                
               
            return true;
 
            case 0:
                 System.out.println("");
                 System.out.println(" ========== Saliendo del Sistema ===========");
                  
            return false;

            default:
            System.out.println("---------- Opcion Invalida --------");
            
        }
        return true;
    }




}