package TallerPilasColas;

public class MainVotos {
    public static void main(String[] args) {
        Votos votos = new Votos();
        votos.agregarVoto("Candidato A");
        votos.agregarVoto("Candidato B");
        votos.agregarVoto("Candidato A");
        votos.agregarVoto("Candidato C");
        votos.agregarVoto("Candidato B");

        System.out.println("Total de votos para Candidato A: " + votos.contarVotos("Candidato A"));
        System.out.println("Total de votos para Candidato B: " + votos.contarVotos("Candidato B"));
        System.out.println("Total de votos para Candidato C: " + votos.contarVotos("Candidato C"));
    }
    
}
