package Clases;

import Interfaces.CrearMensaje;
import Interfaces.Login;
import java.util.Properties;
import java.util.logging.Level;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Validacion implements Runnable{
    
    JTextField correo;
    JPasswordField contraseña;
    JLabel error;
    Login jLogin;
    String mail, pass;

    public Validacion(JTextField correo, JPasswordField contraseña, JLabel error, Login jLogin) {
        this.correo = correo;
        this.contraseña = contraseña;
        this.error = error;
        this.jLogin = jLogin;
        mail = this.correo.getText();
        pass = this.contraseña.getText();
    }

    @Override
    public void run() {
        Properties props = new Properties();
        
        final String usuario = mail;
        final String contra = pass;
        
        if(Login.servidor==0)
        {
            props.put("mail.transport.protocol", "smtp");
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.socketFactory.port", "587");
            props.put("mail.smtp.socketFactory.fallback", "false");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", "587");
        }
        if(Login.servidor==1)
        {
            props.put("mail.transport.protocol", "smtp");
            props.put("mail.smtp.host", "smtp.live.com");
            props.put("mail.smtp.socketFactory.port", "587");
            props.put("mail.smtp.socketFactory.fallback", "false");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", "587");
        }
        if(Login.servidor==2)
        {
            props.put("mail.transport.protocol", "smtp");
            props.put("mail.smtp.host", "smtp.mail.yahoo.com");
            props.put("mail.smtp.socketFactory.port", "587");
            props.put("mail.smtp.socketFactory.fallback", "false");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", "587");
        }
        if(Login.servidor == 3){
                props.put("mail.transport.protocol", "smtp");
                props.put("mail.smtp.host", "smtp.office365.com");
                props.put("mail.smtp.socketFactory.port", "587");
                props.put("mail.smtp.socketFactory.fallback", "false");
                props.put("mail.smtp.starttls.enable", "true");
                props.put("mail.smtp.auth", "true");
                props.put("mail.smtp.port", "587");
            }
        Session sesion = Session.getInstance(props, new javax.mail.Authenticator()
        {
            protected javax.mail.PasswordAuthentication getPasswordAuthentication()
            {
                return new javax.mail.PasswordAuthentication(usuario, contra);
            }
        });
        
        sesion.setDebug(false);
        
        Transport transporte = null;
        
        try{
            transporte = sesion.getTransport("smtp");
        } catch (javax.mail.NoSuchProviderException ex){
            java.util.logging.Logger.getLogger(Validacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try{
            transporte.connect();
            error.setVisible(true);
            jLogin.dispose();
            CrearMensaje ventana = new CrearMensaje(mail, pass);
            ventana.setVisible(true);
        } catch (MessagingException ex) {
            error.setVisible(true);
            contraseña.setText("");
        }
    }
    
    public void start(){
        new Thread(this).start();
    }
        
    
}
