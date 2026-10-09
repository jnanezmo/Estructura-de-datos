package Contenedor;

public class Puerto {
    // Matriz 10x10
    private Contenedor[][] areaContenedores = new Contenedor[10][10];
    
    // Arreglo de 10 posiciones
    private Buque[] muelleBuques = new Buque[10];

    // Método para Buques 
    public String registrarBuque(Buque b) {
        if (b.getPosicion() < 0 || b.getPosicion() >= 10) {
            return "Posición inválida";
        }
        if (muelleBuques[b.getPosicion()] != null) {
            return "Ocupada";
        }
        muelleBuques[b.getPosicion()] = b;
        return "OK";
    }

    public void mostrarBuques() {
        System.out.println("\n--- MUELLE DE BUQUES ---");
        for (int i = 0; i < 10; i++) {
            if (muelleBuques[i] == null) {
                System.out.println("Posición " + i + " - Libre");
            } else {
                System.out.println("Posición " + i + " - " + muelleBuques[i].getNombre() 
                    + " (" + muelleBuques[i].getPuertoOrigen() + ")");
            }
        }
    }

    // Método para Contenedores
    public String registrarContenedor(Contenedor c, int col) {
        if (col < 0 || col >= 10) {
            return "Columna inválida";
        }
        // Buscar fila libre desde abajo
        int filaLibre = -1;
        for (int f = 0; f < 10; f++) {
            if (areaContenedores[f][col] == null) {
                filaLibre = f;
                break;
            }
        }
        if (filaLibre == -1) {
            return "Columna llena";
        }
        areaContenedores[filaLibre][col] = c;
        return "OK";
    }

    public void mostrarContenedores() {
        System.out.println("\n--- ÁREA DE CONTENEDORES (10x10) ---");
        System.out.println("   0 1 2 3 4 5 6 7 8 9");
        for (int f = 9; f >= 0; f--) {
            System.out.print(f + "  ");
            for (int c = 0; c < 10; c++) {
                if (areaContenedores[f][c] != null) {
                    System.out.print("X ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }

    // Se hacen los calculos 
    public double calcularPesoTotal() {
        double total = 0;
        for (int f = 0; f < 10; f++) {
            for (int c = 0; c < 10; c++) {
                if (areaContenedores[f][c] != null) {
                    total += areaContenedores[f][c].getPeso();
                }
            }
        }
        return total;
    }

    public void listarPorOrigen() {
        System.out.println("\n--- CONTENEDORES POR ORIGEN ---");
        String[] origenes = new String[100];
        int[] cantidad = new int[100];
        int contador = 0;

        for (int f = 0; f < 10; f++) {
            for (int c = 0; c < 10; c++) {
                if (areaContenedores[f][c] != null) {
                    String origen = areaContenedores[f][c].getOrigen();
                    int indice = -1;
                    for (int i = 0; i < contador; i++) {
                        if (origenes[i] != null && origenes[i].equals(origen)) {
                            indice = i;
                            break;
                        }
                    }
                    if (indice == -1) {
                        origenes[contador] = origen;
                        cantidad[contador] = 1;
                        contador++;
                    } else {
                        cantidad[indice]++;
                    }
                }
            }
        }

        if (contador == 0) {
            System.out.println("No hay contenedores registrados.");
            return;
        }

        for (int i = 0; i < contador; i++) {
            System.out.println(origenes[i] + ": " + cantidad[i] + " contenedor(es)");
        }
    }
}
