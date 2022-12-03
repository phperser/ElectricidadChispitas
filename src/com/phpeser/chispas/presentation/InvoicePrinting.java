package com.phpeser.chispas.presentation;

import com.phpeser.chispas.domain.models.Invoice;

public class InvoicePrinting {


    public void print(Invoice invoice) {
        System.out.println("Codigo de factura: " + invoice.getIdInv() + " | " + invoice.getDate());
        if (invoice.getAutonomous() != null) {
            System.out.println("CIF/NIF: " + invoice.getAutonomous().getCodeCustomer() + " | Nombre: " + invoice.getAutonomous().getNameCust() +
                    " | Apellidos: " + invoice.getAutonomous().getSurnameAutonomous() +
                    " | Direccion: " + invoice.getAutonomous().getAddress() + " | Poblacion: " + invoice.getAutonomous().getCity() + " | Provincia: " +
                    invoice.getAutonomous().getProvince() +
                    " | Email: " + invoice.getAutonomous().getEmail());
        } else{
        System.out.println("CIF/NIF: " + invoice.getSociety().getCodeCustomer() +
                " | Nombre: " + invoice.getSociety().getNameCust() +
                " | Direccion: " + invoice.getSociety().getAddress() + " | Email: " + invoice.getSociety().getCity() + " | Provincia: " +
                invoice.getSociety().getProvince() +
                " | Email: " + invoice.getSociety().getEmail());
        }

            System.out.println("Productos:");
            System.out.println("Codigo: " + invoice.getProduct().getIdSales() + " | Nombre: " + invoice.getProduct().getNameProd() + " |  Precio: " +
                    invoice.getProduct().getPrice() + "€" + " | Tipo IVA: " + invoice.getProduct().getIvaType().getType() * 100 + "%" + " | Total: " +
                    (invoice.getProduct().getPrice() + invoice.getProduct().getPrice() * invoice.getProduct().getIvaType().getType()) + "€");
            System.out.println("Servicios:");
            System.out.println("Codigo: " + invoice.getService().getIdSales() + " | Nombre: " + invoice.getService().getNameSales() + " | Precio:" +
                    invoice.getService().getPrice() + "€" + " | Tipo IVA: " + invoice.getService().getIvaType().getType() * 100 + "%" + " | Total: " +
                    (invoice.getService().getPrice() + invoice.getService().getPrice() * invoice.getService().getIvaType().getType()) + "€");

        System.out.println("Total: " + Math.floor((invoice.getProduct().getPrice() + invoice.getProduct().getPrice() * invoice.getProduct().getIvaType().getType() +
                invoice.getService().getPrice() + invoice.getService().getPrice() * invoice.getService().getIvaType().getType())) + "€");
    }
}
