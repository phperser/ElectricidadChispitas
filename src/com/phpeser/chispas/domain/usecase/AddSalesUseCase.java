package com.phpeser.chispas.domain.usecase;

import com.phpeser.chispas.data.MemSalesDataStore;
import com.phpeser.chispas.data.SalesDataStore;
import com.phpeser.chispas.domain.models.Sales;

public class AddSalesUseCase {

    private  SalesDataStore salesDataStore;

    public AddSalesUseCase(SalesDataStore salesDataStore){
        this.salesDataStore = salesDataStore;
    }

    public void execute(Sales sales){
        SalesDataStore salesDataStore = new MemSalesDataStore();
            salesDataStore.saveSales(sales);

    }

}
