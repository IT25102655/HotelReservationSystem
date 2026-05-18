package com.hotel.model;
//This class store all payment related data

public class Payment {

    //Attributes 

    //Stores unique paymentID
    private int id;
    //Stores reservationID related to this payment
    private int reservationId;
    //Store ID of user who makes payment
    private int userId;
    //Stores payment amount
    private double amount;
    //Stores payment method
    private String paymentMethod;
    //Stores payment date
    private String paymentDate;
    //Stores payment status
    private String status;
    //Stores username
    private String userName;
    //Stores reservation description
    private String reservationLabel;

    
    //Getter method for payment ID
    public int getId() {
        return id;
    }
    
    //Setter method for paymentID
    public void setId(int id) {
        this.id = id;
    }
    
    //Getter method for reservation ID
    public int getReservationId() {
        return reservationId;
    }

    //Setter method for reservation ID
    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    //Getter method for User ID
    public int getUserId() {
        return userId;
    }

    
    //Setter method for User ID
    public void setUserId(int userId) {
        this.userId = userId;
    }
    
    //Getter method for Amount
    public double getAmount() {
        return amount;
    }

    //Setter method for Amount
    public void setAmount(double amount) {
        this.amount = amount;
    }

    
    //Getter method for Payment method
    public String getPaymentMethod() {
        return paymentMethod;
    }

    
    //Setter method for payment method
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    
    //Getter method for payment date
    public String getPaymentDate() {
        return paymentDate;
    }
    
    //Setter method for payment date
    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }
    
    //Getter method for status
    public String getStatus() {
        return status;
    }
    
    //Setter method for status
    public void setStatus(String status) {
        this.status = status;
    }
    
    //Getter method for user name
    public String getUserName() {
        return userName;
    }
    
    //Setter method for user name
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    //Getter method for reservation label
    public String getReservationLabel() {
        return reservationLabel;
    }
    
    //Setter method for reservation label
    public void setReservationLabel(String reservationLabel) {
        this.reservationLabel = reservationLabel;
    }
}
