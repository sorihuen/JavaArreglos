import java.util.Random;

public class Tema2 {
    static Random R = new Random();
    static int conteoPares = 0;
    static int conteoImpares = 0;
    int arreglo[] = new int[20];
  
    int impar[] = new int[conteoImpares];
    int contador = 0;
    public void vectorAleatorio(){
        clearScreen();
        System.out.println(" ");
        System.out.println("Arreglo llenado con numeros Aleatorios del 0 al 100.");


        for (int i=0; i< arreglo.length; i ++){
            arreglo[i] = R.nextInt(99)+1;
         
            if (arreglo[i] % 2==0){
                conteoPares++;
            }else{
                conteoImpares++;
            }

        }
        int par[] = new int[conteoPares];
        int impar[] = new int[conteoImpares];

        conteoPares=0;
        conteoImpares=0;

        for (int i = 0 ; i<arreglo.length;i++){

            if(arreglo[i] % 2==0){
                par[conteoPares]= arreglo[i];
                conteoPares++;

            }else{
                impar[conteoImpares]= arreglo[i];
                conteoImpares++;
            }

        }
        System.out.print("\n Numero pares: ");
        for (int i=0;i<conteoPares; i++){
            System.out.print(par[i] + ", ");

        }
   

        System.out.print("\n Numeros Impares: ");
        for (int i=0;i<conteoImpares; i++){
            System.out.print(impar[i] + ", ");

        }
        System.out.println(" ");
        System.out.println("---------------------------------------------------");
        System.out.println(" ");



    
    }
    private static void clearScreen(){
        System.out.print("\033[H\033[2J");
         System.out.flush();
    }

       


    
 
}
