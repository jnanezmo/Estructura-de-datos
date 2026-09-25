public class Punto20 {
    //GENERAR UNA MATRIZ 10 x 10 CON CEROS EN LA DIAGONAL PRINCIPAL HACIA ARRIBA
    public static void main(String[] args) {
        OperacionesMatrices objM = new OperacionesMatrices();
        // generar matriz
        int[][] matriz = objM.ceroDiagonalArriba(10, 1, 9);
        System.out.println(objM.imprimirMatriz(matriz));
    }
}

