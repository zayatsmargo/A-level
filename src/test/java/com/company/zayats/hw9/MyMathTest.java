package com.company.zayats.hw9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.Scanner;

class MyMathTest {

    @Test
    public void correctInputTest() throws IOException {
        InputStream test = Mockito.mock(InputStream.class);
        Mockito.when(test.read()).thenReturn(6);
        Assertions.assertEquals(6, MyMath.calculate(test));
    }

    @Test
    public void correctInputTest1() throws IOException{
        InputStream test = Mockito.mock(InputStream.class);
        Mockito.when(test.read()).thenReturn(-1);
        Assertions.assertEquals(-1, MyMath.calculate(test));
    }
    @Test
    public void correctInputTest3() throws IOException{
        InputStream test = Mockito.mock(InputStream.class);
        Mockito.when(test.read()).thenReturn(1234);
        Assertions.assertEquals(10, MyMath.calculate(test));
    }
}
