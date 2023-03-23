/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageEjercicios;

/**
 *
 * @author Computador 1
 */
public class E11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
    
    
    
    
    
    
    /*public class EjercicioExtra24 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la Dimensión del Vector de Fibonacci:");
        int n = leer.nextInt();
        int[] V = new int[n];
        Fibonacci(n,V);
    }

    public static void Fibonacci(int n, int[] V) {
        int f;
        int a = 1;
        int b = 1;
        for (int i = 0; i < n; i++){
            if (i < 2) {
                V[0] = 1;
                V[1] = 1;
            } else {
                f = a + b;
                b = a;
                a = f;
                V[i] = f;
            }
        }
        System.out.println("Vector de Fibonacci de Dimensión " + n + ":");
        System.out.print("V = {");
        for (int i = 0; i < n; i++) {
            System.out.print(V[i] + " ");        
        }
        System.out.print("}");
    }*/
    
    /* * Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y,
 * a medida que el usuario las va ingresando, construya una “sopa de letras para
 * niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en
 * orden horizontal en una fila que será seleccionada de manera aleatoria. Una
 * vez concluida la ubicación de las palabras, rellene los espacios no
 * utilizados con un número aleatorio del 0 al 9. Finalmente imprima por
 * pantalla la sopa de letras creada. Nota: Para resolver el ejercicio deberá
 * investigar cómo se utilizan las siguientes funciones de Java substring(),
 * Length() y Math.random().
 
public class EjercicioExtra23 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String[][] M = new String[20][20];
        int fila = 20, f;
        int columna;
        int lon, cont = 0, aux = -1;
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                M[i][j] = "*";
            }
        }
        System.out.println("Ingrese 5 palabras de mínimo 3 y hasta 5 caracteres:");
        do {
            String palabra = leer.nextLine();
            lon = palabra.length();
            if (lon > 2 && lon < 6) {
                cont++;
                do {
                    f = (int) (Math.random() * 20);
                } while (fila == f);
                fila = f;
                columna = (int) (Math.random() * 16);
                for (int j = columna; j < columna + lon; j++) {
                    aux++;
                    M[fila][j] = palabra.substring(aux, aux + 1);
                }
                aux = -1;
            } else {
                System.out.println("Ingrese una palabra de mínimo 3 y hasta 5 caracteres:");
            }
        } while (cont < 5);

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                if ("*".equals(M[i][j])) {
                    M[i][j] = String.valueOf((int) (Math.random() * 10));
                }
            }
        }

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                System.out.print("[" + M[i][j] + "]");
            }
            System.out.println("");
        }
    }

}
package introjava;
import java.util.Scanner;
/**
Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y 
muestre la suma de sus elementos.
 public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int n, m, suma = 0;
        System.out.println("Matriz de tamaño NxM");
        System.out.println("Ingrese la cantidad de filas:");
        n = leer.nextInt();
        System.out.println("Ingrese la cantidad de columnas:");
        m = leer.nextInt();
        int[][] M = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                M[i][j] = (int) (Math.random()*10);
                suma += M[i][j];
                System.out.print("[" +M[i][j]+ "]");
            }
            System.out.println("");
        }
        System.out.println("La suma de los elementos de la matriz es:");
        System.out.println(suma)
    */
}