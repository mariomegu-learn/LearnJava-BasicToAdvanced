import java.util.Scanner;

public class Ejercicio3_Arreglos {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        float numeros[] = new float[5];
        float suma_positivos = 0, suma_negativos= 0, media_positivos, media_negativos;
        int conteo_positivos=0, conteo_negativos = 0, conteo_ceros = 0;

        System.out.println("Guardando los números en el arreglo");

        for (int i=0; i<5; i++){
            System.out.print((i+1)+". Digite un número: ");
            numeros[i] = entrada.nextFloat();

            if (numeros[i] == 0){
                conteo_ceros++;
            } else if (numeros[i] >= 0){
                suma_positivos += numeros[i];
                conteo_positivos++;
            } else {
                suma_negativos += numeros[i];
                conteo_negativos++;
            }
        }

        if (conteo_positivos == 0){
            System.out.println("No hay número positivos para contar");
        } else {
            media_positivos = suma_positivos / conteo_positivos;
            System.out.println("La madia de los numero positivos es " + media_positivos);
        }

        if (conteo_negativos == 0){
            System.out.println("No hay número Negativos para contar");
        } else {
            media_negativos = suma_negativos / conteo_negativos;
            System.out.println("La madia de los numero positivos es " + media_negativos);
        }

        
        System.out.println("La cantidad de Ceros es: " + conteo_ceros);
    }

}
