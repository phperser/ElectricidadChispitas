package com.phpeser.chispas.domain.usecase;

import com.phpeser.chispas.data.InvoiceDataStore;
import com.phpeser.chispas.domain.models.Invoice;

public class DeleteInvoiceUseCase {

    private InvoiceDataStore invoiceDataStore;

    public DeleteInvoiceUseCase(InvoiceDataStore invoiceDataStore){
        this.invoiceDataStore = invoiceDataStore;
    }

    public void execute(Invoice invoice){
        invoiceDataStore.deleteInvoice(invoice);
    }
}
