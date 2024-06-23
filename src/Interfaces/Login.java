package Interfaces;

import Clases.ComprobarConexionInternet;
import Clases.Validacion;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    
    public static String correoEnvia;
    public static String contraseña;
    private boolean conexion;
    public static int servidor;
    
    
    public Login() {
        initComponents();
        
 
        jLabError.setVisible(false);
    }
    
    public void verificarConexion()
    {
        ComprobarConexionInternet google = new ComprobarConexionInternet();
        conexion = google.test();
        System.out.println(conexion);
        jRB_Gmail.setEnabled(conexion);
        jRB_Hotmail.setEnabled(conexion);
        jRB_Outlook.setEnabled(conexion);
        jRB_Live.setEnabled(conexion);
        jRB_Yahoo.setEnabled(conexion);
        
        if(conexion)
        {
            System.out.println("Esta conectado a internet");
            this.jLab_EstadoInternet.setText("Esta conectado a internet");
            jTF_CorreoElectronico.setEnabled(true);
            jPF_Contraseña.setEnabled(true);
            jBut_Ingresar.setEnabled(true);
        }
        else
        {
            System.out.println("No hay conexion");
            jLab_EstadoInternet.setText("Sin conexión a internet");
            jTF_CorreoElectronico.setEnabled(false);
            jPF_Contraseña.setEnabled(false);
            jBut_Ingresar.setEnabled(false);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        HostCorreo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jRB_Gmail = new javax.swing.JRadioButton();
        jRB_Hotmail = new javax.swing.JRadioButton();
        jRB_Outlook = new javax.swing.JRadioButton();
        jRB_Live = new javax.swing.JRadioButton();
        jRB_Yahoo = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jTF_CorreoElectronico = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jBut_Ingresar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPF_Contraseña = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jBut_ActualizarConexion = new javax.swing.JButton();
        jLab_EstadoInternet = new javax.swing.JLabel();
        jLabError = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Servidor:");

        jRB_Gmail.setBackground(new java.awt.Color(0, 0, 0));
        HostCorreo.add(jRB_Gmail);
        jRB_Gmail.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        jRB_Gmail.setForeground(new java.awt.Color(255, 255, 255));
        jRB_Gmail.setText("Gmail");
        jRB_Gmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRB_GmailMousePressed(evt);
            }
        });

        jRB_Hotmail.setBackground(new java.awt.Color(0, 0, 0));
        HostCorreo.add(jRB_Hotmail);
        jRB_Hotmail.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        jRB_Hotmail.setForeground(new java.awt.Color(255, 255, 255));
        jRB_Hotmail.setText("Hotmail");
        jRB_Hotmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRB_HotmailMousePressed(evt);
            }
        });

        jRB_Outlook.setBackground(new java.awt.Color(0, 0, 0));
        HostCorreo.add(jRB_Outlook);
        jRB_Outlook.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        jRB_Outlook.setForeground(new java.awt.Color(255, 255, 255));
        jRB_Outlook.setText("Outlook");
        jRB_Outlook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRB_OutlookMousePressed(evt);
            }
        });

        jRB_Live.setBackground(new java.awt.Color(0, 0, 0));
        HostCorreo.add(jRB_Live);
        jRB_Live.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        jRB_Live.setForeground(new java.awt.Color(255, 255, 255));
        jRB_Live.setText("Live");
        jRB_Live.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRB_LiveMousePressed(evt);
            }
        });

        jRB_Yahoo.setBackground(new java.awt.Color(0, 0, 0));
        HostCorreo.add(jRB_Yahoo);
        jRB_Yahoo.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        jRB_Yahoo.setForeground(new java.awt.Color(255, 255, 255));
        jRB_Yahoo.setText("Yahoo");
        jRB_Yahoo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRB_YahooMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("direccion de correo ");

        jLabel4.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("contraseña");

        jBut_Ingresar.setBackground(new java.awt.Color(51, 51, 51));
        jBut_Ingresar.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        jBut_Ingresar.setText("entrar");
        jBut_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_IngresarActionPerformed(evt);
            }
        });

        salir.setBackground(new java.awt.Color(51, 51, 51));
        salir.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        salir.setText("salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("inicio de sesion ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(116, 116, 116))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPF_Contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPF_ContraseñaActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Candara Light", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("selecciona tu tipo de corro ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jBut_Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(127, 127, 127)
                                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTF_CorreoElectronico, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jPF_Contraseña)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRB_Gmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jRB_Live))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jRB_Hotmail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRB_Outlook)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRB_Yahoo)))))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jRB_Gmail)
                    .addComponent(jRB_Hotmail)
                    .addComponent(jRB_Outlook)
                    .addComponent(jRB_Yahoo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRB_Live)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTF_CorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPF_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBut_Ingresar)
                    .addComponent(salir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBut_ActualizarConexion.setBackground(new java.awt.Color(51, 51, 51));
        jBut_ActualizarConexion.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        jBut_ActualizarConexion.setText("Actualizar Conexión a Internet");
        jBut_ActualizarConexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_ActualizarConexionActionPerformed(evt);
            }
        });

        jLab_EstadoInternet.setFont(new java.awt.Font("DejaVu Serif", 1, 14)); // NOI18N
        jLab_EstadoInternet.setForeground(new java.awt.Color(255, 255, 255));

        jLabError.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabError.setForeground(new java.awt.Color(255, 255, 255));
        jLabError.setText("¡Datos Incorrectos!");

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Calibri", 2, 36)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("It´s not a mail");
        jLabel9.setOpaque(true);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/mailpng.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLab_EstadoInternet, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBut_ActualizarConexion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabError)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(178, 178, 178))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBut_ActualizarConexion)
                    .addComponent(jLabError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLab_EstadoInternet, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBut_ActualizarConexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_ActualizarConexionActionPerformed
        verificarConexion();
    }//GEN-LAST:event_jBut_ActualizarConexionActionPerformed

    private void jPF_ContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPF_ContraseñaActionPerformed

    }//GEN-LAST:event_jPF_ContraseñaActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed

        this.dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void jBut_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_IngresarActionPerformed
        jBut_ActualizarConexion.doClick();
        if(conexion == true){

            if(jRB_Gmail.isSelected()){
                servidor = 0;
                jTF_CorreoElectronico.setEnabled(true);
                jPF_Contraseña.setEnabled(true);
            }
            if(jRB_Hotmail.isSelected())
            servidor = 3;

            if(jRB_Outlook.isSelected())
            servidor = 3;

            if(jRB_Live.isSelected())
            servidor = 1;

            if(jRB_Yahoo.isSelected())
            servidor = 2;

            Validacion obj = new Validacion(this.jTF_CorreoElectronico, this.jPF_Contraseña, jLabError, this);
            obj.start();
            jLabError.setVisible(false);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Intenta: \n      -Comprobar los cables de red, el módem y el router \n      -Volver a conectarte a Wi-Fi" , "Sin internet", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_jBut_IngresarActionPerformed

    private void jRB_YahooMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRB_YahooMousePressed

    }//GEN-LAST:event_jRB_YahooMousePressed

    private void jRB_LiveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRB_LiveMousePressed

    }//GEN-LAST:event_jRB_LiveMousePressed

    private void jRB_OutlookMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRB_OutlookMousePressed

    }//GEN-LAST:event_jRB_OutlookMousePressed

    private void jRB_HotmailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRB_HotmailMousePressed

    }//GEN-LAST:event_jRB_HotmailMousePressed

    private void jRB_GmailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRB_GmailMousePressed

    }//GEN-LAST:event_jRB_GmailMousePressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup HostCorreo;
    private javax.swing.JButton jBut_ActualizarConexion;
    private javax.swing.JButton jBut_Ingresar;
    private javax.swing.JLabel jLabError;
    private javax.swing.JLabel jLab_EstadoInternet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPF_Contraseña;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRB_Gmail;
    private javax.swing.JRadioButton jRB_Hotmail;
    private javax.swing.JRadioButton jRB_Live;
    private javax.swing.JRadioButton jRB_Outlook;
    private javax.swing.JRadioButton jRB_Yahoo;
    private javax.swing.JTextField jTF_CorreoElectronico;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
