/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shadowstrike.ui;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.UIDefaults;
import javax.swing.text.AttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.StringEscapeUtils;
import shadowstrike.utils.Printer;
/**
 *
 * @author root
 */
public class ScriptConsole extends javax.swing.JPanel {

    /**
     * Creates new form ScriptConole
     */
    public String text;
    public ScriptConsole() {
        initComponents();
        this.jScrollPane2.getViewport().setBackground(Color.BLACK);
        this.jScrollPane2.getViewport().setForeground(Color.WHITE);
        this.text = "";
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sTextField1 = new shadowstrike.components.STextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();

        setBackground(java.awt.Color.black);
        setForeground(java.awt.Color.white);

        sTextField1.setBackground(java.awt.Color.black);
        sTextField1.setBorder(null);
        sTextField1.setForeground(java.awt.Color.white);
        sTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sTextField1ActionPerformed(evt);
            }
        });
        sTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sTextField1KeyPressed(evt);
            }
        });

        jLabel1.setBackground(java.awt.Color.black);
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText(" shadowscript> ");
        jLabel1.setToolTipText("");
        jLabel1.setBorder(null);

        jScrollPane2.setBorder(null);

        jEditorPane1.setEditable(false);
        jEditorPane1.setBackground(java.awt.Color.black);
        Color bgColor = Color.BLACK;
        UIDefaults defaults = new UIDefaults();
        defaults.put("EditorPane[Enabled].backgroundPainter", bgColor);
        jEditorPane1.putClientProperty("Nimbus.Overrides", defaults);
        jEditorPane1.putClientProperty("Nimbus.Overrides.InheritDefaults", true);
        jEditorPane1.setBackground(bgColor);
        jEditorPane1.setBorder(null);
        jEditorPane1.setContentType("text/html"); // NOI18N
        jEditorPane1.setFont(new java.awt.Font("Cantarell", 0, 14)); // NOI18N
        jEditorPane1.setForeground(java.awt.Color.white);
        jEditorPane1.setText("<html>\n  <body>\n  </body>\n</html>\n");
        jScrollPane2.setViewportView(jEditorPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(sTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(sTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sTextField1ActionPerformed

    private void sTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sTextField1KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (sTextField1.getText().isEmpty()) {
                this.writeToConsole("shadowscript>");
            }
            else {
                this.writeToConsole("shadowscript> "+StringEscapeUtils.escapeHtml4(this.sTextField1.getText()));
                this.executeCommand(this.sTextField1.getText());
                this.sTextField1.setText("");
            }
            
        }
    }//GEN-LAST:event_sTextField1KeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private shadowstrike.components.STextField sTextField1;
    // End of variables declaration//GEN-END:variables

    private void writeToConsole(String command) {
        text += command + "<br>";
        this.jEditorPane1.setText("<html><body>"+text+"<br><body/></html>");
    }



    private void executeCommand(String command) {
        String[] commandList = StringUtils.split(command, " ");; 
//        String[] splits = command.split(" (?=([^\"]*\"[^\"]*\")*[^\"]*$)");
//        for (int i = 0; i < splits.length; i++) {
//            commandList.add(splits[i].trim());
//        }
        StringUtils.split(command, " ");
        if (commandList[0].equals("help")) {
            this.writeToConsole("Commands     Description<br>------------------------<br>help       Get help about a command<br>load       Load a script<br>unload    Unload a script<br>syntax    Check the syntax of a script");
        }
        else if (commandList[0].equals("load")) {
            if (commandList.length > 1) {
                this.writeToConsole("<font color='blue'>[*]<font color='white'> Loading "+commandList[1]);
            }
            else {
                this.writeToConsole("<font color='red'>[-]<font color='white'> Please specify a file to load");
            }
        }   
        else {
            this.writeToConsole("<font color='red'>[-]<font color='white'> Command not found");
        }
    }
}
