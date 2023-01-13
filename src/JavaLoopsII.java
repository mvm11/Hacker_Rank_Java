import java.util.*;

public class JavaLoopsII {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int t=in.nextInt();

        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j = 0; j < n; j ++){
                a = a + b;
                System.out.print(a + " ");
                b = b *2;
            }
            System.out.println("");
        }
        in.close();
    }
}

/*
Este código es una solución de Java para un problema específico.

El código utiliza la clase Scanner para leer la entrada del usuario a través del teclado.

La variable "t" se inicializa con el primer valor de entrada del usuario,
que representa la cantidad de conjuntos de operaciones que se deben realizar.

Luego, el código entra en un bucle for que se ejecuta "t" veces. Dentro de este bucle,
las variables "a" y "b" se inicializan con los siguientes dos valores de entrada del usuario.
La variable "n" se inicializa con el tercer valor de entrada del usuario.

Dentro del segundo bucle for, el código realiza una serie de operaciones en las variables "a" y "b".
Cada iteración del bucle, "a" se actualiza para ser la suma de sí mismo y "b",
y luego se imprime en pantalla. "b" se actualiza para ser el doble de sí mismo.

Finalmente, después de "n" iteraciones,
se imprime un salto de línea y se vuelve a comenzar el proceso con el siguiente conjunto de operaciones
(si es que hay uno).

*/


