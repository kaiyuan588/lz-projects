/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.LandOwnerMasterRole;

import Business.Data.Databank;
import Business.Enterprise.LandOwner;
import Business.Organization.LandOwnerMasterOrg;
import Business.Rssystem;
import Business.land.Land;
import java.awt.CardLayout;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ruby
 */
public class SetPrice extends javax.swing.JPanel {

    /**
     * Creates new form SetPrice
     */
    
    private JPanel p;
    private Rssystem b;
    private LandOwner lo;
    private LandOwnerMasterOrg m;

    SetPrice(Rssystem b, JPanel p, LandOwner lo, LandOwnerMasterOrg m) {
        initComponents();
        this.b = b;
        this.p = p;
        this.lo = lo;
        this.m = m;
        populatetbl1();
        populatetbl2();
    }
    
    public void populatetbl1(){
        DefaultTableModel dtm = (DefaultTableModel)tbl1.getModel();
        dtm.setRowCount(0);
        for(Land l : lo.getEvaluatedlandlist()){
            Object row[] = new Object[3];
            row[0] = l;
            row[1] = l.getTopprice();
            row[2] = l.getBottomprice();
            dtm.addRow(row);
        }
    }
    
    public void populatetbl2(){
        DefaultTableModel dtm = (DefaultTableModel)tbl2.getModel();
        dtm.setRowCount(0);
        for(Land l : lo.getPricedlandlist()){
            Object row[] = new Object[2];
            row[0] = l;
            row[1] = l.getUnitprice();
            dtm.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        backbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        pricebtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        sellbtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(68, 75, 92));

        jLabel1.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Set Price and Sell");

        backbtn.setBackground(new java.awt.Color(128, 209, 196));
        backbtn.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        backbtn.setForeground(new java.awt.Color(255, 255, 255));
        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        tbl1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Top Unit Price", "Bottom Unit Price"
            }
        ));
        jScrollPane1.setViewportView(tbl1);
        if (tbl1.getColumnModel().getColumnCount() > 0) {
            tbl1.getColumnModel().getColumn(2).setHeaderValue("Bottom Unit Price");
        }

        tbl2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Unit Price"
            }
        ));
        jScrollPane2.setViewportView(tbl2);

        jLabel2.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Unit Price");

        pricebtn.setBackground(new java.awt.Color(128, 209, 196));
        pricebtn.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        pricebtn.setForeground(new java.awt.Color(255, 255, 255));
        pricebtn.setText("Set Price");
        pricebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pricebtnActionPerformed(evt);
            }
        });

        deletebtn.setBackground(new java.awt.Color(128, 209, 196));
        deletebtn.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        deletebtn.setForeground(new java.awt.Color(255, 255, 255));
        deletebtn.setText("Delete");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        sellbtn.setBackground(new java.awt.Color(128, 209, 196));
        sellbtn.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        sellbtn.setForeground(new java.awt.Color(255, 255, 255));
        sellbtn.setText("On Shelf");
        sellbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(pricebtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sellbtn))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(289, 289, 289)
                            .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2)))
                .addContainerGap(385, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backbtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pricebtn)
                    .addComponent(deletebtn)
                    .addComponent(sellbtn))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(219, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        p.remove(this);
        CardLayout layout =(CardLayout) p.getLayout();
        layout.previous(p);
    }//GEN-LAST:event_backbtnActionPerformed

    private void pricebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pricebtnActionPerformed
        // TODO add your handling code here:
        int selectedrow= tbl1.getSelectedRow();
        if(selectedrow >=0){
            Land l = (Land)tbl1.getValueAt(selectedrow,0);
            Scanner sc = new Scanner(t1.getText());
            if(sc.hasNextDouble() && Double.parseDouble(t1.getText())<= l.getTopprice() && l.getBottomprice()<=Double.parseDouble(t1.getText())){
                if(lo.findpricedland(l)!=null){
                    lo.getPricedlandlist().remove(l);
                }
                l.setUnitprice(Double.parseDouble(t1.getText()));
                lo.getPricedlandlist().add(l);
                populatetbl2();
                Databank.getInstance().storeSystem(b);
            }
            else{
                JOptionPane.showMessageDialog(null,"Invalid Inputs");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Please Select Any Row");
        }
    }//GEN-LAST:event_pricebtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        // TODO add your handling code here:
        int selectedrow= tbl2.getSelectedRow();
        if(selectedrow >=0){
            Land l = (Land)tbl2.getValueAt(selectedrow,0);
            lo.getPricedlandlist().remove(l);
            populatetbl2();
            Databank.getInstance().storeSystem(b);
        }else{
            JOptionPane.showMessageDialog(null,"Please Select Any Row");
        }
    }//GEN-LAST:event_deletebtnActionPerformed

    private void sellbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellbtnActionPerformed
        // TODO add your handling code here:
        int selectedrow= tbl2.getSelectedRow();
        if(selectedrow >=0){
            Land l = (Land)tbl2.getValueAt(selectedrow,0);
            if(lo.getCity().findonshelfland(l)==null){
                lo.getCity().getLandtobesold().add(l);
                JOptionPane.showMessageDialog(null, "On Shelf Requeset Sent");
                Databank.getInstance().storeSystem(b);
            }else{
                lo.getCity().getLandtobesold().remove(lo.getCity().findonshelfland(l));
                lo.getCity().getLandtobesold().add(l);
                JOptionPane.showMessageDialog(null, "Land Already On Shelf");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Please Select Any Row");
        }
    }//GEN-LAST:event_sellbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton pricebtn;
    private javax.swing.JButton sellbtn;
    private javax.swing.JTextField t1;
    private javax.swing.JTable tbl1;
    private javax.swing.JTable tbl2;
    // End of variables declaration//GEN-END:variables
}
