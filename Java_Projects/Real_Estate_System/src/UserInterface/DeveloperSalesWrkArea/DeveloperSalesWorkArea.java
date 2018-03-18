/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DeveloperSalesWrkArea;

import Business.Construction.Construction;
import Business.Data.Databank;
import Business.Enterprise.Developer;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Realestate.RealEstate;
import Business.Rssystem;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 55303
 */
public class DeveloperSalesWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form DeveloperSalesWorkArea
     */
 JPanel p;
  Rssystem b;
  Organization o;
  Developer e;
    public DeveloperSalesWorkArea(JPanel p, Rssystem b, Organization o,Developer e) {
          initComponents();
          this.b = b;
          this.o = o;
          this.p = p;
          this.e = (Developer)e;
          populatetbl();
          populatetbl2();
    }
    
    public void populatetbl(){
        DefaultTableModel dtm = (DefaultTableModel)tbl1.getModel();
        dtm.setRowCount(0);
        for(RealEstate re : e.getRealestatelist()){
            
            Object row[] = new Object[5];
            row[0] = re.getConstruction().getName();
            row[1] = re;
            row[2] = re.getRealestatetype();
            row[3] = re.getConstruction().getBottomprice();
            row[4] = re.getConstruction().getTopprice();
            dtm.addRow(row);
        }
    }
    
    public void populatetbl2(){
        DefaultTableModel dtm = (DefaultTableModel)tbl2.getModel();
        dtm.setRowCount(0);
        for(RealEstate re : e.getRealestatelist()){
            Object row[] = new Object[5];
            row[0] = re.getConstruction().getName();
            row[1] = re;
            row[2] = re.getUnitprice();
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
        jLabel2 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        sellbtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl2 = new javax.swing.JTable();
        pricebtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(68, 75, 92));

        jLabel1.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Developer Sales Work Area");

        backbtn.setBackground(new java.awt.Color(128, 209, 196));
        backbtn.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        backbtn.setForeground(new java.awt.Color(255, 255, 255));
        backbtn.setText("Logout");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        tbl1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "ID", "Type", "Bottom Price", "Top Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl1);
        if (tbl1.getColumnModel().getColumnCount() > 0) {
            tbl1.getColumnModel().getColumn(2).setHeaderValue("Type");
            tbl1.getColumnModel().getColumn(4).setHeaderValue("Top Price");
        }

        jLabel2.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Price:");

        sellbtn.setBackground(new java.awt.Color(128, 209, 196));
        sellbtn.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        sellbtn.setForeground(new java.awt.Color(255, 255, 255));
        sellbtn.setText("On Shelf ");
        sellbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellbtnActionPerformed(evt);
            }
        });

        tbl2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "ID", "Unit Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbl2);

        pricebtn.setBackground(new java.awt.Color(128, 209, 196));
        pricebtn.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        pricebtn.setForeground(new java.awt.Color(255, 255, 255));
        pricebtn.setText("Set A Price");
        pricebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pricebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pricebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(sellbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(329, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sellbtn)
                    .addComponent(pricebtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(251, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        p.remove(this);
        CardLayout layout =(CardLayout) p.getLayout();
        layout.previous(p);
    }//GEN-LAST:event_backbtnActionPerformed

    private void sellbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellbtnActionPerformed
        // TODO add your handling code here:
        int selectedrow= tbl2.getSelectedRow();
        if(selectedrow >=0){
            RealEstate re = (RealEstate)tbl2.getValueAt(selectedrow,1);
            if(e.getCity().findRealEstate(re.getId()) == null){
                if(re.getUnitprice()!=0){
                    e.getCity().getEstatetobesold().add(re);
                    JOptionPane.showMessageDialog(null,"On Shelf Request Sent");
                }else{
                    JOptionPane.showMessageDialog(null,"Set A Price First");
                }
            }else{
                e.getCity().getEstatetobesold().remove(e.getCity().findRealEstate(re.getId()));
                e.getCity().getEstatetobesold().add(re);
                JOptionPane.showMessageDialog(null,"Already On Shelf");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Please Select Any Row");
        }
        Databank.getInstance().storeSystem(b);
    }//GEN-LAST:event_sellbtnActionPerformed

    private void pricebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pricebtnActionPerformed
        // TODO add your handling code here:
        int selectedrow= tbl1.getSelectedRow();
        if(selectedrow >=0){
            RealEstate re = (RealEstate)tbl1.getValueAt(selectedrow,1);
            Construction con = re.getConstruction();
            double d = Double.parseDouble(txtPrice.getText());
            if(d >= con.getBottomprice() && d <= con.getTopprice()){
                con.setPrice(d);
                e.getCity().getEvaluatedConslist().add(con);
                re.setUnitprice(d);
                populatetbl2();
                Databank.getInstance().storeSystem(b);
            }else{
                JOptionPane.showMessageDialog(null,"Invalid Inputs");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Please Select Any Row");
        }
    }//GEN-LAST:event_pricebtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton pricebtn;
    private javax.swing.JButton sellbtn;
    private javax.swing.JTable tbl1;
    private javax.swing.JTable tbl2;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}