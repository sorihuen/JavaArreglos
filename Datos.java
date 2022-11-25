import java.util.Scanner;

public class Datos {

    private static Scanner sc = new Scanner(System.in);


    public static int[] rellenarArreglo(int numero){
        System.out.println("** Llenemos el vector ***");
        System.out. println("");

        int array[] = new int [5];
        for (int i=0; i< array.length; i ++){
          
            System.out.println("Digite los datos del vector "+ (i));
            array[i] = Integer.parseInt(sc.nextLine());


        }
        return array;
    
    }
    public static void  imprimirArreglo(int arr[]){

        System.out.println("Imprimir los Datos:");
        for (int i=0; i< arr.length; i ++){

            System.out.println("["+ i+"] " + arr[i]);

        }



    }
    






}
