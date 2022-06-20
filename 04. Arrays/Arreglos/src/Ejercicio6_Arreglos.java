import java.util.Scanner;

public class Ejercicio6_Arreglos {  
    public static void main(String[] args) throws Exception {
        /*
         * Leer los datos correpondientes a dos tablas de 12 elementos numéricos
         * y mezclarlos en una tercera tabla de la forma:
         * 3 de la tabla A, 3 de la tabla B, luego otros 3 de la tabla A,
         * otros 3 de la tabla B, etc
         */

        Scanner entrada = new Scanner(System.in);

        int tablaA[] = new int[12];
        int tablaB[] = new int[12];
        int tablaC[] = new int[24];
        int i, j;

        System.out.println("Digite 12 números de la primer tabla");
        for (i = 0; i < 12; i++){
            System.out.print("Digite el número de la posición "+(i+1)+" : ");
            tablaA[i] = entrada.nextInt();
        }

        System.out.println("\nDigite 12 números de la Segunda tabla");
        for (i = 0; i < 12; i++){
            System.out.print("Digite el número de la posición "+(i+1)+ " : ");
            tablaB[i] = entrada.nextInt();
        }

        i=0; //Reinicia el valor de i ya que en el anterior buque habia quedado en 13
        j=0;

        while(i<12){
            for (int k =0; k<3; k++){
                tablaC[j] = tablaA[i+k];
                j++;
            }

            for (int k =0; k<3; k++){
                tablaC[j] = tablaB[i+k];
                j++;
            }

            i+=3;
        }
        System.out.print("\nEl arreglo es: ");
        for(i=0; i<24; i++){
            System.out.print(tablaC[i]+ " ");
        }

        System.out.println();
        
    }
    
}
