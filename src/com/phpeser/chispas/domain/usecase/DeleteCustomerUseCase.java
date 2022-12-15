package com.phpeser.chispas.domain.usecase;

import com.phpeser.chispas.data.CustomerDataStore;
import com.phpeser.chispas.data.MemCustomerDataStore;
import com.phpeser.chispas.domain.models.Customer;

public class DeleteCustomerUseCase {

    private CustomerDataStore customerDataStore;

    public DeleteCustomerUseCase(CustomerDataStore customerDataStore){
        this.customerDataStore = customerDataStore;
    }

    public void execute(Customer customer){
        customerDataStore.deleteCustomer(customer);
    }
}
