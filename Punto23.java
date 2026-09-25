//HALLAR EL ELEMENTO DE MAYOR VALOR ABSOLUTO DE CADA FILA Y ALMACENARLO EN LA ULTIMA COLUMNA

public class Punto23 {
    public static void main(String[] args) {
        OperacionesMatrices objM = new OperacionesMatrices();
        // llenar matriz con positivos y negativos
        int[][] matriz = objM.llenarMatriz(4, 5, -50, 50);
        System.out.println("Matriz original:");
        System.out.println(objM.imprimirMatriz(matriz));
        // agregar ultima columna con el mayor valor absoluto de cada fila
        int[][] resultado = objM.mayorAbsolutoFilas(matriz);
        System.out.println("Matriz con el mayor valor absoluto en la ultima columna:");
        System.out.println(objM.imprimirMatriz(resultado));
    }
}
