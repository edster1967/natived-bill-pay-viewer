package com.natived.billpayviewer.domain;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Bill_Pay")
public class BillPayItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer billPayId;
    private String paymentCategory;
    private String invoiceId;
    private String InvoiceDescription;
    private String paymentType;
    private String paymentAmount;
    private Date paymentDate;

    public Integer getBillPayId() {
        return billPayId;
    }

    public void setBillPayId(Integer billPayId) {
        this.billPayId = billPayId;
    }

    public String getPaymentCategory() {
        return paymentCategory;
    }

    public void setPaymentCategory(String paymentCategory) {
        this.paymentCategory = paymentCategory;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getInvoiceDescription() {
        return InvoiceDescription;
    }

    public void setInvoiceDescription(String invoiceDescription) {
        InvoiceDescription = invoiceDescription;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }
}
