/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AgencyAdminRole;

import Business.Data.Databank;
import Business.Enterprise.Agency;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.Role.AgencyCustomer;
import Business.Role.AgencyCustomer.CustomerType;
import Business.Rssystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ruby
 */
public class UserAccountManage extends javax.swing.JPanel {

    /**
     * Creates new form UserAccountManage
     */
    private JPanel p;
    private Rssystem b;
    private Agency e;
    
    UserAccountManage(Rssystem b, JPanel p, Agency e) {
        initComponents();
        this.b = b;
        this.p = p;
        this.e = e;
        cb1.removeAllItems();
        cb2.removeAllItems();
        for(Organization o : e.getOrganizationDirectory().getOrganizationList()){
            cb1.addItem(o.getName()+"-"+o.getOrganizationID());
        }
        populatetbl();
    }
    
    public void populatetbl(){
        DefaultTableModel dtm = (DefaultTableModel)tbl.getModel();
        dtm.setRowCount(0);
        for(Organization o : e.getOrganizationDirectory().getOrganizationList()){
            for(UserAccount ua : o.getUseraccountdirectory().getUserAccountList()){
                Object row[] = new Object[3];
                row[0] = o;
                row[1] = ua.getPerson();
                row[2] = ua;
                dtm.addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        backbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cb2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        t2 = new javax.swing.JPasswordField();
        createbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cb3 = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(68, 75, 92));

        jLabel1.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("UserAccount Manage");

        backbtn.setBackground(new java.awt.Color(128, 209, 196));
        backbtn.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        backbtn.setForeground(new java.awt.Color(255, 255, 255));
        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Organization", "Person", "UserAccount"
            }
        ));
        jScrollPane1.setViewportView(tbl);

        jLabel2.setFont(new java.awt.Font("方正兰亭黑_GB18030", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Organization");

        cb1.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("方正兰亭黑_GB18030", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Person");

        cb2.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        cb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setFont(new java.awt.Font("方正兰亭黑_GB18030", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username");

        jLabel5.setFont(new java.awt.Font("方正兰亭黑_GB18030", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password");

        createbtn.setBackground(new java.awt.Color(128, 209, 196));
        createbtn.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        createbtn.setForeground(new java.awt.Color(255, 255, 255));
        createbtn.setText("Create");
        createbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createbtnActionPerformed(evt);
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

        jLabel6.setFont(new java.awt.Font("方正兰亭黑_GB18030", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Customer Type");

        cb3.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        cb3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NormalCitizen", "PublicServiceEmployee", "GovernmentEmployee" }));
        cb3.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(37, 37, 37)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(62, 62, 62)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(69, 69, 69)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(t2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(t1)
                                .addComponent(cb1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cb3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cb2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(deletebtn, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(createbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(36, 312, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backbtn))
                .addGap(66, 66, 66)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createbtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletebtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(88, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        p.remove(this);
        CardLayout layout =(CardLayout) p.getLayout();
        layout.previous(p);
    }//GEN-LAST:event_backbtnActionPerformed

    private void createbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createbtnActionPerformed
        // TODO add your handling code here:
        String[] s = ((String)cb1.getSelectedItem()).split("-");
        int id = Integer.parseInt(s[1]);
        Organization o = e.getOrganizationDirectory().findOrgbyID(id);
        Person p = o.getPersondirectory().findPersonByName((String)cb2.getSelectedItem());
        if(!t1.getText().isEmpty()){
            if(e.getUseraccountdirectory().checkIfUsernameIsUnique(t1.getText()) && o.getUseraccountdirectory().checkIfUsernameIsUnique(t1.getText())){
                if(!cb3.isEnabled()){
                    UserAccount ua = o.getUseraccountdirectory().createUserAccount(t1.getText(), String.valueOf(t2.getPassword()), p, o.getSupportedRole().get(0));
                    p.getUseraccount().add(ua);
                    populatetbl();
                    Databank.getInstance().storeSystem(b);
                }else{
                    UserAccount ua = o.getUseraccountdirectory().createUserAccount(t1.getText(), String.valueOf(t2.getPassword()), p, new AgencyCustomer(CustomerType.valueOf((String)cb3.getSelectedItem())));
                    p.getUseraccount().add(ua);
                    populatetbl();
                    Databank.getInstance().storeSystem(b);
                }
            }else{
                JOptionPane.showMessageDialog(null,"Username Exists");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Empty Inputs");
        }
    }//GEN-LAST:event_createbtnActionPerformed

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        // TODO add your handling code here:
        if(cb1.getSelectedItem() != null){
            cb2.removeAllItems();
            String[] s = ((String)cb1.getSelectedItem()).split("-");
            int id = Integer.parseInt(s[1]);
            Organization o = e.getOrganizationDirectory().findOrgbyID(id);
            for(Person p : o.getPersondirectory().getPersonlist()){
                cb2.addItem(p.getName());
            }
            if(s[0].equals("Agency Customer Organization")){
                cb3.setEnabled(true);
            }else{
                cb3.setEnabled(false);
            }
        }
    }//GEN-LAST:event_cb1ActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        // TODO add your handling code here:
        int selectedrow= tbl.getSelectedRow();
        if(selectedrow >=0){
            Person p = (Person)tbl.getValueAt(selectedrow,1);
            Organization o = (Organization)tbl.getValueAt(selectedrow,0);
            UserAccount ua = (UserAccount)tbl.getValueAt(selectedrow,2);
            o.getUseraccountdirectory().getUserAccountList().remove(ua);
            p.getUseraccount().remove(ua);
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
    private javax.swing.JComboBox<String> cb3;
    private javax.swing.JButton createbtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t1;
    private javax.swing.JPasswordField t2;
    private javax.swing.JTable tbl;
    // End of variables declaration//GEN-END:variables
}
