import java.util.Scanner;

public class Ejercicio4_Arreglos {
    public static void main (String[] args) throws Exception{
        /**
         * Leer 10 numeros enteros, guardarlos en un arreglo.
         * Se debe mostrar en pantalla en el siguiente order:
         * el primero y el ultimo
         * el segundo y el penultimo
         * el tercero y etc...
         */

        Scanner entrada = new Scanner(System.in); //Comando para entrada de datos

        int numeros[] = new int[10];
        int primero = 0, segundo = 0, tercero = 0, cuarto=0, quinto=0, sexto=0, septimo=0, octavo=0, noveno=0, decimo=0; 

        System.out.println("Digite 10 números");

        for (int i = 0; i < 10; i++){
            System.out.print((i+1)+". Digite un número: ");
            numeros[i] = entrada.nextInt();

            if (i == 0){
                primero = numeros[i];
            } else if (i == 1){
                segundo = numeros[i];
            } else if (i == 2){
                tercero = numeros[i];
            } else if (i == 3){
                cuarto = numeros[i];
            } else if (i == 4){
                quinto = numeros[i];
            } else if (i == 5){
                sexto = numeros[i];
            } else if (i == 6){
                septimo = numeros[i];
            } else if (i == 7){
                octavo = numeros[i];
            } else if (i == 8){
                noveno = numeros[i];
            } else if (i == 9) {
                decimo = numeros[i];
            }
        }

        System.out.println("El primer número es: " + primero + " y el último número es: " + decimo);
        System.out.println("El segundo número es: " + segundo + " y el penúltimo número es: " +noveno);
        System.out.println("El tercer número es: " + tercero + " y el antepenúltimo número es: " +octavo);
        System.out.println("El cuarto número es: " + cuarto + " y el septimo número es: " +septimo);
        System.out.println("El quinto número es: " + quinto + " y el sexto número es: " +sexto);
    }

    
    
    
}
