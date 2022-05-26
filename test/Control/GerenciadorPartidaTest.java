/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Control;

import Model.Partida;
import Model.SetJogo;
import java.util.ArrayList;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import org.junit.*;

/**
 *
 * @author Joao
 */
public class GerenciadorPartidaTest {

    /**
     * Test of iniciarPartida method, of class GerenciadorPartida.
     */
    @Test
    public void testIniciarPartida() {
        GerenciadorPartida gerenciador = new GerenciadorPartida();
        boolean isIniciouPartida = gerenciador.iniciarPartida("", "", "");
        System.out.println("A partida deve ser inicializada com todos os dados informados.");
        assertEquals(false, isIniciouPartida);
    }

    /**
     * Test of adicionarSetAoJogo method, of class GerenciadorPartida.
     */
    @Test
    public void testAdicionarSetAoJogo() {
        GerenciadorPartida gerenciador = new GerenciadorPartida();
        gerenciador.iniciarPartida("10:00", "A", "B");
        boolean isAddSetAoJogo = gerenciador.adicionarSetAoJogo(new SetJogo(1, 25, 23, "A"));
        assertEquals(true, isAddSetAoJogo);
        isAddSetAoJogo = gerenciador.adicionarSetAoJogo(new SetJogo(2, 25, 23, "A"));
        assertEquals(true, isAddSetAoJogo);
        isAddSetAoJogo = gerenciador.adicionarSetAoJogo(new SetJogo(3, 25, 23, "A"));
        assertEquals(true, isAddSetAoJogo);
        isAddSetAoJogo = gerenciador.adicionarSetAoJogo(new SetJogo(4, 25, 23, "A"));
        assertEquals(false, isAddSetAoJogo);
    }

    /**
     * Test of getPartida method, of class GerenciadorPartida.
     */
    @Test
    public void testGetPartida() {
        GerenciadorPartida gerenciador = new GerenciadorPartida();
        gerenciador.iniciarPartida("10:30", "A", "B");
        Partida partidaPrevista = new Partida("10:30", "A", "B", "");
        Partida partidaExecutada = gerenciador.getPartida();

        assertEquals(partidaExecutada.getDataHoraJogo(), partidaPrevista.getDataHoraJogo());
        assertEquals(partidaExecutada.getEquipeA(), partidaPrevista.getEquipeA());
        assertEquals(partidaExecutada.getEquipeB(), partidaPrevista.getEquipeB());
        assertEquals(partidaExecutada.getEquipeVencedora(), partidaPrevista.getEquipeVencedora());

    }

    /**
     * Test of adicionarPontoEquipeA method, of class GerenciadorPartida.
     */
    @Test
    public void testAdicionarPontoEquipeA() {
        GerenciadorPartida gerenciador = new GerenciadorPartida();
        gerenciador.iniciarPartida("10:30", "A", "B");
        gerenciador.inicializarNovoSet();
        for (int i = 1; i <= 25; i++) {
            if (i > 23) {
                gerenciador.adicionarPontoEquipeA();
            } else {
                gerenciador.adicionarPontoEquipeA();
                gerenciador.adicionarPontoEquipeB();
            }

        }

        assertEquals(false, gerenciador.adicionarPontoEquipeA());

    }

    /**
     * Test of adicionarPontoEquipeB method, of class GerenciadorPartida.
     */
    @Test
    public void testAdicionarPontoEquipeB() {
        GerenciadorPartida gerenciador = new GerenciadorPartida();
        gerenciador.iniciarPartida("10:30", "A", "B");
        gerenciador.inicializarNovoSet();
        for (int i = 1; i <= 25; i++) {
            if (i > 23) {
                gerenciador.adicionarPontoEquipeB();
            } else {
                gerenciador.adicionarPontoEquipeA();
                gerenciador.adicionarPontoEquipeB();
            }

        }

        assertEquals(false, gerenciador.adicionarPontoEquipeB());
    }

    /**
     * Test of removerPontoEquipeA method, of class GerenciadorPartida.
     */
    @Test
    public void testRemoverPontoEquipeA() {
        GerenciadorPartida gerenciador = new GerenciadorPartida();
        gerenciador.iniciarPartida("10:30", "A", "B");
        gerenciador.inicializarNovoSet();

        assertEquals(false, gerenciador.removerPontoEquipeA());
    }

    /**
     * Test of removerPontoEquipeB method, of class GerenciadorPartida.
     */
    @Test
    public void testRemoverPontoEquipeB() {
        GerenciadorPartida gerenciador = new GerenciadorPartida();
        gerenciador.iniciarPartida("10:30", "A", "B");
        gerenciador.inicializarNovoSet();

        assertEquals(false, gerenciador.removerPontoEquipeB());
    }

    /**
     * Test of definirVencedorSet method, of class GerenciadorPartida.
     */
    @Test
    public void testDefinirVencedorSet() {
        GerenciadorPartida gerenciador = new GerenciadorPartida();
        gerenciador.iniciarPartida("10:30", "A", "B");
        gerenciador.inicializarNovoSet();
        for (int i = 1; i <= 25; i++) {
            if (i > 23) {
                gerenciador.adicionarPontoEquipeB();
            } else {
                gerenciador.adicionarPontoEquipeA();
                gerenciador.adicionarPontoEquipeB();
            }

        }

        assertEquals("B", gerenciador.definirVencedorSet());
    }

    /**
     * Test of definirVencedorPartida method, of class GerenciadorPartida.
     */
    @Test
    public void testDefinirVencedorPartida() {
        GerenciadorPartida gerenciador = new GerenciadorPartida();
        gerenciador.iniciarPartida("10:30", "A", "B");
        for (int j = 1; j <= 3; j++) {
            gerenciador.inicializarNovoSet();
            for (int i = 1; i <= 25; i++) {
                if (i > 23) {
                    gerenciador.adicionarPontoEquipeB();
                } else {
                    gerenciador.adicionarPontoEquipeA();
                    gerenciador.adicionarPontoEquipeB();
                }
            }
            SetJogo set = new SetJogo(j, gerenciador.getSetAtual().getPontuacaoEquipeA(), gerenciador.getSetAtual().getPontuacaoEquipeB(), "B");
            gerenciador.adicionarSetAoJogo(set);
        }

        assertEquals("B", gerenciador.definirVencedorSet());
    }

    /**
     * Test of verificaFinalSet method, of class GerenciadorPartida.
     */
    @Test
    public void testVerificaFinalSet() {
        GerenciadorPartida gerenciador = new GerenciadorPartida();
        gerenciador.iniciarPartida("10:30", "A", "B");

        gerenciador.inicializarNovoSet();
        for (int i = 1; i <= 25; i++) {
            if (i > 23) {
                gerenciador.adicionarPontoEquipeB();
            } else {
                gerenciador.adicionarPontoEquipeA();
                gerenciador.adicionarPontoEquipeB();
            }
        }

        assertEquals(true, gerenciador.verificaFinalSet());
    }

    /**
     * Test of verificaFinalJogo method, of class GerenciadorPartida.
     */
    @Test
    public void testVerificaFinalJogo() {
        GerenciadorPartida gerenciador = new GerenciadorPartida();
        gerenciador.iniciarPartida("10:30", "A", "B");
        gerenciador.inicializarNovoSet();
        for (int j = 1; j <= 3; j++) {
            gerenciador.inicializarNovoSet();
            for (int i = 1; i <= 25; i++) {
                if (i > 23) {
                    gerenciador.adicionarPontoEquipeB();
                } else {
                    gerenciador.adicionarPontoEquipeA();
                    gerenciador.adicionarPontoEquipeB();
                }
            }
            SetJogo set = new SetJogo(j, gerenciador.getSetAtual().getPontuacaoEquipeA(), gerenciador.getSetAtual().getPontuacaoEquipeB(), "B");
            gerenciador.adicionarSetAoJogo(set);
        }

        assertEquals(true, gerenciador.verificaFinalJogo());
    }


}
