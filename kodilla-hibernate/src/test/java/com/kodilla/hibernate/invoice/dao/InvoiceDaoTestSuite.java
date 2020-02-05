package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {

        //Given
        Product product1 = new Product("Computer");
        Product product2 = new Product("Printer");
        Item item1 = new Item(product1, new BigDecimal(1000), 2, new BigDecimal(2000));
        Item item2 = new Item(product2, new BigDecimal(700), 5, new BigDecimal(2400));

        Invoice invoice1 = new Invoice("1");

        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);

        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);

        //when
        System.out.println(invoice1.getItems().size());
        invoiceDao.save(invoice1);
        int invoiceId = invoice1.getId();

        //Then
        Assert.assertNotEquals(0, invoiceId);

        //clean up
        invoiceDao.delete(invoice1);


    }
}
