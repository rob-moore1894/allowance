package dev.robmoore.allowance.services;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class TwilioService {
    @Value("${TWILIO_ACCOUNT_SID}")
    String ACCOUNT_SID;
    @Value("${TWILIO_AUTH_TOKEN}")
    String AUTH_TOKEN;

    public void sendText() {
        System.out.println("Start message");
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message
                .creator(new PhoneNumber("+17576212232"), // to
                        new PhoneNumber("+12109439303"), // from
                        "New Chore Added")
                .create();

        System.out.println(message.getSid());
        System.out.println("End message");
    }
}