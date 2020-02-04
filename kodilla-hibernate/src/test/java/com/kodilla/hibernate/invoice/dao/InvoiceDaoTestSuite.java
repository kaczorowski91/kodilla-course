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
    public void testInvoiceDaoSave(){

        //Given
        Product product1 = new Product("Computer");
        Item item1 = new Item(product1, new BigDecimal(1000), 2, new BigDecimal(2000));
        Invoice invoice1 = new Invoice("1");


        product1.getItems().add(item1);
        item1.setProduct(product1);

        invoice1.getItems().add(item1);
        item1.setInvoice(invoice1);

        //when
        invoiceDao.save(invoice1);
        int invoiceId= invoice1.getId();

        //Then
        Assert.assertNotEquals(0, invoiceId);

        //clean up
        invoiceDao.delete(invoice1);



}
}
