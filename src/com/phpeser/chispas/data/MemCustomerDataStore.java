package com.phpeser.chispas.data;

import com.phpeser.chispas.domain.models.Customer;

import java.util.List;
import java.util.TreeMap;

public class MemCustomerDataStore implements CustomerDataStore{

    private TreeMap<String, Customer> dataStore = new TreeMap<String, Customer>();


    @Override
    public void saveCustomer(Customer customer) {
        dataStore.put(customer.getCodeCustomer(), customer);
    }

    @Override
    public void deleteCustomer(Customer customer) {
        dataStore.remove(customer);
    }

    @Override
    public void updateCustomer(Customer customer) {
        dataStore.replace(customer.getCodeCustomer(), customer);
    }

    @Override
    public List<Customer> getAllCustomer() {
        return dataStore.values().stream().toList();
    }

}
