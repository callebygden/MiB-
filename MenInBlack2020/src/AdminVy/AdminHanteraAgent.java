/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminVy;

import MiB.ComboBoxes;
import MiB.Validering;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author calle
 */
public class AdminHanteraAgent extends javax.swing.JFrame {

    private static InfDB idb;

    /**
     * Konstruktor som instansierar en ny vy av klassen hantera agent. 
     */
    public AdminHanteraAgent(InfDB idb) {
        initComponents();
        this.idb = idb;
        
        cboxOmrådeschef.setVisible(true);
        
             
        //lokalvariabel combobox 
        ComboBoxes combobox = new ComboBoxes(idb);
        //Metodanrop till klassen Combobox, fyller cBoxOmråde med områden.
        combobox.fyllOmråde(cboxOmråde);
        //Gör att vid första anblick så är comboboxen tom & inte visar första området från databasen.
        cboxOmråde.setSelectedIndex(-1);
        
        combobox.fyllOmråde(cboxOmrådeschef);
        cboxOmrådeschef.setSelectedIndex(-1);
        
        //Sätter fokus på textfältet för att söka efter agent. 
        txtSökAgent.requestFocus();
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRubrikHanteraAgent = new javax.swing.JLabel();
        btnTaBortAgent = new javax.swing.JButton();
        btnLäggTillAgent = new javax.swing.JButton();
        lblAgentID = new javax.swing.JLabel();
        lblNamn = new javax.swing.JLabel();
        lblTelefon = new javax.swing.JLabel();
        lblAnställningsdatum = new javax.swing.JLabel();
        lblOmråde = new javax.swing.JLabel();
        lblOmrådeschef = new javax.swing.JLabel();
        txtAgentID = new javax.swing.JTextField();
        txtNamn = new javax.swing.JTextField();
        txtTelefon = new javax.swing.JTextField();
        txtAnställningsdatum = new javax.swing.JTextField();
        cboxOmråde = new javax.swing.JComboBox<>();
        rbtnOmrådeschef = new javax.swing.JRadioButton();
        cboxOmrådeschef = new javax.swing.JComboBox<>();
        lblKontorschef = new javax.swing.JLabel();
        lblAdministratör = new javax.swing.JLabel();
        lblFältagent = new javax.swing.JLabel();
        rbtnKontorschef = new javax.swing.JRadioButton();
        rbtnAdministratör = new javax.swing.JRadioButton();
        rbtnFältagent = new javax.swing.JRadioButton();
        btnÄndra = new javax.swing.JButton();
        lblSökAgent = new javax.swing.JLabel();
        txtSökAgent = new javax.swing.JTextField();
        btnSök = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfAgenter = new javax.swing.JTextArea();
        btnTillbaka = new javax.swing.JButton();
        btnListaAllaAgenter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRubrikHanteraAgent.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblRubrikHanteraAgent.setText("Hantera Agent");

        btnTaBortAgent.setText("Ta bort agent");
        btnTaBortAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortAgentActionPerformed(evt);
            }
        });

        btnLäggTillAgent.setText("Lägg till agent");
        btnLäggTillAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLäggTillAgentActionPerformed(evt);
            }
        });

        lblAgentID.setText("Agent ID");

        lblNamn.setText("Namn");

        lblTelefon.setText("Telefon");

        lblAnställningsdatum.setText("Anställningsdatum");

        lblOmråde.setText("Område");

        lblOmrådeschef.setText("Områdeschef");

        txtTelefon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonActionPerformed(evt);
            }
        });

        cboxOmråde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxOmrådeActionPerformed(evt);
            }
        });

        rbtnOmrådeschef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnOmrådeschefActionPerformed(evt);
            }
        });

        lblKontorschef.setText("Kontorschef");

        lblAdministratör.setText("Administratör");

        lblFältagent.setText("Fältagent");

        btnÄndra.setText("Ändra");
        btnÄndra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÄndraActionPerformed(evt);
            }
        });

        lblSökAgent.setText("Sök Agent");

        txtSökAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSökAgentActionPerformed(evt);
            }
        });

        btnSök.setText("Sök");
        btnSök.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSökActionPerformed(evt);
            }
        });

        tfAgenter.setColumns(20);
        tfAgenter.setRows(5);
        jScrollPane1.setViewportView(tfAgenter);

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        btnListaAllaAgenter.setText("Lista alla agenter");
        btnListaAllaAgenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaAllaAgenterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSökAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtSökAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSök, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnListaAllaAgenter, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnTillbaka, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblAdministratör, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                        .addComponent(lblFältagent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(26, 26, 26)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(rbtnAdministratör, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rbtnFältagent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblKontorschef, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)
                                    .addComponent(rbtnKontorschef, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblAgentID, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(83, 83, 83)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtAgentID, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                        .addComponent(txtNamn, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtTelefon, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(lblOmrådeschef, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                            .addComponent(rbtnOmrådeschef))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblAnställningsdatum, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblOmråde, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnTaBortAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(0, 13, Short.MAX_VALUE)))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cboxOmrådeschef, 0, 123, Short.MAX_VALUE)
                                            .addComponent(txtAnställningsdatum)
                                            .addComponent(cboxOmråde, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnÄndra, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnLäggTillAgent))))))
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRubrikHanteraAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 589, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblRubrikHanteraAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgentID)
                    .addComponent(txtAgentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSökAgent))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNamn)
                            .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSökAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSök))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTelefon)
                                    .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblAnställningsdatum)
                                    .addComponent(txtAnställningsdatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnListaAllaAgenter, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOmråde)
                            .addComponent(cboxOmråde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblOmrådeschef)
                                .addComponent(cboxOmrådeschef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rbtnOmrådeschef))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblKontorschef)
                            .addComponent(rbtnKontorschef))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAdministratör)
                            .addComponent(rbtnAdministratör))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFältagent)
                            .addComponent(rbtnFältagent))
                        .addGap(16, 16, 16)
                        .addComponent(btnÄndra))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLäggTillAgent)
                    .addComponent(btnTaBortAgent)
                    .addComponent(btnTillbaka))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTelefonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonActionPerformed

    private void rbtnOmrådeschefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnOmrådeschefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnOmrådeschefActionPerformed

    private void btnLäggTillAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLäggTillAgentActionPerformed
        new AdminLäggTillAgent(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLäggTillAgentActionPerformed

    private void btnTaBortAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortAgentActionPerformed
        if(Validering.tomtTextFält(txtAgentID)){
            
            String agID = txtAgentID.getText();
            int agentID = Integer.parseInt(agID);
            
            //Skapar variabel av typen int för svaret på Joptionrutan. 0 = ja, 1=nej, 2=canceö
           
            
            
            try{
            int svar = JOptionPane.showConfirmDialog(null, "Du är på väg att radera agent " + agID + " Vill du fortsätta?");

            if (svar == 0){
                idb.delete("DELETE AGENT FROM AGENT WHERE AGENT_ID= " + "'" + agentID + "'");
                idb.delete("DELETE AGENT FROM FALTAGENT WHERE AGENT_ID= " + "'" + agentID + "'");
                idb.delete("DELETE AGENT FROM INNEHAR_FORDON WHERE AGENT_ID= " + "'" + agentID + "'");
                idb.delete("DELETE AGENT FROM INNEHAR_UTRUSTNING WHERE AGENT_ID= " + "'" + agentID + "'");
                idb.delete("DELETE AGENT FROM KONTORSCHEF WHERE AGENT_ID= " + "'" + agentID + "'");
                idb.delete("DELETE AGENT FROM OMRADESCHEF WHERE AGENT_ID= " + "'" + agentID + "'");
                idb.delete("DELETE AGENT FROM KONTORSCHEF WHERE AGENT_ID= " + "'" + agentID + "'");
                
                JOptionPane.showMessageDialog(null, "Agent " + agentID + " har raderats");
                }
                
            } catch (InfException error) {
                JOptionPane.showMessageDialog(null, "Något gick fel, vänligen försök igen!");
                System.out.println("Internt felmeddelande: " + error.getMessage());
               }
            txtSökAgent.requestFocus();
            txtSökAgent.setText("");
        }
        
    }//GEN-LAST:event_btnTaBortAgentActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        new AdminVy(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void txtSökAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSökAgentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSökAgentActionPerformed

    private void btnSökActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSökActionPerformed

        if ( //Använder Valideringsfunktionen för att säkerställa att sökfältet inte är tomt.
                Validering.tomtTextFält(txtSökAgent)) {

            String söksträng = txtSökAgent.getText();

            try {
                //Skapar lokalvariabel för ID & hämtar AgentID från tabellen Agent i db. Sätter in värdet i rutan txtNamn.
                String id = idb.fetchSingle("SELECT AGENT_ID FROM AGENT WHERE NAMN = " + "'" + söksträng + "'");
                //Omvandlar det hämtade värdet från String till int. Den skapas under ny lokalvariabel.
                int intID = Integer.parseInt(id);
                //Sätter valt textfält till lokalvariabelns innehåll.
                txtAgentID.setText(id);

                //Skapar lokalvariabel för namn & hämtar Namn från tabellen Agent i db. Sätter in värdet i rutan txtNamn.
                String namn = idb.fetchSingle("SELECT NAMN FROM AGENT WHERE AGENT_ID = " + "'" + intID + "'");
                txtNamn.setText(namn);

                //Skapar lokalvariabel för telefonnummer & hämtar Namn från tabellen Agent i db. Sätter in värdet i rutan txtNamn.
                String telnr = idb.fetchSingle("SELECT TELEFON FROM AGENT WHERE AGENT_ID =" + "'" + intID + "'");
                txtTelefon.setText(telnr);

                //Skapar lokalvariabel för anställningsdatum & hämtar datum från tabellen Agent i db. Sätter in värdet i rutan txtAnställningsdatum.
                String anstdatum = idb.fetchSingle("SELECT ANSTALLNINGSDATUM FROM AGENT WHERE AGENT_ID =" + "'" + intID + "'");
                txtAnställningsdatum.setText(anstdatum);

                //Skapar lokalvariabel för admin & hämtar adminstatus från tabellen Administrator i db.
                String admin = idb.fetchSingle("SELECT ADMINISTRATOR FROM AGENT WHERE AGENT_ID =" + "'" + intID + "'");

                
                //Kollar vilket område vald agent befinner sig i 
                String områdeID = idb.fetchSingle("SELECT OMRADE FROM AGENT WHERE AGENT_ID =" + "'" + intID + "'" );
                String områdenamn = idb.fetchSingle("SELECT BENAMNING FROM OMRADE WHERE OMRADES_ID = " +  områdeID + "");
                cboxOmråde.getModel().setSelectedItem(områdenamn);
                
                
                //Kollar namn på område som ifylld agent är områdeschef över 
                String fraga = idb.fetchSingle("SELECT BENAMNING FROM OMRADE JOIN OMRADESCHEF ON OMRADE.OMRADES_ID = OMRADESCHEF.OMRADE JOIN AGENT ON OMRADESCHEF.AGENT_ID = AGENT.AGENT_ID WHERE AGENT.AGENT_ID =" + "'" + intID + "'");
                
                //Om fraga returnerar ett resultat visas områdets namn i comboboxen och radiobutton blir ikryssad
                if (fraga != null) {
                    rbtnOmrådeschef.setSelected(true);
                    cboxOmrådeschef.getModel().setSelectedItem(fraga);
                }
                //Annars visas "Nej" i comboboxen och radiobutton blir inte ikryssad. 
                else{
                     rbtnOmrådeschef.setSelected(false);
                     cboxOmrådeschef.getModel().setSelectedItem("Ej chef");
                }



                //Om vald agent är admin ska RadioButton bli ikryssad. Om inte ska den vara blank.
                if (admin.equals("J")) {
                    rbtnAdministratör.setSelected(true);
                } else {
                    rbtnAdministratör.setSelected(false);
                }

                //Skapar en ArrayList av typen String, samlar alla kontorschefer i denna. 
                ArrayList<String> kontorschef = idb.fetchColumn("SELECT AGENT_ID FROM KONTORSCHEF");
                //Itererar genom Arraylisten
                for (String chef : kontorschef) {
                    //Omvandlar strängen till int för att kunna jämföra med valt unikt agent-ID
                    int söknyckel = Integer.parseInt(chef);
                    //Om valt unikt Agent-ID överensstämmer med ID hos en kontorschef ska RadioButton vara ikryssad.
                    if (intID == söknyckel) {
                        rbtnKontorschef.setSelected(true);
                    } //Om valt unikt Agent-ID inte överensstämmer med ID hos en kontorschef ska RadioButton vara blank.
                    else {
                        rbtnKontorschef.setSelected(false);
                    }
                }
                //ArrayList av typen String som samlar alla fältagenter i denna 
                ArrayList<String> fältagenter = idb.fetchColumn("SELECT AGENT_ID FROM FALTAGENT");
                for (String fältagent : fältagenter) {
                    int fält = Integer.parseInt(fältagent);
                    if (intID == fält) {
                        rbtnFältagent.setSelected(true);
                    }
                    else {
                        rbtnFältagent.setSelected(false);
                    }
                }

            } catch (NumberFormatException error1) {
                JOptionPane.showMessageDialog(null, "Vänligen fyll i ett giltigt namn!");
                System.out.println("Internt felmeddelande: " + error1.getMessage());
            } catch (InfException error2) {
                JOptionPane.showMessageDialog(null, "Något gick fel, vänligen försök igen!");
                System.out.println("Internt felmeddelande: " + error2.getMessage());


            }
            

        }
    }//GEN-LAST:event_btnSökActionPerformed

    private void btnÄndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraActionPerformed
        //Validering för tomma textfält och att telefonnr är i heltal.
         if(Validering.tommaTextFält(txtAgentID, txtAnställningsdatum, txtNamn, txtTelefon)){
             
             String agID = txtAgentID.getText();
             //Lagrar värdet ovan av typen int istället för string.
             int agentID = Integer.parseInt(agID);
             //Bekräftelseruta som lagras i lokalvariabel. 0 = ja, 1 = nej 2 = cancel.
             int svar = JOptionPane.showConfirmDialog(null, "Är du säker på att du vill spara ändringarna för agent: " + agentID + "?");
             //Om svaret är ja
             if (svar == 0){
                 //Hämta ifyllda fält
                 
                 String namn = txtNamn.getText();
                 String tele = txtTelefon.getText();
                 String anstdatum = txtAnställningsdatum.getText();
                 String admin = "";
                 
                try{
                    
                   
                 
                 //Uppdaterar databas med värden av lokalvariabler för ifyllda textrutor. Görs genom säkerställning av agent_id i db har samma värde som vårt int-värde av agent-ID
//DESSA 3 FUNKAR
                 idb.update("UPDATE AGENT SET NAMN = " + "'" + namn + "'" + "WHERE AGENT_ID = " + "'" + agentID + "'");
                 idb.update("UPDATE AGENT SET TELEFON =" + "'" + tele + "'" + "WHERE AGENT_ID = " + "'" + agentID + "'");
                 idb.update("UPDATE AGENT SET ANSTALLNINGSDATUM =" + "'" + anstdatum + "'" + "WHERE AGENT_ID = " + "'" + agentID + "'");
                 
//ADMIN FUNKAR   //Admin Förklaring behgövs
                 if (rbtnAdministratör.isSelected()){
                    admin = "J";
                 }else {
                    admin = "N";
                 }
                 idb.update("UPDATE AGENT SET ADMINISTRATOR = " + "'" + admin + "'" + "WHERE AGENT_ID= " + "'" + agentID + "'");
                 
//FUNKAR BORTSETT FRÅN GÖTALAND                  //Ändrar område för agent. 
                String områdeID = idb.fetchSingle("SELECT OMRADES_ID FROM OMRADE WHERE BENAMNING = " + "'" + cboxOmråde.getSelectedItem().toString() + "'");
                 int omrID = Integer.parseInt(områdeID);
                 idb.update("UPDATE AGENT SET OMRADE = " + "'" + omrID + "'" + "WHERE AGENT_ID = " + "'" + agentID + "'");
                 
                 
//FUNKAR EJ                 //Om knapp för områdeschef är ikryssad läggs värden till i områdeschefs-tabellen med valt agent-ID
                 //Lägg till condition för rbtnOmrådeschef 
                 /*if (rbtnOmrådeschef.isSelected()){
                 String omrchefomr = cboxOmrådeschef.getSelectedItem().toString();
                 idb.insert("INSERT INTO OMRADESCHEF VALUES ('" + omrchefomr + "'" + agentID + "')");
                 } else{
                     idb.delete("DELETE FROM OMRADESCHEF WHERE AGENT_ID =" + "'" + agentID);
                 }
                 */
                 

//FUNKAR         //Om knappen för fältagent är ikryssad men en existerande agent inte finns med värdet av agentID läggs en ny till 
                 if (rbtnFältagent.isSelected()){
                     idb.delete("DELETE FROM FALTAGENT WHERE AGENT_ID =" + agentID);
                     idb.insert("INSERT INTO FALTAGENT VALUES ('" + agentID + "')");
                 }
                 //Om knapp för fältagent inte är ikryssad tas existerande agent med värdet av agentID bort från fältagent-tabellen
                 else{
                     idb.delete("DELETE FROM FALTAGENT WHERE AGENT_ID =" + agentID);
                 }
                 
//FUNKAR         //Om knapp för kontorschef är ikryssad uppdateras kontorschefs-tabellen med nytt agent-ID.
                 if(rbtnKontorschef.isSelected()) {
                     idb.update("UPDATE KONTORSCHEF SET AGENT_ID = " + "'" + agentID + "'");
                 }else{
                     idb.delete("DELETE FROM KONTORSCHEF WHERE AGENT_ID =" + agentID);
                 }
                 
                 JOptionPane.showMessageDialog(null, "Agenten har uppdaterats");

                 
                } catch (InfException e) {
                    JOptionPane.showMessageDialog(null, "Något gick fel, vänligen försök igen");
                    System.out.println("Internfel: " + e.getMessage());
                    
                }catch(NumberFormatException error){
                    JOptionPane.showMessageDialog(null, "NumberFormatException!");
                    System.out.println("Internt felmeddelande: " + error.getMessage());
            }
                }
                }
         
         //Måste fixa en update för områdestabell så den uppdateras, även områdeschef. Gör klart 
         //Admin funktion måste fixas, ändrar inte nuvarande värde i tabell.
         //Måste lägga till delete funtkioner för kontorschef & områdeschef
         
    }//GEN-LAST:event_btnÄndraActionPerformed

    private void btnListaAllaAgenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaAllaAgenterActionPerformed
      
        //Tömmer textfältet
        tfAgenter.setText("");
        //Skapar en ArrayList av  HashMaps som tar två strängar för lagring. 
        ArrayList<HashMap<String,String>> agenter = new ArrayList<HashMap<String,String>>();
        
        try{
        //Lokalvariabel som lagrar SQL-frågan
        String fråga = "SELECT * from AGENT";
        //Hämtar en hel rads information från db och sparar i ArrayList av HashMaps
        agenter = idb.fetchRows(fråga);
        
        //Loopar genom arraylisten & printar vald information i Text Field
        for (HashMap<String,String> agent : agenter){
            tfAgenter.append("Agent-ID: " + agent.get("AGENT_ID"));
            tfAgenter.append("\n" + "Namn: " + agent.get("NAMN"));
            tfAgenter.append("\n" + "Telefon: "+ agent.get("TELEFON"));
            tfAgenter.append("\n" + "Anställningsdatum: " + agent.get("ANSTALLNINGSDATUM"));
            tfAgenter.append("\n" + "Administratör JA/NEJ: " + agent.get("ADMINISTRATOR"));
            tfAgenter.append("\n" + "Område: " + idb.fetchSingle("SELECT BENAMNING FROM OMRADE WHERE OMRADES_ID = (SELECT OMRADE FROM AGENT WHERE AGENT_ID = " + "'" + agent.get("AGENT_ID") + "')"));
            tfAgenter.append("\n" + "--------------------------------------------------" + "\n" + "\n");
        }
        }catch(InfException e){
            JOptionPane.showMessageDialog(null, "Något gick fel, vänligen försök igen");
            System.out.println("Internfel: " + e.getMessage());
            
        }
        
    }//GEN-LAST:event_btnListaAllaAgenterActionPerformed

    private void cboxOmrådeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxOmrådeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxOmrådeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminHanteraAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHanteraAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHanteraAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHanteraAgent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHanteraAgent(idb).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListaAllaAgenter;
    private javax.swing.JButton btnLäggTillAgent;
    private javax.swing.JButton btnSök;
    private javax.swing.JButton btnTaBortAgent;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JButton btnÄndra;
    private javax.swing.JComboBox<String> cboxOmråde;
    private javax.swing.JComboBox<String> cboxOmrådeschef;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAdministratör;
    private javax.swing.JLabel lblAgentID;
    private javax.swing.JLabel lblAnställningsdatum;
    private javax.swing.JLabel lblFältagent;
    private javax.swing.JLabel lblKontorschef;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblOmråde;
    private javax.swing.JLabel lblOmrådeschef;
    private javax.swing.JLabel lblRubrikHanteraAgent;
    private javax.swing.JLabel lblSökAgent;
    private javax.swing.JLabel lblTelefon;
    private javax.swing.JRadioButton rbtnAdministratör;
    private javax.swing.JRadioButton rbtnFältagent;
    private javax.swing.JRadioButton rbtnKontorschef;
    private javax.swing.JRadioButton rbtnOmrådeschef;
    private javax.swing.JTextArea tfAgenter;
    private javax.swing.JTextField txtAgentID;
    private javax.swing.JTextField txtAnställningsdatum;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtSökAgent;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}
