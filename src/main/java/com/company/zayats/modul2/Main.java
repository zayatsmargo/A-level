package com.company.zayats.modul2;

import com.company.zayats.modul2.models.Customer;
import com.company.zayats.modul2.models.Invoice;
import com.company.zayats.modul2.services.AnalyticalData;
import com.company.zayats.modul2.services.PersonService;
import com.company.zayats.modul2.services.ShopService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Invoice> list = new ArrayList<>();
        ShopService shop = new ShopService();
        PersonService service = new PersonService();
        List<Customer> customers = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            customers.add(service.generateCustomer());
            list.add(shop.createOrder(customers.get(i), 2500));
        }
        AnalyticalData analyticalData = new AnalyticalData(list);
        System.out.println("printProductsByCategories");
        analyticalData.printProductsByCategories();
        System.out.println("smallestCheckAndInformation");
        analyticalData.smallestCheckAndInformation();
        System.out.println("theSumOfAllPurchases");
        analyticalData.theSumOfAllPurchases();
        System.out.println("checkWithRetail");
        analyticalData.checkWithRetail();
        System.out.println("checkWithOneType");
        analyticalData.checkWithOneType();
        System.out.println("firstThreeChecks");
        analyticalData.firstThreeChecks(customers);
        System.out.println("checkLowAge");
        analyticalData.checkLowAge();
        System.out.println("printThriceSortedInvoices");
        analyticalData.printThriceSortedInvoices();
    }
}
