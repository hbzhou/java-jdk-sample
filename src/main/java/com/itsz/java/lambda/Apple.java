package com.itsz.java.lambda;

import lombok.Data;

@Data
public class Apple implements Fruit {

    private int weight;

    public Apple(int weight) {
        this.weight = weight;
    }
}
