/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DeveloperManagerRole;

import Business.Data.Databank;
import Business.Realestate.RealEstate;
import Business.Rssystem;
import java.awt.CardLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Ruby
 */
public class ViewRealEstateDetail extends javax.swing.JPanel {

    /**
     * Creates new form ViewRealEstateDetail
     */
    private JPanel p;
    private Rssystem b;
    private RealEstate re;
    private int imagecount;
    
    ViewRealEstateDetail(JPanel p, Rssystem b, RealEstate re) {
        initComponents();
        this.p = p;
        this.b = b;
        this.re = re;
        l1.setText(re.getConstruction().getName());
        l2.setText(re.getAddress());
        l3.setText(re.getDeveloper().getName());
        l4.setText(re.getRealestatetype().getValue());
        l5.setText(String.valueOf(re.getFloorlist().size()));
        l6.setText(String.valueOf(re.getFloorlist().get(0).getRoomlist().size()));
        l7.setText(String.valueOf(re.findRoom(101).getRoomarea()));
        l8.setText(String.valueOf(re.getWholearea()));
        l9.setText(String.valueOf(re.getUnitprice()));
        l10.setText(String.valueOf(re.getId()));
        if(re.getRealestateimglist().size()!=0){
            Image dimg = re.getRealestateimglist().get(0).getScaledInstance(300,250,Image.SCALE_SMOOTH);
            imagelabel.setIcon(new ImageIcon(dimg));
            this.imagecount = 0;
        }else{
            imagelabel.setText("No Image");
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
        jLabel2 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        l9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        l10 = new javax.swing.JLabel();
        imagelabel = new javax.swing.JLabel();
        previous = new javax.swing.JButton();
        next = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();

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
        jLabel1.setText("View Real Estate Detail");

        jLabel2.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Real Estate Name");

        l1.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 255, 255));
        l1.setText("jLabel3");

        jLabel3.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Street Address");

        l2.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 255, 255));
        l2.setText("jLabel3");

        jLabel4.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Developer");

        l3.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        l3.setForeground(new java.awt.Color(255, 255, 255));
        l3.setText("jLabel3");

        jLabel5.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Real Estate Type");

        l4.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        l4.setForeground(new java.awt.Color(255, 255, 255));
        l4.setText("jLabel3");

        jLabel6.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Floor Number");

        l5.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        l5.setForeground(new java.awt.Color(255, 255, 255));
        l5.setText("jLabel3");

        jLabel7.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Room Number/Floor");

        l6.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        l6.setForeground(new java.awt.Color(255, 255, 255));
        l6.setText("jLabel3");

        jLabel8.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Each Room Area");

        l7.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        l7.setForeground(new java.awt.Color(255, 255, 255));
        l7.setText("jLabel3");

        jLabel9.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Total Area");

        l8.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        l8.setForeground(new java.awt.Color(255, 255, 255));
        l8.setText("jLabel3");

        jLabel10.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Unit Price");

        l9.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        l9.setForeground(new java.awt.Color(255, 255, 255));
        l9.setText("jLabel3");

        jLabel11.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Real Estate ID");

        l10.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        l10.setForeground(new java.awt.Color(255, 255, 255));
        l10.setText("jLabel3");

        previous.setBackground(new java.awt.Color(128, 209, 196));
        previous.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        previous.setForeground(new java.awt.Color(255, 255, 255));
        previous.setText("<");
        previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousActionPerformed(evt);
            }
        });

        next.setBackground(new java.awt.Color(128, 209, 196));
        next.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        next.setForeground(new java.awt.Color(255, 255, 255));
        next.setText(">");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        deletebtn.setBackground(new java.awt.Color(128, 209, 196));
        deletebtn.setFont(new java.awt.Font("方正兰亭黑_GB18030", 1, 24)); // NOI18N
        deletebtn.setForeground(new java.awt.Color(255, 255, 255));
        deletebtn.setText("Delete Image");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l5)
                            .addComponent(l6)
                            .addComponent(l7)
                            .addComponent(l8)
                            .addComponent(l9)
                            .addComponent(l1)
                            .addComponent(l2)
                            .addComponent(l3)
                            .addComponent(l10)
                            .addComponent(l4))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(imagelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(deletebtn)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(72, 72, 72)
                                    .addComponent(previous)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(next))))))
                .addContainerGap(417, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(l10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(l1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(l2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(l3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(l4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(l5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(l6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(l7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(l8))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(l9)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backbtn)
                        .addGap(18, 18, 18)
                        .addComponent(imagelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(previous)
                            .addComponent(next))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deletebtn)))
                .addContainerGap(263, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        p.remove(this);
        CardLayout layout =(CardLayout) p.getLayout();
        layout.previous(p);
    }//GEN-LAST:event_backbtnActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // TODO add your handling code here:
        if(re.getRealestateimglist().size()!=0){
            if(imagecount == re.getRealestateimglist().size()-1){
                JOptionPane.showMessageDialog(null, "This Is The Last Picture");
            }else{
                imagecount++;
                Image dimg = re.getRealestateimglist().get(imagecount).getScaledInstance(300,250,Image.SCALE_SMOOTH);
                imagelabel.setIcon(new ImageIcon(dimg));
            }
        }
    }//GEN-LAST:event_nextActionPerformed

    private void previousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousActionPerformed
        // TODO add your handling code here:
        if(re.getRealestateimglist().size()!=0){
            if(imagecount == 0){
                JOptionPane.showMessageDialog(null, "This Is The First Picture");
            }else{
                imagecount--;
                Image dimg = re.getRealestateimglist().get(imagecount).getScaledInstance(300,250,Image.SCALE_SMOOTH);
                imagelabel.setIcon(new ImageIcon(dimg));
            }
        }
    }//GEN-LAST:event_previousActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        // TODO add your handling code here:
        if(re.getRealestateimglist().size()==0){
            JOptionPane.showMessageDialog(null, "All Deleted");
        }
        if(re.getRealestateimglist().size()==1){
            re.getRealestateimglist().remove(re.getRealestateimglist().get(imagecount));
            imagelabel.setIcon(null);
            imagelabel.setText("No Image");
            JOptionPane.showMessageDialog(null, "All Deleted");
        }
        if(re.getRealestateimglist().size()>1){
            if(imagecount != 0){
                Image dimg = re.getRealestateimglist().get(imagecount-1).getScaledInstance(300,250,Image.SCALE_SMOOTH);
                imagelabel.setIcon(new ImageIcon(dimg));
                re.getRealestateimglist().remove(re.getRealestateimglist().get(imagecount));
                imagecount--;
            }else{
                Image dimg = re.getRealestateimglist().get(imagecount+1).getScaledInstance(300,250,Image.SCALE_SMOOTH);
                imagelabel.setIcon(new ImageIcon(dimg));
                re.getRealestateimglist().remove(re.getRealestateimglist().get(imagecount));
            }
        }
        Databank.getInstance().storeSystem(b);
    }//GEN-LAST:event_deletebtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JLabel imagelabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l10;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel l9;
    private javax.swing.JButton next;
    private javax.swing.JButton previous;
    // End of variables declaration//GEN-END:variables
}