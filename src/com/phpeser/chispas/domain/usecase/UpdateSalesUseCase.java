package com.phpeser.chispas.domain.usecase;

import com.phpeser.chispas.data.MemSalesDataStore;
import com.phpeser.chispas.data.SalesDataStore;
import com.phpeser.chispas.domain.models.Sales;

public class UpdateSalesUseCase {

    private SalesDataStore salesDataStore;

    public UpdateSalesUseCase(SalesDataStore salesDataStore){
        this.salesDataStore = salesDataStore;
    }

    public void execute(Sales customer){
        SalesDataStore customerDataStore = new MemSalesDataStore();
        customerDataStore.updateSales(customer);
    }
}
