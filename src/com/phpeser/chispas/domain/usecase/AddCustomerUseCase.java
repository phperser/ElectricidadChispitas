package com.phpeser.chispas.domain.usecase;

import com.phpeser.chispas.domain.models.Customer;
import com.phpeser.chispas.data.CustomerDataStore;
import com.phpeser.chispas.data.MemCustomerDataStore;

public class AddCustomerUseCase {

    private  CustomerDataStore customerDataStore;

    public AddCustomerUseCase(CustomerDataStore customerDataStore){
        this.customerDataStore = customerDataStore;
    }

    public void execute(Customer customer){
        CustomerDataStore customerDataStore = new MemCustomerDataStore();
            customerDataStore.saveCustomer(customer);

    }

}
