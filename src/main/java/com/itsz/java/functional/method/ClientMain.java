package com.itsz.java.functional.method;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ClientMain {

    public static void main(String[] args) {
        List<Dish> dishList = new ArrayList<>();
        int reduce = dishList.stream()
                .mapToInt(Dish::getCalories)
                .reduce(0, (x, y) -> x + y);

        int asInt = dishList.stream()
                .mapToInt(Dish::getCalories)
                .max()
                .orElseGet(() -> 0);

        IntStream.rangeClosed(1, 100).boxed()
                .flatMap(a ->
                        IntStream.rangeClosed(a, 100)
                                .filter(b -> Math.sqrt(a * a + b * b) % 1 == 0)
                                .mapToObj(b -> new int[]{a, b, (int) Math.sqrt(a * a + b * b)})
                ).forEach(ints -> {
            System.out.println(ints[0] + "-----------" + ints[1] + "----------" + ints[2]);
        });


        Stream.iterate(0, n -> n + 2)
                .limit(10)
                .forEach(System.out::println);


        Stream.iterate(new int[]{0, 1},
                t -> new int[]{t[1], t[0] + t[1]})
                .limit(20)
                .forEach(t -> System.out.println("(" + t[0] + "," + t[1] + ")"));


    }
}
