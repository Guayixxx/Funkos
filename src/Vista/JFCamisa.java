/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author Laura
 */
public class JFCamisa extends javax.swing.JFrame {

    /**
     * Creates new form JFCamisa
     */
    public JFCamisa() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        BIzquierda = new javax.swing.JButton();
        Bderecha = new javax.swing.JButton();
        LabelBarba = new javax.swing.JLabel();
        JlabelOpciones = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BSiguiente = new javax.swing.JButton();
        JLabelCamisa = new javax.swing.JLabel();
        BAntes = new javax.swing.JButton();
        LabelCabello = new javax.swing.JLabel();
        LabelFunk1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(65, 96, 202));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BIzquierda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/next_14825 - copia.png"))); // NOI18N
        BIzquierda.setBorderPainted(false);
        BIzquierda.setContentAreaFilled(false);
        BIzquierda.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/chi - copia.png"))); // NOI18N
        BIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BIzquierdaActionPerformed(evt);
            }
        });
        jPanel3.add(BIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 110, 60));

        Bderecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/next_14825.png"))); // NOI18N
        Bderecha.setBorderPainted(false);
        Bderecha.setContentAreaFilled(false);
        Bderecha.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bderecha.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/chi.png"))); // NOI18N
        Bderecha.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel3.add(Bderecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, 90, 60));
        jPanel3.add(LabelBarba, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 200, 200));
        jPanel3.add(JlabelOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 210, 210));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CHOOSE YOUR TOP CLOTHES !");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        BSiguiente.setBackground(new java.awt.Color(33, 137, 210));
        BSiguiente.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        BSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        BSiguiente.setText("Next");
        BSiguiente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSiguienteActionPerformed(evt);
            }
        });
        jPanel3.add(BSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 710, 190, 40));
        jPanel3.add(JLabelCamisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 244, 380));

        BAntes.setBackground(new java.awt.Color(33, 137, 210));
        BAntes.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        BAntes.setForeground(new java.awt.Color(255, 255, 255));
        BAntes.setText("Back");
        BAntes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BAntes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAntesActionPerformed(evt);
            }
        });
        jPanel3.add(BAntes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 710, 190, 40));
        jPanel3.add(LabelCabello, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 270, 200));

        LabelFunk1.setDoubleBuffered(true);
        jPanel3.add(LabelFunk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 260, 330));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BIzquierdaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BIzquierdaActionPerformed

    private void BAntesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAntesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BAntesActionPerformed

    private void BSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSiguienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BSiguienteActionPerformed

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
            java.util.logging.Logger.getLogger(JFCamisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCamisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCamisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCamisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCamisa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BAntes;
    public javax.swing.JButton BIzquierda;
    public javax.swing.JButton BSiguiente;
    public javax.swing.JButton Bderecha;
    public javax.swing.JLabel JLabelCamisa;
    public javax.swing.JLabel JlabelOpciones;
    public javax.swing.JLabel LabelBarba;
    public javax.swing.JLabel LabelCabello;
    public javax.swing.JLabel LabelFunk1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
