/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Control.GerenciadorPartida;
import Model.SetJogo;
import com.sun.javafx.binding.StringFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author Joao
 */
public class TelaPlacar extends javax.swing.JFrame {

    /**
     * Creates new form TelaPlacar
     */
    String horario;
    String equipeA;
    String equipeB;
    GerenciadorPartida gerPartida;

    public TelaPlacar(String horario, String equipeA, String equipeB) {

        gerPartida = new GerenciadorPartida();
        horario = horario;
        equipeA = equipeA;
        equipeB = equipeB;

        gerPartida.iniciarPartida(horario, equipeA, equipeB);
        gerPartida.inicializarNovoSet();

        initComponents();

        lbHorario.setText(horario);
        lbEquipeA.setText(equipeA);
        lbEquipeB.setText(equipeB);
        lbWinner.setText("");
        //Inicializar Placar
        lbPlacarPrimeiroSet.setText("");
        lbPlacarSegundoSet.setText("");
        lbPlacarTerceiroSet.setText("");
        lbPlacarQuartoSet.setText("");
        lbPlacarQuintoSet.setText("");

        lbPontuacaoEquipeA.setText("00");
        lbPontuacaoEquipeB.setText("00");

        lbNroSetsEquipeA.setText("00");
        lbNroSetsEquipeB.setText("00");
    }

    public boolean verificaFinalJogo() {
        return gerPartida.verificaFinalSet();
    }

    public void refresh() {
        lbPlacarPrimeiroSet.setText("");
        lbPlacarSegundoSet.setText("");
        lbPlacarTerceiroSet.setText("");
        lbPlacarQuartoSet.setText("");
        lbPlacarQuintoSet.setText("");
        for (SetJogo set : gerPartida.getSetsDaPartida()) {
            switch (set.getNumero()) {
                case 1:
                    lbPlacarPrimeiroSet.setText("1° SET: " + set.getPontuacaoEquipeA() + " - " + set.getPontuacaoEquipeB());
                    break;
                case 2:
                    lbPlacarSegundoSet.setText("2° SET: " + set.getPontuacaoEquipeA() + " - " + set.getPontuacaoEquipeB());
                    break;
                case 3:
                    lbPlacarTerceiroSet.setText("3° SET: " + set.getPontuacaoEquipeA() + " - " + set.getPontuacaoEquipeB());
                    break;
                case 4:
                    lbPlacarQuartoSet.setText("4° SET: " + set.getPontuacaoEquipeA() + " - " + set.getPontuacaoEquipeB());
                    break;
                case 5:
                    lbPlacarQuintoSet.setText("5° SET: " + set.getPontuacaoEquipeA() + " - " + set.getPontuacaoEquipeB());
                    break;
            }
        }
        lbPontuacaoEquipeA.setText(String.format("%02d", gerPartida.getSetAtual().getPontuacaoEquipeA()));
        lbPontuacaoEquipeB.setText(String.format("%02d", gerPartida.getSetAtual().getPontuacaoEquipeB()));

        lbNroSetsEquipeA.setText(String.format("%02d", gerPartida.getQtdSetsEquipe("A")));
        lbNroSetsEquipeB.setText(String.format("%02d", gerPartida.getQtdSetsEquipe("B")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbEquipeB = new javax.swing.JLabel();
        lbWinner = new javax.swing.JLabel();
        lbPontuacaoEquipeB = new javax.swing.JLabel();
        lbPlacarQuintoSet = new javax.swing.JLabel();
        lbNroSetsEquipeB = new javax.swing.JLabel();
        lbPontuacaoEquipeA = new javax.swing.JLabel();
        labelTitle8 = new javax.swing.JLabel();
        lbEquipeA = new javax.swing.JLabel();
        lbPlacarPrimeiroSet = new javax.swing.JLabel();
        lbPlacarSegundoSet = new javax.swing.JLabel();
        lbPlacarTerceiroSet = new javax.swing.JLabel();
        lbPlacarQuartoSet = new javax.swing.JLabel();
        lbNroSetsEquipeA = new javax.swing.JLabel();
        btnRemovePontuacaoEquipeA = new javax.swing.JButton();
        btnAddPontuacaoEquipeA = new javax.swing.JButton();
        btnAddPontuacaoEquipeB = new javax.swing.JButton();
        btnRemovePontuacaoEquipeB = new javax.swing.JButton();
        labelTitle1 = new javax.swing.JLabel();
        lbHorario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbEquipeB.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        lbEquipeB.setForeground(new java.awt.Color(51, 153, 0));
        lbEquipeB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEquipeB.setText("GUEST");
        getContentPane().add(lbEquipeB, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 170, -1));

        lbWinner.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        lbWinner.setForeground(new java.awt.Color(51, 153, 0));
        lbWinner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbWinner.setText("WINNER!");
        getContentPane().add(lbWinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 340, -1));

        lbPontuacaoEquipeB.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 80)); // NOI18N
        lbPontuacaoEquipeB.setForeground(new java.awt.Color(51, 153, 0));
        lbPontuacaoEquipeB.setText("20");
        getContentPane().add(lbPontuacaoEquipeB, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, -1, -1));

        lbPlacarQuintoSet.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 16)); // NOI18N
        lbPlacarQuintoSet.setForeground(new java.awt.Color(51, 153, 0));
        lbPlacarQuintoSet.setText("5° SET: 25-23");
        getContentPane().add(lbPlacarQuintoSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 500, -1, -1));

        lbNroSetsEquipeB.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 40)); // NOI18N
        lbNroSetsEquipeB.setForeground(new java.awt.Color(51, 153, 0));
        lbNroSetsEquipeB.setText("01");
        getContentPane().add(lbNroSetsEquipeB, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, -1, -1));

        lbPontuacaoEquipeA.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 80)); // NOI18N
        lbPontuacaoEquipeA.setForeground(new java.awt.Color(51, 153, 0));
        lbPontuacaoEquipeA.setText("25");
        getContentPane().add(lbPontuacaoEquipeA, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        labelTitle8.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 40)); // NOI18N
        labelTitle8.setForeground(new java.awt.Color(51, 153, 0));
        labelTitle8.setText("X");
        getContentPane().add(labelTitle8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));

        lbEquipeA.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        lbEquipeA.setForeground(new java.awt.Color(51, 153, 0));
        lbEquipeA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEquipeA.setText("HOME");
        getContentPane().add(lbEquipeA, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 150, -1));

        lbPlacarPrimeiroSet.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 16)); // NOI18N
        lbPlacarPrimeiroSet.setForeground(new java.awt.Color(51, 153, 0));
        lbPlacarPrimeiroSet.setText("1° SET: 25-23");
        getContentPane().add(lbPlacarPrimeiroSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, -1, -1));

        lbPlacarSegundoSet.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 16)); // NOI18N
        lbPlacarSegundoSet.setForeground(new java.awt.Color(51, 153, 0));
        lbPlacarSegundoSet.setText("2° SET: 25-23");
        getContentPane().add(lbPlacarSegundoSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, -1, -1));

        lbPlacarTerceiroSet.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 16)); // NOI18N
        lbPlacarTerceiroSet.setForeground(new java.awt.Color(51, 153, 0));
        lbPlacarTerceiroSet.setText("3° SET: 25-23");
        getContentPane().add(lbPlacarTerceiroSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, -1, -1));

        lbPlacarQuartoSet.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 16)); // NOI18N
        lbPlacarQuartoSet.setForeground(new java.awt.Color(51, 153, 0));
        lbPlacarQuartoSet.setText("4° SET: 25-23");
        getContentPane().add(lbPlacarQuartoSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, -1, -1));

        lbNroSetsEquipeA.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 40)); // NOI18N
        lbNroSetsEquipeA.setForeground(new java.awt.Color(51, 153, 0));
        lbNroSetsEquipeA.setText("01");
        getContentPane().add(lbNroSetsEquipeA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        btnRemovePontuacaoEquipeA.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        btnRemovePontuacaoEquipeA.setForeground(new java.awt.Color(0, 153, 0));
        btnRemovePontuacaoEquipeA.setText("-");
        btnRemovePontuacaoEquipeA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemovePontuacaoEquipeAActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemovePontuacaoEquipeA, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 60, 50));

        btnAddPontuacaoEquipeA.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        btnAddPontuacaoEquipeA.setForeground(new java.awt.Color(0, 153, 0));
        btnAddPontuacaoEquipeA.setText("+");
        btnAddPontuacaoEquipeA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPontuacaoEquipeAActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddPontuacaoEquipeA, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 60, 50));

        btnAddPontuacaoEquipeB.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        btnAddPontuacaoEquipeB.setForeground(new java.awt.Color(0, 153, 0));
        btnAddPontuacaoEquipeB.setText("+");
        btnAddPontuacaoEquipeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPontuacaoEquipeBActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddPontuacaoEquipeB, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 60, 50));

        btnRemovePontuacaoEquipeB.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        btnRemovePontuacaoEquipeB.setForeground(new java.awt.Color(0, 153, 0));
        btnRemovePontuacaoEquipeB.setText("-");
        btnRemovePontuacaoEquipeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemovePontuacaoEquipeBActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemovePontuacaoEquipeB, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 60, 50));

        labelTitle1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        labelTitle1.setForeground(new java.awt.Color(51, 153, 0));
        labelTitle1.setText("PLACAR DE VÔLEI - UDESC");
        getContentPane().add(labelTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        lbHorario.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        lbHorario.setForeground(new java.awt.Color(51, 153, 0));
        lbHorario.setText("HORÁRIO");
        getContentPane().add(lbHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemovePontuacaoEquipeAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemovePontuacaoEquipeAActionPerformed
        gerPartida.removerPontoEquipeA();
        boolean isFinalSet = verificaFinalJogo();
        if (isFinalSet) {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Set Encerrado! Confirmado?", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                gerPartida.definirVencedorSet();
                boolean isFinalPartida = gerPartida.verificaFinalJogo();
                gerPartida.adicionarSetAoJogo(gerPartida.getSetAtual());
                if (isFinalPartida) {
                    gerPartida.definirVencedorPartida();
                    lbWinner.setText(gerPartida.getPartida().getEquipeVencedora() + "VENCEU!");
                    btnAddPontuacaoEquipeA.setEnabled(false);
                    btnAddPontuacaoEquipeB.setEnabled(false);
                    btnRemovePontuacaoEquipeA.setEnabled(false);
                    btnRemovePontuacaoEquipeB.setEnabled(false);
                } else {
                    gerPartida.inicializarNovoSet();
                }

            } else {
                gerPartida.adicionarPontoEquipeA();
            }
        }
        refresh();
    }//GEN-LAST:event_btnRemovePontuacaoEquipeAActionPerformed

    private void btnAddPontuacaoEquipeAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPontuacaoEquipeAActionPerformed
        gerPartida.adicionarPontoEquipeA();
        boolean isFinalSet = verificaFinalJogo();
        if (isFinalSet) {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Set Encerrado! Confirmado?", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                gerPartida.definirVencedorSet();
                gerPartida.adicionarSetAoJogo(gerPartida.getSetAtual());
                boolean isFinalPartida = gerPartida.verificaFinalJogo();
                if (isFinalPartida) {
                    gerPartida.definirVencedorPartida();
                    lbWinner.setText(gerPartida.getPartida().getEquipeVencedora() + "VENCEU!");
                    btnAddPontuacaoEquipeA.setEnabled(false);
                    btnAddPontuacaoEquipeB.setEnabled(false);
                    btnRemovePontuacaoEquipeA.setEnabled(false);
                    btnRemovePontuacaoEquipeB.setEnabled(false);
                } else {
                    gerPartida.inicializarNovoSet();
                }

            } else {
                gerPartida.removerPontoEquipeA();
            }
        }
        refresh();
    }//GEN-LAST:event_btnAddPontuacaoEquipeAActionPerformed

    private void btnAddPontuacaoEquipeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPontuacaoEquipeBActionPerformed
        gerPartida.adicionarPontoEquipeB();
        boolean isFinalSet = verificaFinalJogo();
        if (isFinalSet) {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Set Encerrado! Confirmado?", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                gerPartida.definirVencedorSet();
                gerPartida.adicionarSetAoJogo(gerPartida.getSetAtual());
                boolean isFinalPartida = gerPartida.verificaFinalJogo();
                if (isFinalPartida) {
                    gerPartida.definirVencedorPartida();
                    lbWinner.setText(gerPartida.getPartida().getEquipeVencedora() + "VENCEU!");
                    btnAddPontuacaoEquipeA.setEnabled(false);
                    btnAddPontuacaoEquipeB.setEnabled(false);
                    btnRemovePontuacaoEquipeA.setEnabled(false);
                    btnRemovePontuacaoEquipeB.setEnabled(false);
                } else {
                    gerPartida.inicializarNovoSet();
                }

            } else {
                gerPartida.removerPontoEquipeB();
            }
        }
        refresh();
    }//GEN-LAST:event_btnAddPontuacaoEquipeBActionPerformed

    private void btnRemovePontuacaoEquipeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemovePontuacaoEquipeBActionPerformed
        gerPartida.removerPontoEquipeB();
        boolean isFinalSet = verificaFinalJogo();
        if (isFinalSet) {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Set Encerrado! Confirmado?", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                gerPartida.definirVencedorSet();
                gerPartida.adicionarSetAoJogo(gerPartida.getSetAtual());
                boolean isFinalPartida = gerPartida.verificaFinalJogo();
                if (isFinalPartida) {
                    gerPartida.definirVencedorPartida();
                    lbWinner.setText(gerPartida.getPartida().getEquipeVencedora() + "VENCEU!");
                    btnAddPontuacaoEquipeA.setEnabled(false);
                    btnAddPontuacaoEquipeB.setEnabled(false);
                    btnRemovePontuacaoEquipeA.setEnabled(false);
                    btnRemovePontuacaoEquipeB.setEnabled(false);
                } else {
                    gerPartida.inicializarNovoSet();
                }

            } else {
                gerPartida.adicionarPontoEquipeB();
            }
        }
        refresh();

    }//GEN-LAST:event_btnRemovePontuacaoEquipeBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPontuacaoEquipeA;
    private javax.swing.JButton btnAddPontuacaoEquipeB;
    private javax.swing.JButton btnRemovePontuacaoEquipeA;
    private javax.swing.JButton btnRemovePontuacaoEquipeB;
    private javax.swing.JLabel labelTitle1;
    private javax.swing.JLabel labelTitle8;
    private javax.swing.JLabel lbEquipeA;
    private javax.swing.JLabel lbEquipeB;
    private javax.swing.JLabel lbHorario;
    private javax.swing.JLabel lbNroSetsEquipeA;
    private javax.swing.JLabel lbNroSetsEquipeB;
    private javax.swing.JLabel lbPlacarPrimeiroSet;
    private javax.swing.JLabel lbPlacarQuartoSet;
    private javax.swing.JLabel lbPlacarQuintoSet;
    private javax.swing.JLabel lbPlacarSegundoSet;
    private javax.swing.JLabel lbPlacarTerceiroSet;
    private javax.swing.JLabel lbPontuacaoEquipeA;
    private javax.swing.JLabel lbPontuacaoEquipeB;
    private javax.swing.JLabel lbWinner;
    // End of variables declaration//GEN-END:variables
}
