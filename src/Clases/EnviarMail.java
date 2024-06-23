package Clases;

import Interfaces.Login;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EnviarMail implements Runnable {
    String correo, contraseña, nombre, dest, asu, msg, rutaArchivo;
    JTextField destinatario, asunto, archivoAdjunto;
    JTextArea mensaje;
    String[] vect;
    JLabel estado;

    public EnviarMail(String correo, String contraseña, JTextField destinatario,
           JTextField asunto, JTextField archivoAdjunto, JTextArea mensaje, 
           String nombre, JLabel estado) {
        this.correo = correo;
        this.contraseña = contraseña;
        this.destinatario = destinatario;
        this.asunto = asunto;
        this.archivoAdjunto = archivoAdjunto;
        this.mensaje = mensaje;
        this.nombre = nombre;
        this.estado =estado;
        dest = destinatario.getText();
        asu = asunto.getText();
        msg = mensaje.getText();
        rutaArchivo = archivoAdjunto.getText();
        vect = dest.split(";");
    }
    
    @Override
    public void run() {
        if (rutaArchivo.equals("")) {

            final String usuario = correo;
            final String pass = contraseña;
            Properties props = new Properties();

            if(Login.servidor == 0){
                props.put("mail.transport.protocol", "smtp");
                props.put("mail.smtp.host", "smtp.gmail.com");
                props.put("mail.smtp.socketFactory.port", "587");
                props.put("mail.smtp.socketFactory.fallback", "false");
                props.put("mail.smtp.starttls.enable", "true");
                props.put("mail.smtp.auth", "true");
                props.put("mail.smtp.port", "587");
            }
            if(Login.servidor == 1){
                props.put("mail.transport.protocol", "smtp");
                props.put("mail.smtp.host", "smtp.live.com");
                props.put("mail.smtp.socketFactory.port", "587");
                props.put("mail.smtp.socketFactory.fallback", "false");
                props.put("mail.smtp.starttls.enable", "true");
                props.put("mail.smtp.auth", "true");
                props.put("mail.smtp.port", "587");
            }
            if(Login.servidor == 2){
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
            
            Session sesion = Session.getInstance(props,
                    new javax.mail.Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(usuario, pass);
                        }
                    });
            sesion.setDebug(false);
            
            try {
                estado.setText("Enviando Mensaje");
                for (int i = 0; i < vect.length; i++) {
                    Message message = new MimeMessage(sesion);
                    message.setFrom(new InternetAddress(usuario));
                    message.setRecipients(Message.RecipientType.TO, 
                            InternetAddress.parse(vect[i]));
                    message.setSubject(asu);
                    message.setText(msg);
                    Transport.send(message);
                    JOptionPane.showMessageDialog(null, "Su mensaje fué enviado "
                            + "exitosamente\na los siguientes contactos: \n" + vect[i]);
                }
                estado.setText("Mensaje enviado");
                
                mensaje.setText("");
                asunto.setText("");
                destinatario.setText("");
            } catch (MessagingException e) {
                estado.setText("Error al enviar mensaje");
                JOptionPane.showMessageDialog(null, "Algo salio mal compruebe la conexion a internet");
            }
        } 
        else {

            Properties props = new Properties();
            if(Login.servidor == 0){
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.auth", "true");
            }
            if(Login.servidor == 1){
            props.setProperty("mail.smtp.host", "smtp.live.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.auth", "true");
            }
            if(Login.servidor == 2){
            props.setProperty("mail.smtp.host", "smtp.mail.yahoo.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.auth", "true");
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
            Session session = Session.getDefaultInstance(props);
            session.setDebug(false);
            BodyPart texto = new MimeBodyPart();

            try {
                estado.setText("Enviando Mensaje");
                for (int i = 0; i < vect.length-15; i++) {
                    texto.setText(msg);
                    BodyPart adjunto = new MimeBodyPart();
                    adjunto.setDataHandler(new DataHandler(new FileDataSource(rutaArchivo)));
                    adjunto.setFileName(nombre);
                    MimeMultipart multiParte = new MimeMultipart();
                    multiParte.addBodyPart(texto);
                    multiParte.addBodyPart(adjunto);
                    MimeMessage message = new MimeMessage(session);
                    message.setFrom(new InternetAddress(correo));
                    message.addRecipient(Message.RecipientType.TO, new InternetAddress(vect[i]));
                    message.setSubject(asu);
                    message.setContent(multiParte);
                    Transport t = null;
                    t = session.getTransport("smtp");
                    t.connect(correo, contraseña);
                    t.sendMessage(message, message.getAllRecipients());
                    t.close();
                    JOptionPane.showMessageDialog(null, "Su mensaje fué enviado "
                            + "exitosamente \na los siguientes contactos: \n" + vect[i]);
                }
                estado.setText("Mensaje enviado");
                mensaje.setText("");
                asunto.setText("");
                destinatario.setText("");
                archivoAdjunto.setText("");
            } catch (MessagingException ex) {
                estado.setText("Error al enviar mensaje");
                JOptionPane.showMessageDialog(null, "Algo salio mal compruebe "
                        + "la conexion a internet");
            }
        }
    }
    
    public void start(){
        new Thread(this).start();
    }
}
