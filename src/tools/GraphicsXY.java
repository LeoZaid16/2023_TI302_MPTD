/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tools;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author HP
 */
public class GraphicsXY extends javax.swing.JFrame {

    /**
     * Creates new form GraphicsXY
     */
    public GraphicsXY() {
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

        PnlDraw = new javax.swing.JPanel();
        btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PnlDraw.setPreferredSize(new java.awt.Dimension(300, 300));
        PnlDraw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PnlDrawMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PnlDrawLayout = new javax.swing.GroupLayout(PnlDraw);
        PnlDraw.setLayout(PnlDrawLayout);
        PnlDrawLayout.setHorizontalGroup(
            PnlDrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        PnlDrawLayout.setVerticalGroup(
            PnlDrawLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        getContentPane().add(PnlDraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, -1));

        btn.setText("Draw");
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        getContentPane().add(btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, -1));

        setBounds(0, 0, 640, 480);
    }// </editor-fold>//GEN-END:initComponents

    private void drawAxis(){
        Graphics2D g = (Graphics2D) PnlDraw.getGraphics();
        g.setColor(Color.green);
        g.fillRect(0, 0,Coordinate.WIDTH, Coordinate.HEIGHT);
        
    }
    
    private void PnlDrawMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PnlDrawMouseClicked
        // TODO add your handling code here:
        drawAxis();
    }//GEN-LAST:event_PnlDrawMouseClicked

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        // TODO add your handling code here:
        drawAxis();
    }//GEN-LAST:event_btnActionPerformed

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
            java.util.logging.Logger.getLogger(GraphicsXY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraphicsXY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraphicsXY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraphicsXY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraphicsXY().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlDraw;
    private javax.swing.JButton btn;
    // End of variables declaration//GEN-END:variables
}
