package com.phpeser.chispas.domain.usecase;

import com.phpeser.chispas.data.InvoiceDataStore;
import com.phpeser.chispas.data.MemInvoiceDataStore;
import com.phpeser.chispas.domain.models.Invoice;

public class AddInvoiceUseCase {

    private InvoiceDataStore invoiceDataStore;

    public AddInvoiceUseCase(InvoiceDataStore invoiceDataStore){
        this.invoiceDataStore = invoiceDataStore;
    }

    public void execute(Invoice invoice){
        InvoiceDataStore invoiceDataStore = new MemInvoiceDataStore();
            invoiceDataStore.saveInvoice(invoice);

    }

}
