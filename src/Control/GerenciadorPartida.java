/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Interface.PartidaInterface;
import Model.Partida;
import Model.SetJogo;
import java.util.ArrayList;

/**
 *
 * @author Joao
 */
public class GerenciadorPartida implements PartidaInterface {

    Partida partida;

    SetJogo setAtual;

    @Override
    public boolean iniciarPartida(String dataHoraJogo, String equipeA, String equipeB) {
        if (dataHoraJogo.equals("") || equipeA.equals("") || equipeB.equals("")) {
            return false;
        }
        partida = new Partida(dataHoraJogo, equipeA, equipeB, "");
        return true;
    }

    @Override
    public boolean adicionarSetAoJogo(SetJogo set) {
        boolean isFinalDoJogo = verificaFinalJogo();
        if(isFinalDoJogo){
            return false;
        }
        partida.addSetPartida(set);
        return true;
    }

    @Override
    public Partida getPartida() {
        return partida;
    }

    @Override
    public ArrayList<SetJogo> getSetsDaPartida() {
        return partida.getSets();
    }

    @Override
    public void inicializarNovoSet() {
        SetJogo setNovo = new SetJogo(partida.getSets().size() + 1, 0, 0, "");
        setAtual = setNovo;
    }

    @Override
    public boolean adicionarPontoEquipeA() {
        if(verificaFinalSet()){
            return false;
        }
        setAtual.setPontuacaoEquipeA(setAtual.getPontuacaoEquipeA() + 1);
        return true;
    }

    @Override
    public boolean adicionarPontoEquipeB() {
        if(verificaFinalSet()){
            return false;
        }
        setAtual.setPontuacaoEquipeB(setAtual.getPontuacaoEquipeB() + 1);
        return true;
    }

    @Override
    public boolean removerPontoEquipeA() {
        if (setAtual.getPontuacaoEquipeA() > 0) {
            setAtual.setPontuacaoEquipeA(setAtual.getPontuacaoEquipeA() - 1);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean removerPontoEquipeB() {
        if (setAtual.getPontuacaoEquipeB() > 0) {
            setAtual.setPontuacaoEquipeB(setAtual.getPontuacaoEquipeB() - 1);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String definirVencedorSet() {
        if (setAtual.getPontuacaoEquipeA() > setAtual.getPontuacaoEquipeB()) {
            setAtual.setNomeEquipeVencedora(partida.getEquipeA());
        } else {
            setAtual.setNomeEquipeVencedora(partida.getEquipeB());
        }
        return setAtual.getNomeEquipeVencedora();

    }

    @Override
    public void definirVencedorPartida() {

        int qtdSetEquipeA = 0;
        int qtdSetEquipeB = 0;

        for (SetJogo set : partida.getSets()) {
            if (set.getNomeEquipeVencedora().equals(partida.getEquipeA())) {
                qtdSetEquipeA++;
            } else {
                qtdSetEquipeB++;
            }
        }
        if (qtdSetEquipeA > qtdSetEquipeB) {
            partida.setEquipeVencedora(partida.getEquipeA());
        } else {
            partida.setEquipeVencedora(partida.getEquipeB());
        }
    }

    @Override
    public boolean verificaFinalSet() {
        int pontuacaoMinimaParaAcabar = 0;
        if (partida.getSets().size() >= 4) {
            pontuacaoMinimaParaAcabar = 15;
        } else {
            pontuacaoMinimaParaAcabar = 25;
        }

        if (setAtual.getPontuacaoEquipeA() >= pontuacaoMinimaParaAcabar || setAtual.getPontuacaoEquipeB() >= pontuacaoMinimaParaAcabar) {
            int diferenca = Math.abs(setAtual.getPontuacaoEquipeA() - setAtual.getPontuacaoEquipeB());
            if (diferenca >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean verificaFinalJogo() {
        int qtdSetEquipeA = 0;
        int qtdSetEquipeB = 0;

        for (SetJogo set : partida.getSets()) {
            if (set.getNomeEquipeVencedora().equals(partida.getEquipeA())) {
                qtdSetEquipeA++;
            } else {
                qtdSetEquipeB++;
            }
        }

        if (qtdSetEquipeA == 3 || qtdSetEquipeB == 3) {
            return true;
        }

        return false;
    }

    @Override
    public SetJogo getSetAtual() {
        return setAtual;
    }

    @Override
    public int getQtdSetsEquipe(String equipe) {
        int qtdSetEquipeA = 0;
        int qtdSetEquipeB = 0;

        for (SetJogo set : partida.getSets()) {
            if (set.getNomeEquipeVencedora().equals(partida.getEquipeA())) {
                qtdSetEquipeA++;
            } else {
                qtdSetEquipeB++;
            }
        }

        if (equipe.equals("A")) {
            return qtdSetEquipeA;
        } else {
            return qtdSetEquipeB;
        }
    }

}
