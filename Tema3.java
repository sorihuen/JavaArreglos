public class Tema3 {
    public void numerosPrimos(){
     
       Datos1 d1 = new Datos1();
       clearScreen();
       
       d1.primosRango(1, 1000);
       System.out.println("");  



    }
    private static void clearScreen(){
        System.out.print("\033[H\033[2J");
         System.out.flush();
    }

   
}
