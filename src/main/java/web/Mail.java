package web;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author steven
 */
public class Mail {

    private Properties properties = new Properties();
    private String user;
    private Session session;

    private Session datos() {
        Properties proper = new Properties();
        proper.put("mail.smtp.host", "smtp.gmail.com"); //servidor de Correo
        proper.put("mail.smtp.user", "ratony2012"); //se especifica el correo remitente
        proper.put("mail.smtp.clave", "dtqfflqarmkepseb"); //calve de app
        proper.put("mail.smtp.auth", "true"); //usar atenticacion
        proper.put("mail.smtp.starttls.enable", "true"); // conexiion de manera segura
        proper.put("mail.smtp.port", "587"); // puerto de correo
        session = Session.getDefaultInstance(proper);
        return session;
    }

    public void sendMail(String text) {
        try {
            MimeMessage mensaje = new MimeMessage(datos());
            mensaje.setFrom(new InternetAddress("ratony2012"));
            mensaje.addRecipients(Message.RecipientType.TO, "stev3nlp@outlook.com");

            mensaje.setSubject("Codigo Ganador xD");
            mensaje.setText(text);

            Transport t = session.getTransport("smtp");
            t.connect("smtp.gmail.com", "ratony2012", "dtqfflqarmkepseb");
            t.sendMessage(mensaje, mensaje.getAllRecipients());
            t.close();
        } catch (MessagingException e) {
            e.printStackTrace(System.out);
        }

    }

}
