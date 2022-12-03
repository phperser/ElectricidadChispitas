package com.phpeser.chispas.domain.usecase;

import com.phpeser.chispas.data.SalesDataStore;
import com.phpeser.chispas.data.MemSalesDataStore;
import com.phpeser.chispas.domain.models.Sales;

import java.util.List;

public class GetSalesUseCase {

    private  SalesDataStore salesDataStore;

    public GetSalesUseCase(SalesDataStore salesDataStore){
        this.salesDataStore = salesDataStore;
    }

    public List<Sales> execute(){
        SalesDataStore salesDataStore = new MemSalesDataStore();
        return salesDataStore.getAllSales();
    }
}
