/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vue;

import java.awt.event.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import Cinema.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Naiss
 */
public class PageAccueilClient extends JFrame implements ActionListener, ItemListener {

    private final JButton MonCompte;

    private final JPanel p0;
    

    public PageAccueilClient() {
        super("Page d'accueil");
        setLayout(new BorderLayout());
        setBounds(0, 0, 400, 400);
        setResizable(true);
        setVisible(true);

        MonCompte = new JButton("Mon Compte");
        Film film = new Film();

        p0 = new JPanel();
        p0.add(MonCompte);
        p0.setLayout(new GridLayout(1, 3));
        String columns[] = {"Affiche", "Nom", "Realisateur", "Duree", "Synopsis", "Date de parution", "Note de presse", "Note de spectateurs", "Matricule employé", "IDFILM"};
        DefaultTableModel snoopy;
        snoopy = new DefaultTableModel(film.getfilms(), columns);

        JTable table = new JTable(snoopy);

        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane);
        table.setShowGrid(false);
        table.setShowVerticalLines(false);
        //p0.add(scrollPane);
        p0.add(table);
        add("p0",p0);

        //Définir la hauteur des lignes dans            
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}