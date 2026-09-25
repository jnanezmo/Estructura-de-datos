import java.util.Scanner;

//PRODUCCION DE 20 PLANTAS DURANTE LOS 7 DIAS DE LA SEMANA

public class Punto25 {
    public static void main(String[] args) {
        OperacionesMatrices objM = new OperacionesMatrices();
        Scanner sc = new Scanner(System.in);

        // filas: plantas (20), columnas: dias (7)
        int[][] produccion = objM.llenarMatriz(20, 7, 10, 100);
        System.out.println("Produccion (filas: plantas 1 a 20, columnas: dias 1 a 7):");
        System.out.println(objM.imprimirMatriz(produccion));

        // planta con mayor produccion semanal
        int[] totalPlanta = objM.totalesPorFila(produccion);
        int plantaMayor = objM.posicionMayor(totalPlanta);
        System.out.println("Planta con mayor produccion semanal: " + (plantaMayor + 1)
                + " con " + totalPlanta[plantaMayor]);

        // planta con mayor produccion en un dia especifico
        int dia;
        do {
            System.out.print("\nIngrese el dia a consultar (1 a 7): ");
            dia = sc.nextInt();
        } while (dia < 1 || dia > 7);

        int plantaDia = objM.filaMayorEnColumna(produccion, dia - 1);
        System.out.println("Planta con mayor produccion el dia " + dia + ": " + (plantaDia + 1)
                + " con " + produccion[plantaDia][dia - 1]);
        sc.close();
    }
}
