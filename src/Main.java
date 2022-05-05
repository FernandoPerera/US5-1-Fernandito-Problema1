import com.nandosoft.utils.CustomQueue;
import com.nandosoft.utils.CustomStack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CustomStack pila = new CustomStack();

        int contador = 0;
        int resultado = 0;
        int mostrar = 0;

        boolean salida = false;

        while (salida == false) {
            System.out.println("Introduzca números para añadirlos en una pila");
            System.out.println("---------------------");

            int numero = scanner.nextInt();
            scanner.nextLine();
            pila.push(numero);

            System.out.println("Si desea dejar de introducir números pulse la letra Q sino pulse enter");
            String Q = scanner.nextLine();
            if (Q.equals("Q")) {
                salida = true;
            }
            contador++;
        }

        System.out.println();

        for (int i = 0; i < contador; i++) {

             mostrar = pila.pop();

            System.out.print((mostrar) + " | ");
            resultado += mostrar;
        }

        System.out.println("\n\tEl resultado de la suma de esos números es : " + resultado);
        
    }
}
