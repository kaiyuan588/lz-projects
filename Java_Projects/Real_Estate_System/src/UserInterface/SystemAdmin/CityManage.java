/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdmin;

import Business.City.City;
import Business.Data.Databank;
import Business.Network.CountryNetwork;
import Business.Rssystem;
import Business.State.State;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ruby
 */
public class CityManage extends javax.swing.JPanel {

    /**
     * Creates new form CityManage
     */
    private JPanel p;
    private Rssystem b;

    CityManage(Rssystem b, JPanel p) {
        initComponents();
        this.p = p;
        this.b = b;
        cb1.removeAllItems();
        cb2.removeAllItems();
        for(CountryNetwork nt : b.getNetworkList()){
            cb1.addItem(nt.getName());
        }
        populatetbl();
    }
    
    public void populatetbl(){
        DefaultTableModel dtm= (DefaultTableModel)tbl.getModel();
        dtm.setRowCount(0);
        for(CountryNetwork nt : b.getNetworkList()){
            for(State s : nt.getStatelist()){
                for(City c : s.getCitylist()){
                    Object row[] = new Object[3];
                    row[0] = c;
                    row[1] = s;
                    row[2] = nt;
                    dtm.addRow(row);
                }
            }
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

        backbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cb2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        deletebtn = new javax.swing.JButton();
        createbtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(68, 75, 92));

        backbtn.setBackground(new java.awt.Color(128, 209, 196));
        backbtn.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        backbtn.setForeground(new java.awt.Color(255, 255, 255));
        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("City Manage");

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "City", "State", "Country Network"
            }
        ));
        jScrollPane1.setViewportView(tbl);

        jLabel2.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Country Network");

        cb1.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("State");

        cb2.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        cb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("City");

        deletebtn.setBackground(new java.awt.Color(128, 209, 196));
        deletebtn.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        deletebtn.setForeground(new java.awt.Color(255, 255, 255));
        deletebtn.setText("Delete");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        createbtn.setBackground(new java.awt.Color(128, 209, 196));
        createbtn.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        createbtn.setForeground(new java.awt.Color(255, 255, 255));
        createbtn.setText("Create");
        createbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cb2, 0, 264, Short.MAX_VALUE)
                                    .addComponent(t1))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(createbtn, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(deletebtn, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(525, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(backbtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createbtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletebtn))
                .addContainerGap(293, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        p.remove(this);
        CardLayout layout =(CardLayout) p.getLayout();
        layout.previous(p);
    }//GEN-LAST:event_backbtnActionPerformed

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        // TODO add your handling code here:
        if(cb1.getSelectedItem()!=null){
            cb2.removeAllItems();
            CountryNetwork nt = b.findNetwork((String)cb1.getSelectedItem());
            for(State s : nt.getStatelist()){
                cb2.addItem(s.getName());
            }
        }
        
    }//GEN-LAST:event_cb1ActionPerformed

    private void createbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createbtnActionPerformed
        // TODO add your handling code here:
        CountryNetwork nt = b.findNetwork((String)cb1.getSelectedItem());
        State s = nt.findState((String)cb2.getSelectedItem());
        if(!t1.getText().isEmpty()){
            if(s.checkUniqueCity(t1.getText())){
                City c = new City(s);
                c.setName(t1.getText());
                s.getCitylist().add(c);
//                JOptionPane.showMessageDialog(null,"Created");
                populatetbl();
                Databank.getInstance().storeSystem(b);
            }else{
                JOptionPane.showMessageDialog(null,"City Exists");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Empty Inputs");
        }
    }//GEN-LAST:event_createbtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        // TODO add your handling code here:
        int selectedrow= tbl.getSelectedRow();
        if(selectedrow >=0){
            State s= (State)tbl.getValueAt(selectedrow,1);
            City c = (City)tbl.getValueAt(selectedrow,0);
            s.getCitylist().remove(c);
//            JOptionPane.showMessageDialog(null,"Deleted");
            populatetbl();
            Databank.getInstance().storeSystem(b);
        }else{
            JOptionPane.showMessageDialog(null,"Please Select Any Row");
        }
    }//GEN-LAST:event_deletebtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JComboBox<String> cb2;
    private javax.swing.JButton createbtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t1;
    private javax.swing.JTable tbl;
    // End of variables declaration//GEN-END:variables
}