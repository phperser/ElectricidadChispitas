package com.phpeser.chispas.data;

import com.phpeser.chispas.domain.models.Sales;

import java.util.List;
import java.util.TreeMap;

public class MemSalesDataStore implements SalesDataStore{

    private TreeMap<String, Sales> dataStore = new TreeMap<String, Sales>();


    @Override
    public void saveSales(Sales sales) {
        dataStore.put(sales.getIdSales(), sales);
    }

    @Override
    public void deleteSales(Sales sales) {
        dataStore.remove(sales);
    }

    @Override
    public void updateSales(Sales sales) {
        dataStore.replace(sales.getIdSales(), sales);
    }

    @Override
    public List<Sales> getAllSales() {
        return dataStore.values().stream().toList();
    }
}
