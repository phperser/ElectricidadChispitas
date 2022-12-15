package com.phpeser.chispas.domain.usecase;

import com.phpeser.chispas.data.CustomerDataStore;
import com.phpeser.chispas.data.MemCustomerDataStore;
import com.phpeser.chispas.domain.models.Customer;

import java.util.List;

public class GetCustomerUseCase {

    private  CustomerDataStore customerDataStore;

    public GetCustomerUseCase(CustomerDataStore customerDataStore){
        this.customerDataStore = customerDataStore;
    }

    public List<Customer> execute(){
        CustomerDataStore customerDataStore = new MemCustomerDataStore();
        return customerDataStore.getAllCustomer();
    }
}
