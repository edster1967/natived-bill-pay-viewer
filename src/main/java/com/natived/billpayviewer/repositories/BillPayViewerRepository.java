package com.natived.billpayviewer.repositories;

import com.natived.billpayviewer.domain.BillPayItem;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BillPayViewerRepository extends CrudRepository<BillPayItem, Integer> {
    List<BillPayItem> findBillPayItemByBillPayId(String billPayId);

    List<BillPayItem> findBillPayItemsByInvoiceId(String invoiceId);

}
