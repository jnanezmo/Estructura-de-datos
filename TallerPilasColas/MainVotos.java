package TallerPilasColas;
 //Dados dos contadores: upvotes y downvotes, modela cada voto en una cola como +1
 //(a favor) o-1 (en contra). Procesa la cola sumando todos los valores hasta vaciarla. Retorna la
 //diferencia: (a favor) − (en contra).
 //Ejemplos de verificacion.
 //Entrada: upvotes = 13, downvotes = 0 Salida esperada: 13
 //Entrada: upvotes = 2, downvotes = 33 Salida esperada:-31
 //Entrada: upvotes = 132, downvotes = 132 Salida esperada: 0

public class MainVotos {


 
 public static void main(String[] args) {

        System.out.println("Resultado 1: " + VotosFavorEncontra.calcularDiferencia(13, 0));
        System.out.println("Resultado 2: " + VotosFavorEncontra.calcularDiferencia(2, 33));
        System.out.println("Resultado 3: " + VotosFavorEncontra.calcularDiferencia(132, 132));

    }



 
}