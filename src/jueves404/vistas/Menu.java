/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jueves404.vistas;

import java.util.ArrayList;
import jueves404.entidades.Producto;

/**
 *
 * @author Usuario
 */
public class Menu extends javax.swing.JFrame {
private static ArrayList<Producto> productos=new ArrayList<>();
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }
    
    public static ArrayList<Producto> getListaProductos() {
        return productos;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmProductos = new javax.swing.JMenu();
        jmiAlta = new javax.swing.JMenuItem();
        jmiConsulta = new javax.swing.JMenuItem();
        jmCategoria = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jmProductos.setText("Productos");

        jmiAlta.setText("Alta");
        jmiAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAltaActionPerformed(evt);
            }
        });
        jmProductos.add(jmiAlta);

        jmiConsulta.setText("Consulta");
        jmiConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiConsultaActionPerformed(evt);
            }
        });
        jmProductos.add(jmiConsulta);

        jMenuBar1.add(jmProductos);

        jmCategoria.setText("Consultas");

        jMenuItem1.setText("Categoria");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jmCategoria.add(jMenuItem1);

        jMenuBar1.add(jmCategoria);

        jmSalir.setText("Salir");
        jMenuBar1.add(jmSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAltaActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        AltaDeProductos adp=new AltaDeProductos();
        adp.setVisible(true);
        escritorio.add(adp);
        escritorio.moveToFront(adp);
        
        
    }//GEN-LAST:event_jmiAltaActionPerformed

    private void jmiConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiConsultaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        Consulta consulta = new Consulta();
        consulta.setVisible(true);
        escritorio.add(consulta);
        escritorio.moveToFront(consulta);
    }//GEN-LAST:event_jmiConsultaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        vistaCategoria categoria = new vistaCategoria();
        categoria.setVisible(true);
        escritorio.add(categoria);
        escritorio.moveToFront(categoria);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    public static ArrayList<Producto> getProductos() {
        return productos;
    }

   
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jmCategoria;
    private javax.swing.JMenu jmProductos;
    private javax.swing.JMenu jmSalir;
    private javax.swing.JMenuItem jmiAlta;
    private javax.swing.JMenuItem jmiConsulta;
    // End of variables declaration//GEN-END:variables
}
