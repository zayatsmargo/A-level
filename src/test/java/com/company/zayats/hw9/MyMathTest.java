package com.company.zayats.hw9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.Scanner;

class MyMathTest {

    @Test
    public void correctInputTest() {
        Scanner scanner = new Scanner(System.in);
        MyMath test = Mockito.mock(MyMath.class);
        Mockito.when(test.calculate(scanner)).thenReturn(6);
        Assertions.assertEquals(6, test.calculate(scanner));
    }
}
