/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shadowstrike;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import org.openide.awt.TabbedPaneFactory;
import shadowstrike.ui.ScriptConsole;
import shadowstrike.ui.SessionTable;

/**
 *
 * @author root
 */
public class ShadowStrike extends javax.swing.JFrame {

    /**
     * Creates new form ShadowStrike
     */
    public ShadowStrike() {
        initComponents();
        this.jSplitPane1.setTopComponent(new SessionTable());
        this.MainTabbedPane.add("Script Console", new ScriptConsole());
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        MainTabbedPane = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        PreferencesMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        ScriptManagerMenuItem = new javax.swing.JMenuItem();
        ListenersMenuItem = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        CloseMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerLocation(110);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        MainTabbedPane = TabbedPaneFactory.createCloseButtonTabbedPane();
        MainTabbedPane.addPropertyChangeListener( TabbedPaneFactory.PROP_CLOSE, new PropertyChangeListener() {

            public void propertyChange(PropertyChangeEvent evt) {
                javax.swing.JTabbedPane pane = (javax.swing.JTabbedPane)evt.getSource();
                int sel = pane.getSelectedIndex();
                pane.removeTabAt(sel);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1056, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainTabbedPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jSplitPane1.setRightComponent(jPanel2);

        jMenu1.setText("Shadow Strike");

        PreferencesMenuItem.setText("Preferences");
        jMenu1.add(PreferencesMenuItem);
        jMenu1.add(jSeparator1);

        ScriptManagerMenuItem.setText("Script Manager");
        jMenu1.add(ScriptManagerMenuItem);

        ListenersMenuItem.setText("Listeners");
        ListenersMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListenersMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(ListenersMenuItem);
        jMenu1.add(jSeparator2);

        CloseMenuItem.setText("Close");
        jMenu1.add(CloseMenuItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("View");

        jMenuItem1.setText("Script Console");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Attacks");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListenersMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListenersMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListenersMenuItemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        this.MainTabbedPane.add("Script Console", new ScriptConsole());
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
            java.util.logging.Logger.getLogger(ShadowStrike.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShadowStrike.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShadowStrike.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShadowStrike.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShadowStrike().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CloseMenuItem;
    private javax.swing.JMenuItem ListenersMenuItem;
    private javax.swing.JTabbedPane MainTabbedPane;
    private javax.swing.JMenuItem PreferencesMenuItem;
    private javax.swing.JMenuItem ScriptManagerMenuItem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
