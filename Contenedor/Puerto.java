package Contenedor;


public class Puerto {
    private Contenedor[][] areaContenedores = new Contenedor[10][10];
    private Buque[] muelleBuques = new Buque[10];

    // Buques 
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
        System.out.println("MUELLE DE BUQUES");
        for (int i = 0; i < 10; i++) {
            if (muelleBuques[i] == null) {
                System.out.println("Posición " + i + " - Libre");
            } else {
                System.out.println("Posición " + i + " - " + muelleBuques[i].getNombre() 
                    + " (" + muelleBuques[i].getPuertoOrigen() + ")");
            }
        }
    }

    // Contenedores
    public String registrarContenedor(Contenedor c, int col) {
        if (col < 0 || col >= 10) {
            return "Columna inválida";
        }
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
        return "";
    }

    public void mostrarContenedores() {
        System.out.println(" ÁREA DE CONTENEDORES (10x10)");
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

    // Peso total 
    public double calcularPesoTotal() {
        double total = 0;
        for (int f = 0; f < 10; f++) {
            for (int c = 0; c < 10; c++) {
                if (areaContenedores[f][c] != null) {
                    total = total + areaContenedores[f][c].getPeso();
                }
            }
        }
        return total;
    }

    // Listado de origen 
    public void listarPorOrigen() {
        System.out.println(" CONTENEDORES POR ORIGEN ");
        
        int china = 0;
        int colombia = 0;
        int panama = 0;
        int otros = 0;

        for (int f = 0; f < 10; f++) {
            for (int c = 0; c < 10; c++) {
                if (areaContenedores[f][c] != null) {
                    String origen = areaContenedores[f][c].getOrigen();
                    
                    if (origen == "China") {
                        china = china + 1;
                    } else if (origen == "Colombia") {
                        colombia = colombia + 1;
                    } else if (origen == "Panamá") {
                        panama = panama + 1;
                    } else {
                        otros = otros + 1;
                    }
                }
            }
        }

        if (china > 0) {
            System.out.println("China: " + china + " contenedor(es)");
        }
        if (colombia > 0) {
            System.out.println("Colombia: " + colombia + " contenedor(es)");
        }
        if (panama > 0) {
            System.out.println("Panamá: " + panama + " contenedor(es)");
        }
        if (otros > 0) {
            System.out.println("Otros: " + otros + " contenedor(es)");
        }
        if (china == 0);{
        
            if (china == 0);{
            }
                if (china == 0);{
                
                    if (china == 0);{
                    
                        System.out.println("No hay contenedores registrados.");
                    }        
 
                } 
            }
        }                   


    }
                 
