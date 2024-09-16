/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author gustavogoncalves
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPrincipal extends JFrame {
    
    public TelaPrincipal() {
        setTitle("Sistema de Cadastro de Médicos Residentes");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1)); // Dividindo a tela em 3 linhas para os botões

        // Botão para cadastro de residente
        JButton btnCadastroResidente = new JButton("Cadastrar Residente");
        btnCadastroResidente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CadastroResidente().setVisible(true); // Abrir a tela de cadastro de residente
            }
        });
        add(btnCadastroResidente);

        // Botão para cadastro de residência
        JButton btnCadastroResidencia = new JButton("Cadastrar Residência");
        btnCadastroResidencia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CadastroResidencia().setVisible(true); // Abrir a tela de cadastro de residência
            }
        });
        add(btnCadastroResidencia);

        // Botão para sair
        JButton btnSair = new JButton("Sair");
        btnSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Fecha o sistema
            }
        });
        add(btnSair);
    }

    public static void main(String[] args) {
        new TelaPrincipal().setVisible(true);
    }
}

