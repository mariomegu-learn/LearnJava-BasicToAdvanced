import java.util.Scanner;

public class Ejercicio7_Arreglos {
    public static void main (String[] args) throws Exception{
        /*
         * Leer por teclado una serie de 10 números enteros. 
         * La Aplicación debe indicar si los números estan
         * ordenados de forma creciente, decreciente o si estan desordenados.
         */

        Scanner entrada =  new Scanner(System.in);
        int numeros[] = new int[10];
        boolean creciente=false, decreciente=false;

        System.out.println("Por favor digite 10 números");

        /* Captura los datos */
        for (int i = 0; i < 10; i++){
            System.out.print("Ingrese el número para la posición " + (i+1) + " : ");
            numeros[i] = entrada.nextInt();
        }

        /* recorre el arreglo para validar */
        for (int i=0; i<9; i++){
            if (numeros[i] < numeros[i+1]){
                creciente=true;
            }
            
            if(numeros[i] > numeros[i+1]){
                decreciente=true;
            }
        }

        if (creciente==true && decreciente==false){
            System.out.println("\nLa serie es creciente");
        } else if (creciente == false && decreciente == true){
            System.out.println("\nLa serie es decreciente");
        } else if (creciente==true && decreciente==true){
            System.out.println("\nLa serie esta desordenada");
        } else {
            System.out.println("\nLos números ingresados son iguales");
        }



    }
}
