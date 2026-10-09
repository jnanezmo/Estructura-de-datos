package Contenedor;


public class Main {
    public static void main(String[] args) {
        // Crear el objeto Puerto
        Puerto objPuerto = new Puerto();
        
        System.out.println("SISTEMA DE CONTENEDORES");
        
        // 1. Registrar buques
        System.out.println("REGISTRAR BUQUES");
        Buque b1 = new Buque("Sol Naciente", "Panamá", 2);
        Buque b2 = new Buque("Mar Grande", "Colombia", 5);
        
        String res1 = objPuerto.registrarBuque(b1);
        String res2 = objPuerto.registrarBuque(b2);
        
        System.out.println("Resultado 1: " + res1);
        System.out.println("Resultado 2: " + res2);
        
        // Mostrar muelle
        objPuerto.mostrarBuques();
        
        // 2. Registrar contenedores
        System.out.println(" REGISTRAR CONTENEDORES ");
        Contenedor c1 = new Contenedor("A001", 15.5, "China");
        Contenedor c2 = new Contenedor("B002", 20.0, "Colombia");
        Contenedor c3 = new Contenedor("A002", 12.0, "China");
        
        String r1 = objPuerto.registrarContenedor(c1, 3);
        String r2 = objPuerto.registrarContenedor(c2, 3);
        String r3 = objPuerto.registrarContenedor(c3, 7);
        
        System.out.println("Contenedor 1: " + r1);
        System.out.println("Contenedor 2: " + r2);
        System.out.println("Contenedor 3: " + r3);
        
        // Mostrar matriz
        objPuerto.mostrarContenedores();
        
        // Peso total
        System.out.println("PESO TOTAL ");
        double total = objPuerto.calcularPesoTotal();
        System.out.println("Peso total: " + total + " toneladas");
        
        // Listar por origen
        System.out.println(" CONTENEDORES POR ORIGEN ");
        objPuerto.listarPorOrigen();
        
        System.out.println(" FIN DEL PROGRAMA ");
    }
}
