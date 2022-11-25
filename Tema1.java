

public class Tema1 {
 

    public void Vector(){
        clearScreen();

        System.out.println("========= Vector ===========");
        System.out.println(" ");
        
        int vector[] = Datos.rellenarArreglo(5);
        Datos.imprimirArreglo(vector);
        System.out.println(" ");
        System.out.println("================================");
    
    }
    private static void clearScreen(){
        System.out.print("\033[H\033[2J");
         System.out.flush();
    }

   
}
