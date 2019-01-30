/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectui;

/**
 *
 * @author Harsh Kukreja
 */

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mail {
    
        /*
            By: Harsh Kukreja
            The below method accepts two things one string in email and other string the message which user gave to the application
            and then using properties class we mail to the user thaniking for the feedback
        */
        static String email,feedbackMessage;
	public void mail(String email,String feedbackMessage) {
            System.out.println("Mails");
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");

		Session session = Session.getDefaultInstance(props,
			new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication("info.vespcanteen@gmail.com","vcmroxxx");
				}
			});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("info.vespcanteen.com"));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(email));
			message.setSubject("Thanks!");
			message.setText(feedbackMessage);
			Transport.send(message);
			System.out.println("Done");

		} catch (MessagingException e) {
                    System.out.println(""+e.getMessage());
		}
	}
}   