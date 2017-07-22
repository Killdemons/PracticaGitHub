package practica.github;

import java.util.*;
import javax.swing.table.DefaultTableModel;

public class practica extends javax.swing.JFrame {

    public practica() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMatriz = new javax.swing.JButton();
        lblTitle1 = new javax.swing.JLabel();
        lblTitle2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblMatriz2 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        lblMatriz1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnMatriz.setText("Generar Matriz");
        btnMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatrizActionPerformed(evt);
            }
        });

        lblTitle1.setText("Matriz Original");

        lblTitle2.setText("Matriz Modificada");

        lblMatriz2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(lblMatriz2);

        lblMatriz1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(lblMatriz1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(lblTitle1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle2)
                .addGap(63, 63, 63))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMatriz)
                .addGap(151, 151, 151))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle1)
                    .addComponent(lblTitle2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMatriz)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatrizActionPerformed
        DefaultTableModel tabla1 = (DefaultTableModel) lblMatriz1.getModel();
        DefaultTableModel tabla2 = (DefaultTableModel) lblMatriz2.getModel();
        tabla1.setRowCount(5);
        tabla2.setRowCount(5);
        tabla1.setColumnCount(5);
        tabla2.setColumnCount(5);
        int[][] matriz = new int[5][5];
        Random rand = new Random();
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                matriz[i][j] = rand.nextInt(51);
            }
        }
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                lblMatriz1.setValueAt(matriz[i][j], i, j);
            }
        }
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                if(matriz[i][j]==0){
                    lblMatriz2.setValueAt(matriz[i][j], i, j);
                }
                else if(matriz[i][j]%2==0){
                    lblMatriz2.setValueAt("$", i, j);
                }
                else{
                    lblMatriz2.setValueAt("#", i, j);
                }
            }
        }
    }//GEN-LAST:event_btnMatrizActionPerformed

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
            java.util.logging.Logger.getLogger(practica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(practica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(practica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(practica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new practica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMatriz;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable lblMatriz1;
    private javax.swing.JTable lblMatriz2;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JLabel lblTitle2;
    // End of variables declaration//GEN-END:variables
}
