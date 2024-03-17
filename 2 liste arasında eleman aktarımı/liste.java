/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.prj3vs;

import javax.swing.DefaultListModel;

/**
 *
 * @author lenovo
 */
public class prj3vs extends javax.swing.JFrame {
    DefaultListModel<Integer> leftModel = new DefaultListModel<>();
    DefaultListModel<Integer> rightModel = new DefaultListModel<>();
    /**
     * Creates new form prj3vs
     */
    public prj3vs() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        for(int i=1;i<20; i+=2)
            leftModel.addElement(i);
        
        for(int i=0; i<20; i+=2)
            rightModel.addElement(i);
        
         lst_left.setModel(leftModel);
         lst_right.setModel(rightModel);
            }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lst_left = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lst_right = new javax.swing.JList<>();
        btn_leftToright = new javax.swing.JButton();
        btn_rightToleft = new javax.swing.JButton();
        btn_leftall = new javax.swing.JButton();
        btn_rightall = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(lst_left);

        jScrollPane2.setViewportView(lst_right);

        btn_leftToright.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_leftToright.setText(">");
        btn_leftToright.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_leftTorightActionPerformed(evt);
            }
        });

        btn_rightToleft.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_rightToleft.setText("<");
        btn_rightToleft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rightToleftActionPerformed(evt);
            }
        });

        btn_leftall.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_leftall.setText(">>");

        btn_rightall.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_rightall.setText("<<");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_rightToleft)
                            .addComponent(btn_leftToright)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btn_leftall))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_rightall)))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(btn_leftToright)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_rightToleft)
                .addGap(18, 18, 18)
                .addComponent(btn_leftall)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_rightall)
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>                        

    private void btn_leftTorightActionPerformed(java.awt.event.ActionEvent evt) {                                                
        int [] selectedIndices = lst_left.getSelectedIndices();
        int removeCount=0;
        
        for(int inx : selectedIndices){
            rightModel.addElement(leftModel.getElementAt(inx - removeCount));
        leftModel.remove(inx - removeCount);
            removeCount++;
        }
    }                                               

    private void btn_rightToleftActionPerformed(java.awt.event.ActionEvent evt) {                                                
       int [] selectedIndices = lst_right.getSelectedIndices();
       int removeCount = 0;
       
       for(int inx : selectedIndices){
           leftModel.addElement(rightModel.getElementAt(inx - removeCount));
       rightModel.remove(inx - removeCount);
       removeCount++;
       }
    }                                               

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
            java.util.logging.Logger.getLogger(prj3vs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prj3vs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prj3vs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prj3vs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prj3vs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btn_leftToright;
    private javax.swing.JButton btn_leftall;
    private javax.swing.JButton btn_rightToleft;
    private javax.swing.JButton btn_rightall;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<Integer> lst_left;
    private javax.swing.JList<Integer> lst_right;
    // End of variables declaration                   
}
