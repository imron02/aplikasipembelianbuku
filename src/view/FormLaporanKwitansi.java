/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.KwitansiController;

/**
 *
 * @author aim
 */
public class FormLaporanKwitansi extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormLaporanKwitansi
     */
    public FormLaporanKwitansi() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mdiDesktopPane = new javax.swing.JDesktopPane();
        cetakToggleButton = new javax.swing.JToggleButton();
        pembeliTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tutupToggleButton = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        teleponTextField = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Laporan Kwitansi");

        cetakToggleButton.setText("Cetak");
        cetakToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakToggleButtonActionPerformed(evt);
            }
        });
        cetakToggleButton.setBounds(250, 40, 116, 28);
        mdiDesktopPane.add(cetakToggleButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pembeliTextField.setBounds(110, 40, 119, 28);
        mdiDesktopPane.add(pembeliTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setText("Pembeli");
        jLabel1.setBounds(20, 50, 69, 18);
        mdiDesktopPane.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        tutupToggleButton.setText("Tutup");
        tutupToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tutupToggleButtonActionPerformed(evt);
            }
        });
        tutupToggleButton.setBounds(250, 110, 116, 28);
        mdiDesktopPane.add(tutupToggleButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setText("Telepon");
        jLabel2.setBounds(20, 120, 70, 18);
        mdiDesktopPane.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        teleponTextField.setBounds(110, 110, 120, 28);
        mdiDesktopPane.add(teleponTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mdiDesktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mdiDesktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cetakToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakToggleButtonActionPerformed
        // TODO add your handling code here:
        new KwitansiController().cetakLaporan(pembeliTextField, teleponTextField);
    }//GEN-LAST:event_cetakToggleButtonActionPerformed

    private void tutupToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tutupToggleButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_tutupToggleButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton cetakToggleButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JDesktopPane mdiDesktopPane;
    private javax.swing.JTextField pembeliTextField;
    private javax.swing.JTextField teleponTextField;
    private javax.swing.JToggleButton tutupToggleButton;
    // End of variables declaration//GEN-END:variables
}