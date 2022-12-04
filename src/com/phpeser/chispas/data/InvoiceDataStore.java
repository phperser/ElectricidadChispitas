package com.phpeser.chispas.data;

import com.phpeser.chispas.domain.models.Invoice;

import java.util.List;

public interface InvoiceDataStore {

    void saveInvoice(Invoice invoice);

    void updateInvoice(Invoice invoice);

    List<Invoice> getAllInvoice();
}
