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
public class Partida {
    private String dataHoraJogo;
    private String equipeA;
    private String equipeB;
    private String equipeVencedora;
    private ArrayList<SetJogo> sets = new ArrayList<SetJogo>();

    public Partida(String dataHoraJogo, String equipeA, String equipeB, String equipeVencedora) {
        this.dataHoraJogo = dataHoraJogo;
        this.equipeA = equipeA;
        this.equipeB = equipeB;
        this.equipeVencedora = equipeVencedora;
    }
    
     public void addSetPartida(SetJogo setAtual){
        this.sets.add(setAtual);
    }

    public ArrayList<SetJogo> getSets() {
        return sets;
    }
     
    
    
    public String getDataHoraJogo() {
        return dataHoraJogo;
    }

    public String getEquipeA() {
        return equipeA;
    }

    public String getEquipeB() {
        return equipeB;
    }

    public String getEquipeVencedora() {
        return equipeVencedora;
    }

    public void setDataHoraJogo(String dataHoraJogo) {
        this.dataHoraJogo = dataHoraJogo;
    }

    public void setEquipeA(String equipeA) {
        this.equipeA = equipeA;
    }

    public void setEquipeB(String equipeB) {
        this.equipeB = equipeB;
    }

    public void setEquipeVencedora(String equipeVencedora) {
        this.equipeVencedora = equipeVencedora;
    }
    
    
    
}
