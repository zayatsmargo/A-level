package com.company.zayats.hw15.homeworkSlide20;

import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

class MyListTest {

    MyList<String> myList;
    MyList<Integer> myListInteger;

    @Before
    public void setUp() {
        myList = new MyList<>();
    }

    @Test
    public void getFromLast_whenEmptyList() {
        assertNull(myList.getFromLast(null));
    }

    @Test
    public void getFromLast_whenOneString() {
        myList.add("one");
        assertEquals("one", myList.getFromLast("one"));
    }

    @Test
    public void getFromLast_whenTwoStrings() {
        myList.add("one");
        myList.add("two");

        assertEquals("two", myList.getFromLast("two"));
    }

    @Test
    public void getFromLast_whenFourStrings() {
        myList.add("one");
        myList.add("two");
        myList.add("three");
        myList.add("four");

        assertEquals("one", myList.getFromLast("one"));
        assertEquals("two", myList.getFromLast("two"));
    }

    @Test
    public void getFromLast_whenFourIntegers() {
        myListInteger = new MyList<>();
        myListInteger.add(1);
        myListInteger.add(2);
        myListInteger.add(3);
        myListInteger.add(17);

        assertEquals(Optional.of(1), Optional.of(myListInteger.getFromLast(1)));
        assertEquals(Optional.of(2), Optional.of(myListInteger.getFromLast(2)));
        assertEquals(Optional.of(3), Optional.of(myListInteger.getFromLast(3)));
        assertEquals(Optional.of(17), Optional.of(myListInteger.getFromLast(17)));
    }
}
