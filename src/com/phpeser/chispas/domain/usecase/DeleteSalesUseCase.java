package com.phpeser.chispas.domain.usecase;

import com.phpeser.chispas.data.SalesDataStore;
import com.phpeser.chispas.domain.models.Sales;

public class DeleteSalesUseCase {

    private SalesDataStore salesDataStore;

    public DeleteSalesUseCase(SalesDataStore salesDataStore){
        this.salesDataStore = salesDataStore;
    }

    public void execute(Sales sales){
        salesDataStore.deleteSales(sales);
    }
}
