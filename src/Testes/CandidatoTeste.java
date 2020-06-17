package Testes;

import Classes.Candidato;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CandidatoTeste {
    private static Candidato candidato;

    @BeforeAll
    static void beforeAll() {
         candidato = new Candidato(
                "Pandora",
                18,
                "Cats Democraticos",
                250);
    }

    @Test
    void verificarSeONomeNaoENull() {
        assertNotNull(candidato.getNome());
    }

    @Test
    void verificarSePartidoNaoENull() {
        assertNotNull(candidato.getPartidoPolitico());
    }

    @Test
    void verificarSeAIdadeNaoENull() {
        assertNotNull(candidato.getIdade());
    }

    @Test
    void verificarSeONumeroDeVotosNaoENull() {
        assertNotNull(candidato.getNumeroDeVotos());
    }

}