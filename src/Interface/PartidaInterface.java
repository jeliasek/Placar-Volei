/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

import Model.Partida;
import Model.SetJogo;
import java.util.ArrayList;

/**
 *
 * @author Joao
 */
public interface PartidaInterface {
    
    public boolean iniciarPartida(String dataHoraJogo, String equipeA, String equipeB);
    
    public boolean adicionarSetAoJogo(SetJogo set);
    
    public Partida getPartida();
    
    public ArrayList<SetJogo> getSetsDaPartida();
    
    public void inicializarNovoSet();
    
    public boolean adicionarPontoEquipeA();
    
    public boolean adicionarPontoEquipeB();
    
    public boolean removerPontoEquipeA();
    
    public boolean removerPontoEquipeB();
    
    public String definirVencedorSet();
    
    public void definirVencedorPartida();
    
    public boolean verificaFinalSet();
    
    public boolean verificaFinalJogo();
    
    public SetJogo getSetAtual();
    
    public int getQtdSetsEquipe(String equipe);
    
}
