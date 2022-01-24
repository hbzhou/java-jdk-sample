package com.itsz.java.ej3.builder.hierarchy;

public class CalzonePizza extends Pizza{

    private final boolean sauceInside;

    private CalzonePizza(Builder builder) {
        super(builder);
        this.sauceInside = builder.sauceInside;
    }

    static class Builder extends Pizza.Builder<Builder>{
        private  boolean sauceInside = false;

        public Builder sauceInside() {
            sauceInside = true;
            return this;
        }

        @Override
        Pizza build() {
            return new CalzonePizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    @Override
    public String toString() {
        return "CalzonePizza{" +
                "sauceInside=" + sauceInside +
                ", toppings=" + toppings +
                '}';
    }
}
