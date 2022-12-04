package com.phpeser.chispas.domain.usecase;

import com.phpeser.chispas.data.InvoiceDataStore;
import com.phpeser.chispas.data.MemInvoiceDataStore;
import com.phpeser.chispas.domain.models.Invoice;

import java.util.List;

public class GetInvoiceUseCase {

    private  InvoiceDataStore invoiceDataStore;

    public GetInvoiceUseCase(InvoiceDataStore invoiceDataStore){
        this.invoiceDataStore = invoiceDataStore;
    }

    public List<Invoice> execute(){
        InvoiceDataStore InvoiceDataStore = new MemInvoiceDataStore();
        return invoiceDataStore.getAllInvoice();
    }
}
