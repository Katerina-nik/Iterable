package ru.netology;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    int min;
    int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        random = new Random();
    }


    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            final int number = random.nextInt(min, max + 1);

            @Override
            public boolean hasNext() {
                return number > min | number < max;
            }

            @Override
            public Integer next() {
                return random.nextInt(min, max + 1);

            }
        };
    }
}


