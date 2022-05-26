/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Joao
 */
public class SetJogo {
    private int numero;
    private int pontuacaoEquipeA;
    private int pontuacaoEquipeB;
    private String nomeEquipeVencedora;
    

    public SetJogo(int numero, int pontuacaoEquipeA, int pontuacaoEquipeB, String nomeEquipeVencedora) {
        this.numero = numero;
        this.pontuacaoEquipeA = pontuacaoEquipeA;
        this.pontuacaoEquipeB = pontuacaoEquipeB;
        this.nomeEquipeVencedora = nomeEquipeVencedora;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void setPontuacaoEquipeA(int pontuacaoEquipeA) {
        this.pontuacaoEquipeA = pontuacaoEquipeA;
    }

    public void setPontuacaoEquipeB(int pontuacaoEquipeB) {
        this.pontuacaoEquipeB = pontuacaoEquipeB;
    }

    public void setNomeEquipeVencedora(String nomeEquipeVencedora) {
        this.nomeEquipeVencedora = nomeEquipeVencedora;
    }

    public int getPontuacaoEquipeA() {
        return pontuacaoEquipeA;
    }

    public int getPontuacaoEquipeB() {
        return pontuacaoEquipeB;
    }

    public String getNomeEquipeVencedora() {
        return nomeEquipeVencedora;
    }
}
