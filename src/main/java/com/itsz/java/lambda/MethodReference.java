package com.itsz.java.lambda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodReference {

    static Map<String, Function<Integer, Fruit>> map = new HashMap<>();

    static {
        map.put("apple", Apple::new);
        map.put("orange", Orange::new);
    }

    public static Fruit giveMeFruit(String fruit, int weight) {
        return map.get(fruit).apply(weight);
    }

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("A", "B", "c");
        stringList.sort(String::compareToIgnoreCase);

        Function<String, Integer> stringIntegerFunction = Integer::parseInt;

        BiPredicate<List<String>, String> listStringBiPredicate = List::contains;

        System.out.println(giveMeFruit("apple", 14));


    }
}
