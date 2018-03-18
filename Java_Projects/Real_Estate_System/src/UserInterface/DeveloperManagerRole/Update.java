/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DeveloperManagerRole;

import Business.Construction.Construction;
import Business.Construction.Construction.ConstructionType;
import Business.Enterprise.Developer;
import Business.Organization.OrganizationDirectory;
import Business.Rssystem;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author 55303
 */
public class Update extends javax.swing.JPanel {
    JPanel p;
    Developer e;
     Rssystem b;
     Construction c;
    Update(JPanel p, Developer e, Rssystem b, Construction c) {
        initComponents();
       this.p = p;
       this.b = b;
       this.e = (Developer)e;
       this.c = c;
        populateProductDetails();
        btnSave.setEnabled(false);
        btnEdit.setEnabled(true);
    }

    

     private void populateProductDetails(){
        txtName.setText(c.getName());
        txtID.setText(Integer.toString(c.getID()));
        txtArea.setText(Double.toString(c.getArea()));
        txtCost.setText(Double.toString(c.getCost()));
        if(c.getType() == ConstructionType.Residence ){
            cb1.setSelectedItem("Residence");
        }else if(c.getType() == ConstructionType.Sanitation){
            cb1.setSelectedItem("Sanitation");
        }else if(c.getType() == ConstructionType.OfficeBuilding){
            cb1.setSelectedItem("OfficeBuilding");
        }else if(c.getType() == ConstructionType.CommericalCenter){
            cb1.setSelectedItem("CommericalCenter");
        }else if(c.getType() == ConstructionType.Military){
            cb1.setSelectedItem("Military");
        }else if(c.getType() == ConstructionType.TransportationCenter){
            cb1.setSelectedItem("TransportationCenter");
        }else if(c.getType() == ConstructionType.Education){
            cb1.setSelectedItem("Education");
        }else{
            cb1.setSelectedItem("Governance"); 
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

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        cb1 = new javax.swing.JComboBox<>();
        txtCost = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        backjButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(68, 75, 92));

        jLabel4.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cost:");

        jLabel5.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Construction Name:");

        jLabel6.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Construction ID:");

        jLabel7.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Area:");

        jLabel8.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Type:");

        cb1.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Residence", "Sanitation", "OfficeBuilding", "CommericalCenter", "Military", "TransportationCenter", "Education", "Governance" }));

        btnSave.setBackground(new java.awt.Color(128, 209, 196));
        btnSave.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(128, 209, 196));
        btnEdit.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        backjButton1.setBackground(new java.awt.Color(128, 209, 196));
        backjButton1.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        backjButton1.setForeground(new java.awt.Color(255, 255, 255));
        backjButton1.setText("<< Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(18, 18, 18)
                                    .addComponent(cb1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtArea))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(backjButton1)
                        .addGap(41, 41, 41)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(862, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnEdit)
                    .addComponent(backjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(326, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
      
       
        btnSave.setEnabled(false);
        btnEdit.setEnabled(true);

        c.setName(txtName.getText());
        c.setID(Integer.parseInt(txtID.getText()));
        c.setArea(Double.parseDouble(txtArea.getText()));
        c.setCost(Double.parseDouble(txtCost.getText()));
      
        cb1.setEnabled(false);

        txtName.setEditable(false);
        txtID.setEditable(false);
        txtArea.setEditable(false);
        txtCost.setEditable(false);
        
        cb1.setEditable(false);

        JOptionPane.showMessageDialog(null,"Product updated!");

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        txtName.setEnabled(true);
        txtID.setEnabled(true);
        txtArea.setEnabled(true);
       
        txtCost.setEnabled(true);
        cb1.setEnabled(true);

        txtName.setEditable(true);
        txtID.setEditable(true);
        txtArea.setEditable(true);
        
        txtCost.setEditable(true);
        cb1.setEditable(true);

        btnSave.setEnabled(true);
        btnEdit.setEnabled(false);

    }//GEN-LAST:event_btnEditActionPerformed

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        p.remove(this);
        CardLayout layout = (CardLayout) p.getLayout();
        layout.previous(p);
    }//GEN-LAST:event_backjButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtCost;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}