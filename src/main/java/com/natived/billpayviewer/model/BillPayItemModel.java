package com.natived.billpayviewer.model;

import com.natived.billpayviewer.domain.BillPayItem;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

public class BillPayItemModel {


    private String billPayId;
    @Size(min = 4, max = 32, message = "invoice number must be between 4 and 32 characters")
    private String invoiceId;
    private List<BillPayItem> billPayItemList;

    public String getBillPayId() {
        return billPayId;
    }

    public void setBillPayId(String billPayId) {
        this.billPayId = billPayId;
    }

    public List<BillPayItem> getBillPayItemList() {
        return billPayItemList;
    }

    public void setBillPayItemList(List<BillPayItem> billPayItemList) {
        this.billPayItemList = billPayItemList;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }
}
