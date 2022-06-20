import java.util.Scanner;

public class Ejercicio5_Arreglos {
    public static void main (String[] args) throws Exception{
        /*
         * Leer por teclado dos tablas de 10 números enteros 
         * y mezclarlas en una tercera de la forma:
         * el 1° de la A con el 1° de la B
         * El 2° de la A con el 2° de la B
         * Etc
         */

        Scanner entrada = new Scanner(System.in);

        int tablaA[] = new int[10];
        int tablaB[] = new int[10];
        int tablaC[] = new int[20];
        int j = 0, k = 1;

        

        System.out.println("Digite 10 número para la primer tabla (A)");
        for (int i = 0; i < 10; i++){
            System.out.print((i+1) + ". Digite un número: ");
            tablaA[i] = entrada.nextInt();
            tablaC[j] = tablaA[i];
            j = j + 2;            
        }

        System.out.println("\nDigite 10 número para la Segunda tabla (B)");
        for (int i = 0; i < 10; i++){
            System.out.print((i+1) + ". Digite un número: ");
            tablaB[i] = entrada.nextInt();
            tablaC[k] = tablaB[i];
            k = k + 2; 
        }

        System.out.print("\nEl tercer arreglo es: ");
        for (int i = 0; i<20; i++){
            System.out.print(tablaC[i] + " ");
        }
        System.out.println();
    }
    
}
