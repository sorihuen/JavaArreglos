public class Datos1 {

 
    public boolean esPrimo(int num){
        boolean primo = true;
        if(num ==1 ||((num % 2)==0 && num> 2)){
            primo = false;
        }else{
            for(int i = 2; i<(num/2); i++){
                if(num % i ==0){
                    primo = false;
                    break;

                }

            }

        }

        return primo;
    }
    public void primosRango(int r, int z ){
        if (r>0 && z>0){
            int cantidadPrimos = 0;
            int inferior = (r<z)? r:z;
            int superior = (r>z)? r:z;
            System.out.println(" ");
            System.out.println("Los primos en el rango dado:");
            System.out.println("");
            for(int i = inferior;i<=superior;i++){
                if (esPrimo(i)){
                    System.out.print(i + " ");
                    cantidadPrimos++;
                }
                if (i%80==0){
                    System.out.println("");

                }

            }
            System.out.println("");  
            System.out.println("Los primos en el rango[" + inferior + " - " + superior + "] :" + cantidadPrimos);
           
        } 
            

            
    }
}
