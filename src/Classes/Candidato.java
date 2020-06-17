package Classes;

public class Candidato {
    private String nome;
    private int idade;
    private String partidoPolitico;
    private int numeroDeVotos;

    public Candidato(String nome, int idade, String partidoPolitico, int numeroDeVotos) {
        this.nome = nome;
        this.idade = idade;
        this.partidoPolitico = partidoPolitico;
        this.numeroDeVotos = numeroDeVotos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public int getNumeroDeVotos() {
        return numeroDeVotos;
    }

    public void setNumeroDeVotos(int numeroDeVotos) {
        this.numeroDeVotos = numeroDeVotos;
    }

    @Override
    public String toString() {
        return " ------- Informações do candidato ------- \n" +
                "Nome: " + nome + "\n" +
                "Idade: " + idade + "\n" +
                "Partido Politico: " + partidoPolitico + "\n" +
                "Numero de Votos: " + numeroDeVotos + "\n";
    }
}
