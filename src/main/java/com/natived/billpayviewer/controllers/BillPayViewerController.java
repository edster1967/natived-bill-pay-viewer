package com.natived.billpayviewer.controllers;


import com.natived.billpayviewer.model.BillPayItemModel;
import com.natived.billpayviewer.repositories.BillPayViewerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class BillPayViewerController {

    private BillPayViewerRepository billPayViewerRepository;

    public BillPayViewerController(BillPayViewerRepository billPayViewerRepository) {
        this.billPayViewerRepository = billPayViewerRepository;
    }

    @RequestMapping("/")
    public String getHome (BillPayItemModel billPayItemModel){
        return "index";
    }

    @RequestMapping("/getBillPayItemById")
    public String getBillPayItemById(@Valid BillPayItemModel model, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "index";
        }

        model.setBillPayItemList(billPayViewerRepository.findBillPayItemByBillPayId(model.getBillPayId()));

        return "BillPayResults";
    }

    @RequestMapping("/getBillPayItemsByInvoiceId")
    public String getBillPayItemsByInvoiceId(@Valid BillPayItemModel model, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "index";
        }

        model.setBillPayItemList(billPayViewerRepository.findBillPayItemsByInvoiceId(model.getInvoiceId()));

        return "BillPayResults";
    }
}
