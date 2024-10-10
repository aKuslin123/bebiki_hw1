package org.example;

import org.example.book.Book;
import org.example.car.Car;
import org.example.clock.Clock;

public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.setHours(23);
        clock.setMinutes(58);
        clock.setSeconds(59);

        clock.tick();

        clock.readTime();
    }
}
