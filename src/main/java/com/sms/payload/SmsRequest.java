package com.sms.payload;

public class SmsRequest {
    private String toPhoneNumber;
    private String message;

    // Default constructor
    public SmsRequest() {
    }

    // Parameterized constructor
    public SmsRequest(String toPhoneNumber, String message) {
        this.toPhoneNumber = toPhoneNumber;
        this.message = message;
    }

    // Getters and setters
    public String getToPhoneNumber() {
        return toPhoneNumber;
    }

    public void setToPhoneNumber(String toPhoneNumber) {
        this.toPhoneNumber = toPhoneNumber;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
