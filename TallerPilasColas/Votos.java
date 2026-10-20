package TallerPilasColas;

public class Votos {
    private int totalVotosA;
    private int totalVotosB;
    private int totalVotosC;

    public Votos() {
        this.totalVotosA = 0;
        this.totalVotosB = 0;
        this.totalVotosC = 0;
    }

    public void agregarVoto(String candidato) {
        switch (candidato) {
            case "Candidato A":
                totalVotosA++;
                break;
            case "Candidato B":
                totalVotosB++;
                break;
            case "Candidato C":
                totalVotosC++;
                break;
            default:
                System.out.println("Candidato no válido.");
        }
    }

    public int contarVotos(String candidato) {
        switch (candidato) {
            case "Candidato A":
                return totalVotosA;
            case "Candidato B":
                return totalVotosB;
            case "Candidato C":
                return totalVotosC;
            default:
                System.out.println("Candidato no válido.");
                return 0;
        }
    }
}
