import javax.swing.JOptionPane;

public class Ejercicio16B {

    public static void main(String[] args) throws Exception{
        /**
         * Pide un numero que debe estar entre 0 y 10 para mostrar la tabla de multiplicar de dicho numero
         */

         int numero, resultado=0;

         numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero entre 0 y 10"));

         if (numero >= 0 && numero <= 10){

            for (int i=0; i<=10; i++){

                resultado = numero *i;
                System.out.println(numero + " x " + i + " = " +resultado);

            }

         } else{
             System.out.println("El número no corresponde al rango permitido");
         }
    }
    
}
