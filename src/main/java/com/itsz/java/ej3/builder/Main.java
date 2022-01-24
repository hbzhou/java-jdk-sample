package com.itsz.java.ej3.builder;

public class Main {
    public static void main(String[] args) {

        NutritionFacts nutritionFacts = new NutritionFacts.Builder(100, 100)
                .calories(10)
                .fat(13)
                .carbohydrate(20)
                .sodium(1)
                .build();
        System.out.println(nutritionFacts);

    }
}
