package com.phpeser.chispas.data;

import com.phpeser.chispas.domain.models.Customer;

import java.util.List;

public interface CustomerDataStore {

    void saveCustomer(Customer customer);

    void  deleteCustomer(Customer customer);

    void updateCustomer(Customer customer);

    List<Customer> getAllCustomer();
}
