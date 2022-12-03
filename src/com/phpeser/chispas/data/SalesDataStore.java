package com.phpeser.chispas.data;

import com.phpeser.chispas.domain.models.Sales;

import java.util.List;

public interface SalesDataStore {

    void saveSales(Sales sales);

    void  deleteSales(Sales sales);

    void updateSales(Sales sales);

    List<Sales> getAllSales();

}
