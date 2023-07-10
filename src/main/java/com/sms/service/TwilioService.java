package com.sms.service;

import com.twilio.Twilio;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@Service
public class TwilioService {

    @Value("${twilio.account.sid}")
    private String accountSid;

    @Value("${twilio.auth.token}")
    private String authToken;

    @Value("${twilio.phone.number}")
    private String twilioPhoneNumber;

    public void sendSms(String toPhoneNumber, String message) {
        try {
            Twilio.init(accountSid, authToken);

            Message.creator(new PhoneNumber(toPhoneNumber), new PhoneNumber(twilioPhoneNumber), message).create();
        } catch (Exception e) {
            // Handle any exceptions here
        }
    }
}
