package com.phpeser.chispas.presentation;

import com.phpeser.chispas.data.*;
import com.phpeser.chispas.domain.models.*;
import com.phpeser.chispas.domain.usecase.*;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        String salto;

        Autonomous autonomous = new Autonomous();
        System.out.println("Datos del autonomo");
        System.out.println("Introduce el DNI:");
        autonomous.setDni(entrada.nextLine());
        System.out.println("Introduce el nombre:");
        autonomous.setNameCust(entrada.nextLine());
        System.out.println("Introduce los apellidos:");
        autonomous.setSurnameAutonomous(entrada.nextLine());
        System.out.println("Introduce la ciudad:");
        autonomous.setCity(entrada.nextLine());
        System.out.println("Introduce la provincia");
        autonomous.setProvince(entrada.nextLine());
        System.out.println("Introduce la direccion");
        autonomous.setAddress(entrada.nextLine());
        System.out.println("Introduce el email");
        autonomous.setEmail(entrada.nextLine());
        System.out.println("Introduce el telefono");
        autonomous.setPhoneNumber(entrada.nextInt());
        salto = entrada.nextLine();


        Society society = new Society();
        System.out.println("Datos de la sociedad");
        System.out.println("Introduce el NIF:");
        society.setNif(entrada.nextLine());
        System.out.println("Introduce la razon social:");
        society.setNameCust(entrada.nextLine());
        System.out.println("Introduce la ciudad:");
        society.setCity(entrada.nextLine());
        System.out.println("Introduce la provincia:");
        society.setProvince(entrada.nextLine());
        System.out.println("Introduce la direccion:");
        society.setAddress(entrada.nextLine());
        System.out.println("Introduce el email:");
        society.setEmail(entrada.nextLine());
        System.out.println("Introduce el telefono:");
        society.setPhoneNumber(Integer.parseInt(entrada.nextLine()));
        /* He realizado un cambio de formato para que no me de error
entre el nextInt y nextLine por el \n
 */


        CustomerDataStore customerDataStore = new MemCustomerDataStore();

        AddCustomerUseCase addCustomerUseCase = new AddCustomerUseCase(customerDataStore);
        addCustomerUseCase.execute(autonomous);
        addCustomerUseCase.execute(society);

        GetCustomerUseCase getCustomerUseCase = new GetCustomerUseCase(customerDataStore);
        List<Customer> customers = getCustomerUseCase.execute();
        for (int i = 0; i < customers.size(); i++){
            printCustomer(customers.get(i));
        }

        /* System.out.println("Eliminando Autonomo");

        DeleteCustomerUseCase deleteCustomerUseCase = new DeleteCustomerUseCase(customerDataStore);
        deleteCustomerUseCase.execute((autonomous));
        List<Customer> customers1 = getCustomerUseCase.execute();
        for (int i = 0; i < customers1.size(); i++)
            printCustomer(customers1.get(i)); */

        //Lo he comentado para poder hacer la factura de autonomo, he intendado
        // que obtuviese por teclado el cliente ha borrar pero no he podido

        System.out.println("-----Modificando la Sociedad-----");
        System.out.println("Introduce el NIF:");
        society.setNif(entrada.nextLine());
        System.out.println("Introduce la razon social:");
        society.setNameCust(entrada.nextLine());
        System.out.println("Introduce la ciudad:");
        society.setCity(entrada.nextLine());
        System.out.println("Introduce la provincia:");
        society.setProvince(entrada.nextLine());
        System.out.println("Introduce la direccion:");
        society.setAddress(entrada.nextLine());
        System.out.println("Introduce el email:");
        society.setEmail(entrada.nextLine());
        System.out.println("Introduce el telefono:");
        society.setPhoneNumber(Integer.parseInt(entrada.nextLine()));
        UpdateCustomerUseCase updateCustomerUseCase = new UpdateCustomerUseCase(customerDataStore);
        updateCustomerUseCase.execute(society);
        List<Customer> customers2 = getCustomerUseCase.execute();
        for (int i = 0; i < customers2.size(); i++)
            printCustomer(customers2.get(i));

        System.out.println("Modificando el Autonomo");
        System.out.println("Datos del autonomo");
        System.out.println("Introduce el DNI:");
        autonomous.setDni(entrada.nextLine());
        System.out.println("Introduce el nombre:");
        autonomous.setNameCust(entrada.nextLine());
        System.out.println("Introduce los apellidos:");
        autonomous.setSurnameAutonomous(entrada.nextLine());
        System.out.println("Introduce la ciudad:");
        autonomous.setCity(entrada.nextLine());
        System.out.println("Introduce la provincia");
        autonomous.setProvince(entrada.nextLine());
        System.out.println("Introduce la direccion");
        autonomous.setAddress(entrada.nextLine());
        System.out.println("Introduce el email");
        autonomous.setEmail(entrada.nextLine());
        System.out.println("Introduce el telefono");
        autonomous.setPhoneNumber(entrada.nextInt());
        salto = entrada.nextLine();
        UpdateCustomerUseCase updateCustomerUseCase1 = new UpdateCustomerUseCase(customerDataStore);
        updateCustomerUseCase1.execute(autonomous);
        List<Customer> customers3 = getCustomerUseCase.execute();
        for (int i = 0; i < customers3.size(); i++)
            printCustomer(customers3.get(i));

        IVAType iva0 = new IVAType();
        iva0.setType(0.00);
        IVAType iva4 = new IVAType();
        iva4.setType(0.04);
        IVAType iva10 = new IVAType();
        iva10.setType(0.10);
        IVAType iva21 = new IVAType();
        iva21.setType(0.21);

        IVATypeDataStore ivaTypeDataStore = new MemIVATypeDataStore();

        AddIVATypeUseCase addIVATypeUseCase = new AddIVATypeUseCase(ivaTypeDataStore);
        addIVATypeUseCase.execute(iva0);
        addIVATypeUseCase.execute(iva4);
        addIVATypeUseCase.execute(iva10);
        addIVATypeUseCase.execute(iva21);

        System.out.println("TIPOS DE IVA");
        GetIVATypeUseCase getIVATypeUseCase = new GetIVATypeUseCase(ivaTypeDataStore);
        List<IVAType> ivaTypes = getIVATypeUseCase.execute();
        for (int i = 0 ; i<ivaTypes.size() ; i++){
            System.out.println(ivaTypes.get(i).getType());}

       /* DeleteIVATypeUseCase deleteIVATypeUseCase = new DeleteIVATypeUseCase(ivaTypeDataStore);
        System.out.println("----- ELIMINADO TIPO DE IVA -----");
        deleteIVATypeUseCase.execute(iva0);
        deleteIVATypeUseCase.execute(iva4);
        deleteIVATypeUseCase.execute(iva10);
        deleteIVATypeUseCase.execute(iva21);
        List<IVAType> ivaTypes2 = getIVATypeUseCase.execute();
        for (int i = 0 ; i<ivaTypes2.size() ; i++){
            System.out.println(ivaTypes2.get(i).getType());} */
        //Comentado para que no halla problemas con la factura ni los calculos de totales

        System.out.println("MODIFICAR TIPO DE IVA 4");
        UpdateIVATypeUseCase updateIVATypeUseCase = new UpdateIVATypeUseCase(ivaTypeDataStore);
        System.out.println("Introduce el tipo de IVA");
        iva4.setType(entrada.nextDouble());
        salto = entrada.nextLine();
        updateIVATypeUseCase.execute(iva4);
        List<IVAType> ivaTypes3 = getIVATypeUseCase.execute();
        for (int i = 0 ; i<ivaTypes3.size() ; i++){
            System.out.println(ivaTypes3.get(i).getType());}




        Product product1 = new Product();
        System.out.println("Datos del producto 1");
        System.out.println("Introduce el codigo:");
        product1.setIdSales(entrada.nextLine());
        System.out.println("Introduce el nombre:");
        product1.setNameProd(entrada.nextLine());
        System.out.println("Introduce la marca:");
        product1.setBrandProd(entrada.nextLine());
        System.out.println("Introduce el modelo:");
        product1.setModelProd(entrada.nextLine());
        System.out.println("Introduce el precio:");
        product1.setPrice(entrada.nextDouble());
        System.out.println("Seleccione el tipo de IVA: 0, 4, 10, 21:");
        Integer IVA = entrada.nextInt();
        switch (IVA){
            case 0: product1.setIvaType(iva0); break;
            case 4: product1.setIvaType(iva4); break;
            case 10: product1.setIvaType(iva10); break;
            case 21: product1.setIvaType(iva21); break;
        }
        salto = entrada.nextLine();

        Product product2 = new Product();
        System.out.println("Datos del producto 2");
        System.out.println("Introduce el codigo:");
        product2.setIdSales(entrada.nextLine());
        System.out.println("Introduce el nombre:");
        product2.setNameProd(entrada.nextLine());
        System.out.println("Introduce la marca:");
        product2.setBrandProd(entrada.nextLine());
        System.out.println("Introduce el modelo:");
        product2.setModelProd(entrada.nextLine());
        System.out.println("Introduce el precio:");
        product2.setPrice(entrada.nextDouble());
        System.out.println("Seleccione el tipo de IVA: 0, 4, 10, 21:");
        IVA = entrada.nextInt();
        switch (IVA){
            case 0: product2.setIvaType(iva0); break;
            case 4: product2.setIvaType(iva4); break;
            case 10: product2.setIvaType(iva10); break;
            case 21: product2.setIvaType(iva21); break;
        }
        salto = entrada.nextLine();

        Service service1 = new Service();
        System.out.println("Datos del servicio 1:");
        System.out.println("Introduce el codigo:");
        service1.setIdSales(entrada.nextLine());
        System.out.println("Introduce el nombre:");
        service1.setNameServ(entrada.nextLine());
        System.out.println("Introduce el precio:");
        service1.setPrice(entrada.nextDouble());
        System.out.println("Seleccione el tipo de IVA: 0, 4, 10, 21:");
        IVA = entrada.nextInt();
        switch (IVA){
            case 0: service1.setIvaType(iva0); break;
            case 4: service1.setIvaType(iva4); break;
            case 10: service1.setIvaType(iva10); break;
            case 21: service1.setIvaType(iva21); break;
        }
        salto = entrada.nextLine();

        Service service2 = new Service();
        System.out.println("Datos del servicio 2:");
        System.out.println("Introduce el codigo:");
        service2.setIdSales(entrada.nextLine());
        System.out.println("Introduce el nombre:");
        service2.setNameServ(entrada.nextLine());
        System.out.println("Introduce el precio:");
        service2.setPrice(entrada.nextDouble());
        System.out.println("Seleccione el tipo de IVA: 0, 4, 10, 21:");
        IVA = entrada.nextInt();
        switch (IVA){
            case 0: service2.setIvaType(iva0); break;
            case 4: service2.setIvaType(iva4); break;
            case 10: service2.setIvaType(iva10); break;
            case 21: service2.setIvaType(iva21); break;
        }
        salto = entrada.nextLine();



        SalesDataStore salesDataStore = new MemSalesDataStore();

        AddSalesUseCase addSalesUseCase = new AddSalesUseCase(salesDataStore);
        addSalesUseCase.execute(product1);
        addSalesUseCase.execute(product2);
        addSalesUseCase.execute(service1);
        addSalesUseCase.execute(service2);

        System.out.println("Productos y servicios:");
        GetSalesUseCase getSalesUseCase = new GetSalesUseCase(salesDataStore);
        List<Sales> sales = getSalesUseCase.execute();
        for (int i = 0 ; i<sales.size() ; i++){
            System.out.println(sales.get(i));}


        DeleteSalesUseCase deleteSalesUseCase = new DeleteSalesUseCase(salesDataStore);
        System.out.println("Eliminar producto 1");
        deleteSalesUseCase.execute(product1);
        List<Sales> sales1 = getSalesUseCase.execute();
        for (int i = 0 ; i<sales1.size() ; i++){
            System.out.println(sales1.get(i));}

        UpdateSalesUseCase updateSalesUseCase = new UpdateSalesUseCase(salesDataStore);
        System.out.println("Modificar producto 2");
        System.out.println("Introduce el nuevo precio del producto 2");
        product2.setPrice(entrada.nextDouble());
        updateSalesUseCase.execute(product2);
        salto = entrada.nextLine();
        List<Sales> sales2 = getSalesUseCase.execute();
        for (int i = 0 ; i<sales2.size() ; i++){
            System.out.println(sales2.get(i));}

        Invoice autInvoice = new Invoice();
        System.out.println("Datos de la factura de autonomos");
        System.out.println("Introduce el codigo de la factura");
        autInvoice.setIdInv(entrada.nextInt());
        salto = entrada.nextLine();
        System.out.println("Introduce la fecha de la factura");
        autInvoice.setDate(entrada.nextLine());
        autInvoice.setAutonomous(autonomous);
        autInvoice.setProduct(product1);
        autInvoice.setService(service1);
        autInvoice.setTaxBase(autInvoice.getTaxBase());
        autInvoice.setTotal(autInvoice.getTotal());

        InvoiceDataStore invoiceDataStore = new MemInvoiceDataStore();


        System.out.println("Factura");
        InvoicePrinting invPrintAutonomous = new InvoicePrinting();
        invPrintAutonomous.print(autInvoice);

        Invoice socInvoice = new Invoice();
        System.out.println("Datos de la factura de sociedad");
        System.out.println("Introduce el codigo de la factura");
        socInvoice.setIdInv(entrada.nextInt());
        salto = entrada.nextLine();
        System.out.println("Introduce la fecha de la factura");
        socInvoice.setDate(entrada.nextLine());
        socInvoice.setSociety(society);
        socInvoice.setProduct(product2);
        socInvoice.setService(service2);
        socInvoice.setTaxBase(socInvoice.getTaxBase());
        socInvoice.setTotal(socInvoice.getTotal());

        AddInvoiceUseCase addInvoiceUseCase = new AddInvoiceUseCase(invoiceDataStore);
        addInvoiceUseCase.execute(socInvoice);
        addInvoiceUseCase.execute(autInvoice);
        GetInvoiceUseCase getInvoiceUseCase = new GetInvoiceUseCase(invoiceDataStore);
        List<Invoice> invoices = getInvoiceUseCase.execute();
        for (int i = 0 ; i<invoices.size() ; i++){
            System.out.println(invoices.get(i));}

        UpdateInvoiceUseCase updateInvoiceUseCase = new UpdateInvoiceUseCase(invoiceDataStore);
        System.out.println("Factura sociedad, nuevo codigo");
        socInvoice.setIdInv(entrada.nextInt());
        salto = entrada.nextLine();
        updateInvoiceUseCase.execute(socInvoice);

        System.out.println("Factura");
        InvoicePrinting  invPrintSociety = new InvoicePrinting();
        invPrintSociety.print(socInvoice);
}


    public static void printCustomer(Customer customer){
        System.out.println("Cod: " + customer.getCodeCustomer() + " Nombre: " + customer.getNameCust() + " DNI/CIF/IN: " + customer.getCodeCustomer() +"\n" +
                "Direccion: " + customer.getAddress() + " Ciudad: " + customer.getCity() + " Provincia: " + customer.getProvince()  + "\n" +
                "Email: " + customer.getEmail() + " Telefono: " + customer.getPhoneNumber());

    }
    public static void printSales(Sales sales){
        System.out.println("Cod:" + sales.getIdSales() + " Nombre:" + sales.getNameSales()
                + " Precio: " + sales.getPrice() + " Precio + IVA: " + (sales.getPrice() + sales.getPrice() * sales.getIvaType().getType()));
    }
}