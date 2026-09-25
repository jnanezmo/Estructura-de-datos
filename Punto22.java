import java.util.Scanner;
//LEER LAS DIMENSIONES Y LA MATRIZ, VISUALIZARLA Y ENCONTRAR EL MAYOR Y MENOR ELEMENTO CON SUS POSICIONES
 
public class Punto22 {
    public static void main(String[] args) {
        OperacionesMatrices objM = new OperacionesMatrices();
        Scanner sc = new Scanner(System.in);
        // leer dimensiones
        System.out.print("Numero de filas: ");
        int f = sc.nextInt();
        System.out.print("Numero de columnas: ");
        int c = sc.nextInt();
        // leer y mostrar matriz
        int[][] matriz = objM.leerMatriz(f, c, sc);
        System.out.println("\nMatriz ingresada:");
        System.out.println(objM.imprimirMatriz(matriz));
        // mayor y menor
        System.out.println(objM.mayorMenor(matriz));
        sc.close();
    }
}
 
