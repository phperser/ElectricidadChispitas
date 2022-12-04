package com.phpeser.chispas.data;

import com.phpeser.chispas.domain.models.Invoice;

import java.util.List;
import java.util.TreeMap;

public class MemInvoiceDataStore implements InvoiceDataStore{

    private TreeMap<String, Invoice> dataStore = new TreeMap<String, Invoice>();


    @Override
    public void saveInvoice(Invoice invoice) {
        dataStore.put(String.valueOf(invoice.getIdInv()), invoice);
    }


    @Override
    public void updateInvoice(Invoice invoice) {
        dataStore.replace(String.valueOf(invoice.getIdInv()), invoice);
    }

    @Override
    public List<Invoice> getAllInvoice() {
        return dataStore.values().stream().toList();
    }

}
