package com.itsz.java.ej3.builder.hierarchy;

import java.util.Objects;

public class NewYorkPizza extends Pizza {

    public enum Size {SMALL, MEDIUM, LARGE}

    private final Size size;

    private NewYorkPizza(Builder builder) {
        super(builder);
        this.size = builder.size;
    }


    static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        Pizza build() {
            return new NewYorkPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }

    }

    @Override
    public String toString() {
        return "NewYorkPizza{" +
                "size=" + size +
                ", toppings=" + toppings +
                '}';
    }
}
