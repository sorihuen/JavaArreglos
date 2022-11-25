import java.util.Scanner;

public class Tema5 {
    private static Scanner sc = new Scanner(System.in);
    public void tabla(){
        boolean respuesta= true;
        int opcion;
        clearScreen();

        int cuadro[][] = new int [11][11];
        System.out.println("=============== Tabla Multiplicar ==========================");

        for (int i = 0; i < cuadro.length; i++) {
            for (int j = 0; j < cuadro[0].length; j++) {
                cuadro[i][j]= i * j;
            }
        }

        for(int i=1; i< cuadro.length;i++){
            for(int j=1; j<cuadro[0].length;j++){
              if(i!= cuadro.length){
                  System.out.print(j + " X " + i + " "+ "|");
                }else{
                    System.out.print(j + " X " + i + " "+ "|");

                }
                 
     
            }
            System.out.println();
            
        }
        
        do{
            menu();
            opcion = capturaopcion();
            clearScreen();
             respuesta = evaluaropcion(opcion);

        } while(respuesta == true);

    }
    private static void clearScreen(){
        System.out.print("\033[H\033[2J");
         System.out.flush();
    }
    private static void multiplicacion(){
        System.out.println("");
        System.out.println("=========================================");
        System.out.println("Ingrese la posicion de la fila");
        int i =  Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese la posicion de la columna");
        int j =  Integer.parseInt(sc.nextLine());
        System.out.println("Respuesta: " + i * j);
        System.out.println("");
        
    }
    private static boolean evaluaropcion(int opcion){

        switch(opcion){
            case 1:
               multiplicacion();

            return true;
            case 0:
                System.out.println("");
                System.out.println(" ========== Salir del Sistema ===========");
                  
            return false;
            default:
            System.out.println("---------- Opcion Invalida --------");
            
        }
        return true;
    }
    private static void menu(){

      
        System.out.println("Seleccione una opcion");
        System.out.println("[1]. Multiplicar la tabla");
        System.out.println("[0].*****  Salir del taller *****");
        System.out.println("-----------------------------------------------");
    
    }
    private static int capturaopcion(){
        return Integer.parseInt(sc.nextLine());

    }


}  

    


