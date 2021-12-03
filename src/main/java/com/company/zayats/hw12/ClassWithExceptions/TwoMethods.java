package com.company.zayats.hw12.ClassWithExceptions;

import java.io.IOException;

public class TwoMethods {
    public static void f() throws Exception {
        try {
            g();
        }catch (IOException e){
            throw new Exception("An exception with method f() in a class TwoMethods");
        }
    }

    private static void g() throws IOException {
        throw new IOException("An exception with method g() in a class TwoMethods");
    }
}
