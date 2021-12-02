package com.company.zayats.hw12;

import com.company.zayats.hw12.BookPhone.PhoneBook;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        /*try {
            ExceptionInsideBlock.main();
             TwoMethods.f();
        } catch (Exception e) {
           System.err.println(e.getMessage());
        }*/

        /* try {
            WithThreeExceptions.doAction(50);
        } catch (IllegalArgumentException | InputMismatchException | ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }*/

        PhoneBook phoneBook = new PhoneBook();
        Optional<Integer> tmp = phoneBook.findIndexByPhoneNumber("016/161617");
        System.out.println(phoneBook.findIndexByPhoneNumber("016/161619"));
        tmp.ifPresent(System.out::println);
    }
}
