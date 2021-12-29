package com.company.zayats.modul2.services;

import com.company.zayats.modul2.models.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AnalyticalData {
    private final List<Invoice> list;

    public AnalyticalData(List<Invoice> list) {
        this.list = list;
    }

    public void printProductsByCategories() {
        int telephoneQuantity = list.stream()
                .flatMap(invoice -> invoice.getList().stream())
                .filter(technics -> technics.getClass().equals(Telephone.class))
                .mapToInt(quantity -> 1)
                .sum();
        int televisionQuantity = list.stream()
                .flatMap(invoice -> invoice.getList().stream())
                .filter(technics -> technics.getClass().equals(Television.class))
                .mapToInt(quantity -> 1)
                .sum();
        System.out.println("telephoneQuantity = " + telephoneQuantity + "\ntelevisionQuantity = " + televisionQuantity);
    }

    public void smallestCheckAndInformation() {
        Invoice minInvoice = list.stream()
                .min(Comparator.comparing(inv -> inv.getList().stream()
                        .mapToInt(Technics::getPrice)
                        .sum())).orElse(new Invoice(new ArrayList<>(), 0, new PersonService().generateCustomer()));
        System.out.println(minInvoice.getList().stream().mapToInt(Technics::getPrice).sum());
        System.out.println(minInvoice.getCustomer());

    }

    public void theSumOfAllPurchases() {
        int sum = list.stream()
                .flatMap(invoice -> invoice.getList().stream())
                .mapToInt(Technics::getPrice)
                .sum();
        System.out.println("sum = " + sum);
    }

    public void checkWithRetail() {
        long retailQuantity = list.stream()
                .filter(invoice -> invoice.getType().equals("retail"))
                .count();
        System.out.println("retailQuantity = " + retailQuantity);
    }

    public void checkWithOneType() {
        List<Invoice> telephoneType = list.stream()
                .filter(invoice -> invoice.getList().stream().allMatch(technics -> technics.getClass().equals(Telephone.class)))
                .collect(Collectors.toList());
        List<Invoice> televisionType = list.stream()
                .filter(invoice -> invoice.getList().stream().allMatch(technics -> technics.getClass().equals(Television.class)))
                .collect(Collectors.toList());
        System.out.println("televisionType = " + televisionType + "\ntelephoneType" + telephoneType);
    }

    public void firstThreeChecks(List<Customer> customers) {
        for (int i = 0; i < customers.size(); i++) {
            int finalI = i;
            System.out.println(list.stream()
                    .filter(invoice -> invoice.getCustomer().getId() == customers.get(finalI).getId()).limit(3).collect(Collectors.toList()));
        }

    }

    public void checkLowAge() {
        list.stream()
                .filter(invoice -> invoice.getCustomer().getAge() < 18)
                .forEach(invoice -> {
                    invoice.setType("low_age");
                    System.out.println(invoice);
                });
    }

    public void printThriceSortedInvoices() {
        System.out.println(list.stream()
                .sorted(Comparator.comparing(inv -> -inv.getCustomer().getAge())).collect(Collectors.toList()));
        System.out.println(list.stream()
                .sorted(Comparator.comparing(inv -> inv.getList().size())).collect(Collectors.toList()));
        System.out.println(list.stream()
                .sorted(Comparator.comparing(inv -> inv.getList().stream()
                        .mapToInt(Technics::getPrice)
                        .sum()))
                .collect(Collectors.toList()));
    }
}
