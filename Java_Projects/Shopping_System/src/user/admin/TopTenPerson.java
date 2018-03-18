/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.admin;

import business.Business;
import business.PersonAndAccount;
import business.Rank;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ruby
 */
public class TopTenPerson extends javax.swing.JPanel {

    /**
     * Creates new form TopTenPerson
     */
    private Business b;
    private JPanel pp;
    private PersonAndAccount pa;
    
    TopTenPerson(Business b, JPanel pp, PersonAndAccount pa) {
         //To change body of generated methods, choose Tools | Templates.
        initComponents();
        this.b = b;
        this.pp = pp;
        this.pa = pa;
        populatetbl2();
        populatetbl3();
    }
    public void populatetbl2(){
        DefaultTableModel dtm= (DefaultTableModel)tbl2.getModel();
        dtm.setRowCount(0);
        ArrayList<Rank> err = RankByRevenue("Education");
        ArrayList<Rank> frr = RankByRevenue("Financial");
        for(int i=0; i<err.size();i++){
            Object row[] = new Object[3];
            row[0]= "Education";
            row[1] = err.get(i).getName();
            row[2] = err.get(i).getIncome();
            dtm.addRow(row);
        }
        for(int i=0; i<frr.size();i++){
            Object row[] = new Object[3];
            row[0]= "Financial";
            row[1] = frr.get(i).getName();
            row[2] = frr.get(i).getIncome();
            dtm.addRow(row);
        }
        
    }
    public void populatetbl3(){
        DefaultTableModel dtm= (DefaultTableModel)tbl3.getModel();
        dtm.setRowCount(0);
        ArrayList<Rank> egr = new ArrayList<Rank>();
        for(int i=0; i<10;i++){
            egr.add(RankByGap("Education").get(i));
        }
        ArrayList<Rank> fgr = new ArrayList<Rank>();
        for(int i=0; i<10;i++){
            fgr.add(RankByGap("Financial").get(i));
        }
        for(int i=0; i<egr.size();i++){
            Object row[] = new Object[3];
            row[0]= "Education";
            row[1] = egr.get(i).getName();
            row[2] = egr.get(i).getIncome();
            dtm.addRow(row);
        }
        for(int i=0; i<fgr.size();i++){
            Object row[] = new Object[3];
            row[0]= "Financial";
            row[1] = fgr.get(i).getName();
            row[2] = fgr.get(i).getIncome();
            dtm.addRow(row);
        }
     }
    
    public ArrayList<Rank> RankByRevenue(String m){
        ArrayList<Rank> r = new ArrayList<Rank>();
        for(int i=0; i<pa.getRolemanage().getSalesman().size(); i++){
            if(pa.getRolemanage().getSalesman().get(i).getMarketname().equals(m)){
                Rank rk = new Rank();
                rk.setName(pa.getRolemanage().getSalesman().get(i).getFullname());
                rk.setIncome(RevenueByPerson(pa.getRolemanage().getSalesman().get(i).getFullname()));
                r.add(rk);
            }
        }
        Rank rk = new Rank();
        for(int i=0; i< r.size()-1;i++){
            for(int j=0; j<r.size()-1-i;j++){
                if(r.get(j).getIncome()<r.get(j+1).getIncome()){
                    rk.setIncome(r.get(j).getIncome());
                    rk.setName(r.get(j).getName());
                    r.get(j).setIncome(r.get(j+1).getIncome());
                    r.get(j).setName(r.get(j+1).getName());
                    r.get(j+1).setIncome(rk.getIncome());
                    r.get(j+1).setName(rk.getName());
                }
            }
        }
        ArrayList<Rank> r10 = new ArrayList<Rank>();
        for(int i=0; i<10;i++){
            r10.add(r.get(i));
        }
        return r10;
    }
    
    public ArrayList<Rank> RankByGap(String m){
        ArrayList<Rank> r = new ArrayList<Rank>();
        for(int i=0; i<pa.getRolemanage().getSalesman().size(); i++){
            if(pa.getRolemanage().getSalesman().get(i).getMarketname().equals(m)){
                Rank rk = new Rank();
                rk.setName(pa.getRolemanage().getSalesman().get(i).getFullname());
                rk.setIncome(GapByPerson(pa.getRolemanage().getSalesman().get(i).getFullname()));
                r.add(rk);
            }
        }
        Rank rk = new Rank();
        for(int i=0; i< r.size()-1;i++){
            for(int j=0; j<r.size()-1-i;j++){
                if(r.get(j).getIncome()<r.get(j+1).getIncome()){
                    rk.setIncome(r.get(j).getIncome());
                    rk.setName(r.get(j).getName());
                    r.get(j).setIncome(r.get(j+1).getIncome());
                    r.get(j).setName(r.get(j+1).getName());
                    r.get(j+1).setIncome(rk.getIncome());
                    r.get(j+1).setName(rk.getName());
                }
            }
        }
        
        return r;
    }
    public Double GapByPerson(String sm){
        double tr = 0;
        for(int i=0; i<b.getOrderlist().getOrder().size(); i++){
            if(b.getOrderlist().getOrder().get(i).getSalesmanname().equals(sm)){
                tr = tr + (b.getOrderlist().getOrder().get(i).getActualprice()-b.getOrderlist().getOrder().get(i).getTargetprice())*(double)b.getOrderlist().getOrder().get(i).getQuantity();
            }
        }
        return tr;
    }
    public Double RevenueByPerson(String sm){
        double tr = 0;
        for(int i=0; i<b.getOrderlist().getOrder().size(); i++){
            if(b.getOrderlist().getOrder().get(i).getSalesmanname().equals(sm)){
                tr = tr + b.getOrderlist().getOrder().get(i).getTargetprice()*(double)b.getOrderlist().getOrder().get(i).getQuantity();
            }
        }
        return tr;
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
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl2 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbl3 = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Top 10 Person");

        tbl2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Market", "Name", "Revenue"
            }
        ));
        jScrollPane4.setViewportView(tbl2);

        tbl3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Market", "Name", "Gap"
            }
        ));
        jScrollPane5.setViewportView(tbl3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(146, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tbl2;
    private javax.swing.JTable tbl3;
    // End of variables declaration//GEN-END:variables
}
