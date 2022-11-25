import java.util.Scanner;
public class Tema4 {
    private static Scanner sc = new Scanner(System.in);

    public void matriz(){
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
    private static void menu(){
        System.out.println("Seleccione un tema del Taller");
        System.out.println("1. Tema [1]: Imprimir Matriz A");
        System.out.println("2. Tema [2]: Imprimir Matriz B");
        System.out.println("0.  *****  Salir del taller *****");
        System.out.println("-----------------------------------------------");
      
        
    }
    private static int capturaopcion(){
        return Integer.parseInt(sc.nextLine());

    }

    private static void clearScreen(){
        System.out.print("\033[H\033[2J");
         System.out.flush();
    }
    public static void imprimirMatriz(int [][] num){
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[0].length; j++) {
               System.out.print(num[i][j] + " ");
  
            }
            System.out.println("");

  
        }

    }
    private static boolean evaluaropcion(int opcion){

        switch(opcion){
            case 1:
                System.out.println("Matriz A");
                int numeros[][]={
                    {1, 2, 3, 4, 5},
                    {6, 7, 8, 9, 10},
                    {11, 12, 13, 14, 15},
                    {16, 17, 18, 19, 20}
                };
                System.out.println();
                imprimirMatriz(numeros);
                System.out.println("");
                System.out.println("===========================");
                
           
                
            return true;
            case 2:
                System.out.println("Matriz B");
                int mat[][]={
                    {1,2,3,4,5},
                    {10,9,8,7,6},
                    {11,12,13,14,15},
                    {20,19,18,17,16}

                };
            
                System.out.println("  {1,2,3,4,5},");
                System.out.println("  {10,9,8,7,6},");
                System.out.println("  {11,12,13,14,15},");
                System.out.println("  {20,19,18,17,16}");
                System.out.println("");
                System.out.println("===========================");
                
                
            return true;
            case 0:
                System.out.println("");

                System.out.println("***** Salir del sistema *******");
                  
            return false;

            default:
            System.out.println("---------- Opcion Invalida --------");
            
        }
        return true;
    }

 
}
   




   
    
    



