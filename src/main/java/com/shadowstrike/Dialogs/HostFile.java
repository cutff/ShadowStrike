/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shadowstrike.Dialogs;

/**
 *
 * @author root
 */
public class HostFile extends javax.swing.JPanel {

    /**
     * Creates new form HostFile
     */
    public HostFile() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jTextPane1.setEditable(false);
        jTextPane1.setText("Host a file with Shadow Strike's web server");
        jTextPane1.setFocusable(false);
        jScrollPane1.setViewportView(jTextPane1);

        jLabel1.setText("File:");
        jLabel1.setMaximumSize(new java.awt.Dimension(76, 20));
        jLabel1.setMinimumSize(new java.awt.Dimension(76, 20));
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(76, 20));

        jTextField3.setText("g");
        jTextField3.setPreferredSize(new java.awt.Dimension(19, 27));
        jTextField3.setRequestFocusEnabled(false);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.setText("127.0.0.1");
        jTextField4.setPreferredSize(new java.awt.Dimension(72, 27));

        jLabel2.setText("Local URI:");
        jLabel2.setMaximumSize(new java.awt.Dimension(66, 20));
        jLabel2.setMinimumSize(new java.awt.Dimension(66, 20));
        jLabel2.setName(""); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(66, 20));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folderClosedIcon.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField2.setText("/download/file.ext");
        jTextField2.setPreferredSize(new java.awt.Dimension(131, 27));
        jTextField2.setRequestFocusEnabled(false);

        jLabel3.setText("Local Host:");
        jLabel3.setMaximumSize(new java.awt.Dimension(76, 20));
        jLabel3.setMinimumSize(new java.awt.Dimension(76, 20));
        jLabel3.setName(""); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(76, 20));

        jLabel4.setText("Local Port:");
        jLabel4.setMaximumSize(new java.awt.Dimension(76, 20));
        jLabel4.setMinimumSize(new java.awt.Dimension(76, 20));
        jLabel4.setPreferredSize(new java.awt.Dimension(76, 20));
        jLabel4.setRequestFocusEnabled(false);

        jTextField5.setText("80");
        jTextField5.setPreferredSize(new java.awt.Dimension(29, 27));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        String[] items = new String[]{"automatic", "application/octect-stream::any", "application/acad::dwg", "application/arj::arj", "application/astound::asn", "application/clariscad::ccad", "application/drafting::drw", "application/dxf::dxf", "application/hta::hta", "application/i-deas::unv", "application/iges::igs", "application/java-archive::jar", "application/mac-binhex40::hqx", "application/msaccess::mdb", "application/msexcel::xlw", "application/mspowerpoint::ppt", "application/msproject::mpp", "application/msword::w6w", "application/mswrite::wri", "application/octet-stream::bin", "application/oda::oda", "application/pdf::pdf", "application/postscript::ps", "application/pro_eng::prt", "application/rtf::rtf", "application/set::set", "application/sla::stl", "application/solids::sol", "application/STEP::stp", "application/vda::vda", "application/vnd.openxmlformats-officedocument.wordprocessingml.document::docx", "application/vnd.ms-word.document.macroEnabled.12::docm", "application/vnd.openxmlformats-officedocument.wordprocessingml.template::dotx", "application/vnd.ms-word.template.macroEnabled.12::dotm", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet::xlsx", "application/vnd.ms-excel.sheet.macroEnabled.12::xlsm", "application/vnd.openxmlformats-officedocument.spreadsheetml.template::xltx", "application/vnd.ms-excel.template.macroEnabled.12::xltm", "application/vnd.ms-excel.sheet.binary.macroEnabled.12::xlsb", "application/vnd.ms-excel.addin.macroEnabled.12::xlam", "application/vnd.openxmlformats-officedocument.presentationml.presentation::pptx", "application/vnd.ms-powerpoint.presentation.macroEnabled.12::pptm", "application/vnd.openxmlformats-officedocument.presentationml.slideshow::ppsx", "application/vnd.ms-powerpoint.slideshow.macroEnabled.12::ppsm", "application/vnd.openxmlformats-officedocument.presentationml.template::potx", "application/vnd.ms-powerpoint.template.macroEnabled.12::potm", "application/vnd.ms-powerpoint.addin.macroEnabled.12::ppam", "application/vnd.openxmlformats-officedocument.presentationml.slide::sldx", "application/vnd.ms-powerpoint.slide.macroEnabled.12::sldm", "application/msonenote::one", "application/msonenote::onetoc2", "application/msonenote::onetmp", "application/msonenote::onepkg", "application/vnd.ms-officetheme::thmx", "application/x-bcpio::bcpio", "application/x-cpio::cpio", "application/x-csh::csh", "application/x-director::dxr", "application/x-dvi::dvi", "application/x-dwf::dwf", "application/x-gtar::gtar", "application/x-gzip::gzip", "application/x-hdf::hdf", "application/x-javascript::js", "application/x-latex::latex", "application/x-macbinary::bin", "application/x-midi::mid", "application/x-mif::mif", "application/x-netcdf::nc", "application/x-sh::sh", "application/x-shar::shar", "application/x-shockwave-flash::swf", "application/x-stuffit::sit", "application/x-sv4cpio::sv4cpio", "application/x-sv4crc::sv4crc", "application/x-tar::tar", "application/x-tcl::tcl", "application/x-tex::tex", "application/x-texinfo::texinfo", "application/x-troff::tr", "application/x-troff-man::man", "application/x-troff-me::me", "application/x-troff-ms::ms", "application/x-ustar::ustar", "application/x-wais-source::src", "application/x-winhelp::hlp", "application/zip::zip", "audio/basic::snd", "audio/midi::midi", "audio/x-aiff::aiff", "audio/x-mpeg::mp3", "audio/x-pn-realaudio::ram", "audio/x-pn-realaudio-plugin::rpm", "audio/x-voice::voc", "audio/x-wav::wav", "image/bmp::bmp", "image/gif::gif", "image/ief::ief", "image/jpeg::jpg", "image/pict::pict", "image/png::png", "image/tiff::tiff", "image/x-cmu-raster::ras", "image/x-portable-anymap::pnm", "image/x-portable-bitmap::pbm", "image/x-portable-graymap::pgm", "image/x-portable-pixmap::ppm", "image/x-rgb::rgb", "image/x-xbitmap::xbm", "image/x-xpixmap::xpm", "image/x-xwindowdump::xwd", "multipart/x-gzip::gzip", "multipart/x-zip::zip", "text/html::html", "text/plain::txt", "text/richtext::rtx", "text/tab-separated-values::tsv", "text/x-setext::etx", "text/x-sgml::sgml", "video/mpeg::mpg", "video/msvideo::avi", "video/quicktime::qt", "video/vdo::vdo", "video/vivo::vivo", "video/x-sgi-movie::movie", "x-conference/x-cooltalk::ice", "x-world/x-svr::svr", "x-world/x-vrml::wrl", "x-world/x-vrt::vrt", "other"};
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(items));
        jComboBox1.setName(""); // NOI18N
        jComboBox1.setPreferredSize(new java.awt.Dimension(42, 27));
        jComboBox1.setRequestFocusEnabled(false);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Mime  Type:");
        jLabel5.setMaximumSize(new java.awt.Dimension(76, 20));
        jLabel5.setMinimumSize(new java.awt.Dimension(76, 20));
        jLabel5.setName(""); // NOI18N
        jLabel5.setPreferredSize(new java.awt.Dimension(76, 20));

        jButton1.setText("Launch");

        jButton4.setText("Help");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}