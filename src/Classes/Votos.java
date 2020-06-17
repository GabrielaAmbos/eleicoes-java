package Classes;
import java.util.ArrayList;
import java.util.List;

public class Votos {
    private List<Candidato> candidatos;

    public Votos() {
        this.candidatos = new ArrayList<>();
    }

    public Candidato candidato (int posicao) {
        return this.candidatos.get(posicao);
    }

    public void novoCandidato(Candidato candidato) {
        this.candidatos.add(candidato);
    }

    public void deletaCandidato(int posicao) {
        this.candidatos.remove(posicao);
    }

    public Candidato candidatoMaisNovo() {
        if (this.candidatos.isEmpty()) {
            return null;
        } else {
            return candidatoMaisNovo(0, 0);
        }
    }

    private Candidato candidatoMaisNovo(int posicao, int maisNovo) {
        if (this.candidatos.size() == posicao) {
            return this.candidatos.get(maisNovo);
        } else {
            if (this.candidatos.get(maisNovo).getIdade() > candidatos.get(posicao).getIdade()) {
                maisNovo = posicao;
            }
            posicao++;
            return candidatoMaisNovo(posicao, maisNovo);
        }
    }

    public Candidato candidatoMaisVelho() {
        if (this.candidatos.isEmpty()) {
            return null;
        } else {
            return candidatoMaisVelho(0, 0);
        }
    }

    private Candidato candidatoMaisVelho(int posicao, int maisVelho) {
        if (this.candidatos.size() == posicao) {
            return this.candidatos.get(maisVelho);
        } else {
            if (this.candidatos.get(maisVelho).getIdade() < candidatos.get(posicao).getIdade()) {
                maisVelho = posicao;
            }
            posicao++;
            return candidatoMaisVelho(posicao, maisVelho);
        }
    }

    public Candidato candidatoMaisVotado() {
        if (this.candidatos.isEmpty()) {
            return null;
        } else {
            return candidatoMaisVotado(0, 0);
        }
    }

    private Candidato candidatoMaisVotado(int posicao, int maisVotado) {
        if (this.candidatos.size() == posicao) {
            return this.candidatos.get(maisVotado);
        } else {
            if (this.candidatos.get(maisVotado).getNumeroDeVotos() < candidatos.get(posicao).getNumeroDeVotos()) {
                maisVotado = posicao;
            }
            posicao++;
            return candidatoMaisVotado(posicao, maisVotado);
        }
    }

    public Candidato candidatoMenosVotado() {
        if (this.candidatos.isEmpty()) {
            return null;
        } else {
            return candidatoMenosVotado(0, 0);
        }
    }

    private Candidato candidatoMenosVotado(int posicao, int menosVotado) {
        if (this.candidatos.size() == posicao) {
            return this.candidatos.get(menosVotado);
        } else {
            if (this.candidatos.get(menosVotado).getNumeroDeVotos() > candidatos.get(posicao).getNumeroDeVotos()) {
                menosVotado = posicao;
            }
            posicao++;
            return candidatoMenosVotado(posicao, menosVotado);
        }
    }

    public int totalDeVotos() {
        if (this.candidatos.isEmpty()) {
            return 0;
        } else {
            return totalDeVotos(0);
        }
    }

    private int totalDeVotos(int posicao) {
        if (this.candidatos.size() == (posicao + 1)) {
            return this.candidatos.get(posicao).getNumeroDeVotos();
        } else {
            return this.candidatos.get(posicao).getNumeroDeVotos() + totalDeVotos(++posicao);
        }
    }

    public double mediaDeVotos() {
        if (this.candidatos.isEmpty()) {
            return 0;
        } else {
            return mediaDeVotos(0, 0);
        }
    }

    private double mediaDeVotos(int posicao, int soma) {
        if (this.candidatos.size() == posicao) {
            return (double) soma / posicao;
        } else {
            soma += this.candidatos.get(posicao).getNumeroDeVotos();
            return mediaDeVotos(++posicao, soma);
        }
    }
}