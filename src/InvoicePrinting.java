
public class InvoicePrinting {


    public void print(Invoice invoice) {
        System.out.println("Codigo de factura: " + invoice.getIdInv() + "          " +
                "       " + invoice.getDate());
        if (invoice.getAutonomous() != null) {
            System.out.println("ID: " + invoice.getAutonomous().getCodeCustomer() + "\n" +
                    "Nombre: " + invoice.getAutonomous().getNameCust() +
                    "Apellidos: " + invoice.getAutonomous().getSurnameAutonomous() + "\n" +
                    "Direccion: " + invoice.getAutonomous().getAddress() + "        Ciudad: " + invoice.getAutonomous().getCity() + "       Provincia: " +
                    invoice.getAutonomous().getProvince() + "\n" +
                    "Correo electronico: " + invoice.getAutonomous().getEmail());
        } else{
        System.out.println("ID: " + invoice.getSociety().getCodeCustomer() + "\n" +
                "Nombre: " + invoice.getSociety().getNameCust() + "\n" +
                "Direccion: " + invoice.getSociety().getAddress() + "        Ciudad: " + invoice.getSociety().getCity() + "       Provincia: " +
                invoice.getSociety().getProvince() + "\n" +
                "Correo electronico: " + invoice.getSociety().getEmail());
        }

            System.out.println("Productos:");
            System.out.println("ID: " + invoice.getProduct().getIdSales() + " | " + invoice.getProduct().getNameProd() + " | " +
                    invoice.getProduct().getPrice() + "€" + " | " + invoice.getProduct().getIvaType().getType() * 100 + "%" + " | " +
                    (invoice.getProduct().getPrice() + invoice.getProduct().getPrice() * invoice.getProduct().getIvaType().getType()));
            System.out.println("Servicios:");
            System.out.println("ID: " + invoice.getService().getIdSales() + " | " + invoice.getService().getNameSales() + " | " +
                    invoice.getService().getPrice() + "€" + " | " + invoice.getService().getIvaType().getType() * 100 + "%" + " | " +
                    (invoice.getService().getPrice() + invoice.getService().getPrice() * invoice.getService().getIvaType().getType()));

        System.out.println("Total: " + (invoice.getProduct().getPrice() + invoice.getProduct().getPrice() * invoice.getProduct().getIvaType().getType() +
                invoice.getService().getPrice() + invoice.getService().getPrice() * invoice.getService().getIvaType().getType()));
    }
}
