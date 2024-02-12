package com.lerning.BookMyShow.models;


import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Payment extends BaseModel{

    private int amountPaid;
    private String referenceNo;
    private PaymentProvider paymentProvider;
    private PaymentStatus paymentStatus;
    private Date paidOn;

}
