package Testes;

import Classes.Candidato;
import Classes.Votos;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VotosTeste {
    private static Votos votos = new Votos();

    @BeforeAll
    static void beforeAll() {
        Candidato candidato = new Candidato(
                "Pandora",
                18,
                "Cats Democraticos",
                250);
        votos.novoCandidato(candidato);
        candidato = new Candidato(
                "Uruka",
                20,
                "Cats Democraticos",
                400);
        votos.novoCandidato(candidato);
        candidato = new Candidato(
                "Snow",
                25,
                "Soninhos Comunistas",
                300);
        votos.novoCandidato(candidato);
    }

    @Test
    void novoCandidato() {
        Candidato candidato = new Candidato(
                "Delphi",
                19,
                "Espirros Republicanos",
                350);
        votos.novoCandidato(candidato);
        assertEquals(votos.candidato(3), candidato);
        votos.deletaCandidato(3);
    }

    @Test
    void candidatoMaisNovo() {
        Candidato candidato = votos.candidatoMaisNovo();
        assertEquals(candidato.getNome(), "Pandora");
    }

    @Test
    void candidatoMaisVelho() {
        Candidato candidato = votos.candidatoMaisVelho();
        assertEquals(candidato.getNome(), "Snow");
    }

    @Test
    void candidatoMaisVotado() {
        Candidato candidato = votos.candidatoMaisVotado();
        assertEquals(candidato.getNome(), "Uruka");
    }

    @Test
    void candidatoMenosVotado() {
        Candidato candidato = votos.candidatoMenosVotado();
        assertEquals(candidato.getNome(), "Pandora");
    }

    @Test
    void totalDeVotos() {
        assertEquals(votos.totalDeVotos(), 950);
    }

    @Test
    void mediaDeVotos() {
        assertEquals(votos.mediaDeVotos(), 316.6666666666667);
    }
}