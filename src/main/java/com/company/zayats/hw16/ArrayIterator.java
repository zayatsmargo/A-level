package com.company.zayats.hw16;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayIterator {
    private static <T> Iterator<T> getIterator(final T[] array) {
        return new Iterator<T>() {
            private int count = array.length;
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < count;
            }

            @Override
            public T next() {
                if (hasNext()) {
                    return array[index++];
                } else {
                    throw new NoSuchElementException("No such element.");
                }
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Cannot remove item from array.");
            }
        };
    }

    public static void main(String[] args) {
        Integer[] integers = new Integer[]{3, 6, 5, 7, 4, 5};
        Double[] doubles = new Double[]{0.1, 0.2, 0.3};

        Iterator<Integer> integerIterator = getIterator(integers);

        while (integerIterator.hasNext()) {
            System.out.println(integerIterator.next());
        }

        Iterator<Double> doubleIterator = getIterator(doubles);
        while (doubleIterator.hasNext()) {
            System.out.println(doubleIterator.next());
        }
    }
}
