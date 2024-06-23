package Interfaces;

import Clases.ComprobarConexionInternet;
import Clases.EnviarMail;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class CrearMensaje extends javax.swing.JFrame {

    public String adjunto;
    private boolean conexion;
    String correo;
    String contraseña;
    String nombre;
    String archivo;
    
    public CrearMensaje(String correo, String contra) {
        this.correo = correo;
        this.contraseña = contra;
        initComponents();        
    }
    
    private CrearMensaje(){
        
    }
    
    public void verificarConexion()
    {
        ComprobarConexionInternet google = new ComprobarConexionInternet();
        conexion = google.test();
        System.out.println(conexion);
        
        if(conexion)
        {
            System.out.println("Esta conectado a internet");
        }
        else
        {
            System.out.println("No hay conexion");
            jLab_EstadoInternet.setText("Sin conexión a internet");
            jTF_Destinatario.setEnabled(conexion);
            jTF_Asunto.setEnabled(false);
            jTA_Mensaje.setEnabled(false);
            jBut_Enviar.setEnabled(false);
            jBut_Descartar.setEnabled(false);
            jBut_Adjuntar.setEnabled(false);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTF_Destinatario = new javax.swing.JTextField();
        jTF_Asunto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTA_Mensaje = new javax.swing.JTextArea();
        jBut_Enviar = new javax.swing.JButton();
        jBut_Descartar = new javax.swing.JButton();
        jBut_Adjuntar = new javax.swing.JButton();
        jBut_CerrarSesion = new javax.swing.JButton();
        jBut_ActualizarConexion = new javax.swing.JButton();
        jLab_EstadoInternet = new javax.swing.JLabel();
        jTF_Adjunto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabEstado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jScrollPane2.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("para:");

        jTF_Destinatario.setBackground(new java.awt.Color(233, 233, 233));
        jTF_Destinatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_DestinatarioActionPerformed(evt);
            }
        });

        jTF_Asunto.setBackground(new java.awt.Color(233, 233, 233));
        jTF_Asunto.setToolTipText("");

        jTA_Mensaje.setBackground(new java.awt.Color(233, 233, 233));
        jTA_Mensaje.setColumns(20);
        jTA_Mensaje.setRows(5);
        jScrollPane1.setViewportView(jTA_Mensaje);

        jBut_Enviar.setBackground(new java.awt.Color(99, 99, 99));
        jBut_Enviar.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jBut_Enviar.setForeground(new java.awt.Color(255, 255, 255));
        jBut_Enviar.setText("enviar");
        jBut_Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_EnviarActionPerformed(evt);
            }
        });

        jBut_Descartar.setBackground(new java.awt.Color(99, 99, 99));
        jBut_Descartar.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jBut_Descartar.setForeground(new java.awt.Color(255, 255, 255));
        jBut_Descartar.setText("limpiar");
        jBut_Descartar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_DescartarActionPerformed(evt);
            }
        });

        jBut_Adjuntar.setBackground(new java.awt.Color(99, 99, 99));
        jBut_Adjuntar.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jBut_Adjuntar.setForeground(new java.awt.Color(255, 255, 255));
        jBut_Adjuntar.setText("adjuntar");
        jBut_Adjuntar.setToolTipText("Adjuntar");
        jBut_Adjuntar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_AdjuntarActionPerformed(evt);
            }
        });

        jBut_CerrarSesion.setBackground(new java.awt.Color(99, 99, 99));
        jBut_CerrarSesion.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jBut_CerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jBut_CerrarSesion.setText("salir");
        jBut_CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_CerrarSesionActionPerformed(evt);
            }
        });

        jBut_ActualizarConexion.setBackground(new java.awt.Color(99, 99, 99));
        jBut_ActualizarConexion.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jBut_ActualizarConexion.setForeground(new java.awt.Color(255, 255, 255));
        jBut_ActualizarConexion.setText("actualizar conexion ");
        jBut_ActualizarConexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_ActualizarConexionActionPerformed(evt);
            }
        });

        jLab_EstadoInternet.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        jLab_EstadoInternet.setForeground(new java.awt.Color(255, 255, 255));
        jLab_EstadoInternet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jTF_Adjunto.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("tema:");

        jLabEstado.setForeground(new java.awt.Color(255, 255, 255));
        jLabEstado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Calibri", 2, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("It´s not a mail ");
        jLabel1.setOpaque(true);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/mailpng.png"))); // NOI18N

        jLabel5.setBackground(new java.awt.Color(191, 205, 217));
        jLabel5.setFont(new java.awt.Font("Candara Light", 3, 18)); // NOI18N
        jLabel5.setText("  it's so much better");
        jLabel5.setAlignmentY(0.1F);
        jLabel5.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBut_ActualizarConexion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTF_Asunto)
                                            .addComponent(jTF_Destinatario)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLab_EstadoInternet, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10)))
                        .addComponent(jLabEstado))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jBut_Enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBut_Descartar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBut_Adjuntar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTF_Adjunto, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBut_CerrarSesion)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jBut_ActualizarConexion))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jTF_Destinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLab_EstadoInternet, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jTF_Asunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBut_Enviar)
                    .addComponent(jBut_Descartar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBut_Adjuntar)
                    .addComponent(jTF_Adjunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBut_CerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBut_ActualizarConexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_ActualizarConexionActionPerformed
        verificarConexion();
    }//GEN-LAST:event_jBut_ActualizarConexionActionPerformed

    private void jBut_CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_CerrarSesionActionPerformed
        this.dispose();
        Login ventana = new Login();
        ventana.setVisible(true);
    }//GEN-LAST:event_jBut_CerrarSesionActionPerformed

    private void jBut_AdjuntarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_AdjuntarActionPerformed
        JFileChooser fc = new JFileChooser();
        int option = fc.showOpenDialog(this);
        if(option == JFileChooser.APPROVE_OPTION){
            fc.removeChoosableFileFilter(fc.getFileFilter());
            fc.addChoosableFileFilter(new FileNameExtensionFilter("Images", "jpg", "png", "*.txt","txt", "*.zip", "zip"));
            archivo = fc.getSelectedFile().getPath(); 
            nombre = fc.getSelectedFile().getName();
            jTF_Adjunto.setText(archivo);
        }
    }//GEN-LAST:event_jBut_AdjuntarActionPerformed

    private void jBut_DescartarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_DescartarActionPerformed
        jTF_Destinatario.setText("");
        jTF_Asunto.setText("");
        jTA_Mensaje.setText("");
        jTF_Adjunto.setText("");
    }//GEN-LAST:event_jBut_DescartarActionPerformed

    private void jBut_EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_EnviarActionPerformed
        jBut_ActualizarConexion.doClick();

        if(conexion == true){
            if(jTF_Destinatario.getText().equals("")){
                JOptionPane.showMessageDialog(null, "No ha agregado el destinatario");
            }
            else{
                int valor = 5;
                if(jTF_Asunto.getText().equals("")){
                    valor = JOptionPane.showConfirmDialog(rootPane, "¿Esta seguro que desea enviar el correo sin asunto?");
                }
                if(valor == 5 || valor == 0){
                    EnviarMail obj = new EnviarMail(correo, contraseña, jTF_Destinatario, jTF_Asunto, jTF_Adjunto, jTA_Mensaje, nombre, jLabEstado);
                    obj.start();
                    obj = null;
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Intenta: \n      -Comprobar los cables de red, el módem y el router \n      -Volver a conectarte a Wi-Fi" , "Sin internet", JOptionPane.PLAIN_MESSAGE);

        }

    }//GEN-LAST:event_jBut_EnviarActionPerformed

    private void jTF_DestinatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTF_DestinatarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTF_DestinatarioActionPerformed

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
            java.util.logging.Logger.getLogger(CrearMensaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearMensaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearMensaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearMensaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearMensaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBut_ActualizarConexion;
    private javax.swing.JButton jBut_Adjuntar;
    private javax.swing.JButton jBut_CerrarSesion;
    private javax.swing.JButton jBut_Descartar;
    private javax.swing.JButton jBut_Enviar;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabEstado;
    private javax.swing.JLabel jLab_EstadoInternet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private static javax.swing.JTextArea jTA_Mensaje;
    private javax.swing.JTextField jTF_Adjunto;
    private static javax.swing.JTextField jTF_Asunto;
    private static javax.swing.JTextField jTF_Destinatario;
    // End of variables declaration//GEN-END:variables
}
