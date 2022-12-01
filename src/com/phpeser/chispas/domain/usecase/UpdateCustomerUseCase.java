package com.phpeser.chispas.domain.usecase;

import com.phpeser.chispas.data.CustomerDataStore;
import com.phpeser.chispas.data.MemCustomerDataStore;
import com.phpeser.chispas.domain.models.Customer;

public class UpdateCustomerUseCase {

    private  CustomerDataStore customerDataStore;

    public UpdateCustomerUseCase(CustomerDataStore customerDataStore){
        this.customerDataStore = customerDataStore;
    }

    public void execute(Customer customer){
        CustomerDataStore customerDataStore = new MemCustomerDataStore();
        customerDataStore.updateCustomer(customer);
    }
}
