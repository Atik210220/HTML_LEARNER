/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Dashboard;

import javax.swing.JLabel;

/**
 *
 * @author Acer
 */
public class style extends javax.swing.JFrame {

    /**
     * Creates new form style
     */
    public style() {
        initComponents();
        
                 String htmlContent = "<html>" 
                + "<p><h1>The HTML style attribute is used to add styles to an element, such as color, font, size, and more.</h1> "
                +"<h3> The HTML style attribute has the following syntax: </h3> "
                + "<h4> &lt;tagname style=\"property:value;\"&gt;</h4>"
                + "<h4> Use the style attribute for styling HTML elements\n" 
                +"<br>Use background-color for background color\n" 
                +"<br>Use color for text colors\n" 
                +"<br>Use font-family for text fonts\n" 
                +"<br>Use font-size for text sizes\n" 
                +"<br>Use text-align for text alignment </h4>"
                + "<h4> &lt;h1 style=\"background-color:powderblue;\" &gt; This is a heading&lt;h1&gt;\n" 
                +"<br>&lt;p style=\"background-color:tomato;\"&gt; This is a paragraph.&lt;p&gt; </h4>"
                + "<h4> &lt;h1 style=\"color:blue;\"&gt;This is a heading&lt;/h1&gt;\n" 
                +"<br><&lt;p style=\"color:red;\"&gt;This is a paragraph.&lt;p&gt;</h4>"
                + "<h4> &lt;h1 style=\"font-family:verdana;\"&gt;This is a heading&lt;h1&gt;\n"
                +"<br>&lt;p style=\"font-family:courier;\"&gt;This is a paragraph.<&lt;h1&gt;</h4>"
                + "<h4> &lt;h1 style=\"font-size:300%;\"&gt;This is a heading&lt;h1&gt;\n" 
                +"<br>&lt;p style=\"font-size:160%;\"&gt;This is a paragraph.&lt;p&gt; </h4> "
                +"<h4> &lt;h1 style=\"text-align:center;\"&gt;Centered Heading&lt;h1&gt;\n" 
                +"<br>&lt;p style=\"text-align:center;\"&gt;Centered paragraph.&lt;p&gt;</h4>"

                + "</html>";
         
         jLabel1.setText(htmlContent);
         
        jLabel1.setVerticalAlignment(JLabel.TOP); // Align text to the top
        jLabel1.setHorizontalAlignment(JLabel.LEFT); // Center-align text
        jLabel1.setVerticalTextPosition(JLabel.TOP); // Ensure vertical text position is at the top
        jLabel1.setHorizontalTextPosition(JLabel.LEFT); // Ensure horizontal text position is at the center
        // Set the HTML content to the JLabel
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("practice it!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        HTMLViewer html = new HTMLViewer();
            html.setVisible(true);
            dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(style.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(style.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(style.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(style.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new style().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}